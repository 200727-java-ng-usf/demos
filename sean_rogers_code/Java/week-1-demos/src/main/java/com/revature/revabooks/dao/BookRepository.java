package com.revature.revabooks.dao;

import com.revature.revabooks.models.Book;
import com.revature.revabooks.models.Genre;

import java.util.Set;

public class BookRepository implements CrudRepository<Book>{
    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public Set<Book> findAll() {
        return null;
    }

    public Set<Book> findBooksByGenre(Genre genre) {
        return null;
    }

    public Set<Book> findBooksByAuthor(String authorLastName) {
        return null;
    }

    public Set<Book> findBooksByTitle(String title) {
        return null;
    }

    @Override
    public Book findById(Integer id) {
        return null;
    }

    public Set<Book> findBookByIsbn(String isbn) {
        return null;
    }

    @Override
    public boolean update(Book book) {
        return false;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }
}
