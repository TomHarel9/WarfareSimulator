package com.afeka.WarfareSimulator.Models;

public class Missile{
	
	private Location destination;
	private double launchTime;
	private double flyTime;
	private double damage;
	
	public Location getDestination() {
		return destination;
	}
	public void setDestination(Location destination) {
		this.destination = destination;
	}
	public double getLaunchTime() {
		return launchTime;
	}
	public void setLaunchTime(double launchTime) {
		this.launchTime = launchTime;
	}
	public double getFlyTime() {
		return flyTime;
	}
	public void setFlyTime(double flyTime) {
		this.flyTime = flyTime;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}

}
