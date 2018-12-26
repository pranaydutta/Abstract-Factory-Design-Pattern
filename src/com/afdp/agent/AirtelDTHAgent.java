package com.afdp.agent;

public class AirtelDTHAgent implements DTHRechargeAgent{

	@Override
	public String recharge(String dthNo, String amount, String pkg) {
		return "Recharge Sucessfully for Airtel DTH :"+dthNo;
	}
	
	

}
