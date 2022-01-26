package br.com.eventoappcourse.eventoapp.repository;

import br.com.eventoappcourse.eventoapp.models.Convidados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvidadosRepository extends JpaRepository<Convidados, String>{
    
}
