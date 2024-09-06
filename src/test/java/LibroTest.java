import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {
    private Libro libro;

    public void setUp() {
        libro = new Libro("Satanás", 2002, "Mario Mendoza", 280);
    }
  
    public void testGetAutor() {
        assertEquals("Mario Mendoza", libro.getAutor());
    }
    
    public void testSetAutor() {
        libro.setAutor("Mario Mendoza");
        assertEquals("Mario Mendoza", libro.getAutor());
    }

    public void testGetNumeroPaginas() {
        assertEquals(280, libro.getNumeroPaginas());
    }
    public void testSetNumeroPaginas() {
        libro.setNumeroPaginas(280);
        assertEquals(280, libro.getNumeroPaginas());
    }

    public void testGetTitulo() {
        assertEquals("Satanás", libro.getTitulo());
    }

    public void testSetTitulo() {
        libro.setTitulo("Satanás");
        assertEquals("Satanás", libro.getTitulo());
    }

    public void testGetAnioPublicacion() {
        assertEquals(2002, libro.getAnioPublicacion());
    }

    public void testSetAnioPublicacion() {
        libro.setAnioPublicacion(2002);
        assertEquals(2002, libro.getAnioPublicacion());
    }

}
