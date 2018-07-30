package sahli.springFramework.Chucknorrisforactuator.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sahli.springFramework.Chucknorrisforactuator.services.JokeService;


@Controller
public class JokesController {

	 private JokeService jokeService;
	
	
	
	
	public JokesController(JokeService jokeService) {
	 
		this.jokeService = jokeService;
	}
 

	//@RequestMapping({"/",""})
	@RequestMapping("/jokes")
	public String getRandomJoke(Model model){
		
		 model.addAttribute("joke",jokeService.getRandomJoke());
 		return "jokes";
	}
}
