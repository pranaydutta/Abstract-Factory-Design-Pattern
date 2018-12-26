package com.afdp.test;

public class FreeChargeTest {

	public static void main(String[] args) {
		
		boolean status=new FreeChargeStore().rechargeDTH("airtel", "200", "9538700913", "combo");
		System.out.println(status);

	}

}
