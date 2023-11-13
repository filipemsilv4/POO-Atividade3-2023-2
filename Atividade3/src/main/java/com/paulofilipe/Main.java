package com.paulofilipe;

import com.paulofilipe.book.Book;
import com.paulofilipe.book.BookDAO;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BookDAO bookDao = new BookDAO();

        // 2. Testes contemplando:
        // 2.1. Tentativa de criação de um livro com data de aquisição com 3 dias posteriores ao dia corrente;
        String title1 = "A Game of Thrones";
        String author1 = "George R. R. Martin";
        LocalDate acquisition1 = LocalDate.of(2023, 11, 13);
        Short nPage1 = 694;
        Short year1 = 1996;
        Byte edition1 = 1;
        BigDecimal price1 = new BigDecimal("150.00");
        Book book1 = new Book(title1, author1, acquisition1, nPage1, year1, edition1, price1);
        System.out.println(">> " + book1);

        bookDao.saveOrUpdate(book1);

        // 2.2. A inclusão de três livros com dados à escolha;
        String title2 = "A Clash of Kings";
        String author2 = "George R. R. Martin";
        LocalDate acquisition2 = LocalDate.of(2010, 1, 20);
        Short nPage2 = 768;
        Short year2 = 1998;
        Byte edition2 = 2;
        BigDecimal price2 = new BigDecimal("120.00");
        Book book2 = new Book(title2, author2, acquisition2, nPage2, year2, edition2, price2);
        System.out.println(">> " + book2);

        // A Storm of Swords
        // George R. R. Martin
        String title3 = "A Storm of Swords";
        String author3 = "George R. R. Martin";
        LocalDate acquisition3 = LocalDate.of(2012, 5, 10);
        Short nPage3 = 973;
        Short year3 = 2000;
        Byte edition3 = 3;
        BigDecimal price3 = new BigDecimal("135.00");
        Book book3 = new Book(title3, author3, acquisition3, nPage3, year3, edition3, price3);
        System.out.println(">> " + book3);

        String title4 = "A Feast for Crows";
        String author4 = "George R. R. Martin";
        LocalDate acquisition4 = LocalDate.of(2013, 10, 20);
        Short nPage4 = 753;
        Short year4 = 2005;
        Byte edition4 = 4;
        BigDecimal price4 = new BigDecimal("160.00");
        Book book4 = new Book(title4, author4, acquisition4, nPage4, year4, edition4, price4);
        System.out.println(">> " + book4);

        bookDao.saveOrUpdate(book2);
        bookDao.saveOrUpdate(book3);
        bookDao.saveOrUpdate(book4);

        // 2.3. A atualização de um livro à escolha;
        title3 = "A Dance with Dragons";
        author3 = "George R. R. Martin";
        book3.setTitle(title3);
        book3.setAuthors(author3);
        bookDao.saveOrUpdate(book3);

        // 2.4. A localização por ID de dois livros à escolha;
        Book idBook3 = bookDao.findById(3L);
        Book idBook1 = bookDao.findById(1L);
        System.out.println(">>> " + idBook3);
        System.out.println(">>> " + idBook1);

        // 2.5. A carga de todos os livros;
        List<Book> list = bookDao.findAll();
        for (Book b : list) {
            System.out.println(">>> " + b);
        }

        // 2.6. E a remoção de um livro à escolha.
        bookDao.delete(3L);
    }
}
