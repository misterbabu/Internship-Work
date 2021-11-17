package com.student.ConvertJsonToMap;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties
public class Student {
		private String name;
	    private String id;
	    private long age;
	    //private String[] address;
	    private Address address;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(String name, String id, long age, Address address) {
			super();
			this.name = name;
			this.id = id;
			this.age = age;
			this.address = address;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}
		/**
		 * @return the age
		 */
		public long getAge() {
			return age;
		}
		/**
		 * @param age the age to set
		 */
		public void setAge(long age) {
			this.age = age;
		}
		/**
		 * @return the address
		 */
		public Address getAddress() {
			return address;
		}
		/**
		 * @param address the address to set
		 */
		public void setAddress(Address address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", id=" + id + ", age=" + age + ", address=" + address + "]";
		}

	    
	    
}
