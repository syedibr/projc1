package com.ibu.deals.resource;

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

import com.ibu.deals.model.Deals;
import com.ibu.deals.repo.DealsRepo;

@RestController
@RequestMapping("/deals")
public class DealsController {
	@Autowired
	private DealsRepo eRepo;
	
	@PostMapping("/add")
	public Deals getDeals(@RequestBody Deals deals)
	{
		Deals d = eRepo.save(deals);
		return d;
	}
	
	@GetMapping("/find/{id}")
	public Optional<Deals> getByid(@PathVariable ("id") String id)
	{
		Optional<Deals> d = eRepo.findById(id);
		return d;
		
	}
	
	@GetMapping("/findall")
	public List <Deals> getAll()
	{
		return (List<Deals>) eRepo.findAll();
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String del(@PathVariable ("id") String id)
	{
		eRepo.deleteById(id);
	    return "id no "+id+" is deleted ";
	}
	
	@PutMapping("/update/{id}")
	public Deals update(Deals deals)
	{
	   Deals d = eRepo.save(deals);
	   return d;
	}
	

}
