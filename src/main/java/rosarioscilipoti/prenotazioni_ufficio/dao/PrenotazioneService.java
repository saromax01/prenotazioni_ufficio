package rosarioscilipoti.prenotazioni_ufficio.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rosarioscilipoti.prenotazioni_ufficio.entites.Prenotazione;
import rosarioscilipoti.prenotazioni_ufficio.entites.Utente;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioneService {
    @Autowired
    private DaoPrenotazione daoPrenotazione;


    public List<Prenotazione> getPrenotazioniByUtenteAndData(Utente utente, LocalDate dataPrenotazione) {
        return daoPrenotazione.findByUtenteAndDataPrenotazione(utente, dataPrenotazione);
        // Questo metodo restituisce una lista di prenotazioni per un determinato utente e una data di prenotazione.
       // Prende in input un oggetto Utente e una data di prenotazione.
       // Utilizza il repository delle prenotazioni per recuperare i dati dal database.
       // Restituisce una lista di prenotazioni che sono fatte dall'utente specificato nella data di prenotazione specificata.
    }
    public boolean isUtenteHaPrenotazionePerData(Utente utente, LocalDate data) {
        return daoPrenotazione.existsByUtenteAndDataPrenotazione(utente, data);
    }

}
