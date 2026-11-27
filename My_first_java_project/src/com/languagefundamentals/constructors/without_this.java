package com.languagefundamentals.constructors;

// Constructor - initialize the values without this key word.
// 1.Same names with this keyword.

public class without_this {

	int empid;
	String ename;
	int age;

	without_this(int empid, String ename, int age) {

		empid = empid;
		ename = ename;
		age = age;

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		without_this obj1 = new without_this(80, "sathwik", 22);
		System.out.println(obj1.empid);
		System.out.println(obj1.ename);
		System.out.println(obj1.age);

		System.out.println("main method endeed");

	}

}

/*

What happens without the this keyword?
This is the most important part.

You have two types of variables:
- Instance variables (class-level variables).
- Local variables (constructor parameters).
For example:
int empid;  // Instance variable

without_this(int empid) {  // Parameter (local variable)

    empid = empid;

}


Both variables have the same name.

When you write:
empid = empid;


Java considers both references to mean the constructor parameter, because the parameter shadows the instance variable.

Therefore:
- Left-side empid → constructor parameter.
- Right-side empid → constructor parameter.
You are assigning the parameter to itself.

The instance variable remains unchanged.
4. What are the final values?
After constructor execution:
Variable	Actual value
Instance empid	0
Instance ename	null
Instance age	0

Even though you passed 80, "sathwik", and 22, the instance variables are not initialized with those values.
5. How can you verify this?
Add these statements after object creation:
System.out.println(obj1.empid);
System.out.println(obj1.ename);
System.out.println(obj1.age);


Expected output
main method started
0
null
0
main method started


6. How does this solve the problem?
If you write:
without_this(int empid, String ename, int age) {

    this.empid = empid;
    this.ename = ename;
    this.age = age;

}

3. What happens without the this keyword?
This is the most important part.

You have two types of variables:
- Instance variables (class-level variables).
- Local variables (constructor parameters).
For example:
int empid;  // Instance variable

without_this(int empid) {  // Parameter (local variable)

    empid = empid;

}


Both variables have the same name.

When you write:
empid = empid;


Java considers both references to mean the constructor parameter, because the parameter shadows the instance variable.

Therefore:
- Left-side empid → constructor parameter.
- Right-side empid → constructor parameter.
You are assigning the parameter to itself.

The instance variable remains unchanged.
4. What are the final values?
After constructor execution:
Variable	Actual value
Instance empid	0
Instance ename	null
Instance age	0

Even though you passed 80, "sathwik", and 22, the instance variables are not initialized with those values.
5. How can you verify this?
Add these statements after object creation:
System.out.println(obj1.empid);
System.out.println(obj1.ename);
System.out.println(obj1.age);


Expected output
main method started
0
null
0
main method started


6. How does this solve the problem?
If you write:
without_this(int empid, String ename, int age) {

    this.empid = empid;
    this.ename = ename;
    this.age = age;

}


Now:
- this.empid → instance variable.
- empid → constructor parameter.
- this.ename → instance variable.
- ename → constructor parameter.
- this.age → instance variable.
- age → constructor parameter.
Expected values:
80
sathwik
22



Remember this important point:

Without this, when a constructor parameter and an instance variable have the same name, the parameter takes precedence.

This is called variable shadowing.

Would you like to learn how to initialize instance variables without this by using different parameter names?

*/