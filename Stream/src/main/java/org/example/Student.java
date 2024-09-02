package org.example;

public class Student {
    private  final  String id;
    private  final String postalCode;
    private  final  int age;

    public Student(String id, String postalCode, int age) {
        this.id = id;
        this.postalCode = postalCode;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", age=" + age +
                '}';
    }
}
