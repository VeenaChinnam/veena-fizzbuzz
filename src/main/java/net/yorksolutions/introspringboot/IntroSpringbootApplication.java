package net.yorksolutions.introspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroSpringbootApplication {

	//ts version
	/*
	public static void main(args: string[]): void{
	//some code
	 */

	public static void main(String[] args) {

		//SpringApplication.run(IntroSpringbootApplication.class, args);


		FizzBuzz fizzbuzz = new FizzBuzz(182);
		String result = fizzbuzz.play();
		System.out.println(result);


//		//String foo = "hello";
//		Greeter greeter = new Greeter("adam");
//		Greeter greeter2 = new Greeter("bob");
//		Greeter greeter3 = new Greeter("scott");
//
//		//TS
//		//console.log()
//
//		System.out.println(
//				greeter3.greet()
//		);
//
//		Greeter foo = new Greeter("joe");
//		Greeter bar = foo;
//		bar.name = "sally";
//
//		System.out.println(
//				foo.greet()
//		);
//		System.out.println(
//				bar.greet()
//		);
//
//
//		Greeter baz = new Greeter("alana");
//		Greeter baz2 = baz;
//		baz2 = null;
//
//		System.out.println(
//				baz.greet()
//		);
//
//
//		Greeter foo1 = new Greeter("alana");
//		Greeter foo2 = new Greeter("abigail");
//		Greeter foo3 = foo1;
//		foo3 = foo2;
//
//		System.out.println(
//				foo3.greet()
//		);
	}


}
