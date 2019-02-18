package com.app.core.ch02.app01.objects;

public class Main02 {

    public static void main(String[] args) {
        Person p = new Person();
        p.age=10;
        p.name="Boris";

        Person p1 = new Person();
        p1.age=10;
        p1.name="Boris";

        System.out.println(p1==p);

        Person p2 = p1;
        System.out.println(p2==p1);

        System.out.println(p1.name);
        p2.name="Test";
        System.out.println(p1.name);
        System.out.println("----------speak--------------");
        p.speak();
        p1.speak();
        p2.speak();


        System.out.println("----------Student--------------");
        Student student = new Student();
        student.age=20;
        student.name="Shurik";
        student.speak();
        student.goToLibrary();

        System.out.println("----------Professor--------------");
        Professor professor = new Professor();
        professor.name="Dudle";
        professor.age=40;
        professor.speak();
        professor.teach();
        System.out.println("------------IS-A------------------");
        boolean res = professor instanceof Person;
        System.out.println("professor IS-A Person: "+res);
        boolean res2 = professor instanceof Object;
        System.out.println("professor IS-A Object: "+res);
        /*boolean res3 = professor instanceof Student;
        System.out.println("professor IS-A Student: "+res);*/
        System.out.println("---------------------------------");
        Person person = new Person();
        Professor professorA = new Professor();
        Person x = new Professor();
        x.speak();
        System.out.println("x.name="+x.name);

        //x = person;
        x.speak();
        System.out.println("x.name="+x.name);
        //x.teach();
        System.out.println("---------Overloading----------");
        Professor myProfessor = new Professor();
        myProfessor.teach();
        myProfessor.teach("Mathematics");
        System.out.println("-------Super. Calls----------");
        professor.speak();
    }
}
