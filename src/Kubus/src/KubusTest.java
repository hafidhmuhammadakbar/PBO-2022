import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KubusTest {
    Kubus kubus;

    @BeforeEach
    void setUp(){
        kubus = new Kubus(); 
    }

    @Test
    void testHitungVolume(){
        assertEquals(27.0, kubus.hitungVolume(3), "Hitung volume benar");
    }

    @Test
    void testHitungLuasPermukaan(){
        assertEquals(54.0, kubus.hitungLuasPermukaan(3), "Hitung luas benar");
    }
}
