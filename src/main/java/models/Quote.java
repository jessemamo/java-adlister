package models;

import java.io.Serializable;

public class Quote implements Serializable {
    private int id;
    private String content;
    private Author author;


    public Quote(int id, String content, Author author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public Quote() {
    }

    public int getId() {
        return id;
    }

    public Quote setId(int id) {
        this.id = id;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Quote setContent(String content) {
        this.content = content;
        return this;
    }

    public Author getAuthor() {
        return author;
    }

    public Quote setAuthor(Author author) {
        this.author = author;
        return this;
    }
}
