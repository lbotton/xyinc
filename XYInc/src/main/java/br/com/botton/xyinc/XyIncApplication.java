package br.com.botton.xyinc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("br.com.botton.xyinc.entity")
@ComponentScan({"br.com.botton.xyinc.controller","br.com.botton.xyinc.service"})
@EnableJpaRepositories("br.com.botton.xyinc.repository")
public class XyIncApplication {

	public static void main(String[] args) {
		SpringApplication.run(XyIncApplication.class, args);
	}

}
