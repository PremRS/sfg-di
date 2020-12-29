package com.sample.sfgdi;

import com.sample.sfgdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("-----* I18n *-----");
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.getGreeting());

		System.out.println("-----* Primary *-----");
		MyController controller = (MyController) context.getBean("myController");
		System.out.println(controller.sayHi());

		System.out.println("-----* Property *-----");
		PropertyInjectorController propertyInjectorController = (PropertyInjectorController) context.getBean("propertyInjectorController");
		System.out.println(propertyInjectorController.getGreeting());

		System.out.println("-----* Setter *-----");
		SetterInjectorController setterInjectorController = (SetterInjectorController) context.getBean("setterInjectorController");
		System.out.println(setterInjectorController.getGreeting());

		System.out.println("-----* Constructor *-----");
		ConstructorInjectorController constructorInjectorController = (ConstructorInjectorController) context.getBean("constructorInjectorController");
		System.out.println(constructorInjectorController.getGreeting());
	}

}
