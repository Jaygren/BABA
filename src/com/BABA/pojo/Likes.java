package com.BABA.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="baba_Likes")
public class Likes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String table_from;
	String id_from;
	//ip锁区
	String ip_from;
	public Likes(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTable_from() {
		return table_from;
	}
	public void setTable_from(String table_from) {
		this.table_from = table_from;
	}
	public String getId_from() {
		return id_from;
	}
	public void setId_from(String id_from) {
		this.id_from = id_from;
	}
	public String getIp_from() {
		return ip_from;
	}
	public void setIp_from(String ip_from) {
		this.ip_from = ip_from;
	}
	
}
