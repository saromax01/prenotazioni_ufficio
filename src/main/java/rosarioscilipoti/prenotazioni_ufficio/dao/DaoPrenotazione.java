package rosarioscilipoti.prenotazioni_ufficio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rosarioscilipoti.prenotazioni_ufficio.entites.Prenotazione;
import rosarioscilipoti.prenotazioni_ufficio.entites.Utente;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface DaoPrenotazione extends JpaRepository<Prenotazione, Long> {
    // Questo metodo cerca le prenotazioni in base all'utente e alla data di prenotazione.
// Prende in input un oggetto Utente e una data di prenotazione.
// Restituisce una lista di prenotazioni che sono fatte dall'utente specificato nella data di prenotazione specificata.
    List<Prenotazione> findByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);
}
