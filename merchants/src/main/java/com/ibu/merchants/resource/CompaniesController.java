package com.ibu.merchants.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibu.merchants.model.Companies;
import com.ibu.merchants.repo.CompaniesRepo;

@RestController
@RequestMapping("/companies")
public class CompaniesController {
	
	@Autowired
	private CompaniesRepo eRepo;
	
	@PostMapping("/add")
	public Companies getcompany(@RequestBody Companies com)
	{
		Companies c = eRepo.save(com);
		return c;
	}
	
	@GetMapping("/find/{id}")
	public Optional<Companies> getcomByid(@PathVariable ("id") String id)
	{
		Optional<Companies> c = eRepo.findById(id);
		return c;
	}
	
	@GetMapping("/findall")
	public List <Companies> getAllcom()
	{
		return (List<Companies>) eRepo.findAll();
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String delcom(@PathVariable ("id") String id)
	{
		eRepo.deleteById(id);
	    return "id no "+id+" is deleted ";
	}
	
	@PutMapping("/update")
	public Companies updatecom(Companies com)
	{
	 Companies c = eRepo.save(com);
	   return c;
	}
	


}
