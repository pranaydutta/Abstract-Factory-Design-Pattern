package com.afdp.agent;

public class RelienceMobileAgent implements MobileRechargeAgent{

	@Override
	public String recharge(String mobileNo, String amount, String pkg) {
		return "Recharge Sucessfully for Relience Mobile:"+mobileNo;
	}
	
	

}
