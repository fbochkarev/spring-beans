package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    @Override
    public String toString() {
        return "I`m a Dog";
    }
    public String toAString() {
        return "I`m a Dog";
    }


}
