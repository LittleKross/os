# P-06: Reflection and Threads in various languages

## CSCI - P436 | _Brandon Yonug_

### Languages

* Ruby
* Python
* Java

### Ruby Code

```ruby
newTest = Thread.new{ }
puts newTest.class.instance_methods(true)
```

### Python Code

```python
import threading
print(dir())
```

### Java Code

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

### Runing the code

* Ruby Version: `ruby <filename>.rb`
* Python Version: `python <filename>.py`
* Java Version: `javac <filename>.java && java filename`

### Ruby Output  
pending_interrupt?  
raise  
join  
value  
kill  
terminate  
exit  
run  
wakeup  
[]  
[]\=  
key?  
keys  
priority  
priority\=  
status  
thread_variable_get  
thread_variable_set  
thread_variables  
thread_variable?  
alive?  
stop?  
abort_on_exception  
abort_on_exception=  
safe_level  
group  
backtrace  
backtrace_locations  
inspect  
set_trace_func  
add_trace_func  
nil?  
\=\=\=  
\=~  
!~  
eql?  
hash  
<\=>  
class  
singleton_class  
clone  
dup  
taint  
tainted?  
untaint  
untrust  
untrusted?  
trust  
freeze  
frozen?  
to_s  
methods  
singleton_methods  
protected_methods  
private_methods  
public_methods  
instance_variables  
instance_variable_get  
instance_variable_set  
instance_variable_defined?  
remove_instance_variable  
instance_of?  
kind_of?  
is_a?  
tap  
send  
public_send  
respond_to?  
extend  
display  
method  
public_method  
define_singleton_method  
object_id  
to_enum  
enum_for  
\=\=  
equal?  
!  
!=  
instance_eval  
instance_exec  
\_\_send\_\_  
\_\_id\_\_  

### Python Output

['\_\_annotations\_\_', '\_\_builtins\_\_', '\_\_cached\_\_', '\_\_doc\_\_', '\_\_file\_\_', '\_\_loader\_\_', '\_\_name\_\_', '\_\_package\_\_', '\_\_spec\_\_', 'threading']

### Java Output

List of all methods from Thread class:  
getName  
run  
exit  
dispatchUncaughtException  
toString  
clone  
isInterrupted  
isInterrupted  
currentThread  
onSpinWait  
registerNatives  
join  
join  
join  
getThreadGroup  
setContextClassLoader  
holdsLock  
getStackTrace  
checkAccess  
dumpStack  
setPriority  
setDaemon  
start  
sleep  
sleep  
isCCLOverridden  
isDaemon  
getPriority  
getContextClassLoader  
nextThreadID  
nextThreadNum  
start0  
resume  
stop0  
interrupt0  
interrupt  
suspend0  
resume0  
setPriority0  
setNativeName  
activeCount  
enumerate  
isAlive  
dumpThreads  
getThreads  
processQueue  
auditSubclass  
setDefaultUncaughtExceptionHandler  
getUncaughtExceptionHandler  
blockedOn  
yield  
stop  
interrupted  
suspend  
setName  
countStackFrames  
getAllStackTraces  
getId  
getState  
getDefaultUncaughtExceptionHandler  
setUncaughtExceptionHandler