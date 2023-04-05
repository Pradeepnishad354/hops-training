package com.aop.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
public class MyAspect {
	
	
	public void pritnBefore(Joinpoint my) {
		
		System.out.println("payment started..");
	}

}
