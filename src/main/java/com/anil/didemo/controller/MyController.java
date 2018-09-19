/**
 * 
 */
package com.anil.didemo.controller;

import org.springframework.stereotype.Controller;

/**
 * @author Anil_Ramesh
 *
 */
@Controller
public class MyController {
	
	public String hello() {
		System.out.println("hello");
		return "hello";
	}

}
