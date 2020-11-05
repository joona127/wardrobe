package hh.swd20.wardrobe.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import hh.swd20.wardrobe.domain.Owner;
import hh.swd20.wardrobe.domain.OwnerRepository;

@Controller
public class OwnerController {
    @Autowired
	private OwnerRepository orepository;
	
	
	@RequestMapping("/ownerlist")
	public String categoryList(Model model) {
	     model.addAttribute("owners", orepository.findAll());
		
		return "ownerlist";
}
	
	@RequestMapping(value = "/addowner")
	public String addCategory(Model model) {
		model.addAttribute("owner", new Owner());
		return "addowner";
	}
	
	@RequestMapping(value = "/saveowner", method = RequestMethod.POST)
	public String save(Owner o) {
		orepository.save(o);
		return "redirect:/ownerlist";
	}
	
	
}
