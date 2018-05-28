package com.afeka.WarfareSimulator.Models;

import java.util.ArrayList;

import com.afeka.WarfareSimulator.Interfaces.Destructed;
import com.afeka.WarfareSimulator.Interfaces.Destructor;

public class MissileDestructor implements Destructor{
	
	private String id;
	private ArrayList<Destructed> destructedMissiles;
	
	public MissileDestructor(String id, ArrayList<Destructed> destructedMissiles) {
		this.id = id;
		this.destructedMissiles = new ArrayList<>(destructedMissiles);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Destructed> getDestructedMissiles() {
		return destructedMissiles;
	}

	public void setDestructedMissiles(ArrayList<Destructed> destructedMissiles) {
		this.destructedMissiles = destructedMissiles;
	}
}
