/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entity.Book;
import entity.Reader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.BookFacade;
import session.ReaderFacade;

/**
 *
 * @author pupil
 */
@WebServlet(name = "Library", urlPatterns = {"/newBook","/addBook","/newReader","/addReader","/listBookReader"})
public class Library extends HttpServlet {
@EJB BookFacade bookFacade;
@EJB ReaderFacade readerFacade;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String path = request.getServletPath();
        if("/listBookReader".equals(path)){
            bookFacade.findAll();
            request.setAttribute("allBooks", bookFacade.findAll());
            request.getRequestDispatcher("/WEB-INF/pages/listBookReader.jsp").forward(request, response);}
        
        else if("/newBook".equals(path)){
            
            request.getRequestDispatcher("/WEB-INF/pages/newBook.jsp").forward(request, response);
        
        }else if("/addBook".equals(path)){
            String bookName = request.getParameter("bookName"); //имена параметров
            String bookAuthor = request.getParameter("bookAuthor");
            String bookPublish = request.getParameter("bookPublish");
            String bookIsbn = request.getParameter("bookIsbn");
            
            Book book = new Book(bookName, bookAuthor, new Integer (bookPublish), bookIsbn);//инициируем книгу
            bookFacade.create(book);
            request.setAttribute("book", book); //передаем данные на страницу addBook.jsp
            request.getRequestDispatcher("/WEB-INF/pages/addBook.jsp").forward(request, response);
        }
        else if("/newReader".equals(path)){
            
            request.getRequestDispatcher("/WEB-INF/pages/newReader.jsp").forward(request, response);
        
        }else if("/addReader".equals(path)){
            String name = request.getParameter("name"); //имена параметров
            String surname = request.getParameter("surname");
            String phone = request.getParameter("phone");
            String city = request.getParameter("city");
            
            Reader reader = new Reader(name, surname, phone, city);//инициируем книгу
            readerFacade.create(reader);
            request.setAttribute("reader", reader); //передаем данные на страницу page2.jsp
            request.getRequestDispatcher("/WEB-INF/pages/addReader.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
