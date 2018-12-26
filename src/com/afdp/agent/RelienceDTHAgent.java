package com.afdp.agent;

public class RelienceDTHAgent implements DTHRechargeAgent{

	@Override
	public String recharge(String dthNo, String amount, String pkg) {
		
		return "Recharge Sucessfully for Relience DTH :"+dthNo;
	}
	
	

}
