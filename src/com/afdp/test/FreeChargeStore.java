package com.afdp.test;

import com.afdp.agent.DTHRechargeAgent;
import com.afdp.agent.MobileRechargeAgent;
import com.afdp.factory.AbstractAgentFactory;
import com.afdp.factory.AirtelAgentFactory;
import com.afdp.factory.RelienceAgentFactory;

public class FreeChargeStore {

	public boolean rechargeMobile(String provider,String amount,String accountNo,String pckg)
	{
		boolean flag = false;
		AbstractAgentFactory agentFactory=null;
		MobileRechargeAgent mobileAgent=null;
		
		if(provider.equals("airtel"))
		{
		agentFactory=new AirtelAgentFactory();
		}
		else if(provider.equals("relience"))
		{
			agentFactory=new RelienceAgentFactory();
		}
		
		
		
		mobileAgent=agentFactory.newMobileRechargeAgent();
		String status=mobileAgent.recharge(accountNo, amount, pckg);
		System.out.println(status);
		if(!status.equals(null))
		{
		flag=true;;
		}
		return flag;
	}
	
	public boolean rechargeDTH(String provider,String amount,String accountNo,String pckg)
	{
		boolean flag = false;
		AbstractAgentFactory agentFactory=null;
		DTHRechargeAgent dthAgent=null;
		
		if(provider.equals("airtel"))
		{
		agentFactory=new AirtelAgentFactory();
		}
		else if(provider.equals("relience"))
		{
			agentFactory=new RelienceAgentFactory();
		}
		
		
		
		dthAgent=agentFactory.newDTHRechargeAgent();
		String status=	dthAgent.recharge(accountNo, amount, pckg);
		System.out.println(status);
		
		if(!status.equals(null))
		{
			flag=true;
		}
			return flag;
	}

}
