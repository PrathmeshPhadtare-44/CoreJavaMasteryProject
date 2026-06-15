package com.prathmesh.corejavamastery.opps;

public class Book {
    private String name;

    public Book() {

    }

    public int getCopies() {
        return copies;
    }

    public String getName() {
        return name;
    }

    private int copies;

    public Book(String name, int copies) {
        if (copies < 0){
            throw new IllegalArgumentException("Copies cannot be negative");
        }
        if (name == null ||name.isEmpty()){
            throw  new IllegalArgumentException("Book name cannot be empty");
        }
        this.name = name;
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", copies=" + copies +'}';
    }
}
