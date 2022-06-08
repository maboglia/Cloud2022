package com.catgenova.viaggi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.catgenova.viaggi.entities.Documento;
import com.catgenova.viaggi.entities.Viaggio;
import com.catgenova.viaggi.repos.DocumentoDAO;
import com.catgenova.viaggi.repos.ViaggioDAO;

@SpringBootApplication
public class Prj20SpringViaggiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj20SpringViaggiApplication.class, args);
	}

	@Bean 
	public CommandLineRunner demo(ViaggioDAO repoViaggi, DocumentoDAO repoDocumento) {
		
		return pippo -> {
			
			
			String[]viaggi = {
					"ALLA SCOPERTA QUARTIERI PIÙ PITTORESCHI E SUGGESTIVI DI PARIGI",
					"TRE GIORNI IN BICICLETTA TRA I MERAVIGLIOSI PANORAMI DELLA PUSTERIA",
					"FANTASTICO TOUR TRA LE MERAVIGLIE DELL’ISOLA DI SMERALDO",
					"INFIORATA DI SPELLO E RIEVOCAZIONE DELLE “GAITE” DI BEVAGNA",
					"SOGGIORNO CON ESCURSIONI IN WELLNESS HOTEL 3*S A MALOSCO (TN)",
					"SOGGIORNO CON ESCURSIONI IN WELLNESS HOTEL 3*S A NAZ (BZ)",
					"VIAGGIO + SOGGIORNO IN VILLAGGIO 4* AL MARE IN ALL INCLUSIVE CON ESCURSIONI",
					"SPLENDIDO GARGANO"
					
					
			};
			for (String string : viaggi) {
				
				Viaggio v = new Viaggio();
				v.setDestinazione(string);
				Documento d = new Documento();
				d.setPercorso("locandina.pdf");
				
				v.setDocumento(d);
				d.setViaggio(v);
				
				repoViaggi.save(v);
			}
			
			
			
			
			
			
			
		};
		
		
		
		
	}
	
	
	
	
}
