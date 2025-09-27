package org.example;

public class Wall {

    double height;
    double width;

    public Wall(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        if(width>0) {
            this.width = width;
        } else {
           this.width=0;
        }
    }

    public void setHeight(double height) {
        if(height>0) {
            this.height = height;
        } else {
            this.height=0;
        }
    }

    public double getArea(){
        return width*height;
    }
}

/*org.example paketi altında Wall isimli bir sınıf tanımlayınız.
Sınıf için 2 tane instance variable tanımlayınız.
Bu iki sınıf değişkeni; width double olmalı, height double olmalı.
Wall sınıfı için bir adet constructor tanımlayınız. 2 parametreyi de set etmeli.
Wall sınıfı içerisine 5 tane metod ekleyiniz.
getWidth => width değerini dönmeli
getHeight => height değerini dönmeli.
setWidth => bir parametre almalı ve aldığı parametreyi width değerine eşitlemeli. Gelen parametre 0'dan küçükse, width değerini 0'a eşitlemeli.
setHeight => bir parametre almalı ve aldığı parametreyi height değerine eşitlemeli. Gelen parametre 0'dan küçükse, height değerini 0'a eşitlemeli.
getArea => hiçbir parametre almamalı ve width*height değerini dönmeli.

 */
