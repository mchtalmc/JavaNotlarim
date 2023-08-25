package day24polymorphism;



public class Cat extends Animal {

    @Override
    public void move() {
        System.out.println(" move...");
    }

    @Override
    public int add(int a, int b) {
        return add(a, b);
    }

    @Override
    public Animal create() {
        return new Cat();
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return multiply(a, b);
    }


}