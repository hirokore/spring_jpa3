package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity //モデルだと宣言
public class Employee {
	@Id //主キー
	@GeneratedValue(strategy = GenerationType.IDENTITY) //自動採番をIDに対して行うんだ
	private Long id;
	
	@NotBlank
	@Size(max = 40)
	private String name;
	
	@ManyToOne //このクラスが多、宣言したクラスが一の設定
	private Department department;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
