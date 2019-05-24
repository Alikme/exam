package lv.tsi.exam.books;

import lv.tsi.exam.DB;
import lv.tsi.exam.users.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private Integer year;
    private Integer id;

    public Book(Integer id, String title, String author, Integer year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getId() {
        return id;
    }

    public String toString() {
        return String.format("%d: %s - %s (%d)", id, author, title, year);
    }

    public static List<Book> getByUserId(Integer id) {
        List<Book> bookList = new ArrayList<>();

        Statement st = null;
        Connection con = null;
        try {
            con = DB.createConnection();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM BOOKS JOIN USERBOOK ON BOOK_ID=ID AND USER_ID=" + String.valueOf(id));
            while (rs.next()) {

                Book b = new Book(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("year"));
                bookList.add(b);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException se2) {
            }
        }

        return bookList;
    }


    public static List<Book> getAll() {
        List<Book> bookList = new ArrayList<>();

        Statement st = null;
        Connection con = null;
        try {
            con = DB.createConnection();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM BOOKS");
            while (rs.next()) {

                Book b = new Book(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("year"));
                bookList.add(b);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException se2) {
            }
        }

        return bookList;
    }


    public static Book getBookById(Integer id) {
        Book b = null;
        Statement st = null;
        Connection con = null;
        try {
            con = DB.createConnection();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM BOOKS WHERE ID=" + String.valueOf(id));
            while (rs.next()) {

                b = new Book(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("year"));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException se2) {
            }
        }

        return b;
    }
}
