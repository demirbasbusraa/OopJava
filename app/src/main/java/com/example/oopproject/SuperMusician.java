package com.example.oopproject;

public class SuperMusician extends Musician{
    public SuperMusician(String name, String instrument, int age) {
        super(name, instrument, age);
    }

    /*INHERITANCE NEDİR ?
    Mesela burada SuperMusician sınıfı Musician sınıfındaki tüm özelliklere sahip olsun üstüne ekstra bir de sing metodu
    olsun isteyebiliriz. Musician sınıfındaki özelliklerede erişmek için extends denen keywordü kullan
     */


    public String sing(){
        return "Nothing Else Matters!";
    }
}
