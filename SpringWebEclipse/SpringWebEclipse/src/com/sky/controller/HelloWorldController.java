package com.sky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sky.forms.Contact;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {

		String message = "Hello World, Spring 3.0!";
		return new ModelAndView("hello", "message", message);

}
	@RequestMapping("/hellojson")
	@ResponseBody
	public Contact helloWorldJson() {

		Contact c = new Contact();
		c.setFirstname("MyFirstName");
		c.setLastname("MyLastName");
		
		return  c;

}

	@RequestMapping(value = "/fgbrest/*",  method = RequestMethod.POST)
	@ResponseBody
	public String callRest(HttpServletRequest request, @RequestBody String inputStr) {
		System.out.println(request.getRequestURI());
		return "sss"; 	

}
	 
}