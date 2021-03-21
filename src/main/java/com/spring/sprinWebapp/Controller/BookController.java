package com.spring.sprinWebapp.Controller;

import com.spring.sprinWebapp.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBook(Model model){
        model.addAttribute("books", bookRepository.findAll());
        System.out.println(bookRepository.findAll());
        return "books/list";
    }
}
