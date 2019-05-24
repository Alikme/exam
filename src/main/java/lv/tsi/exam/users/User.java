package lv.tsi.exam.users;

import lv.tsi.exam.DB;
import lv.tsi.exam.books.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private Integer id;
    private String fullname;
    private List<Book> books;
    private DB db;

    public User(Integer id, String fullname) {
        this.id = id;
        this.fullname = fullname;
        books = new ArrayList<>();
    }

    public void flush() {
        db = DB.getInstance();

        Statement st = DB.getInstance().getStatement();
        if (st != null) {
            try {
                st.executeUpdate("INSERT INTO Users VALUES(" + String.valueOf(id) + ", '" + fullname + "')");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String getFullname() {
        return fullname;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Integer getId() {
        return id;
    }

    public Integer addBook(Book book) {
        books.add(book);

        return books.size();
    }

    public static User getById(Integer id) {
        User u = null;
        Statement st = null;
        Connection con = null;
        try {
            con = DB.createConnection();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT " +
                    "u.ID as USER_ID, u.FULLNAME as USER_FULLNAME FROM USERS u WHERE id =" + String.valueOf(id));
            rs.next();

            u = new User(id, rs.getString("USER_FULLNAME"));

            for (Book b : Book.getByUserId(id)) {
                u.addBook(b);
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

        return u;
    }


    public static Map<Integer, User> getUserByBook(Integer bookId) {
        Book b = Book.getBookById(bookId);

        Map<Integer, User> userList = new HashMap<>();

        Statement st = null;
        Connection con = null;
        try {
            con = DB.createConnection();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT " +
                    "u.ID as USER_ID, u.FULLNAME as USER_FULLNAME FROM USERS u JOIN USERBOOK as ub ON ub.USER_ID = ID AND BOOK_ID=" + String.valueOf(bookId));
            while (rs.next()) {
                Integer id = rs.getInt("USER_ID");

                User u = new User(id, rs.getString("USER_FULLNAME"));
                userList.put(id, u);

                u.addBook(b);
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

        return userList;
    }

    public static Map<Integer, User> getAll() {

        Map<Integer, User> userList = new HashMap<>();

        Statement st = null;
        Connection con = null;
        try {
            con = DB.createConnection();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT " +
                    "u.ID as USER_ID, u.FULLNAME as USER_FULLNAME FROM USERS u");
            while (rs.next()) {
                Integer id = rs.getInt("USER_ID");

                User u = new User(id, rs.getString("USER_FULLNAME"));
                userList.put(id, u);

                for (Book b : Book.getByUserId(id)) {
                    u.addBook(b);
                }
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

        return userList;
    }
}
