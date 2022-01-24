package br.com.felipe.fnchat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.felipe.fnchat.dto.MessageDTO;
import br.com.felipe.fnchat.entities.Message;
import br.com.felipe.fnchat.repositories.MessageRepository;

@Service
public class MessageService {
	@Autowired
	private MessageRepository messageRepository;

	@Transactional(readOnly = true)
	public Page<MessageDTO> finAll(Pageable pageable) {
		Page<Message> result = messageRepository.findAll(pageable);
		Page<MessageDTO> page = result.map(x -> new MessageDTO(x));
		return page;
	}

	@Transactional(readOnly = true)
	public MessageDTO finById(Long id) {
		Message result = messageRepository.findById(id).get();
		MessageDTO dto = new MessageDTO(result);
		return dto;
	}
}
