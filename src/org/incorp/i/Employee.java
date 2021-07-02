package org.incorp.i;

public class Employee {
    String surName;
    String name;
    String middleName;
    String eMail;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String surName, String name, String middleName, String eMail, String phoneNumber, int salary, int age) {
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
