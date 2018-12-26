package com.afdp.agent;

public class AirtelMobileAgent implements MobileRechargeAgent{

	@Override
	public String recharge(String mobileNo, String amount, String pkg) {
		return "Recharge Sucessfully for Airtel Mobile:"+mobileNo;
	}
	
	

}
