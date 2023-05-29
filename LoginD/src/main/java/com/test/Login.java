package com.test;

public class Login {

	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPasswpord(String password) {
		this.password = password;
	}

	public String validate() {
		if (name.equals("pradeep") && password.equals("pradeep")) {
			return "success";
		} else {

			return "fails";
		}

	}
}