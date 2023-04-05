package com.spring.core.expression.language;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/expression/language/expconfig.xml");

		Demo d = (Demo) context.getBean("demo");
		System.out.println(d);
		
		
		//using through spelApi
		
		SpelExpressionParser  expressionParser=new SpelExpressionParser();
		Expression parseExpression = expressionParser.parseExpression("33+33");
		System.out.println(parseExpression.getValue());

	}
}
