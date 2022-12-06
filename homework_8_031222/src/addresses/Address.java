// Task1.создать класс Address, описать поля, характеризующие адрес(полагаюсь на вашу креативность) создать
// пустой конструктор и конструктор, позволяющий заполнить поля при создании обьекта, создать методы get,set
// для полей класса, переопределить метод equals, hashCode, toString

package addresses;

import java.util.Objects;

public class Address {
    String country;
    int postcode;
    String city;
    String street;
    String homeNumber;
    int flatNumber;
    int floor;
    int block;

    public Address() {
    }

    public Address(String country, int postcode, String city, String street, String homeNumber,
                   int flatNumber, int floor, int block) {
        this.country = country;
        this.postcode = postcode;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
        this.floor = floor;
        this.block = block;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getBlock() {
        return block;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return this.postcode == address.postcode && this.postcode != 0;
    }

    @Override
    public int hashCode() {
        return this.postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", flatNumber=" + flatNumber +
                ", floor=" + floor +
                ", block=" + block +
                '}';
    }
}

