package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.EmployeeImplimentatiom;

@Controller
@RequestMapping("/Emp")
public class EmployeeController {
	private EmployeeImplimentatiom ad;
    @Autowired
	public EmployeeController(EmployeeImplimentatiom ad) {
		super();
		this.ad = ad;
	}
    
    public String data(Model model) {
    	model.addAttribute("Emp", ad.getEmployee1());
    	return "Employee";
    }
	
	
}
