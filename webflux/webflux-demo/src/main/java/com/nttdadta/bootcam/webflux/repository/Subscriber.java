package com.nttdadta.bootcam.webflux.repository;

public class Subscriber {
	
	public static void print(Integer n) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Subsriber 1: " + n);
	}
}
