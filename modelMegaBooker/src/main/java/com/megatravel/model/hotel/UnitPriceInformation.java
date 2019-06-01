//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.21 at 06:51:34 PM CEST 
//


package com.megatravel.model.hotel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.megatravel.dto.hotel.UnitPriceInformationDTO;
import com.megatravel.model.global_parameters.CurrencyPrice;


@Entity
public class UnitPriceInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
	@OneToOne()
    protected CurrencyPrice price;
    @ManyToOne()
    protected Room room;
    @ManyToOne()
    protected PriceList priceList;
    
    public UnitPriceInformation(UnitPriceInformationDTO unitPriceInformationDTO) {
		this.id = unitPriceInformationDTO.getId();
		this.price = unitPriceInformationDTO.getPrice() != null ? new CurrencyPrice(unitPriceInformationDTO.getPrice()) : null;
		//this.room = ;//unitPriceInformationDTO.getRoom() != null ? new Room(unitPriceInformationDTO.getRoom()) : null;
	}
    
	public UnitPriceInformation(Long id, CurrencyPrice price, Room room) {
		super();
		this.id = id;
		this.price = price;
		this.room = room;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CurrencyPrice getPrice() {
		return price;
	}

	public void setPrice(CurrencyPrice price) {
		this.price = price;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public PriceList getPriceList() {
		return priceList;
	}

	public void setPriceList(PriceList priceList) {
		this.priceList = priceList;
	}
}
