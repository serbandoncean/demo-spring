package com.example.springlearn;

import java.util.Objects;

public class City {
    int id;
    String name;
    String countryCode;
    String district;
    int population;
    public City()
    {

    }

    public int getId() {
        return id;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public String getName() {
        return name;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return id == city.id && population == city.population && Objects.equals(name, city.name) && Objects.equals(countryCode, city.countryCode) && Objects.equals(district, city.district);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, countryCode, district, population);
    }

    @Override
    public String toString() {
        StringBuilder construct=new StringBuilder();
        construct.append(id+" "+name+" "+countryCode+" "+district+ " "+population+"\n");
        return construct.toString();
    }

}
