package com.fullstack.todo.resource.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long timesTemp;
	private Integer status;
	private String message;
		
	public StandardError() {
		super();
	}

	public StandardError(Long timesTemp, Integer status, String message) {
		this.timesTemp = timesTemp;
		this.status = status;
		this.message = message;
	}

	public Long getTimesTemp() {
		return timesTemp;
	}

	public void setTimesTemp(Long timesTemp) {
		this.timesTemp = timesTemp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
