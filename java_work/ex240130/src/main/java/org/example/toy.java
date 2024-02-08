package org.example;

public class toy {

    private String name;

    @Override
    public String toString() {
        return "toy{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
