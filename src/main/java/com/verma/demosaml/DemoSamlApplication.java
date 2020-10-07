package com.verma.demosaml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class DemoSamlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSamlApplication.class, args);
	}
	
	@RequestMapping("/")
    public String index() {
        return "index";
    }

}
