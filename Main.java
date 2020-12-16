class Main {

    public static void main(String[] args) {

        Apple app1 = new Apple();
        Orange orange1 = new Orange();
        System.out.println(app1.getWeight());
        System.out.println(orange1.getWeight());


        FruitBox<Apple> appleBox = new FruitBox<Apple>(app1, 3);
        System.out.println(appleBox.getWeight());
        FruitBox<Orange> orangeBox = new FruitBox<Orange>(orange1, 2);
        System.out.println(orangeBox.getWeight());

        System.out.println();
        System.out.println(orangeBox.compare(appleBox));

    }
}


abstract class Fruit {

    private float weight;

    void setWeight(float weight) {
        this.weight = weight;
    }

    float getWeight() {
        return weight;
    }

    Fruit(){
    }
}

class Orange extends Fruit{

    Orange() {
        this.setWeight(1.5f);
    }
}

class Apple extends Fruit {

    Apple() {
        this.setWeight(1.0f);
    }
}
