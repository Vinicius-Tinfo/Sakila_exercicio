package br.com.sakila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.sakila.repository.PaisRepository;
@Controller
public class PaisController {

	@Autowired
	private PaisRepository paisRepository;
	
@GetMapping("/pais")
	public String home(ModelMap model)
	{
	model.addAttribute("pais",paisRepository.findAll());
	return"atores/pais";
	}

}

