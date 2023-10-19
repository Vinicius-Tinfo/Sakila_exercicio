package br.com.sakila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.sakila.repository.ActorRepository;

@Controller
public class ActorController {
	
	@Autowired
	private ActorRepository actorRepository;
	
	@GetMapping("/")
	public String home(ModelMap model)
	{
		model.addAttribute("atores", actorRepository.findAll());
		return "atores/atores";
	}

}
