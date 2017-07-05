package org.wecancodeit.travel;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TravelController {

	@Resource
	CountryRepository countryRepo;
	@Resource
	CityRepository cityRepo;
	
	@RequestMapping("/country")
	public String fetchOneCountry(@RequestParam(value="id") Long id, Model model){
	model.addAttribute("country", countryRepo.findOne(id));
	return "country";}
	
	@RequestMapping("/countries")
	public String fetchAllCountries(Model model){
	model.addAttribute("countryAsCollection", countryRepo.findAll());
	return "countries";}

	@RequestMapping("/city")
	public String fetchCity(@RequestParam(value="id") Long id, Model model){
	model.addAttribute("city", cityRepo.findOne(id));
	return "city";
	}
	
	
}
