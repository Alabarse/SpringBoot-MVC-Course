package br.com.eventoappcourse.eventoapp.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "convidados")
public class Convidados implements Serializable {

    @Id
    @NotEmpty
    private String rg;
    @Column
    @NotEmpty
    private String name;

    @ManyToOne
    private Evento evento;
}
