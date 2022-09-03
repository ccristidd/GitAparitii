package com.example.numaraparitii;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NumarAparitiiCifra {

    int numarInitial;
    int numarfinal;
    int cifraCautata;

    public String numarAparitiiCalculat(int numarInitial, int numarfinal, int cifraCautata) {
        List<String> numere = new ArrayList<>();

        int numarAparitii = 0;
        long numarAparitiiStream = 0l;
        for (int i = numarInitial; i <= numarfinal; i++) {
            numere.add(String.valueOf(i));

        }
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < numere.size(); i++) {
            for (char ch : numere.get(i).toCharArray()) {
                chars.add(ch);
                if (Integer.parseInt(String.valueOf(ch)) == cifraCautata) {
                    numarAparitii++;
                }
            }
        }

        //sau cu stream:
        numarAparitiiStream = numere.stream()
                .flatMapToInt(numar -> numar.chars())
                .mapToObj(i -> Character.valueOf((char) i))
                .filter(i -> Integer.parseInt(String.valueOf(i)) == cifraCautata)
                .count();
//                .collect(Collectors.toList());
        System.out.println("cifra " + cifraCautata + " apare de " + numarAparitiiStream + " ori");
        return ("cifra " + cifraCautata + " apare de " + numarAparitii + " ori");


    }
}
