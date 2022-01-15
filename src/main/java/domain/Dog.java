package domain;

//class used for stereotypical annotation

import org.springframework.stereotype.Component;

@Component(value = "biggerDog")
public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
