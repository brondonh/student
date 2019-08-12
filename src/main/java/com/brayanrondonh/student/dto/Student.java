package com.brayanrondonh.student.dto;

import javassist.SerialVersionUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Student implements Serializable
{
    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue
    private int idStudent;
    private String firstName;
    private String lastName;
    private LocalDate birthdate;
    private String documentType;
    private String dni;
    private String phoneNumber;
    private String email;

    public Student() {}

    public Student(int idStudent, String firstName, String lastName, LocalDate birthdate, String documentType, String dni, String phoneNumber, String email)
    {
        this.idStudent = idStudent;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.documentType = documentType;
        this.dni = dni;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static long getSerialVersionUID()
    {
        return SerialVersionUID;
    }

    public int getIdStudent()
    {
        return idStudent;
    }

    public void setIdStudent(int idStudent)
    {
        this.idStudent = idStudent;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate()
    {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate)
    {
        this.birthdate = birthdate;
    }

    public String getDocumentType()
    {
        return documentType;
    }

    public void setDocumentType(String documentType)
    {
        this.documentType = documentType;
    }

    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "Student{ idStudent=" + idStudent +", firstName='" + firstName + '\'' +", lastName='" + lastName + '\'' +", birthdate=" + birthdate +", documentType='" + documentType + '\'' +", dni='" + dni + '\'' +", phoneNumber='" + phoneNumber + '\'' +", email='" + email + '\'' +'}';
    }
}
