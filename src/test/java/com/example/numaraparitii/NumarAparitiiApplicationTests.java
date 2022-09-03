package com.example.numaraparitii;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NumarAparitiiApplicationTests {

    @Autowired
    NumarAparitiiCifra numarAparitiiCifra;

    @Test
    void contextLoads() {
    }

    @Test
    public void testNumarAparitiiCifra(){
        assertEquals(numarAparitiiCifra.numarAparitiiCalculat(1,24,4),"cifra 4 apare de 3 ori",
                "numarul de aparitii este calculat gresit");

    }

}
