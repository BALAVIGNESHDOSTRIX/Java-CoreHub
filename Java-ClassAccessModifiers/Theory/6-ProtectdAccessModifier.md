# Protected Access Modifier
    - If the class members are protected that is only accessable by all the classes. when all the class within the same package

    - We can call the protected members of the class from the child class by the parent or child reference within the same package.

    Example:
        class Animal{
            protected int getLegs(int x){
                System.out.println(x);
            }
        }

        class Cat extends Animal{
            Animal ani = new Animal();
            ani.getLegs(4);

            Cat cat = new Cat();
            cat.getLegs(4);

            Animal ans = new Cat();
            ans.getLegs(4);
        }

        - Above Example only Applicable for when parent and sub class are present within the same package.


    - If the child class is present in the outer package. only the child reference can be access the protected member.

    Example:
        class Animal{
            protected int getLegs(int x){
                System.out.println(x);
            }
        }

        class Cat extends Animal{
            Cat cat = new Cat();
            cat.getLegs(4);
        }

# Note
    The protected members of the class can be accessable by the child class.