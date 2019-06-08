package com.megatravel.accommodationservice.webservices;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.web.context.WebApplicationContext;

import com.megatravel.accommodationservice.configurations.WebApplicationContextLocator;
import com.megatravel.accommodationservice.dtos.RoomDTO;
import com.megatravel.accommodationservice.interfaces.RoomServiceInterface;

@WebService(endpointInterface = "com.megatravel.accommodationservice.interfaces.RoomServiceInterface")
public class RoomServiceImpl implements RoomServiceInterface {

	public static final String ENDPOINT = "/services/rooms";
	
	public RoomServiceImpl() {
        AutowiredAnnotationBeanPostProcessor bpp = new AutowiredAnnotationBeanPostProcessor();
        WebApplicationContext currentContext = WebApplicationContextLocator.getCurrentWebApplicationContext();
        bpp.setBeanFactory(currentContext.getAutowireCapableBeanFactory());
        bpp.processInjection(this);
	}
	
	@Override
	@WebMethod
	public List<RoomDTO> getHotelRooms(Long hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@WebMethod
	public RoomDTO getRoom(Long id, Long hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@WebMethod
	public RoomDTO createRoom(RoomDTO room, Long hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@WebMethod
	public RoomDTO updateRoom(RoomDTO room, Long hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@WebMethod
	public boolean removeRoom(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}