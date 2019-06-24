//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.21 at 06:51:34 PM CEST 
//

package com.megatravel.model.hotel;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.megatravel.dto.hotel.RoomDTO;
import com.megatravel.model.room_reservation.RoomReservation;

@Entity
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected String description;
	protected int cancellationDays;
	protected boolean cancellationAllowed;
	protected int capacity;
	protected int numberOfBeds;
	@OneToMany(mappedBy = "room")
	protected Set<UnitPriceInformation> unitPriceInformations;
	@OneToMany(mappedBy = "roomImage")
	protected Set<Image> images;
	@OneToMany(mappedBy = "roomReservation")
	protected Set<RoomReservation> roomReservations;
	@ManyToOne()
	protected AccomodationType accomodationType;
	@ManyToOne()
	protected Hotel roomsHotel;
	protected double currentlyPrice;
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastChangedTime;
	
	public Room() {
	}

	public Room(RoomDTO roomDTO) {
		this.id = roomDTO.getId();
		this.description = roomDTO.getDescription();
		this.cancellationDays = roomDTO.getCancellationDays();
		this.cancellationAllowed = roomDTO.isCancellationAllowed();
		this.capacity = roomDTO.getCapacity();
		this.numberOfBeds = roomDTO.getNumberOfBeds();
		this.currentlyPrice = roomDTO.getCurrentlyPrice();
		this.lastChangedTime = new Date();
	}

	public Room(com.megatravel.dtosoap.hotel.RoomDTO roomDTO) {
		this.id = roomDTO.getId();
		this.description = roomDTO.getDescription();
		this.cancellationDays = roomDTO.getCancellationDays();
		this.cancellationAllowed = roomDTO.isCancellationAllowed();
		this.capacity = roomDTO.getCapacity();
		this.numberOfBeds = roomDTO.getNumberOfBeds();
		this.currentlyPrice = roomDTO.getCurrentlyPrice();
		this.lastChangedTime = new Date();
	}
	
	public Room(Long id, String description, int cancellationDays, boolean cancellationAllowed, int capacity,
			int numberOfBeds, AccomodationType accomodationType, Hotel roomsHotel) {
		super();
		this.id = id;
		this.description = description;
		this.cancellationDays = cancellationDays;
		this.cancellationAllowed = cancellationAllowed;
		this.capacity = capacity;
		this.numberOfBeds = numberOfBeds;
		this.accomodationType = accomodationType;
		this.roomsHotel = roomsHotel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCancellationDays() {
		return cancellationDays;
	}

	public void setCancellationDays(int cancellationDays) {
		this.cancellationDays = cancellationDays;
	}

	public boolean isCancellationAllowed() {
		return cancellationAllowed;
	}

	public void setCancellationAllowed(boolean cancellationAllowed) {
		this.cancellationAllowed = cancellationAllowed;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

	public Set<UnitPriceInformation> getUnitPriceInformations() {
		return unitPriceInformations;
	}

	public void setUnitPriceInformations(Set<UnitPriceInformation> unitPriceInformations) {
		this.unitPriceInformations = unitPriceInformations;
	}

	public Set<Image> getImages() {
		return images;
	}

	public void setImages(Set<Image> images) {
		this.images = images;
	}

	public Set<RoomReservation> getRoomReservations() {
		return roomReservations;
	}

	public void setRoomReservations(Set<RoomReservation> roomReservations) {
		this.roomReservations = roomReservations;
	}

	public AccomodationType getAccomodationType() {
		return accomodationType;
	}

	public void setAccomodationType(AccomodationType accomodationType) {
		this.accomodationType = accomodationType;
	}

	public Hotel getRoomsHotel() {
		return roomsHotel;
	}

	public void setRoomsHotel(Hotel roomsHotel) {
		this.roomsHotel = roomsHotel;
	}

	public double getCurrentlyPrice() {
		return currentlyPrice;
	}

	public void setCurrentlyPrice(double currentlyPrice) {
		this.currentlyPrice = currentlyPrice;
	}

	public Date getLastChangedTime() {
		return lastChangedTime;
	}

	public void setLastChangedTime(Date lastChangedTime) {
		this.lastChangedTime = lastChangedTime;
	}
}
