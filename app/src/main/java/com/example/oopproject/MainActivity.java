package com.example.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;

import java.net.SocketOption;

public class MainActivity extends AppCompatActivity {

    // CONSTRUCTOR DEMEK BİR OBJE ÇAĞRILDIĞINDA İLK AÇILAN, ÇAĞRILAN METODDUR.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        User myUser = new User();
//        myUser.name = "busra";
//        myUser.job = "engineer";

        //EĞER BİR SINIFTAN BİRDEN FAZLA OBJE OLUŞTURAMIYORSAK BU YAPI SINGLETON'DIR.

        User user = new User("Busra","ENGINEER");
        System.out.println(user.name);
        System.out.println(user.information());

        //Eğer Musician'daki propertylerin başına private yazmazsak aşağıdaki gibi istediğimizi değiştiririz.
        //Private yaparsak buradaki age'lerin hata verdiğini görürüz yani böyle direk erişemezsin demek oluyor.

        //ENCAPSULATION
        Musician james = new Musician("James", "Guitar", 50);
        /*james.age = 60;
        System.out.println(james.age);*/
        //getter ve setter ları ekledikten sonra şu şekilde çağırabiliriz
        System.out.println(james.getName());
        System.out.println(james.getInstrument());
        james.setAge(60);
        System.out.println(james.getAge());


        //INHERITANCE
        SuperMusician lars = new SuperMusician("Lars", "Drums", 55);
        System.out.println(lars.getName());
        System.out.println(lars.getAge());
        System.out.println(lars.sing());


        //POLYMORPHISM
        // 1) Statik Polymorphism :
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,6));
        System.out.println(mathematics.sum(4,9,7));

        // 2) Dinamik Polymorphism :
        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();

        //INTERFACE
        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        myPiano.digital = true;
        myPiano.info();





    }
}
