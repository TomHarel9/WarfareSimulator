package com.afeka.WarfareSimulator.Models;

import java.util.ArrayList;

import com.afeka.WarfareSimulator.Interfaces.Destructed;

public class Launcher {
	
	private String id;
	private boolean isHidden;
	private ArrayList<Missile> missiles;
	
	public Launcher(String id, boolean isHidden, ArrayList<Missile> missiles) {
		this.id = id;
		this.isHidden = isHidden;
		this.missiles = new ArrayList<>(missiles);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isHidden() {
		return isHidden;
	}
	public void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}
	public ArrayList<Missile> getMissiles() {
		return missiles;
	}
	public void setMissiles(ArrayList<Missile> missiles) {
		this.missiles = missiles;
	}
	
	

}
