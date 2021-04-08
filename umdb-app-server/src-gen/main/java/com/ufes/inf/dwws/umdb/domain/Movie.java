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
public class Movie implements Serializable {

	private static final long serialVersionUID = 1L;



    
	@NotNull
	@Column(name = "title", unique = true)
	private String title;
    

    
	@NotNull
	@Column(name = "year", unique = true)
	private Date year;
    

    
	@NotNull
	@Column(name = "averageRating", unique = true)
	private float averageRating;
    




		
		@ManyToMany
		@JoinTable(
			name = "Source_Target",
			joinColumns = @JoinColumn(name = "Source_id"),
			inverseJoinColumns = @JoinColumn(name = "Target_id")
		)
		private Set<Genre> Target;
		
	

		
		@ManyToMany
		@JoinTable(
			name = "Source_Target",
			joinColumns = @JoinColumn(name = "Source_id"),
			inverseJoinColumns = @JoinColumn(name = "Target_id")
		)
		private Set<Actor> Target;
		
	

		
		@ManyToMany
		@JoinTable(
			name = "Source_Target",
			joinColumns = @JoinColumn(name = "Source_id"),
			inverseJoinColumns = @JoinColumn(name = "Target_id")
		)
		private Set<Director> Target;
		
	

		
		@OneToMany(mappedBy="Source")
		private Set<Review> Target;
		
	


	public Movie() {
		super();
	}



	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public Date getYear() {
		return year;
	}
	
	public void setYear(Date year) {
		this.year = year;
	}

	public float getAverageRating() {
		return averageRating;
	}
	
	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}




		
		public Set<Genre> getTarget() {
			return Target;
		}
		
		public void setTarget(Set<Genre> Target) {
			this.Target = Target;
		}
		
	

		
		public Set<Actor> getTarget() {
			return Target;
		}
		
		public void setTarget(Set<Actor> Target) {
			this.Target = Target;
		}
		
	

		
		public Set<Director> getTarget() {
			return Target;
		}
		
		public void setTarget(Set<Director> Target) {
			this.Target = Target;
		}
		
	

		
		public Set<Review> getTarget() {
			return Target;
		}
		
		public void setTarget(Set<Review> Target) {
			this.Target = Target;
		}
		
	





}