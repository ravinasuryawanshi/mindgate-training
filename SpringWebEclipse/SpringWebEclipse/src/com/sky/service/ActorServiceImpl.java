package com.sky.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sky.domain.Actor;

@Service
public class ActorServiceImpl implements ActorService {
	List<Actor> actors;
	public ActorServiceImpl(){
		actors = new ArrayList<Actor>();
		actors.add(new Actor("a","a"));
		actors.add(new Actor("b","b"));
		actors.add(new Actor("c","c"));
		
	}
	
	public List<Actor> getActors(){
		return actors;
	}

	public void  addNewActors(Actor actor){
		actors.add(actor);
	}

	public Actor  findActorByName(String firstName){
		for (Actor actor : actors) {
			if(actor.getFirstName().equals(firstName))
				return actor;
						
		}
		return null;
		
	}
}
