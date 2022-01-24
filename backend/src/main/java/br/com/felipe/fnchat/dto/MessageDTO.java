package br.com.felipe.fnchat.dto;

import br.com.felipe.fnchat.entities.Message;

public class MessageDTO {
	private Long id;
	private String name;
    private String message;
    
    
    public MessageDTO() {
		
	}
    
	public MessageDTO(Message m) {
		id = m.getId();
		name = m.getName();
		message = m.getMessage();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
