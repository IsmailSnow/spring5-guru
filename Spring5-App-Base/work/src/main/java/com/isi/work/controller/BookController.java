

package com.isi.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.isi.work.repositories.BookRepo;

/**  @Author Salmi Ismail**/

@Controller
public class BookController {

    private final BookRepo bookRepository;

    public BookController(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepository.findAll());

        return "books/list";
    }
}

