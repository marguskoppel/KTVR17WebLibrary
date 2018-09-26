/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pupil
 */
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;
    private String bookAuthor;
    private int bookPublish;
    private String bookIsbn;
    
    

    public Book() {
    }

    public Book(String bookName, String bookAuthor, int bookPublish, String bookIsbn) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublish = bookPublish;
        this.bookIsbn = bookIsbn;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Integer getBookPublish() {
        return bookPublish;
    }

    public void setBookPublish(Integer bookPublish) {
        this.bookPublish = bookPublish;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.bookName);
        hash = 17 * hash + Objects.hashCode(this.bookAuthor);
        hash = 17 * hash + Objects.hashCode(this.bookPublish);
        hash = 17 * hash + Objects.hashCode(this.bookIsbn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.bookName, other.bookName)) {
            return false;
        }
        if (!Objects.equals(this.bookAuthor, other.bookAuthor)) {
            return false;
        }
        if (!Objects.equals(this.bookPublish, other.bookPublish)) {
            return false;
        }
        if (!Objects.equals(this.bookIsbn, other.bookIsbn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPublish=" + bookPublish + ", bookIsbn=" + bookIsbn + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
