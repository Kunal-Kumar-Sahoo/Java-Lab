# Notes of Object-Oriented Programming with Java
## Course codes: 20CP204T, 20CP204P

### Course instructor: [Dr. Debabrata Swain](https://www.linkedin.com/in/dr-debabrata-swain-44980636/)
### Notes prepared by: [Kunal Kumar Sahoo](https://www.linkedin.com/in/kunal-kumar-sahoo/)

#### Characteristics of Java:
        - Descendent of C/C++ family: It supports almost all the concepts of C and C++ except few like pointers etc.
        - Simple: It is easy to learn and code
        - Portable/Architectural-Neutral: Due to its nature of platform independence
        - Object-Oriented
        - Secured
        - Robust: Does not allow user to write erroneous programs. Java poses strict restrictions
        - Multithreading
        - Interpreted and High Performance: Interpretation happens at the execution phase of ByteCode with the help of Just-In Time (JIT)
        - Distributed
        - Dynamic: We can have dynamic memory allocation with the help of "new" keyword

#### Execution of C/C++ program
![Image](http://www.btechsmartclass.com/c_programming/cp_images/program-execution-process.png)

#### Execution of Java program
![image2](http://www.btechsmartclass.com/java/java_images/Execution_of_Java_Program.jpg)

![image4](https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/02/Flow-of-a-Java-program.png)


        - Java Virtual Machine is platform-dependent
        - Bytecode is NOT specific to any machine

#### Java Development Kit
![image3](https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/02/All-Java-components-Diagram.png)

#### Java Virtual Machine (JVM)
        - Makes Java platform independent
        - Provides a runtime environment to executed Java Bytecode (.class file)
        - Translates a single instruction from the Bytecode to machine language line-by-line (INTERPRETER)
        - When a Java application is executed, an instance of JVM is loaded on to the RAM of the native machine and takes the responsibility of the execution.
        - JVM is not actually a hardware but resides in RAM whenever a Java code is to be executed.
        - Responsible to locate address of the modules (Address resolution)
        - Provides features like:
                - Automated exception handling
                - Control loader (Load methods in the memory)
                - Just in Time compiler
                - Bytecode verification

The internal architecture of JVM:
![image5](https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/02/Various-parts-of-a-JVM.png)

        - Heap memory deals with Dynamic Memory Allocation 
        - Stack memory deal with Static Memory Allocation

![image6](https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/02/Components-of-JDK.png)

#### Syntax for main() method:
        ``public static void main(String[] args)``
        - public: makes the method accessible outside the class by any other class
        - static: No object is required to invoke the main method.
                -  Static method, static data are the properties of the class and is common for all the objects.
        - void: No return type
        - String args[]: an array of Strings, this is used for command-line arguments to main method at the time of invocation

#### First Java program

#### Dynamic Linking
        - This is used by the Java interpreter to launch the program by invoking the **main** method of the class identified in the command to start the program.
        - All address resoulution is done at runtime by JVM
        - JVM calls main() method using its **Classname.main()** at the time of running the program.
        - main() needs to be public to be accessed by JVM

**Variable**: It is a named memory location capable of holding some value that can be modified by the program.

In Java there are three types of variables:
1. Local: Any variable declared inside a method which has no scope outside that method.
2. Instance: Any variable declared within the class but outside all the methods and within the main() method.
3. Static: Any variable which maintains its integrity inside and outside methods.
   - Static variable is a variable of class and not an object of the class.

**Data type**: The type of data which a variable can store is called data type of the variable.

#### Primitive Data Types in Java:
  - byte -> 8 bits -> Default value = 0 
  - short -> 16 bits -> Default value = 0 
  - int -> 32 bits -> Default value = 0
  - long -> 64 bits -> Default value = 0
  - float -> 32 bits -> Default value = 0.0f
  - double -> 64 bits -> Default value = 0.0
  - char -> 16 bits -> Default value = 'u000'
  - boolean -> JVM Dependent -> Default value = false;

#### Data type operations: Widening and Narrowing
Widening: Storing the value of a particular datatype into another variable of datatype of larger size.<br>
Example: <br>
int a = 10; <br>
float b = a; <br>
System.out.println()
