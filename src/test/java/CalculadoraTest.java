import com.mycompany.calculadoraprojeto.CalculadoraProjeto;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;


public class CalculadoraTest {
    private Scanner scanner;
    
    
    @Test
    public void testSomar() {
        assertEquals(1.4f, CalculadoraProjeto.somar(0.7f, 0.7f));
    }

    @Test
    public void testSubtrair() {
        assertEquals(1.0f, CalculadoraProjeto.subtarir(2.5f, 1.5f));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6.25f, CalculadoraProjeto.multiplicar(2.5f, 2.5f));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0f, CalculadoraProjeto.dividir(5.0f, 2.5f));
        assertEquals(Double.POSITIVE_INFINITY, CalculadoraProjeto.dividir(5.0f, 0.0f));
    }

    @Test
    public void testGetFloat() {
        String input = "3,5\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        scanner = new Scanner(inputStream);
        assertEquals(3.5f, CalculadoraProjeto.getFloat(scanner, "Digite um número:"), 0.01f);
    }

    @Test
    public void testPause() {
        String input = "\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        scanner = new Scanner(inputStream);
        assertDoesNotThrow(() -> CalculadoraProjeto.pause(scanner));
    }
}
