package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	
		//System.out.println("result:: " + solution(12));
		System.out.println("result:: " + detectCapital("AAAA"));
		
	}
	/*@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}*/
	
	public static boolean detectCapital(String word) {
		
		if(Character.isUpperCase(word.charAt(0)) && (Character.isUpperCase(word.charAt(1)))) {
			for(int i=2; i<word.length();i++) {
				if(Character.isLowerCase(word.charAt(i))) {
					return false;
				}
			}
		}
		else{
			for(int i=1; i<word.length();i++) {
				if(Character.isUpperCase(word.charAt(i))) {
					return false;
				}
			}
		}
		return true;
		
		
	}
	
	public static int solution(int N) {
		int n =String.valueOf(N).length();
		
		
		int[] digits = new int[n];
		int i=0;
		while(N!=0) {
			digits[i] = N % 10;
			N = N/10;
			i++;
		}
		
		Arrays.sort(digits);
		int result = 0;
		
		for(int j=n-1; j>=0; j--) {
			result = (result * 10) + digits[j];
		}
		return result;
		
	}

}
