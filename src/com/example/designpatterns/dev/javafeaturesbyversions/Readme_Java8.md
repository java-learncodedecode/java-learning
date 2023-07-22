#2014
#1.
In Java, you can use lambda expressions to create implementation of functional interfaces. A functional interface is an interface with a single abstract method. Here is an example of a lambda expression in Java:

#2. Default & static methods



#3. Base64 Encoding
      Base64.getEncoder().encodeToString(str.getBytes())
      // Prior to java8 - NA
#4. New Date and Time API


     // Prior to java8
     
#5.

#6. Method Reference:
A method reference is a way to refer to a method without actually invoking it. Method references can be used to pass methods as arguments to other methods, or to construct new functions from existing methods.

    Here is an example of a method reference in Java 8:

    public class MethodReferenceExample {
		public static void main(String[] args) {
		List<String> strings = Arrays.asList("a", "b", "c", "d");

		// Use a lambda expression to print all elements in the list
		strings.forEach(s -> System.out.println(s));

		// Use a method reference to print all elements in the list
		strings.forEach(System.out::println);
	}
	
#7. Stream API: 
The Stream API is a set of methods that allow you to perform operations on collections of data in a functional style. For example, the following code uses the Stream API to find the first even number in a list:

       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
       Optional<Integer> firstEven = numbers.stream()
                                     .filter(x -> x % 2 == 0)
                                     .findFirst();
       System.out.println(firstEven.get()); // prints 2