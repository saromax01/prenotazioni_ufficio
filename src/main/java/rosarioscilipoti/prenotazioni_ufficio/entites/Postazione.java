package rosarioscilipoti.prenotazioni_ufficio.entites;

import jakarta.persistence.*;
import lombok.*;
import rosarioscilipoti.prenotazioni_ufficio.Utility.TipoPostazione;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
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

    public Postazione(String codice, String descrizione, TipoPostazione tipo, int numeroMassimoOccupanti, Edificio edificio) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numeroMassimoOccupanti = numeroMassimoOccupanti;
        this.edificio = edificio;
    }
}
