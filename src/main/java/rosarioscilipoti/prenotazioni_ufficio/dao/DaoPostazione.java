package rosarioscilipoti.prenotazioni_ufficio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rosarioscilipoti.prenotazioni_ufficio.Utility.TipoPostazione;
import rosarioscilipoti.prenotazioni_ufficio.entites.Postazione;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface DaoPostazione extends JpaRepository<Postazione,Long> {
    List<Postazione> findByTipoAndEdificio_Citta(TipoPostazione tipo, String citta);
    // Questo metodo cerca le postazioni in base al tipo di postazione e alla città dell'edificio.
// Prende in input il tipo di postazione e la città dell'edificio.
// Restituisce una lista di postazioni che corrispondono al tipo di postazione e alla città dell'edificio. @Query("SELECT p FROM Postazione p LEFT JOIN p.prenotazioni pr WHERE pr.dataPrenotazione = :data AND p.tipo = :tipo AND p.edificio.citta = :citta AND SIZE(p.prenotazioni) = 0")
//    List<Postazione> findPostazioniDisponibiliByTipoAndCitta(TipoPostazione tipo, String citta, LocalDate data);
    @Query("SELECT p FROM Postazione p WHERE p NOT IN (SELECT pr.postazione FROM Prenotazione pr WHERE pr.dataPrenotazione = :data) AND p.tipo = :tipo AND p.edificio.citta = :citta")
    List<Postazione> findPostazioniDisponibiliByTipoAndCitta(TipoPostazione tipo, String citta, LocalDate data);
}




