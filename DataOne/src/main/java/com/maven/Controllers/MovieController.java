package com.maven.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.apache.tomcat.jni.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.maven.Impl.Movie;
import com.maven.Repositories.MovieRepository;

@RestController
@RequestMapping(value="/api", method=RequestMethod.POST)
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class MovieController {

	@Autowired
	private MovieRepository movieRepository;
	
	@GetMapping("/movies")
	public Page<Movie> showPage(@RequestParam(defaultValue="0") int page){
		return movieRepository.findAll(new PageRequest(page, 9));
	}
	
	@GetMapping("/movie/{movieid}")
	public Movie getMovie(@PathVariable Long movieid){
		return movieRepository.findOne(movieid);
	}
	
	@DeleteMapping("/movie/{movieid}")
	public boolean detleteMovie(@PathVariable Long movieid){
		movieRepository.delete(movieid);
		return true;
	}
	
	@PutMapping("/movie")
	public Movie updateMovie(@Valid @RequestBody Movie movie, BindingResult result, Model model){
		return movieRepository.save(movie);
	}
	
	@PostMapping("/movie")
	public Movie createMovie(@Valid @RequestBody Movie movie, BindingResult result, Model model){
		return movieRepository.save(movie);	
	}
	
}
