package br.com.sakila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.sakila.repository.CustomerRepository;
@Controller
public class CustomerController {	
	@Autowired
	private CustomerRepository customerRepository;
		@GetMapping("/customer")
		public String home(ModelMap model)
		{
			model.addAttribute("customer", customerRepository.findAll());
			return "atores/customer";
		}

	}
