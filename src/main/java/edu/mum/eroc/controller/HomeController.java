package edu.mum.eroc.controller;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.eroc.domain.Company;
import edu.mum.eroc.service.IRocService;

@Controller
public class HomeController {
	
	@Autowired 
	IRocService rocService;
@RequestMapping("/")
public String homePage(){
	return "index";
}

@RequestMapping(value="/register", method=RequestMethod.GET)
public String register(@ModelAttribute("company") Company company){
	return "register";
}

@RequestMapping(value="/register", method=RequestMethod.POST)
public String registerCompany(@Valid @ModelAttribute("company") Company company,Model model ){
	rocService.save(company);
    return "success";
}
}
