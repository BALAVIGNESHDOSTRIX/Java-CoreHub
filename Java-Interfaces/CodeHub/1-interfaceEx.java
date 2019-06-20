// all the interface implementation method should be have public access modifier

interface Interf{
    public int getVecwheel();
    public int getVecLight();
}

class RT implements Interf{
    public int getVecwheel(){
        return 4;
    }

    public int getVecLight(){
        return 8;
    }
}


