package com.hp.entity;

public class Admin {
	private int id;
	private String username;
	private String password;
	private String shouji;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getShouji() {
		return shouji;
	}
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	public Admin(int id, String username, String password, String shouji) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.shouji = shouji;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", password="
				+ password + ", shouji=" + shouji + "]";
	}
	 
}
