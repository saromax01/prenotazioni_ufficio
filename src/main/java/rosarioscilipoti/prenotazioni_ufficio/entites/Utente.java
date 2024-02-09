package rosarioscilipoti.prenotazioni_ufficio.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Utente {
    @Id
    private long id;
    private String username;
    private String nomeCompleto;
    private String email;
}
