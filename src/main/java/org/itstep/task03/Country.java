package org.itstep.task03;

import org.itstep.task02.City;

import java.util.Arrays;

public class Country {
    private String name;
    private String continent;
    private String code;
    private City capital;
    private City[] cities;

    public Country() {
        this(null, null, null, new City());
    }

    public Country(String name, String continent, String code, City capital) {
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
        this.cities = new City[10];
    }

    public void addCity(City city) {
        if (cities[cities.length - 1] != null) {
            cities = Arrays.copyOf(cities, cities.length + 10);
        }
        int index = 0;
        for (; index < cities.length; index++) {
            if (cities[index] == null) {
                cities[index] = city;
                break;
            }
        }
    }

    public int getInhabitants() {
        int index = 0;
        int result = 0;

        while (cities[index] != null) {
            result += cities[index++].getInhabitants();
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }
}
