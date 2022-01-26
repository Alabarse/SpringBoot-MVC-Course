package br.com.eventoappcourse.eventoapp.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "convidados")
public class Convidados implements Serializable {
    @Id
    private String rg;
    @Column
    private String name;
    
    //@ManyToOne
    //private Evento evento;
}
