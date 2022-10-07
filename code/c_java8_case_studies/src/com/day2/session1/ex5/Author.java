package com.day2.session1.ex5;

import java.util.Objects;

class Author implements Comparable<Author> {
	private String name;
	private String lastname;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Author(String name, String lastname, String country) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.country = country;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", lastname=" + lastname + ", country="
				+ country + "]";
	}
	@Override
	public int compareTo(Author o) {
		return this.getName().compareTo(o.getName());
	}
	@Override
	public int hashCode() {
		return Objects.hash(country, lastname, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(country, other.country) && Objects.equals(lastname, other.lastname)
				&& Objects.equals(name, other.name);
	}
	
	
	
}
