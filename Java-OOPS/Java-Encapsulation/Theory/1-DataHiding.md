# Data Hiding 
    - Defenition of Data Hiding
        Dont allow any one directly to access the class members that is called data hiding

    Example:
        class Vehicle{
            private int wheelscount;

            public int getWheelsCount(){
                return wheelscount;
            }
        }

        class Main{
            public static void main(String args[]){
                Vehicle vt = new Vehicle();
                vt.getWheelsCount();
            }
        }