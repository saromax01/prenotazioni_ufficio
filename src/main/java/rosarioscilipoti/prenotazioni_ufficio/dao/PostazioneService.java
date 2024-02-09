package rosarioscilipoti.prenotazioni_ufficio.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rosarioscilipoti.prenotazioni_ufficio.Utility.TipoPostazione;
import rosarioscilipoti.prenotazioni_ufficio.entites.Postazione;

import java.util.List;

@Service
public class PostazioneService {
    @Autowired
    private DaoPostazione daoPostazione;


    public List<Postazione> getPostazioniByTipoAndCitta(TipoPostazione tipo, String citta) {
        return daoPostazione.findByTipoAndEdificio_Citta(tipo, citta);
        // Questo metodo restituisce una lista di postazioni in base al tipo e alla città.
       // Prende in input il tipo di postazione desiderato e il nome della città.
      // Utilizza il repository delle postazioni per recuperare i dati dal database.
      // Restituisce una lista di postazioni che corrispondono al tipo e alla città specificati.
    }
}
