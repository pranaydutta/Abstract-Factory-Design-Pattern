package com.afdp.factory;

import com.afdp.agent.AirtelDTHAgent;
import com.afdp.agent.AirtelMobileAgent;
import com.afdp.agent.DTHRechargeAgent;
import com.afdp.agent.MobileRechargeAgent;

public class AirtelAgentFactory extends AbstractAgentFactory{

	@Override
	protected MobileRechargeAgent createMobileRechargeAgent() {
		return new AirtelMobileAgent();
	}
	@Override
	protected DTHRechargeAgent createDTHRechargeAgent() {
		return new AirtelDTHAgent();
	}
	
	

}
