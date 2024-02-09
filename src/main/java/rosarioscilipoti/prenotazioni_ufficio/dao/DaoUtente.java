package rosarioscilipoti.prenotazioni_ufficio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rosarioscilipoti.prenotazioni_ufficio.entites.Utente;
@Repository
public interface DaoUtente extends JpaRepository<Utente,Long> {

}
