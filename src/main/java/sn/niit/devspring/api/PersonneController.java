package sn.niit.devspring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.niit.devspring.model.Personne;
import sn.niit.devspring.service.PersonneService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/personnes")
public class PersonneController {
    @Autowired
    PersonneService personneService;

    @GetMapping
    public List<Personne> getAllPersonne(){
        return personneService.getAllPersonne();
    }
}
