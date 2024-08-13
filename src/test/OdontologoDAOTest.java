package test;
import main.java.com.clinica.odontologica.dao.OdontologoDAO;

import main.java.com.clinica.odontologica.model.Odontologo;
import main.java.com.clinica.odontologica.dao.OdontologoDAOArrayListImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class OdontologoDAOTest {

    @Test
    public void testListarTodos() {
        OdontologoDAO dao = new OdontologoDAOArrayListImpl();
        Odontologo odontologo1 = new Odontologo("123", "Juan", "Perez");
        Odontologo odontologo2 = new Odontologo("456", "Ana", "Gomez");
        Odontologo odontologo3 = new Odontologo("987", "Mariana", "Cano");
        Odontologo odontologo4 = new Odontologo("567", "Oscar", "Garcia");

        dao.guardar(odontologo1);
        dao.guardar(odontologo2);
        dao.guardar(odontologo3);
        dao.guardar(odontologo4);

        List<Odontologo> odontologos = dao.listarTodos();

        assertEquals(4, odontologos.size());
        assertTrue(odontologos.contains(odontologo1));
        assertTrue(odontologos.contains(odontologo2));
        assertTrue(odontologos.contains(odontologo3));
    }
}
