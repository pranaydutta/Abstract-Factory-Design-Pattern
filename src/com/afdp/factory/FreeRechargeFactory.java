package com.afdp.factory;

public class FreeRechargeFactory {
	
	public static AbstractAgentFactory getAgentFactory(String provider)
	{
		AbstractAgentFactory agentFactory=null;
		
		if(provider.equals("airtel"))
		{
			agentFactory= new AirtelAgentFactory();
		}
		else if(provider.equals("relience"))
		{
			agentFactory= new RelienceAgentFactory();
		}
		return agentFactory;
		
	}
	
	

}
