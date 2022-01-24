package br.com.felipe.fnchat.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.felipe.fnchat.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long>{
	Optional<Message> findById(Long id);
}
