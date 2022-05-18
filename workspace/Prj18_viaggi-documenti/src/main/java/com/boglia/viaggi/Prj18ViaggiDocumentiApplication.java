package com.boglia.viaggi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.boglia.viaggi.entities.Documento;
import com.boglia.viaggi.entities.Viaggio;
import com.boglia.viaggi.repos.DocumentoDAO;
import com.boglia.viaggi.repos.ViaggioDAO;

@SpringBootApplication
public class Prj18ViaggiDocumentiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj18ViaggiDocumentiApplication.class, args);
	}

	@Bean
	public CommandLineRunner eseguiti(DocumentoDAO docRepo, ViaggioDAO viaggioRepo) {
		
		
		
		return a -> {
			
			Viaggio v = new Viaggio("parigi");
			Documento d = new Documento("viaggio.pdf");
			
			v.setDocumento(d);
			d.setViaggio(v);
			docRepo.save(d);
			viaggioRepo.save(v);
		};
		
		
		
		
	}
	
	
}
