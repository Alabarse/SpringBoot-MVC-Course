package br.com.eventoappcourse.eventoapp.repository;

import br.com.eventoappcourse.eventoapp.models.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<Evento, Long> {
    
}
