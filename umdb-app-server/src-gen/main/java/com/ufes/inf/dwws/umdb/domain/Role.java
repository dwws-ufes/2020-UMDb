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
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;



    
	@NotNull
	@Column(name = "name", unique = true)
	private String name;
    




		
		@OneToMany(mappedBy="Target")
		private Set<User> Source;
		
	


	public Role() {
		super();
	}



	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}




		
		public Set<User> getSource() {
			return Source;
		}
		
		public void setSource(Set<User> Source) {
			this.Source = Source;
		}
		
	





}