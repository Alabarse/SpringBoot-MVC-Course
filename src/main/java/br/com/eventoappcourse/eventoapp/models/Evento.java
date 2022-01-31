package br.com.eventoappcourse.eventoapp.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "evento")
public class Evento implements Serializable {

    private static final long SERIALVERSIONUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    @NotEmpty
    private String name;
    @NotEmpty
    private String local;
    @NotEmpty
    private String data;
    @NotEmpty   
    private String horario;

    @OneToMany
    private List<Convidados> convidado;
}
