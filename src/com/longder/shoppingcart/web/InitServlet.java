package com.longder.shoppingcart.web;

import com.longder.shoppingcart.dao.BookDao;
import com.longder.shoppingcart.entity.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class InitServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入Servlet");
        //查询所有图书
        BookDao bookDao = new BookDao();
        List<Book> bookList = bookDao.listAll();

        req.setAttribute("bookList",bookList);
        req.getRequestDispatcher("/showAllBook.jsp").forward(req,resp);
    }
}
