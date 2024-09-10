package com.project01.spring_boot_call_app;

import java.net.URI;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class SpringBootCallAppApplication implements ApplicationRunner {

	private final static String SID_ACCOUNT = "57a4f61e73d5d49979e709a1c04d9ab";// entered dummy val here
	private final static String AUTH_ID = "41044f607557a4f61e5d49979e70";// entered dummy val here
	private final static String FROM_NUMBER = "+12512775426";
	private final static String TO_NUMBER = "+";// entered dummy val here 
	
	static {
		Twilio.init(SID_ACCOUNT, AUTH_ID);
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCallAppApplication.class , args);
		System.out.println("here2...");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Call.creator(new PhoneNumber(TO_NUMBER) , new PhoneNumber(FROM_NUMBER) , new URI("http://demo.twilio.com/docs/voice.xml") ).create();
		System.out.println("here1...");
		
		
	}

}
