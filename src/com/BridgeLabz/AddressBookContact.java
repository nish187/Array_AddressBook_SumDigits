package com.BridgeLabz;

public class AddressBookContact {
    private String name;
    private String age;
    private String phoneNumber;
    private String city;
    private String State;

    public AddressBookContact(String name, String age, String phoneNumber, String city, String state) {
        this.setName(name);
        this.setAge(age);
        this.setPhoneNumber(phoneNumber);
        this.setCity(city);
        this.setState(state);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }


}
