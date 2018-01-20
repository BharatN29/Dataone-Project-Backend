package com.maven.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maven.Impl.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
