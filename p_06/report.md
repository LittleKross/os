# P-06
## Reflection and Threads in various languages

### Languages:
* Ruby
* Python
* Java

### Ruby Code:
```ruby
newTest = Thread.new{ }
puts newTest.class.instance_methods(true)
```
### Python Code:
```python
import threading
print(dir())
```

### Java:
```java
import java.util.*;
import java.io.*;
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
```

### Run using:

* Ruby Version: `ruby <filename>.rb`
* Python Version: `python <filename>.py`
* Java Version: `javac <filename>.java && java filename`

