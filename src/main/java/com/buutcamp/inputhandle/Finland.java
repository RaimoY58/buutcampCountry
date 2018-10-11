package com.buutcamp.inputhandle;

public class Finland implements Country  {

    private String countryName;
    private String countryPopulation;
    private String countryPresident;

    public void setCountryName(String cname) {
        this.countryName = cname;

    }

    public void setCountryPopul(String cpopul) {
        this.countryPopulation = cpopul;
    }

    public void setPresidentName(String president) {
         this.countryPresident = president;

    }

    public String getCountryName() {
        return this.countryName;
    }

    public String getCountryPopul() {
        return this.countryPopulation;
    }

    public String getCountryPresident() {
        return this.countryPresident;
    }
}
