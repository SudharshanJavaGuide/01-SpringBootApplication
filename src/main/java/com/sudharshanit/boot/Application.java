package com.sudharshanit.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		//changes for HIS-134
		run.close();
	}
	//HIS-200 Related Changes
	public void doProcess(){
		//Code goes Here
	}

}
