/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
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
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Book book;
    private Reader reader;
    private Date bookIssued;
    private Date bookReturned;

    public History() {
    }

    public History(Book book, Reader reader, Date bookIssued, Date bookReturned) {
        this.book = book;
        this.reader = reader;
        this.bookIssued = bookIssued;
        this.bookReturned = bookReturned;
    }

    public Date getBookReturned() {
        return bookReturned;
    }

    public void setBookReturned(Date bookReturned) {
        this.bookReturned = bookReturned;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getBookIssued() {
        return bookIssued;
    }

    public void setBookIssued(Date bookIssued) {
        this.bookIssued = bookIssued;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.book);
        hash = 97 * hash + Objects.hashCode(this.reader);
        hash = 97 * hash + Objects.hashCode(this.bookIssued);
        hash = 97 * hash + Objects.hashCode(this.bookReturned);
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
        final History other = (History) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.book, other.book)) {
            return false;
        }
        if (!Objects.equals(this.reader, other.reader)) {
            return false;
        }
        if (!Objects.equals(this.bookIssued, other.bookIssued)) {
            return false;
        }
        if (!Objects.equals(this.bookReturned, other.bookReturned)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "History{" + "id=" + id + ", book=" + book + ", reader=" + reader + ", bookIssued=" + bookIssued + ", bookReturned=" + bookReturned + '}';
    }
    
    
}
