# Notes of Object-Oriented Programming with Java
## Course codes: 20CP204T, 20CP204P

### Course instructor: [Dr. Debabrata Swain](https://www.linkedin.com/in/dr-debabrata-swain-44980636/)
### Notes prepared by: [Kunal Kumar Sahoo](https://www.linkedin.com/in/kunal-kumar-sahoo/)

#### Characteristics of Java:
        - Descendent of C/C++ family: It supports almost all the concepts of C and C++ except few like pointers etc.
        -         - Simple: It is easy to learn and code
        -                 - Portable/Architectural-Neutral: Due to its nature of platform independence
        -                         - Object-Oriented
        -                                 - Secured
        -                                         - Robust: Does not allow user to write erroneous programs. Java poses strict restrictions
        -                                                 - Multithreading
        -                                                         - Interpreted and High Performance: Interpretation happens at the execution phase of ByteCode with the help of Just-In Time (JIT)
        -                                                                 - Distributed
        -                                                                         - Dynamic: We can have dynamic memory allocation with the help of "new" keyword
        -
        -                                                                         #### Execution of C/C++ program
        -                                                                         ![Image](http://www.btechsmartclass.com/c_programming/cp_images/program-execution-process.png)
        -
        -                                                                         #### Execution of Java program
        -                                                                         ![image2](http://www.btechsmartclass.com/java/java_images/Execution_of_Java_Program.jpg)
        -
        -                                                                         ![image4](https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/02/Flow-of-a-Java-program.png)
        -
        -
        -                                                                                 - Java Virtual Machine is platform-dependent
        -                                                                                         - Bytecode is NOT specific to any machine
        -
        -                                                                                         #### Java Development Kit
        -                                                                                         ![image3](https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/02/All-Java-components-Diagram.png)
        -
        -                                                                                         #### Java Virtual Machine (JVM)
        -                                                                                                 - Makes Java platform independent
        -                                                                                                         - Provides a runtime environment to executed Java Bytecode (.class file)
        -                                                                                                                 - Translates a single instruction from the Bytecode to machine language line-by-line (INTERPRETER)
        -                                                                                                                         - When a Java application is executed, an instance of JVM is loaded on to the RAM of the native machine and takes the responsibility of the execution.
        -                                                                                                                                 - JVM is not actually a hardware but resides in RAM whenever a Java code is to be executed.
        -                                                                                                                                         - Responsible to locate address of the modules (Address resolution)
        -                                                                                                                                                 - Provides features like:
        -                                                                                                                                                                 - Automated exception handling
        -                                                                                                                                                                                 - Control loader (Load methods in the memory)
        -                                                                                                                                                                                                 - Just in Time compiler
        -                                                                                                                                                                                                                 - Bytecode verification
        -
        -                                                                                                                                                                                                                 The internal architecture of JVM:
        -                                                                                                                                                                                                                 ![image5](https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/02/Various-parts-of-a-JVM.png)
        -
        -                                                                                                                                                                                                                         - Heap memory deals with Dynamic Memory Allocation 
        -                                                                                                                                                                                                                                 - Stack memory deal with Static Memory Allocation
        -
        -                                                                                                                                                                                                                                 ![image6](https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/02/Components-of-JDK.png)
        -
        -                                                                                                                                                                                                                                 #### Q. How does JVM recognized the main() method in a class?
