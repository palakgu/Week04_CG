package reflection;


import org.junit.jupiter.api.Test;
import reflection.customlogging.Greeting;
import reflection.customlogging.GreetingImpl;
import reflection.customlogging.LoggingProxy;

import static org.junit.jupiter.api.Assertions.*;

public class LoggingProxyTest {

    @Test
    public void testProxyLogging() {
        Greeting originalGreeting = new GreetingImpl();
        Greeting proxyGreeting = LoggingProxy.createProxy(originalGreeting, Greeting.class);

        String message = proxyGreeting.sayHello("Abhishek");
        assertEquals("Hello, Abhishek!", message);
    }
}