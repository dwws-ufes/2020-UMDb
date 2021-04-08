package com.ufes.inf.dwws.umdb.domain;

import java.io.Serializable;
import java.util.Set;
import java.util.List;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;



    
	@NotNull
	@Column(name = "name", unique = true)
	private String name;
    

    
	@NotNull
	@Column(name = "email", unique = true)
	private String email;
    

    
	@NotNull
	@Column(name = "password", unique = true)
	private String password;
    

    
	@NotNull
	@Column(name = "registrationDate", unique = true)
	private Date registrationDate;
    




		
		@OneToMany(mappedBy="Source")
		private Set<Review> Target;
		
	

		
		@ManyToOne
		@JoinColumn(name = "Target_id")
		private Role Target;
		
	


	public User() {
		super();
	}



	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}
	
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}




		
		public Set<Review> getTarget() {
			return Target;
		}
		
		public void setTarget(Set<Review> Target) {
			this.Target = Target;
		}
		
	

		
		public Role getTarget() {
			return Target;
		}
		
		public void setTarget(Role Target) {
			this.Target = Target;
		}
		
	





}