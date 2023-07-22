package com.dev.company.coforge;

public class Mphasis {

	public int index = 1;
	protected int x, y;
	int i[] = { 0 };
	static int index9 = 0;
	public static void main(String[] args) {
		if (true)
			// 1. break;
			// break cannot be used outside of a loop or a switch

			// 2. It will print sum of all char's ascii value
			System.out.println('j' + 'a' + 'v' + 'a');

		// 3.
		Integer num1 = 100;
		Integer num2 = 100;
		Integer num3 = 500;
		Integer num4 = 500;
		if (num1 == num2) {
			System.out.println("num1 == num2");
		} else {
			System.out.println("num1 != num2");
		}
		if (num3 == num4) {
			System.out.println("num3 == num4");
		} else {
			System.out.println("num3 != num4");
		}
		
		//Mphasis mph = new Mphasis();
		//8.
		int i[] = { 1 };
		alter(i);
		System.out.println("answer to 8: " + i[0]);
		
		//9.
	  //	System.out.println(test()); Cannot make a static reference to the non-static method test() from the type Mphasis
	}

	public static void alter(int i[]) {
		int j[] = { 2 };
		i = j;
	}
	int test() {
        int index = 1;
        return index;
    }	
	}

//4.
class App extends Mphasis {
	public App(int index) {
		// super();
		 index= index; //print 1. if both are there, prints 10
       // this.index = index; prints 10
    }
    public static void main(String args[]) {
        App myApp = new App(10);
        System.out.println(myApp.index);
    // 5.
     System.out.println(myApp.x + " " + myApp.y); // 0 0
     
    //6.
    // for (int index = 0; 1; index++) { can't convert from int to boolean
    //7.
       for (int index = 0; true; index++) {
         System.out.println("Welcome");
         break;
     }
       
    }

}


/*
 * 1. Write a Java Program to count the number of words in a string using
 * HashMap.
 * 
 * String str = "This this is is done by Saket Saket"; 
 * String[] split = str.split(" "); //Hint
 * 
 * HashMap<String,Integer> map = new HashMap<String,Integer>();
 * 
 * //CODE STARTS
 * 
 * 
 * //CODE ENDS
 * 
 * System.out.println(); //Return’s Map
 * 
 * }
 * }
 * 
 * OUTPUT :
 * {Saket=2, by=1, this=1, This=1, is=2, done=1}
 * 
 * 2. What is the difference between @RequestMapping and @RestController
 *     annotation in Spring Boot used for? Write a sample code using both
 * 
 * Basic Q&A
 * 
 * What is a classloader in Java?
 * 
 * The Java ClassLoader is a subset of JVM (Java Virtual Machine) that is
 * responsible for loading the class files. Whenever a Java program is executed
 * it is first loaded by the classloader. Java provides three built-in
 * classloaders:
 * 
 * Bootstrap ClassLoader Extension ClassLoader System/Application ClassLoader
 * What is encapsulation in Java?
 * 
 * Encapsulation is a mechanism where you bind your data(variables) and
 * code(methods) together as a single unit. Here, the data is hidden from the
 * outer world and can be accessed only via current class methods. This helps in
 * protecting the data from any unnecessary modification. We can achieve
 * encapsulation in Java by:
 * 
 * Declaring the variables of a class as private. Providing public setter and
 * getter methods to modify and view the values of the variables. List some of
 * the important annotations in annotation-based Spring configuration.
 * 
 * The important annotations are:
 * 
 * @Required 
 * @Autowired
 * @Qualifier 
 * @Resource 
 * @PostConstruct 
 * @PreDestroy
 * @ComponentScan 
 * @Component
 * @Configuration 
 * @Service
 * @Repository 
 * 
 * Can we override the static methods? No, we can't override static
 * methods.
 * 
 * List the different Scopes of Spring bean.
 * Singleton: Prototype: Request: Session: Global-session: Life cycle of Thread:
 * 
 * · New/Born state
 * · Runnable
 * · Running
 * · Waiting/blocking/sleeping
 * · Dead/terminate state
 *
 * List the few HTTP methods in Rest API:
 * 
 * · Get
 * · Post 
 * · Put
 * · Delete
 * · Patch
 * · Option
 * · Head
 */