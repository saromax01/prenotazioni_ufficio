package rosarioscilipoti.prenotazioni_ufficio.dao;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rosarioscilipoti.prenotazioni_ufficio.entites.Edificio;

import java.util.List;

@Service
public class EdificioService {
    @Autowired
    private DaoEdificio daoEdificio;
    public List<Edificio> getAllEdifici() {
        return daoEdificio.findAll();
        // Questo metodo restituisce una lista di tutti gli edifici dell'azienda.
       // Utilizza il repository degli edifici per recuperare i dati dal database.
        // Restituisce una lista di oggetti Edificio che rappresentano gli edifici.
    }
}
