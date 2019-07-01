package com.longder.shoppingcart.dao;

import com.longder.shoppingcart.entity.Book;
import com.longder.shoppingcart.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Book表的数据库交互对象
 */
public class BookDao {

    public List<Book> listAll(){
        List<Book> bookList = new ArrayList<>();

        Connection connection = DBUtil.getConnection();

        String sql = "SELECT * FROM BOOK";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                Book book = new Book();
                book.setId(resultSet.getLong("id_"));
                book.setName(resultSet.getString("name_"));
                book.setPrice(resultSet.getDouble("price_"));
                bookList.add(book);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection(connection);
        }
        return bookList;
    }
}
