/*
Lord Mendoza
SWE 645 - HW 3

This class is the main entrypoint of springboot and initializes the servlet for when tomcat invokes it.
 */

package com.swe645.hw3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Hw3Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(Hw3Application.class, args);
	}
}
