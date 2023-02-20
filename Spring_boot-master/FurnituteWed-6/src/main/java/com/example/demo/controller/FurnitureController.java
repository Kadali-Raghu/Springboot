package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Furniture;
import com.example.demo.service.FurnitureSerImplementtations;
@Controller
@RequestMapping("/market")
public class FurnitureController {
	private static final Object Furniture = null;
	private FurnitureSerImplementtations ems;
    @Autowired
	public FurnitureController(FurnitureSerImplementtations ems) {
		
		this.ems = ems;
	}
	
    @GetMapping("/Furniture") 
	public String displayAll(Model model) {
    	
    	List<Furniture> furniture=ems.showAll();
    	model.addAttribute("Furniture",furniture);
    	return "Library/FurnitureList";
    	
    }
    @GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model)
	{
    	Furniture furniture=new Furniture();
		model.addAttribute("Furniture",furniture);
		return "Library/Furniture-form";
	}
    @PostMapping("/save")
    public String addfu(@ModelAttribute ("market") Furniture furniture ,Model model) {
    	ems.insorup(furniture);
    	model.addAttribute("Furniture", furniture);
    	return "redirect:/market/Furniture";
    }
    @GetMapping("/showFormForUpdate")
	public String updateFurniture(@RequestParam("furnitureId") int id,Model model)
	{
    	Furniture furniture=ems.fetchById(id);
		model.addAttribute("Furniture",furniture);
		return "Library/Furniture-form";
	}
    @GetMapping("/delete")
	public String deleteFurniture(@RequestParam("furnitureId") int id)
	{
		ems.delete(id);
		return "redirect:/market/Furniture";
	}
//    @GetMapping
//    public String searchFurniture(@RequestParam("furnitureId") int id) {
//    	ems.findById(id);
//    	return "Library/FurnitureList";
//    	//return "redirect:/market/Furniture";
//   
  //  }
    @GetMapping("/search")
    public String getFurniture(Model model,@Param("name") String name) {
    	if(name!=null) {
    		List<Furniture> m=ems.findFurnitureByName(name);
    		model.addAttribute("Furniture",m);
    		return "Library/FurnitureList";
    		
    	}
    	else {
    		List<Furniture> m=ems.showAll();
    		model.addAttribute("Furniture",m);
    		
    	}
    	
  
    	return "redirect:/market/Furniture";

    }

}



