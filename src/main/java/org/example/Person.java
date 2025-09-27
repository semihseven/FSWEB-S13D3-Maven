package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double weight;
    int height;
    String gender;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName,String lastName,int age, double weight, int height, String gender){
        this(firstName,lastName,age);
        this.weight=weight;
        this.height = height;
        this.gender = gender;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen(){
        return this.age>=13&&this.age<=19;
    }

}

/*
org.example paketi altında Person isimli bir sınıf tanımlayınız.
Sınıf için 3 tane instance variable tanımlayınız.
firstname String olmalı, lastName String olmalı age int olmalı.
Kendiniz Person isimli bir sınıfta olmasını isteyeceğiniz 3 adet daha instance variable ekleyiniz.
Bu sınıf için firstname, lastname ve age değerlerini alabileceğiniz bir constructor tanımlayınız.
Kendi eklediğiniz parametreleri de kullandığınız bir adet daha constructor ekleyerek overloading yapınız.
Toplamda minimum 2 tane constructor olmalı.


Eklediğiniz constructor metodlarından birinin içerisinden diğerini çağırarak constructor chaining yapınız.
Person sınıfının içerisinde 4 adet method tanımlayınız.
getFirstName => firstname değerini dönmeli
getLastName => lastname değerini dönmeli.
getAge => age değerini dönmeli.
isTeen => age değeri 13-19 arasında true dönmeli. Diğer koşullarda false dönmeli.
main metodu içerisinde aşağıdaki gibi çağırımlar yapabilmelisiniz.
Person sınıfından birden fazla person instance oluşturarak. Bir sınıftan pek çok obje oluşturabilmeyi deneyimleyiniz.
*/