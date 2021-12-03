package com.ibu.couponinfo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.ibu.couponinfo.model.Companies;
import com.ibu.couponinfo.model.CouponInfo;
import com.ibu.couponinfo.model.Deals;

@RestController
@RequestMapping("/info")
public class CouponInfoController {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{id}")
	@HystrixCommand(fallbackMethod = "getFallbackinfo" ,
	commandProperties = {
	                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
	                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
	                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
	                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000"),
	            }
	)

	public CouponInfo getCatalog(@PathVariable("id") String id) {
	
	Deals deals = restTemplate.getForObject( "http://deals/deals/find/"+id, Deals.class);
 
		
			
			Companies com = restTemplate.getForObject("http://merchants/companies/find/"+ deals.getId(), Companies.class);
			

			
			return new CouponInfo(deals.getId(),com.getC1(),deals.getCount(),com.getId());
	}
			public CouponInfo getFallbackinfo(@PathVariable("id") String id){
				return new CouponInfo(id,"not found",0,"can't find");

			
	

}
	
}
