package com.ailliushchenia.patterns.prototype;

public class Book implements Prototype{
    private final String name;
    private final String author;
    private final String year;

    public Book(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public Prototype clone() {
        return new Book(name, author, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                ", hashCode='" + this.hashCode() + '\'' +
                '}';
    }
}
