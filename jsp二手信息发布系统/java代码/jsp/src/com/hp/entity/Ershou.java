package com.hp.entity;

import java.util.Date;

public class Ershou {
  private int id;
  private String name;
  private String kind;
  private int money;
  private String faburen;
  private String phone;
  private Date time;
  private String qingkuang;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getKind() {
	return kind;
}
public void setKind(String kind) {
	this.kind = kind;
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
public String getFaburen() {
	return faburen;
}
public void setFaburen(String faburen) {
	this.faburen = faburen;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Date getTime() {
	return time;
}
public void setTime(Date time) {
	this.time = time;
}
public String getQingkuang() {
	return qingkuang;
}
public void setQingkuang(String qingkuang) {
	this.qingkuang = qingkuang;
}
public Ershou(int id, String name, String kind, int money, String faburen,
		String phone, Date time, String qingkuang) {
	super();
	this.id = id;
	this.name = name;
	this.kind = kind;
	this.money = money;
	this.faburen = faburen;
	this.phone = phone;
	this.time = time;
	this.qingkuang = qingkuang;
}
public Ershou() {
	super();
	// TODO Auto-generated constructor stub
}
public Ershou(int id2, String name2, String kind2, int money2, String faburen2,
		String phone2, String time2, String qingkuang2) {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Ershou [id=" + id + ", name=" + name + ", kind=" + kind
			+ ", money=" + money + ", faburen=" + faburen + ", phone=" + phone
			+ ", time=" + time + ", qingkuang=" + qingkuang + "]";
}

  
}
