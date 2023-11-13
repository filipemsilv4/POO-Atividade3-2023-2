package com.paulofilipe.book;

import com.paulofilipe.entity.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Book extends Entity {
    private String title;
    private String authors;
    private LocalDate acquisition;
    private Short pages;
    private Short year;
    private Byte edition;
    private BigDecimal price;

    public Book() {
    }

    public Book(String title, String authors, LocalDate acquisition, Short pages, Short year, Byte edition, BigDecimal price) {
        this.title = title;
        this.authors = authors;
        this.acquisition = acquisition;
        this.pages = pages;
        this.year = year;
        this.edition = edition;
        this.price = price;
    }


    //<editor-fold defaultstate="collapsed" desc="GETTERS/SETTERS">
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public LocalDate getAcquisition() {
        return acquisition;
    }

    public void setAcquisition(LocalDate acquisition) {
        this.acquisition = acquisition;
    }

    public Short getPages() {
        return pages;
    }

    public void setPages(Short pages) {
        this.pages = pages;
    }

    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
    }

    public Byte getEdition() {
        return edition;
    }

    public void setEdition(Byte edition) {
        this.edition = edition;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", authors=" + authors +
                ", acquisition=" + acquisition + ", pages=" + pages + ", year=" + year +
                ", edition=" + edition + ", price=" + price + '}';
    }
}
