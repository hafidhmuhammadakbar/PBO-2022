package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
                "penjumlahan sudah jalan");
    }

    @Test
    void kurangTest(){
        assertEquals(6.0, kalkulator.kurang(9.0, 3.0),
                "pengurangan sudah jalan");
    }

    @Test
    void kaliTest(){
        assertEquals(27.0, kalkulator.kali(9.0, 3.0),
                "kali sudah jalan");
    }

    @Test
    void bagiTest(){
        assertEquals(3.0, kalkulator.bagi(9.0, 3.0),
                "pembagian sudah jalan");
    }
}
