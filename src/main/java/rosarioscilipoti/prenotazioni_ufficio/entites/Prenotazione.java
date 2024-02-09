package rosarioscilipoti.prenotazioni_ufficio.entites;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Postazione postazione;
    @ManyToOne
    private Utente utente;
    private LocalDate dataPrenotazione;

    public Prenotazione(Postazione postazione, Utente utente, LocalDate dataPrenotazione) {
        this.postazione = postazione;
        this.utente = utente;
        this.dataPrenotazione = dataPrenotazione;
    }
}