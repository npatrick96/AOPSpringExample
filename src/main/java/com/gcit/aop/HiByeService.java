package com.gcit.aop;

import org.springframework.stereotype.Component;

@Component
public class HiByeService {
	public void sayHi(String name) {
		System.out.println("Hi " + name);
	}

	public void sayBye(String lastname) {
		System.out.println("Bye Mr. " + lastname);
	}

	public String returnSomething() {
		return "This is a return something method";
	}
}
