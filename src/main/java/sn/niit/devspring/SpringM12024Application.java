package sn.niit.devspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sn.niit.devspring.config.AppConfig;
import sn.niit.devspring.model.Adresse;
import sn.niit.devspring.model.Personne;
import sn.niit.devspring.service.Calcul;

@SpringBootApplication
public class SpringM12024Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringM12024Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.scan("sn.niit.devspring");

		Adresse adresse = context.getBean(Adresse.class);
		adresse.setRue("Rue 25");
		adresse.setMaison("224G");
		adresse.setVille("Dakar");
		//System.out.println(adresse);

		Personne personne1 = context.getBean(Personne.class);
		personne1.setPrenom("Abdoul");
		personne1.setNom("Ndiaye");
	   	System.out.println(personne1);
		//System.out.println(personne1.getAdresse());

		Calcul calcul = context.getBean(Calcul.class);
		System.out.println(calcul.addition(5, 10));
	}

}
