//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.11 at 09:48:04 PM CEST 
//

package com.megatravel.model.system_user_info;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.megatravel.dto.system_user_info.MessageDTO;

@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected String caption;
	protected String text;
	protected boolean opened;
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date lastChangedTime;
	protected Date date;
	@ManyToOne()
	protected User sender;
	@ManyToOne()
	protected User receiver;
	@ManyToOne()
	protected Chat chat;

	public Message() {

	}

	public Message(com.megatravel.dtosoap.system_user_info.MessageDTO messageDTO ) {
		this.id = messageDTO.getId();
		this.caption = messageDTO.getCaption();
		this.text = messageDTO.getText();
		this.opened = messageDTO.isOpened();
		this.date = messageDTO.getDate();
		this.lastChangedTime = new Date();
		//this.sender = messageDTO.getSender() != null ? new User(messageDTO.getSender()) : null;
		//this.receiver = messageDTO.getReceiver() != null ? new User(messageDTO.getReceiver()) : null;
	}
	
	public Message(MessageDTO messageDTO) {
		this.id = messageDTO.getId();
		this.caption = messageDTO.getCaption();
		this.text = messageDTO.getText();
		this.opened = messageDTO.isOpened();
		this.date = messageDTO.getDate();
		this.lastChangedTime = new Date();
		this.sender = messageDTO.getSender() != null ? new User(messageDTO.getSender()) : null;
		this.receiver = messageDTO.getReceiver() != null ? new User(messageDTO.getReceiver()) : null;
	}

	public Message(Long id, String caption, String text, boolean opened, Date date, User sender, User receiver,
			Chat chat) {
		super();
		this.id = id;
		this.caption = caption;
		this.text = text;
		this.opened = opened;
		this.date = date;
		this.sender = sender;
		this.receiver = receiver;
		this.chat = chat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isOpened() {
		return opened;
	}

	public void setOpened(boolean opened) {
		this.opened = opened;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public Date getLastChangedTime() {
		return lastChangedTime;
	}

	public void setLastChangedTime(Date lastChangedTime) {
		this.lastChangedTime = lastChangedTime;
	}
}