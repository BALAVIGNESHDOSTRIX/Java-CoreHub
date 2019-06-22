class Car{

    //Hiding the class member details simply by declare the class member as a private
    private int wheelwcount = 4;

    public int getWheelsCount(){
        return this.wheelscount;
    }
}


class Main{
    public static void main(String[] args) {
        Car cr = new Car();
        System.out.println(cr.getWheelsCount());
    }
}