package sn.niit.devspring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Greating {
    @GetMapping("/greating")
    public String greating(){
        return "Hello: Bonjour";
    }
}
