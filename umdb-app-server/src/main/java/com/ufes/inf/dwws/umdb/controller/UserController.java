package com.ufes.inf.dwws.umdb.controller;

import com.ufes.inf.dwws.umdb.domain.User;
import com.ufes.inf.dwws.umdb.security.JwtTokenProvider;
import com.ufes.inf.dwws.umdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@Controller
public class UserController {

    UserService userService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/api/open/user")
    @ResponseBody
    public ResponseEntity<Object> saveUser (@RequestBody User user) {
        User d = this.userService.saveUser(user.getName(), user.getEmail(), user.getPassword());

        if (d != null) {
            return new ResponseEntity<>(d, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Já existe um ator cadastrado com esse nome!", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/api/admin/user")
    @ResponseBody
    public ResponseEntity<List> findAll () {
        return new ResponseEntity<>(this.userService.findAll(),HttpStatus.OK);
    }

    @GetMapping("/api/admin/user/{id}")
    @ResponseBody
    public ResponseEntity<Object> findUser(@PathVariable Long id) {
        User d = this.userService.findUserById(id);

        if (d != null) {
            return new ResponseEntity<>(d, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/api/close/user/{id}")
    @ResponseBody
    public ResponseEntity<Object> deleteUser (@PathVariable Long id, @AuthenticationPrincipal User userDetails) {
        if (userDetails.getRole().getName().equals("ROLE_ADMIN") || userDetails.getId().equals(id)){
            User d = this.userService.deleteUserById(id);

            if (d != null) {
                return new ResponseEntity<>(d, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }
        }else{
            return new ResponseEntity<>("Internal server error", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/api/close/user/{id}")
    @ResponseBody
    public ResponseEntity<Object> updateUser (@RequestBody User user, @PathVariable Long id) {
        User d = this.userService.updateUserById(id, user.getName(), user.getEmail(), user.getPassword(), user.getRole().getName());

        if (d != null) {
            return new ResponseEntity<>(d, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/api/admin/user/{id}")
    @ResponseBody
    public ResponseEntity<Object> updateUserRole (@RequestBody User user, @PathVariable Long id) {
        User d = this.userService.updateUserById(id, user.getRole().getName());

        if (d != null) {
            return new ResponseEntity<>(d, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/api/open/login")
    @ResponseBody
    public ResponseEntity login(@RequestBody User user) {

        Map myUser = this.userService.sigin(user.getEmail(),user.getPassword());
        if (myUser == null){
            return new ResponseEntity("USer not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(myUser, HttpStatus.OK);

    }
}