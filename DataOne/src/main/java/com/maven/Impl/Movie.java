package com.maven.Impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@Entity
@RestController
@SpringBootApplication
public class Movie {
	
	@Id
	@GeneratedValue
	private long movieid;
	@NotNull
	@NotEmpty(message="Please enter the required field: Movie Name.")
	private String moviename;
	@Column(columnDefinition="CLOB")
	private String coverimage;
	@NotNull
	@NotEmpty(message="Please enter the required field: Release Date.")
	private String reldate;
	private String genre;
	@NotNull
	@NotEmpty(message="Please enter the required field: Lead Actors/Actresses.")
	private String leadactors;
	@NotNull
	@NotEmpty(message="Please enter the required field: Directors.")
	private String directors;
	
	public long getMovieid() {
		return movieid;
	}
	public void setMovieid(long movieid) {
		this.movieid = movieid;
	}
	@NotNull
	@NotEmpty(message="Please enter the required field: Movie Name.")
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	
	public String getCoverimage() {
		return coverimage;
	}
	public void setCoverimage(String coverimage) {
		this.coverimage = coverimage;
	}
	@NotNull
	@NotEmpty(message="Please enter the required field: Release Date.")
	public String getReldate() {
		return reldate;
	}
	public void setReldate(String reldate) {
		this.reldate = reldate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@NotNull
	@NotEmpty(message="Please enter the required field: Lead Actors/Actresses.")
	public String getLeadactors() {
		return leadactors;
	}
	public void setLeadactors(String leadactors) {
		this.leadactors = leadactors;
	}
	@NotNull
	@NotEmpty(message="Please enter the required field: Directors.")
	public String getDirectors() {
		return directors;
	}
	public void setDirectors(String directors) {
		this.directors = directors;
	}
	public Movie(String moviename, String coverimage, String reldate, String genre, String leadactors,
			String directors) {
		this.moviename = moviename;
		this.coverimage = coverimage;
		this.reldate = reldate;
		this.genre = genre;
		this.leadactors = leadactors;
		this.directors = directors;
	}
	
	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", coverimage=" + coverimage + ", reldate="
				+ reldate + ", genre=" + genre + ", leadactors=" + leadactors + ", directors=" + directors + "]";
	}
	
	public Movie() {
	}
	
	
}
