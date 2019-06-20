# Interface
    Defenition:
        Any service requirements specification.

# Note
    - All the interface method in where implementation class. there is all should be have the public access modifier

        Example:
            interface Interf{
                public void mr1();
                public void mr2();
            }

            class RT implements Interf{
                public void mr1(){}

                public void mr2(){}
            }

    - All the interface method should be implemented in the required implementation class or declare the class as abstract then implement the remaining interface method in future.

        Example:
            interface Interf{
                public void mr1();
                public void mr2();
            }

            abstract class RT implements Interf{
                public void mr1(){}
            }

            class RTS implements RT{
                public void m2(){}
            }