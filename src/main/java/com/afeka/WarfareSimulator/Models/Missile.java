package com.afeka.WarfareSimulator.Models;

public class Missile{
	
	protected String id;
	protected Location destination;
	protected double launchTime;
	protected double flyTime;
	protected double damage;
	
	public Missile (String id, Location destination, double launchTime, double flyTime, double damage) {
		this.id = id;
		this.destination = destination;
		this.launchTime = launchTime;
		this.flyTime = flyTime;
		this.damage = damage;
	}
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
