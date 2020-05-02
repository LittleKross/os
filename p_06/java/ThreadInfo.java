import java.lang.reflect.*;

public class ThreadInfo {

    public static void main(String[] args) {

        Reflections obj = new Reflections();
        Class threads = Thread.class;
        Method[] threadMethods = threads.getDeclaredMethods();
        System.out.println("List of all methods from Thread class: ");
        for (Method threadMethod : threadMethods) {
            System.out.println(threadMethod.getName());
        }

    }
}

class Reflections extends Thread {

    Reflections() {
    }

    public void testMethod() {
        System.out.println("This is a test method");
    }

}
