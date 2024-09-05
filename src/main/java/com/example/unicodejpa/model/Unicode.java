package com.example.unicodejpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Unicode {

    @Id
    @@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int unicode;
    private char c;
    private String description;
    private String name;








}



/*
 Step4. Opret nu en ny model klasse, vi kunne kalde den Unicode, som skal mappes til MySql database med JPA.



Step6. I f.eks. InitData skriv en metode der gemmer alle de Unicode bogstaver
i unicode sql tabellen, som kan være i et Set<Character>

Step7. Opret et end point der tager 2 parametre. Et bogstav og et antal.
* Som udskriver antal bogstaver startende med bogstav. Så hvis overfører ’a’ , 10, så udskrives 10 bogstaver startende med ’a’.
* */