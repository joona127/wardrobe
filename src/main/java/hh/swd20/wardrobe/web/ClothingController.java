package hh.swd20.wardrobe.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.CrossOrigin;

import hh.swd20.wardrobe.domain.Clothing;
import hh.swd20.wardrobe.domain.ClothingRepository;
import hh.swd20.wardrobe.domain.OwnerRepository;
import hh.swd20.wardrobe.domain.TypeRepository;

@CrossOrigin
@Controller
public class ClothingController {
	
	@Autowired
	private ClothingRepository clothingrepository;
	@Autowired
	private TypeRepository typerepository;
	@Autowired
	private OwnerRepository ownerrepository;

	@RequestMapping("/clothes")
	public String ClothingList(Model model) {
	     model.addAttribute("clothes", clothingrepository.findAll());
		
		return "clothes";
	}
	
	@RequestMapping(value = "/add")
	public String addClothes(Model model) {
		model.addAttribute("clothing", new Clothing());
		model.addAttribute("types", typerepository.findAll());
		model.addAttribute("owner", ownerrepository.findAll());
		return "addclothes";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteClothes(@PathVariable("id") Long ClothingId, Model model) {
		clothingrepository.deleteById(ClothingId);
		return "redirect:../clothes";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Clothing clothing) {
		clothingrepository.save(clothing);
		return "redirect:../clothes";
	}
	
}
