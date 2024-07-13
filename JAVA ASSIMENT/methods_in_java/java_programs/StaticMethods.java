// this programe contains one non-static method, two static methods and a constructor//
package java_programs;
public class StaticMethods{
	// declaretion of non static variable//
	private int instanceVariable;

	//The construct//
	public StaticMethods(int value){
		this.instanceVariable = value;
	}
	//non static methods//
	public void instanceMethod(){
		System.out.println("Inside instanceMethod()");
		System.out.println("Instance variable value: "+instanceVariable);

	}
	public static void staticMethod1() {
        System.out.println("Inside staticMethod1()");
        System.out.println("This is a static method.");
    }
    public static void staticMethod2() {
        System.out.println("Inside staticMethod2()");
        System.out.println("This is another static method.");
    }
    // Method to execute the Programme//
     public static void main(String[] args) {
        // Calling static methods directly
        staticMethod1();
        staticMethod2();

        // Creating an instance of ExampleProgram using the constructor
        StaticMethods obj = new StaticMethods(10);

        // Calling the instance method on the object
        obj.instanceMethod();
    }

}