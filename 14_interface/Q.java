interface Jumpable{
    void JumpingFactor();
    void jumpStyle();
}

class Toy{

}

class Ball extends Toy implements Jumpable{
    public void JumpingFactor(){
        // ---
    }

    public void jumpStyle(){
        //---
    }
}

class Animal{

}

class Rabbit extends Animal implements Jumpable{
    public void JumpingFactor(){
        // ---
    }

    public void jumpStyle(){
        // --
    }
}
class Car{

}

class SportsCar extends Car implements Jumpable{
    public void JumpingFactor(){
        // ---
    }

    public void jumpStyle(){
        // --
    }
}
