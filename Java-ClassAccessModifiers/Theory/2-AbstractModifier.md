# Abstract Modifier

    - When we dont know the exact implementation of the required method. we can decalre the method as a abstract type. after we can implement that method by using the child class.

    - If the class have atleast one abstract method means the class also should have the abstract modifier.

# Note
    Very important modifier is abstract

    Abstract means there is no implementation. only declaration.

# Example:
    abstract class Test{
        public abstract void FruitTaste();
    }

# Usage
    - If we dont know the implementation details for example. we have one Vehicle class and there is one method for returning the Vehicle wheels but we dont know what vehicle and how many wheels of the vehicle. so we can declare the class Vehicle is abstract and wheels method also abstract. so we can implement this method whenever we need in the future purpose by using the child class

    Example:
        abstract class Vehicle{
            public abstract int WheelsCount();
        }