package com.org.codinghub.package1;

public class PrimeCal
{
	public int number,factor=0;
	public int forLoop()
	{
		int x;
		for(x=2;x<=number/2;x++)
		{
			if(number%x==0)
				factor++;
		}
		return factor;
	}
}
