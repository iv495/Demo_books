package com.example.demo_books.books;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {

    @Bean
    CommandLineRunner commandLineRunner( BookRepository repository){
        return args -> {
           Book one= new Book(
                    "Undiscovered Self",
                    "Carl Jung",
                    true

            );
            Book two = new Book(
                    "Think and grow rich",
                    "Napoleon Hill",
                    false

            );

            repository.saveAll(List.of(one, two));
        };
    }
}
