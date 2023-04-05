package com.example.validation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.mapping.event.ValidatingMongoEventListener;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Configuration
public class ValidationConfig extends ResponseEntityExceptionHandler {

	
	@Bean
	public ValidatingMongoEventListener eventListener() {
		
		return new ValidatingMongoEventListener(validatorFactoryBean());
	}

	
	
	@Bean
	public LocalValidatorFactoryBean validatorFactoryBean() {
		
		return new LocalValidatorFactoryBean();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}




//@Override
//protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
//		HttpHeaders headers, HttpStatusCode status, WebRequest request) {
//	// Map<String,String> error=new HashMap<>();
//
//	Map<String, String> errors = new HashMap<String, String>();
//
//	ex.getBindingResult().getAllErrors().forEach((error) -> {
//		String fieldname = ((FieldError) error).getField();
//		String message = error.getDefaultMessage();
//
//		errors.put(fieldname, message);
//
//	});
//
//	return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
//}
