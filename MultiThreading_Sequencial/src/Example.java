import java.util.*;
//Sequential Flow of excution(Time wasting)
public class Example {
		public static void task1() {
			System.out.println("task1 is STARTED");
			System.out.println("task1 is END");
		}
		public static void task2() {
			System.out.println("task2 is STARTED");
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Name::");  //here task2 is taking time to excute due to this task task3 is waiting
			String s=sc.next();
			System.out.println("task2 is END");
		}
		public static void task3() {
			System.out.println("task3 is STARTED");
			System.out.println("task3 is END");
		}
}
class Test{
	//if i call task1,task2 and task3 in main thread my program execution will take more time
	public static void main(String[] args) {
		System.out.println("main method::STARTED");
		Example.task1();
		System.out.println("===================1");
		Example.task2();
		System.out.println("===================2");
		Example.task3();
		System.out.println("===================3");
		System.out.println("main method::END");
	}
}
