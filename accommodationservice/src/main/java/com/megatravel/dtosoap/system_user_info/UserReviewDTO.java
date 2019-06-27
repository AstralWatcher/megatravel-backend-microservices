//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.21 at 06:51:34 PM CEST 
//


package com.megatravel.dtosoap.system_user_info;

import java.util.Date;

import com.megatravel.dtosoap.hotel.RoomDTO;
import com.megatravel.model.system_user_info.UserReview;

public class UserReviewDTO {

    protected long id;
    protected int rating;
    protected String comment;
    protected Date timeStamp;
    protected RoomDTO roomDTO;
    protected SystemUserInfoDTO systemUserInfoDTO;
    protected boolean approved;
    protected Date lastChangedTime;

    public UserReviewDTO() { }
    
    public UserReviewDTO(UserReview userReview) {
    	this.id = userReview.getId();
    	this.rating = userReview.getRating();
    	this.comment = userReview.getComment();
    	this.timeStamp = userReview.getTimeStamp();
    	this.systemUserInfoDTO = (userReview.getUser() == null) ? null : new SystemUserInfoDTO(userReview.getUser());
    	this.approved = userReview.isApproved();
    	this.lastChangedTime = userReview.getLastChangedTime();
    }
    
    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     */
    public int getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     */
    public void setRating(int value) {
        this.rating = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(Date value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the roomDTO property.
     * 
     * @return
     *     possible object is
     *     {@link RoomDTO }
     *     
     */
    public RoomDTO getRoomDTO() {
        return roomDTO;
    }

    /**
     * Sets the value of the roomDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomDTO }
     *     
     */
    public void setRoomDTO(RoomDTO value) {
        this.roomDTO = value;
    }

    /**
     * Gets the value of the systemUserInfoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link SystemUserInfoDTO }
     *     
     */
    public SystemUserInfoDTO getSystemUserInfoDTO() {
        return systemUserInfoDTO;
    }

    /**
     * Sets the value of the systemUserInfoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemUserInfoDTO }
     *     
     */
    public void setSystemUserInfoDTO(SystemUserInfoDTO value) {
        this.systemUserInfoDTO = value;
    }

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public Date getLastChangedTime() {
		return lastChangedTime;
	}

	public void setLastChangedTime(Date lastChangedTime) {
		this.lastChangedTime = lastChangedTime;
	}

	
}