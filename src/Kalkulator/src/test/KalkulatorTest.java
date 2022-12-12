package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.Kalkulator;

public class KalkulatorTest {
    Kalkulator kalkulator;

    @BeforeEach
    void setUp() {
        kalkulator = new Kalkulator();
    }

    @Test
    void tambahTest() {
        assertEquals(5.0, kalkulator.tambah(2.0, 3.0),
                "penjumlahan salah");
    }

    @Test
    void kurangTest(){
        assertEquals(6.0, kalkulator.kurang(9.0, 3.0),
                "pengurangan salah");
    }

    @Test
    void kaliTest(){
        assertEquals(27.0, kalkulator.kali(9.0, 3.0),
                "perkalian salah");
    }

    @Test
    void bagiTest(){
        assertEquals(3.0, kalkulator.bagi(9.0, 3.0),
                "pembagian salah");
    }

    @Test
    void perkalianBesarTest(){
        assertTimeout(
            Duration.ofSeconds(1),
            ()->kalkulator.kali(99999999.0, 99999999.0)
        );
    }
}
