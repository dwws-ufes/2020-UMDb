package com.ufes.inf.dwws.umdb.application;

import java.util.List;
import java.util.Optional;

public interface ActorService {

	
	public Actor update(Actor autor);
	
	
	
	
	public Optional<Actor> findActorById(Long id);
	public List<Actor> findAllActors();
	public Actor saveActor(Actor actor);
	public void deleteActor(Actor actor);

}