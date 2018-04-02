package com.ty.entity;

import java.util.Date;

public class User {
	private int uId;
	private String uName;
	private String uPwd;
	private Date uBirthDay;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	public Date getuBirthDay() {
		return uBirthDay;
	}
	public void setuBirthDay(Date uBirthDay) {
		this.uBirthDay = uBirthDay;
	}
	public User(int uId, String uName, String uPwd, Date uBirthDay) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uPwd = uPwd;
		this.uBirthDay = uBirthDay;
	}
	public User() {
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPwd=" + uPwd + ", uBirthDay=" + uBirthDay + "]";
	}
}
