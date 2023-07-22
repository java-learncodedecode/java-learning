package com.example.designpatterns.behavioral.template;
/**
 * Template method design pattern is to define an algorithm as a skeleton of operations and leave the details to be implemented by the child classes. The overall structure and sequence of the algorithm are preserved by the parent class. 
Template means Preset format like HTML templates which has a fixed preset format. Similarly in the template method pattern, we have a preset structure method called template method which consists of steps. These steps can be an abstract method that will be implemented by its subclasses.
This behavioral design pattern is one of the easiest to understand and implement. This design pattern is used popularly in framework development. This helps to avoid code duplication also.
 * @author 310231625
 *
 *
 *A Template Pattern says that "just define the skeleton of a function in an operation, deferring some steps to its subclasses".
 *Benefits:
It is very common technique for reusing the code.This is only the main benefit of it.
Usage:
It is used when the common behavior among sub-classes should be moved to a single common class by avoiding the duplication.
 */
public class MainClass {

	public static void main(String[] args) {
		OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);
        System.out.println();
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(false);
	}
}
