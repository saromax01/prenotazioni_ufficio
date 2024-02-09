package rosarioscilipoti.prenotazioni_ufficio.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Utente {
    @Id
    private long id;
    private String username;
    private String nomeCompleto;
    private String email;

    public Utente(String username, String nomeCompleto, String email) {
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }
}
