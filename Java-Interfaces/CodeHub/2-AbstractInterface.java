//If any one interface method is not implemented in the implementation class. please declare that class as a abstract

interface Interf{
    public int getVecwheel();
    public int getVecLight();
}

abstract class RT implements Interf{
    public int getVecwheel(){
        return 4;
    }
}

class RTS extends RT{
    public int getVecLight(){
        return 8;
    }
}



