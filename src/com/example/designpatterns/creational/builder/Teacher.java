package com.example.designpatterns.creational.builder;

public class Teacher {

	// instance fields
	private final int id;
	private final String name;
	private final String address;
	
	public Teacher(Builder builder) {
		super();
		this.id = builder.id;
		this.name = builder.name;
		this.address = builder.address;
	}
	
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public static class Builder{
		private int id;
		private String name;
		private String address;
		
		public static Builder getInstance() {
			return new Builder();
		}
		
		private Builder() {
			
		}

		public Builder setId(int id) {
			this.id = id;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Teacher build() {
			return new Teacher(this);
		}
		
		
	}
	
	
	
	
}
