package br.com.eventoappcourse.eventoapp.repository;

import br.com.eventoappcourse.eventoapp.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

    Evento findByCodigo(Long codigo);
}
//
