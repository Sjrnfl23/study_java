package com.urdomain.lecture.ch07;

public abstract class Phone {
	public String owner;
	
	/*
	 * public Phone(String owner) { this.owner=owner; }
	 */
 public void turnOn() {
	 System.out.println(owner+" 가 폰 전원을 켭니다.");
 }
 public void turnOff() {
	 System.out.println("폰 전원을 끕니다");
 }
}
