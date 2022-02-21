package com.codingdojo.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("/travel/{place}")
	public String index(@PathVariable("place") String place) {
		return "Contratulations! you will soon travel to "+place;	
	}
	@RequestMapping("/lotto/{num}")
	public String lotto(@PathVariable("num") Integer num) {
		if (num % 2==0) {
			return "you will take a grand journey in the near future, but be wary of tempting offers ";
		} else {
			return "you have to enjoy the fruits of your labor but now its a great time to spen time with family and friends";
		}
	}
}
