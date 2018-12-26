package com.afdp.factory;

import com.afdp.agent.DTHRechargeAgent;
import com.afdp.agent.MobileRechargeAgent;

abstract public class AbstractAgentFactory {
	
	public MobileRechargeAgent newMobileRechargeAgent()
	{
		MobileRechargeAgent mobileRechargeAgent=null;
		
		mobileRechargeAgent=createMobileRechargeAgent();
		
		return mobileRechargeAgent;
	}
	
	public DTHRechargeAgent newDTHRechargeAgent()
	{
		DTHRechargeAgent dthRechargeAgent=null;
		
		dthRechargeAgent=createDTHRechargeAgent();
		
		return dthRechargeAgent;
	}
	
	
	
	protected abstract MobileRechargeAgent createMobileRechargeAgent();
	protected abstract DTHRechargeAgent createDTHRechargeAgent();

}
