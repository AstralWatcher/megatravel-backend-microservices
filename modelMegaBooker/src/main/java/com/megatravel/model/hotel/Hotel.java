//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.11 at 09:48:04 PM CEST 
//

package com.megatravel.model.hotel;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.megatravel.dto.hotel.HotelDTO;
import com.megatravel.model.global_parameters.Address;
import com.megatravel.model.system_user_info.Chat;
import com.megatravel.model.system_user_info.User;

@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected double rating;
	@OneToOne
	protected Address address;
	@OneToMany(mappedBy = "hotelExtraOption")
	protected Set<HotelExtraOption> hotelExtraOptions;
	@OneToMany(mappedBy = "hotel")
	protected Set<Image> image;
	@OneToMany(mappedBy = "hotelPriceList")
	protected Set<PriceList> priceList;
	@OneToMany(mappedBy = "roomsHotel")
	protected Set<Room> rooms;
	@ManyToOne()
	protected User usersHotel;
	@OneToMany(mappedBy = "chatsHotel")
	protected Set<Chat> chats;

	public Hotel() {
	}

	public Hotel(Long id, double rating, Address address) {
		super();
		this.id = id;
		this.rating = rating;
		this.address = address;
	}

	public Hotel(HotelDTO hotelDTO) {
		this.id = hotelDTO.getId();
		this.rating = hotelDTO.getRating();
		this.address = hotelDTO.getAddress() != null ? new Address(hotelDTO.getAddress()) : null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<HotelExtraOption> getHotelExtraOptions() {
		return hotelExtraOptions;
	}

	public void setHotelExtraOptions(Set<HotelExtraOption> hotelExtraOptions) {
		this.hotelExtraOptions = hotelExtraOptions;
	}

	public Set<Image> getImage() {
		return image;
	}

	public void setImage(Set<Image> image) {
		this.image = image;
	}

	public Set<Room> getRooms() {
		return rooms;
	}

	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}

	public User getUsersHotel() {
		return usersHotel;
	}

	public void setUsersHotel(User usersHotel) {
		this.usersHotel = usersHotel;
	}

	public Set<Chat> getChats() {
		return chats;
	}

	public void setChats(Set<Chat> chats) {
		this.chats = chats;
	}

	public Set<PriceList> getPriceList() {
		return priceList;
	}

	public void setPriceList(Set<PriceList> priceList) {
		this.priceList = priceList;
	}
}
