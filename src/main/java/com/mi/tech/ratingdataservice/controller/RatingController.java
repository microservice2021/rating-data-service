package com.mi.tech.ratingdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mi.tech.ratingdataservice.model.Rating;
import com.mi.tech.ratingdataservice.model.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating("100", 4);
	}
	
	@GetMapping("/users/{userId}")
	public UserRating getRatingByUserId(@PathVariable("userId") String userId) {
		
		 List<Rating> ratings=Arrays.asList(
					new Rating("111", 4),
					new Rating("112", 2),
					new Rating("113", 3),
					new Rating("114", 5)
					
					);
		 UserRating userRating=new UserRating();
		 userRating.setUserRatings(ratings);
		return userRating;
	}

}
