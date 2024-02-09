package rosarioscilipoti.prenotazioni_ufficio.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rosarioscilipoti.prenotazioni_ufficio.Utility.TipoPostazione;
import rosarioscilipoti.prenotazioni_ufficio.entites.Postazione;

import java.time.LocalDate;
import java.util.List;

@Service
public class PostazioneService {
    @Autowired
    private DaoPostazione daoPostazione;
    public List<Postazione> getPostazioniByTipoAndCitta(TipoPostazione tipo, String citta) {
        return daoPostazione.findByTipoAndEdificio_Citta(tipo, citta);
    }


    public List<Postazione> getPostazioniDisponibili(TipoPostazione tipo, String citta, LocalDate data) {
        return daoPostazione.findPostazioniDisponibiliByTipoAndCitta(tipo, citta, data);
    }

}
