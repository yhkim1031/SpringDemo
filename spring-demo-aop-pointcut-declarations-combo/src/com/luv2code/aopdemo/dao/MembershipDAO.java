package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public boolean addSillyMember() {
		System.out.println(getClass() + ": Doing stuff: adding a membership account");
		return true;
	}
	
	public void goToSleep() {
		System.out.println(getClass()+": i'm going to sleep");
	}
	
}
