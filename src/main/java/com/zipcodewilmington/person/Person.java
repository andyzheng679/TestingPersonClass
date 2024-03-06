package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;

    private int height; //in cm
    private Boolean hasPet;
    private Boolean canSee;
    private String nickname;
    private Boolean hasGlasses;

    public Person(String name, int age, int height, boolean hasPet, boolean canSee, String nickname, boolean hasGlasses){
        this.name = name;
        this.age = age;

        this.height = height;
        this.hasPet = hasPet;
        this.canSee = canSee;
        this.nickname = nickname;
        this.hasGlasses = hasGlasses;

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Boolean getHasPet() {
        return hasPet;
    }

    public void setHasPet(Boolean hasPet) {
        this.hasPet = hasPet;
    }

    public Boolean getCanSee() {
        return canSee;
    }

    public void setCanSee(Boolean canSee) {
        this.canSee = canSee;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Boolean getHasGlasses() {
        return hasGlasses;
    }

    public void setHasGlasses(Boolean hasGlasses) {
        this.hasGlasses = hasGlasses;
    }


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {

        return age;
    }
}
