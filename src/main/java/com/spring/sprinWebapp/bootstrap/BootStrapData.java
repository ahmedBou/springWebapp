package com.spring.sprinWebapp.bootstrap;

import com.spring.sprinWebapp.domain.Author;
import com.spring.sprinWebapp.domain.Book;
import com.spring.sprinWebapp.domain.Publisher;
import com.spring.sprinWebapp.repository.AuthorRepository;
import com.spring.sprinWebapp.repository.BookRepository;
import com.spring.sprinWebapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BootStrapData implements CommandLineRunner {


    public final AuthorRepository authorReposity;
    public final BookRepository bookRepository;
    public final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorReposity, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorReposity = authorReposity;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();
        publisher.setName("ahmed");
        publisher.setState("Rabat");
        publisher.setCity("temara");
        publisherRepository.save(publisher);

        Author author = new Author("rachid","boutayeb");
        Book book = new Book("ten time", 1234);

        author.getBooks().add(book);
        book.getAuthor().add(author);

        book.setPublisher(publisher);
        publisher.getBooks().add(book);

        authorReposity.save(author);
        bookRepository.save(book);
        publisherRepository.save(publisher);



        Author rod = new Author("rod","johnson");
        Book noEjb = new Book("J2ee Development without Ejb", 1234778);

        rod.getBooks().add(noEjb);
        noEjb.getAuthor().add(rod);

        noEjb.setPublisher(publisher);
        publisher.getBooks().add(noEjb);

        authorReposity.save(rod);
        bookRepository.save(noEjb);
        publisherRepository.save(publisher);





        List<Book> booking = (List<Book>) bookRepository.findAll();
        for(int i =0 ; i < booking.size(); i++){
            System.out.println(i);
        }



        System.out.println("Started in bootstrap");
        System.out.println("Number of book"+bookRepository.count());
        System.out.println("Number of Author:"+ authorReposity.count());
        System.out.println("findall "+ bookRepository.findAll());
        System.out.println("Name of Author: "+ author.getFirstname());
        System.out.println("Number of publisher of book"+ publisherRepository.count());


    }
}
