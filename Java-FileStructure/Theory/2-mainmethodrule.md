# Main Method rule
    - We can declare many classes each class can have the main method

    Example:
        class A{
            public static void main(String[] args){
                sop("God");
            }
        }

        class B{
            public static void main(String[] args){
                sop("God");
            }
        }

        class C{
            public static void main(String[] args){
                sop("God");
            }
        }

        class D{
            
        }

        - Above code is applicable when we compile the code we can get A,B,C .class file so we can run each class file but if any of the class is not contains main method the compiler should return the Error. Like if we want to run the D.class file we can't becuase that class not contains the main method.
