package com.afeka.WarfareSimulator.Models;

import com.afeka.WarfareSimulator.Interfaces.Destructed;

public class DestructedMissile implements Destructed{
	
	private String id;
	private double destructAfterLaunch;
	
	
	public String getTarget() {
		return id;
	}
	public void setTarget(String target) {
		this.id = target;
	}
	public double getDestructAfterLaunch() {
		return destructAfterLaunch;
	}
	public void setDestructAfterLaunch(double destructAfterLaunch) {
		this.destructAfterLaunch = destructAfterLaunch;
	}
}
