/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Objects;
import javax.persistence.Column;
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
    @Column(unique = true)
    private String bookIsbn;
    private int count;
    private Boolean active;

    public Book() {
    }

    

    public Book(String bookName, String bookAuthor, int bookPublish, String bookIsbn, int count) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublish = bookPublish;
        this.bookIsbn = bookIsbn;
        this.count = count;
        this.active = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getBookPublish() {
        return bookPublish;
    }

    public void setBookPublish(int bookPublish) {
        this.bookPublish = bookPublish;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.bookName);
        hash = 67 * hash + Objects.hashCode(this.bookAuthor);
        hash = 67 * hash + this.bookPublish;
        hash = 67 * hash + Objects.hashCode(this.bookIsbn);
        hash = 67 * hash + this.count;
        hash = 67 * hash + Objects.hashCode(this.active);
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
        if (this.bookPublish != other.bookPublish) {
            return false;
        }
        if (this.count != other.count) {
            return false;
        }
        if (!Objects.equals(this.bookName, other.bookName)) {
            return false;
        }
        if (!Objects.equals(this.bookAuthor, other.bookAuthor)) {
            return false;
        }
        if (!Objects.equals(this.bookIsbn, other.bookIsbn)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.active, other.active)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPublish=" + bookPublish + ", bookIsbn=" + bookIsbn + ", count=" + count + ", active=" + active + '}';
    }
    
    

    
}
