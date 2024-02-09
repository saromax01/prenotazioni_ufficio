package rosarioscilipoti.prenotazioni_ufficio.entites;

import jakarta.persistence.*;
import lombok.Data;
import rosarioscilipoti.prenotazioni_ufficio.Utility.TipoPostazione;

@Entity
@Data
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codice;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;
    private int numeroMassimoOccupanti;
    @ManyToOne
    private Edificio edificio;
}
