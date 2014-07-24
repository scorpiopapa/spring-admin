package com.joinway.admin.bean.form;

import org.hibernate.validator.constraints.NotBlank;

import com.joinway.bean.form.Form;
import com.joinway.bean.logging.annotation.LogIgnore;

public class PushHtmlForm extends Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1834597870964496690L;

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
	
}
