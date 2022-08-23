package com.pratik.springprojects.simplewebapp.domain;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String Name;
	private String AddressLine1;
	private String City;
	private String State;
	private String Zip;

	@OneToMany
	@JoinColumn()
	private Set<Book> books;

	public Publisher() {
	}

	public Publisher(String name, String address_Line1, String city, String state, String zip) {
		Name = name;
		AddressLine1 = address_Line1;
		City = city;
		State = state;
		Zip = zip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddressLine1() {
		return AddressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}

	@Override
	public String toString() {
		return "Publisher{" +
			"id=" + id +
			", Name='" + Name + '\'' +
			", Address_Line1='" + AddressLine1 + '\'' +
			", City='" + City + '\'' +
			", State='" + State + '\'' +
			", Zip='" + Zip + '\'' +
			'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Publisher publisher = (Publisher) o;

		return id != null ? id.equals(publisher.id) : publisher.id == null;
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}
