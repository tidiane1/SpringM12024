package sn.niit.devspring.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Calcul {
    public int addition(int nombre1, int nombre2){
        return nombre1 + nombre2;
    }
}
