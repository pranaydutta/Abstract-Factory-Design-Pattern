package com.afdp.factory;

import com.afdp.agent.DTHRechargeAgent;
import com.afdp.agent.MobileRechargeAgent;
import com.afdp.agent.RelienceDTHAgent;
import com.afdp.agent.RelienceMobileAgent;

public class RelienceAgentFactory extends AbstractAgentFactory{

	@Override
	protected MobileRechargeAgent createMobileRechargeAgent() {
		return new RelienceMobileAgent();
	}

	@Override
	protected DTHRechargeAgent createDTHRechargeAgent() {
		return new RelienceDTHAgent();
	}
	
	

}
