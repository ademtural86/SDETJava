package project1;

class Main {
    public static void main(String[] args){
        Animal[] Animals = {new Cat("Cat"), new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten3("kitten3")};

        for (Animal animal : Animals) {
            animal.eat();
            animal.sleep();
        }
    }
}

class Animal{
    String type;

    Animal(String type){
        this.type = type;
    }

    void eat(){

    }

    void sleep(){

    }
}

class Cat extends Animal{
    Cat(String type){
        super(type);
    }

    void eat(){
        System.out.println(type +" eats");
    }

    void sleep(){
        System.out.println(type +" sleeps a lot");
    }
}

class Kitten1 extends Cat{
    Kitten1(String type){
        super(type);
    }

    void eat(){
        System.out.println(type +" eats milk");
    }
}

class Kitten2 extends Cat{
    Kitten2(String type){
        super(type);
    }

    void eat(){
        System.out.println(type +" eats snacks");
    }
}

class Kitten3 extends Cat{
    Kitten3(String type){
        super(type);
    }

    void eat(){
        System.out.println(type +" eats everything");
    }
}
