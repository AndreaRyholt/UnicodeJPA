package com.example.unicodejpa.config;

import com.example.unicodejpa.model.Unicode;
import com.example.unicodejpa.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) throws Exception {
        Set<Character> charSet = new HashSet<>();
        Unicode unicode = new Unicode();

        for (int i=1;i <=Character.MAX_VALUE;i++) {
            char character = (char)i;
            if (charSet.add(character)) {
                unicode.setC(character);
                unicodeRepository.save(unicode);
            }
        }


    }
    }
