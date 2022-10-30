/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anamikaverma
 */
public class person {
    private String PersonName;
        private int age;
	private int contactno;
	private int zipcode;
        private Patient patient;
        private String community;
        private String house;
        private String city;

        public int getAge() {
        return age;
        }

        public void setAge(int age) {
        this.age = age;
        }

        public String getPersonName() {
        return PersonName;
        }

        public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
        }
	
        public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

        public Patient getPatient() {
        return patient;
        }

        public void setPatient(Patient patient) {
        this.patient = patient;
        }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

  
       
        
        @Override
    public String toString()
    {
        return this.PersonName;
    }
}
