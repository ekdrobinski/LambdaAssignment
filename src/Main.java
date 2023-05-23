import java.util.function.DoubleBinaryOperator;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class Main {
    public static void main(String[] args) {
        //Task 1: Simple Lambda Expressions
        DoubleBinaryOperator addition = (a, b)-> a + b;
        DoubleBinaryOperator subtraction = (a, b)-> a - b;
        DoubleBinaryOperator multiplication = (a, b)-> a * b;
        DoubleBinaryOperator division = (a, b)-> a / b;

        System.out.println("7+4= " + addition.applyAsDouble(7, 4));
        System.out.println("7-4= " + subtraction.applyAsDouble(7, 4));
        System.out.println("7*4= " + multiplication.applyAsDouble(7, 4));
        System.out.println("28/7= " + division.applyAsDouble(28, 7));

        //Task 2: Lambda Expressions with Functional Interfaces
        MyFunctionalInterface greeting = name-> "Hello " + name;
        System.out.println(greeting.sayHello("Rebecca"));

        //Task 3: Lambda Expressions with Built-in Functional Interfaces
        Supplier<Double> randomNumber = Math::random;
        System.out.println("random number: " + randomNumber.get());
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("now caps this");
        Function<Integer, String> convertToString = Object::toString;
        System.out.println("convert 777 to 1 string that's inserted as a parameter: " + convertToString.apply(777));
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("'7' is an even number: " + isEven.test(7));

    }

    //Task 2: Lambda Expressions with Functional Interfaces
    @FunctionalInterface
    interface MyFunctionalInterface {
        String sayHello(String name);
    }
}


