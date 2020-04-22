package com.example.oopproject;

public class User extends People{

    //CONSTRUCTOR VE PROPERTY NEDİR BUNU ANLATTI

    //Bu sınıftan oluşturulacak objelerimin iki özelliği(PROPERTYsi) olsun :
    String name;
    String job;

    //Constructor
/* Mesela bir projedesiniz ve bu projede yüzlerce developer çalışıyor hepsinin sizin yazdığınız kodun ne yaptığını net
birşekilde anlamaları gerekiyor. Bu projedeki propertyleri mesela ismi ya da mesleğini girmek istemediği userlar olabilir
Eğer Main Activity'deki gibi obje oluşturmaya devam edersek program çöker. Bu yüzden constructora ihtiyaç duyarız  */


    public User(String nameInput, String jobInput) {
        this.name = nameInput;
        this.job = jobInput;

        System.out.println("User created.");
    }
}
