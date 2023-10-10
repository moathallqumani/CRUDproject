package com.example.crudproject.response;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BaseResponse {
	private String responseCode;

	private String message;

	private String messageAR;

	private HttpStatus Status;

	private Object entitiesResponse;

	/*
	 * public BaseResponse() { super(); this.responseCode = ""; this.message = "";
	 * this.messageAR = ""; this.Status = null; this.entitiesResponse = null; }
	 * public BaseResponse(String responseCode, String message, String messageAR,
	 * HttpStatus status, Object entitiesResponse) { super(); this.responseCode =
	 * responseCode; this.message = message; this.messageAR = messageAR; this.Status
	 * = null; this.entitiesResponse = entitiesResponse; }
	 */
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageAR() {
		return messageAR;
	}

	public void setMessageAR(String messageAR) {
		this.messageAR = messageAR;
	}

	public HttpStatus getStatus() {
		return Status;
	}

	public void setStatus(HttpStatus status) {
		Status = status;
	}

	public Object getEntitiesResponse() {
		return entitiesResponse;
	}

	public void setEntitiesResponse(Object entitiesResponse) {
		this.entitiesResponse = entitiesResponse;
	}

	@Override
	public String toString() {
		return "BaseResponse [responseCode=" + responseCode + ", message=" + message + ", messageAR=" + messageAR
				+ ", Status=" + Status + ", entitiesResponse=" + entitiesResponse + ", getResponseCode()="
				+ getResponseCode() + ", getMessage()=" + getMessage() + ", getMessageAR()=" + getMessageAR()
				+ ", getStatus()=" + getStatus() + ", getEntitiesResponse()=" + getEntitiesResponse() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}