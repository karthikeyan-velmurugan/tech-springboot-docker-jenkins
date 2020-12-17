/**
 * 
 */
package com.karthik.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author karthik
 *
 */
@RestController
public class HomeController {
	
	@GetMapping("/")
	public String hello() {
		return "Hi, This is CI/CD example";
	}

}
