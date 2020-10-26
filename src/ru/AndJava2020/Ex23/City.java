package ru.AndJava2020.Ex23;

import java.util.Objects;

public class City {
    private String city;
    private String country;

    public City(String country,String city){
        this.city=city;
        this.country=country;

    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(city, city.city) &&
                Objects.equals(country, city.country);
    }

}
