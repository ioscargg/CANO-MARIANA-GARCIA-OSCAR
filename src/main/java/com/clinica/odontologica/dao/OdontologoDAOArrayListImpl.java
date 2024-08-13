package main.java.com.clinica.odontologica.dao;

import main.java.com.clinica.odontologica.model.Odontologo;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOArrayListImpl implements OdontologoDAO {

    private static final Logger logger = LogManager.getLogger(OdontologoDAOArrayListImpl.class);
    private List<Odontologo> odontologos = new ArrayList<>();

    @Override
    public void guardar(Odontologo odontologo) {
        odontologos.add(odontologo);
        logger.info("Odontólogo guardado: " + odontologo);
    }

    @Override
    public List<Odontologo> listarTodos() {
        logger.info("Listando todos los odontólogos.");
        return new ArrayList<>(odontologos);
    }
}
