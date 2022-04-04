package Models;

import Models.Author;

import java.io.Serializable;

public class Quote implements Serializable {
    private long id;
    private String content;
    private Author author;

    public Quote() {}

    public Quote(long id, String content, Author author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getContent(){
        return this.content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public Author getAuthor(){
        return this.author;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

}
