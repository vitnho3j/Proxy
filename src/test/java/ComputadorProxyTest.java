import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputadorProxyTest {

    @BeforeEach
    void setUp(){
        BD.addComputador(new Computador(1, "Vitor", "Red Dragon Wheel Jack", "Ryzen 5 3400", "GTX 1080 TI", "2X 6GB FURY", "ASUS B450-M", "CORSAIR CV SERIES CV550"));
        BD.addComputador(new Computador(2, "Raí", "NZXT H710i", "AMD Ryzen 9 5950X", "RTX 3090 Aorus Master", "4x 8GB 3600Mhz Aorus", "Aorus B450 Aorus M", "Gigabyte 850W GOLD"));
    }

    @Test
    public void deveRetornarDadosComputador(){
        ComputadorProxy computador = new ComputadorProxy(1);

        assertEquals(Arrays.asList("Vitor", "Red Dragon Wheel Jack"), computador.obterDadosComputador());
    }

}
