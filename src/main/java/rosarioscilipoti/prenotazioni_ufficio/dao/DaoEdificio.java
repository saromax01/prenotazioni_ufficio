package rosarioscilipoti.prenotazioni_ufficio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rosarioscilipoti.prenotazioni_ufficio.entites.Edificio;
@Repository
public interface DaoEdificio  extends JpaRepository<Edificio,Long> {
    // come visto ieri rimane vuoto se vuoi.
}
