package br.com.sakila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.sakila.repository.ActorRepository;
import br.com.sakila.repository.FilmeRepository;
@Controller

public class FilmeController {
	@Autowired
	private FilmeRepository filmeRepository;
		@GetMapping("/filme")
		
		public String home(ModelMap model)
		{
		model.addAttribute("filmes", filmeRepository.findAll());
			
			return "atores/filmes";
		}

	}
