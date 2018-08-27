public class Dog extends Animals {

    // this is just applicable for dog class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // but in addition they have these characteristics

//    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
//    }

    /* we will just assume all dogs have a brain and body.
    * So we will not force the programmer who is creating Dog class to define these variables.
    *
    * Then we will have to initialize the Dog variables in this class by defining them in the params
    * */
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
}
