package br.com.eventoappcourse.eventoapp.repository;

import br.com.eventoappcourse.eventoapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento, Long> {
    
}
