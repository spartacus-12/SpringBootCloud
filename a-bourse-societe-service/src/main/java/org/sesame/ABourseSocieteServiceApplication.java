package org.sesame;

import java.util.stream.Stream;

import org.sesame.dao.SocieteRepository;
import org.sesame.entities.Societe;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@EnableEurekaClient
@SpringBootApplication
public class ABourseSocieteServiceApplication {

	public static void main(String[] args) {
	ApplicationContext ctx =	SpringApplication.run(ABourseSocieteServiceApplication.class, args);
	SocieteRepository societeRepository=ctx.getBean(SocieteRepository.class);
	Stream.of("A","B","C").forEach(s-> societeRepository.save(new Societe(s)));
	societeRepository.findAll().forEach(s->System.out.println(s.getNomSociete()));
		
	}
}



