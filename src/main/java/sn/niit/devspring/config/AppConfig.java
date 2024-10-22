package sn.niit.devspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sn.niit.devspring.model.Adresse;
import sn.niit.devspring.model.Personne;

@Configuration
public class AppConfig {
    @Bean
    Adresse adresse(){
        return new Adresse();
    }
    @Bean
    Personne personne(){
        return new Personne(null, null);
    }
}
