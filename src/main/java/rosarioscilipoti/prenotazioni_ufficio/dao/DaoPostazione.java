package rosarioscilipoti.prenotazioni_ufficio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rosarioscilipoti.prenotazioni_ufficio.Utility.TipoPostazione;
import rosarioscilipoti.prenotazioni_ufficio.entites.Postazione;

import java.util.List;
@Repository
public interface DaoPostazione extends JpaRepository<Postazione,Long> {
    List<Postazione> findByTipoAndEdificio_Citta(TipoPostazione tipo, String citta);
    // Questo metodo cerca le postazioni in base al tipo di postazione e alla città dell'edificio.
// Prende in input il tipo di postazione e la città dell'edificio.
// Restituisce una lista di postazioni che corrispondono al tipo di postazione e alla città dell'edificio.
}
