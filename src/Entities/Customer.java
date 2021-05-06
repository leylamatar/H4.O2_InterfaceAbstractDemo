package Entities;

import Abstract.Entity;

import java.time.LocalDate;


public class Customer implements Entity {
    private int Id;
    private String FirstName;
    private String LastName;
    private LocalDate DateOfBirth;
    private String NationalityId;

    public Customer(){
    }

    public Customer(int Id, String FirstName , String LastName, LocalDate DateOfBirth , String NationalityId ){
        super();
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.setDateOfBirth(DateOfBirth);
        this.NationalityId = NationalityId;


    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }




    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
}
