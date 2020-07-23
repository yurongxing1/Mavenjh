package com.yrx.pojo;

/**
 * User实体类
 * @author Yu rongxing
 *
 */
public class User {

	private int id;
	private String name;
	private String sex;
	private int depar_id;
	private Depar depar;
	public Depar getDepar() {
		return depar;
	}
	public void setDepar(Depar depar) {
		this.depar = depar;
	}
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getDepar_id() {
		return depar_id;
	}
	public void setDepar_id(int depar_id) {
		this.depar_id = depar_id;
	}
}
