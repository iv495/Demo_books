package com.example.demo_books.books;

import jakarta.persistence.*;

@Entity
@Table
public class Book {

    @Id
    @SequenceGenerator(
        name= "book_sequence",
        sequenceName ="book_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
       strategy = GenerationType.SEQUENCE,
       generator = "book_sequence"
    )

    private Long id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book() {
    }

    public Book(Long id,
                String title,
                String author,
                boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public Book(String title,
                String author,
                boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
