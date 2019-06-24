//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.21 at 06:51:34 PM CEST 
//

package com.megatravel.model.global_parameters;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.megatravel.dto.global_parameters.AddressDTO;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected String country;
	protected String city;
	protected String street;
	protected int streetNumber;
	protected double coordinateX;
	protected double coordinateY;
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastChangedTime;
	
	public Address() {

	}

	public Address(AddressDTO adressDTO) {
		this.id = adressDTO.getId();
		this.country = adressDTO.getCountry();
		this.city = adressDTO.getCity();
		this.street = adressDTO.getStreet();
		this.streetNumber = adressDTO.getStreetNumber();
		this.coordinateX = adressDTO.getCoordinateX();
		this.coordinateY = adressDTO.getCoordinateY();
		this.lastChangedTime = new Date();
	}

	public Address(com.megatravel.dtosoap.global_parameters.AddressDTO adressDTO) {
		this.id = adressDTO.getId();
		this.country = adressDTO.getCountry();
		this.city = adressDTO.getCity();
		this.street = adressDTO.getStreet();
		this.streetNumber = adressDTO.getStreetNumber();
		this.coordinateX = adressDTO.getCoordinateX();
		this.coordinateY = adressDTO.getCoordinateY();
		this.lastChangedTime = new Date();
	}
	
	
	public Address(Long id, String country, String city, String street, int streetNumber, double coordinateX,
			double coordinateY) {
		super();
		this.id = id;
		this.country = country;
		this.city = city;
		this.street = street;
		this.streetNumber = streetNumber;
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public double getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(double coordinateX) {
		this.coordinateX = coordinateX;
	}

	public double getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(double coordinateY) {
		this.coordinateY = coordinateY;
	}

	public Date getLastChangedTime() {
		return lastChangedTime;
	}

	public void setLastChangedTime(Date lastChangedTime) {
		this.lastChangedTime = lastChangedTime;
	}

}
