import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PublicacionTest {
    public void testConstructorAndGetTitulo() {
       
        Publicacion publicacion = new Publicacion("Satanás", 2002);
        assertEquals("Satanás", publicacion.getTitulo(), "El título debe ser 'Satanás'");
    }

    public void testConstructorAndGetAnioPublicacion() {
        
        Publicacion publicacion = new Publicacion("Satanás", 2002);
        assertEquals(2002, publicacion.getAnioPublicacion(), "El año de publicación debe ser 2002");
    }

    public void testMostrarInfo() {
      
        Publicacion publicacion = new Publicacion("Satanás", 2002);       
        String expectedOutput = "Título: Satanás\nAño de Publicación: 2002\n";
        assertEquals(expectedOutput, getOutputFromMostrarInfo(publicacion));
    }

    public void testSetAndGetTitulo() {
     
        Publicacion publicacion = new Publicacion("Satanás", 2002);        
        publicacion.setTitulo("Satanás");
        assertEquals("Satanás", publicacion.getTitulo(), "El título debe ser 'Satanás'");
    }

    public void testSetAndGetAnioPublicacion() {
        
        Publicacion publicacion = new Publicacion("Satanás", 2002);     
        publicacion.setAnioPublicacion(2002);
        assertEquals(2002, publicacion.getAnioPublicacion(), "El año de publicación debe ser 2002");
    }
}
