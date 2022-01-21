package br.com.eventoappcourse.eventoapp.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Evento implements Serializable{
    
    private static final long SERIALVERSIONUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    private String name;
    private String local;
    private String data;
    private String horario;
}
