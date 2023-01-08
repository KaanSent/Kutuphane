
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kaan
 */
public class Book implements Serializable{

    public Book(String BooksName, String AuthorsName, Genre typeOfBook) {
        this.BooksName = BooksName;
        this.AuthorsName = AuthorsName;
        this.typeOfBook = typeOfBook;
    }
    private String BooksName;
    private String AuthorsName;
    private Genre typeOfBook;

    public String getBooksName() {
        return BooksName;
    }

    public void setBooksName(String BooksName) {
        this.BooksName = BooksName;
    }

    public String getAuthorsName() {
        return AuthorsName;
    }

    public void setAuthorsName(String AuthorsName) {
        this.AuthorsName = AuthorsName;
    }

    public Genre getTypeOfBook() {
        return typeOfBook;
    }

    public void setTypeOfBook(Genre typeOfBook) {
        this.typeOfBook = typeOfBook;
    }
}
