package com.hari.springboot.learnspringboot.controller;

import com.hari.springboot.learnspringboot.Bean.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.awt.*;

@RestController
@RequestMapping("/BookMangment")
public class BookController {

    @RequestMapping("/hello-world")
    @ResponseBody
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(value = {"/rich dad" , "/dad" , "/book"},
            produces = { MediaType.APPLICATION_JSON_VALUE }
            //consumes = { MediaType.APPLICATION_JSON_VALUE  }
    )

    @ResponseBody
    public Book getBook(){
        Book book = new Book(1, "Rich dad, Poor dad", "it tell about life managment");
        return book;
    }

    @PostMapping(value = "/book/create",
    consumes = MediaType.APPLICATION_JSON_VALUE )
    //@ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());

        return new ResponseEntity<>(book,HttpStatus.CREATED);
    }


    @PutMapping(value = "/books/update/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book updatedBook){
        System.out.println(id);
        System.out.println(updatedBook.getTitle());
        System.out.println(updatedBook.getDescription());
        updatedBook.setId(id);
        return ResponseEntity.ok(updatedBook);
    }


    @DeleteMapping("/books/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable  int id){
        System.out.println(id);
        return ResponseEntity.ok("Book deleted successfully");
    }

    @GetMapping(value = "/books/{id}/{title}/{description}")
    public ResponseEntity<Book> pathVariableDemo(@PathVariable int id, @PathVariable("title") String bookTitle, @PathVariable("description") String bookDescription){
        System.out.println(id);
        Book book = new Book();
        book.setId(id);
        book.setTitle(bookTitle);
        book.setDescription(bookDescription);
        return ResponseEntity.ok(book);
    }

    @GetMapping("/books/query")
    public ResponseEntity<Book> requestParamDemo(@RequestParam(name = "id") int id,@RequestParam(name = "title") String title, @RequestParam(name = "description") String description){
        System.out.println(id);
        System.out.println(title);
        System.out.println(description);

        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setDescription(description);

        return ResponseEntity.ok(book);
    }


}
