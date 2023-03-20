package org.example;

public class PersonBuilder {


    protected String name;
    protected String surname;
    protected int age = -1;
    protected String city;


    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Не указано имя");
        } else this.name = name;
    return this;}
    public PersonBuilder setSurname(String surname) throws IllegalArgumentException {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Не указана фамилия");
        } else this.surname = surname;
    return this;}
    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age<0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        } else this.age = age;
    return this;}
    public PersonBuilder setCity(String city) {
        this.city = city;
    return this;}

    public Person build() throws IllegalStateException {
        Person person;
        if (name == null || surname == null)
            throw new IllegalStateException("Имя или Фамилия не определены");
        if (age < 0) {
            person = new Person(name, surname);
        } else person = new Person(name, surname, age);
        person.setCity(city);
        return person;
    }

}
