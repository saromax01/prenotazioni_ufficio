package rosarioscilipoti.prenotazioni_ufficio.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rosarioscilipoti.prenotazioni_ufficio.entites.Utente;

import java.util.List;

@Service
public class UtenteService {
    @Autowired
    private DaoUtente daoUtente;


    public List<Utente> getAllUtenti() {
        return daoUtente.findAll();
        // Questo metodo restituisce una lista di tutti gli utenti registrati nel sistema.
       // Utilizza il repository degli utenti per recuperare i dati dal database.
       // Restituisce una lista contenente tutti gli utenti presenti nel sistema.
    }

}
