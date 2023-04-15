package main;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 1, 5, 4};
        ExampleJava.javaMethod(arr1);
        ExampleGroovy.groovyMethod(arr1);

        int[] arr2 = {1, 3, 4, 5, 1, 5, 4, 10, 25, 10, 33, 66, 25};
        ExampleJava.javaMethod(arr2);
        ExampleGroovy.groovyMethod(arr2);
    }
}
