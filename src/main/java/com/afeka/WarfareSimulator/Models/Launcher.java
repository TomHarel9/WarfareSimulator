package com.afeka.WarfareSimulator.Models;

import java.util.ArrayList;

public class Launcher {
	
	private String id;
	private boolean isHidden;
	private ArrayList<Missile> missiles;
	
	
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
