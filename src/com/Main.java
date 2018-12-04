package com;

public class Main {
    public static void main(String[] args) {
        IWorker iWorker=new Cook();
        iWorker.work();
        iWorker.eat();
        iWorker.work();
    }
}
interface Worker{
    void work();

}
interface Eater{
    void eat();
}
interface IWorker extends Worker,Eater{
    void work();
    void eat();
}
class Cook implements IWorker{
    @Override
    public void work() {
        System.out.println("work");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}
class Waiter implements Worker{
    @Override
    public void work() {
        System.out.println("Deliver food");
    }

}















