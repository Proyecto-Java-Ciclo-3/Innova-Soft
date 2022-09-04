package com.InnovaSoft.InnovaSoft;

import com.InnovaSoft.InnovaSoft.modelos.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//@RestController
@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class InnovaSoftApplication {

	@GetMapping("/hello")
	public String hello(){
		return "Hola ciclo 3, saldremos vivos de esto";

	}

	@GetMapping("/test")
	public String test(){

		Empresa empresa = new Empresa("Innova Soft", "Calle la jeta", "00000", "80000000-3");
		empresa.setNombre("Innova Soft SAS");

		return empresa.getNombre();

	}

	public static void main(String[] args) {
		SpringApplication.run(InnovaSoftApplication.class, args);
	}

}
