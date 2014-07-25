package com.joinway.admin.bean.form;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

import com.joinway.bean.form.Form;
import com.joinway.bean.logging.annotation.LogIgnore;

public class PushHtmlForm extends Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1834597870964496690L;

	@Min(1)
	int userId;
	
	@NotBlank
	@LogIgnore
	String html;
	
	@NotBlank
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}

