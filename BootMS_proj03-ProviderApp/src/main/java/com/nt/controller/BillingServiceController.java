package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingServiceController {

	  @Value("${server.port}")
	  private  int port;
	  @Value("${eureka.instance.instance-id}")
	private String instanceId;
	
	
	@GetMapping("/info")
	public ResponseEntity<String> getBillingInfo() {
             try {
				Thread.sleep(3000);
            	 
			} catch (Exception e) {

				e.printStackTrace();
				// TODO: handle exception
			}
		
		
		return new ResponseEntity<String>("we accept Card payment,UPI payment,Get Way Payment,net BAnking payment :::"+"INSTANCE_ID"+instanceId+"@porNumber  "+port,HttpStatus.OK);
		

	}

}
