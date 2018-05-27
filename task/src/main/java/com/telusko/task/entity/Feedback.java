package com.telusko.task.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {
	private String name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private int  id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	private String email;
	private String reg;
	private String code;
	private String msg;
	public String getName() {
		return name;
	}
	
	public Feedback() {}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Feedback [id="+id+",name=" + name + ", email=" + email + ", reg=" + reg + ", code=" + code + ", msg=" + msg + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Feedback(int id,String name, String email, String reg, String code, String msg) {
		super();
		this.id=id;
		this.name = name;
		this.email = email;
		this.reg = reg;
		this.code = code;
		this.msg = msg;
	}
	

}
