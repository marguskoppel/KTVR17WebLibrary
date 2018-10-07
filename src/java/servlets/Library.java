/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entity.Book;
import entity.History;
import entity.Reader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.BookFacade;
import session.HistoryFacade;
import session.ReaderFacade;

/**
 *
 * @author pupil
 */
@WebServlet(name = "Library", urlPatterns = {"/newBook", "/addBook", "/newReader", "/addReader", "/listBookReader", "/showBooks","/showReaders","/library","/takeBook","/showTakeBook"})
public class Library extends HttpServlet {

    @EJB
    BookFacade bookFacade;
    @EJB
    ReaderFacade readerFacade;
    @EJB HistoryFacade historyFacade;


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
        if ("/newBook".equals(path)) {

            request.getRequestDispatcher("/WEB-INF/pages/newBook.jsp").forward(request, response);

        } else if ("/addBook".equals(path)) {
            String bookName = request.getParameter("bookName"); //имена параметров
            String bookAuthor = request.getParameter("bookAuthor");
            String bookPublish = request.getParameter("bookPublish");
            String bookIsbn = request.getParameter("bookIsbn");

            Book book = new Book(bookName, bookAuthor, new Integer(bookPublish), bookIsbn);//инициируем книгу
            bookFacade.create(book);
            request.setAttribute("book", book); //передаем данные на страницу addBook.jsp
            request.getRequestDispatcher("/WEB-INF/pages/page1.jsp").forward(request, response);
        } else if ("/newReader".equals(path)) {

            request.getRequestDispatcher("/WEB-INF/pages/newReader.jsp").forward(request, response);

        } else if ("/addReader".equals(path)) {
            String name = request.getParameter("name"); //имена параметров
            String surname = request.getParameter("surname");
            String phone = request.getParameter("phone");
            String city = request.getParameter("city");

            Reader reader = new Reader(name, surname, phone, city);//инициируем книгу
            readerFacade.create(reader);
            request.setAttribute("reader", reader); //передаем данные на страницу page2.jsp
            request.getRequestDispatcher("/WEB-INF/pages/page1.jsp").forward(request, response);
        } else if ("/showBooks".equals(path)) {
            List<Book> bookList = bookFacade.findAll();
            request.setAttribute("bookList", bookList);
            request.getRequestDispatcher("/bookList.jsp").forward(request, response);
        } else if ("/showReaders".equals(path)) {
            List<Reader> readerList = readerFacade.findAll();
            request.setAttribute("readerList", readerList);
            request.getRequestDispatcher("/readerList.jsp").forward(request, response);
        } else if ("/library".equals(path)) {
            request.setAttribute("bookList", bookFacade.findAll());
            request.setAttribute("readerList", readerFacade.findAll());
            request.getRequestDispatcher("/library.jsp").forward(request, response);

        }else if("/showTakeBook".equals(path)){
            request.getRequestDispatcher("/listTakeBooks.jsp").forward(request, response);
        }else if("/takeBook".equals(path)){
            String selectedBook = request.getParameter("selectedBook");
            String selectedReader = request.getParameter("selectedReader");
            Book book = bookFacade.find(new Long(selectedBook));
            Reader reader = readerFacade.find(new Long(selectedReader));
            Calendar c = new GregorianCalendar();
            History history = new History(book, reader, c.getTime(), null);
            historyFacade.create(history);
            List<History> takeBooks = historyFacade.findTakeBooks();
            request.setAttribute("takeBooks", takeBooks);
            request.getRequestDispatcher("/listTakeBooks.jsp").forward(request, response);
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
