package com.sky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sky.service.ActorService;
import com.sky.service.ActorServiceImpl;

@Controller
@RequestMapping("/actor")
public class ActorController {

	private ActorService actorService = new ActorServiceImpl();
	

	public ActorService getActorService() {
		return actorService;
	}


	public void setActorService(ActorService actorService) {
		this.actorService = actorService;
	}


	@RequestMapping(value = "/getActors" , method= RequestMethod.GET)
	public ModelAndView getActors() {
		
		return new ModelAndView("actorlist", "actorlist", actorService.getActors());

}
}
