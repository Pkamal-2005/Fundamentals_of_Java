// Java Code -> Compiler -> Bytecode -> JVM -> Machine Code

// Java Compiler (javac) converts Java source code (.java files) into Java bytecode (.class files), an intermediate, platform-independent format.  This bytecode is not machine code but a set of instructions for the Java Virtual Machine (JVM). 

// The JVM executes the bytecode using a combination of interpretation and Just-In-Time (JIT) compilation.  Initially, the JVM interprets bytecode instructions, emulating their execution. However, to improve performance, the JVM's runtime profiler identifies frequently executed code segments ("hotspots"). These are then compiled into native machine code by the JIT compiler on-the-fly, which is executed directly by the CPU. 

// This two-step process—compilation to bytecode followed by JIT compilation to machine code at runtime—enables Java’s "Write Once, Run Anywhere" (WORA) principle.  The same bytecode can run on any system with a compatible JVM, while JIT compilation ensures high performance by generating optimized machine code tailored to the specific hardware and operating system. 

class _01_Hello{
    public static void main(String a[]){
        System.out.print("Hello World");
    }
}