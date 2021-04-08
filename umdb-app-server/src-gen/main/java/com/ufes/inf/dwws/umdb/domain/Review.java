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
public class Review implements Serializable {

	private static final long serialVersionUID = 1L;



    
	@NotNull
	@Column(name = "rating", unique = true)
	private Integer rating;
    

    
	
	@Column(name = "commentary", unique = true)
	private String commentary;
    




		
		@ManyToOne
		@JoinColumn(name = "Source_id")
		private User Source;
		
	

		
		@ManyToOne
		@JoinColumn(name = "Source_id")
		private Movie Source;
		
	


	public Review() {
		super();
	}



	public Integer getRating() {
		return rating;
	}
	
	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getCommentary() {
		return commentary;
	}
	
	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}




		
		public User getSource() {
			return Source;
		}
		
		public void setSource(User Source) {
			this.Source = Source;
		}
		
	

		
		public Movie getSource() {
			return Source;
		}
		
		public void setSource(Movie Source) {
			this.Source = Source;
		}
		
	





}