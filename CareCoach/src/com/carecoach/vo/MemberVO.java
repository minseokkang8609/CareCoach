package com.carecoach.vo;

import java.sql.Timestamp;

public class MemberVO {
	
	private String user_id;
	private String password;
	private String nickname;
	private String email;
	private int is_deleted;
	private String profile_image;
	private String bio;
	private String roles;
	private Timestamp indate;
		  
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}
	public String getProfile_image() {
		return profile_image;
	}
	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public Timestamp getIndate() {
		return indate;
	}
	public void setIndate(Timestamp indate) {
		this.indate = indate;
	}

}

