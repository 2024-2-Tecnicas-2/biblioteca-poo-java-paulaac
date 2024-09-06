import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RevistaTest {
private Revista revista;

    public void setUp() {
        revista = new Revista("Revista de Ciencia", 2023, 25, "Ciencia y Tecnología");
    }

    public void testGetNumeroRevista() {
        assertEquals(25, revista.getNumeroRevista());
    }

    public void testSetNumeroRevista() {
        revista.setNumeroRevista(25);
        assertEquals(25, revista.getNumeroRevista());
    }

    public void testGetNombreRevista() {
        assertEquals("Ciencia y Tecnología", revista.getNombreRevista());
    }

    public void testSetNombreRevista() {
        revista.setNombreRevista("Innovación y Futuro");
        assertEquals("Innovación y Futuro", revista.getNombreRevista());
    }

    public void testGetTitulo() {
        assertEquals("Revista de Ciencia", revista.getTitulo());
    }

    public void testSetTitulo() {
        revista.setTitulo("Revista de Tecnología");
        assertEquals("Revista de Tecnología", revista.getTitulo());
    }

    public void testGetAnioPublicacion() {
        assertEquals(2023, revista.getAnioPublicacion());
    }

    public void testSetAnioPublicacion() {
        revista.setAnioPublicacion(2023);
        assertEquals(2023, revista.getAnioPublicacion());
    }
}
