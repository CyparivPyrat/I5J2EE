package com.rioc.ws.services.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {
	
	public HelloService() {}
	
	public String getHelloForName(String name) {
		return "Hello " + name + " : "+ getLenght(name);
	}
	
	private int getLenght(String name) {
		return name.length();
	}

}
