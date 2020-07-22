package com.example.jsonCheckpoint;


import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/movies")
public class JsonController {

    @GetMapping
    public Movie getMovie() {
        Movie movie = new Movie();

        Person person = new Person();
        person.setFirstName("Francis Ford");
        person.setRole("Director");
        person.setLastName("Copolla");

        Person person1 = new Person();
        person1.setFirstName("Marlon");
        person1.setRole("Star");
        person1.setLastName("Brando");

        Person person2 = new Person();
        person2.setFirstName("James");
        person2.setRole("Star");
        person2.setLastName(null);

        Person person3 = new Person();
        person3.setFirstName("Diane");
        person3.setRole("Star");
        person3.setLastName("Keaton");

        movie.setTitle("The GodFather");
        movie.setMinutes(175);
        movie.setGenre("Crime, Drama");
        movie.setRating(9.2);
        movie.setDescription("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.");
        movie.setVotes(1561591);
        movie.setGross(134.97);
        movie.setYear("1972");
        movie.setMetaScore(100);

        movie.setCredits(Arrays.asList(person, person1, person2, person3));


        return movie;
    }


    @PostMapping
    public String total(@RequestBody List<Movie> movies) {
        double grossTotal = 0;
        for (int i = 0; i < movies.size(); i++) {
            movies.get(i) = new Movie();
            grossTotal += movies.get(i).getGross();
        }


//    return String.valueOf(grossTotal);

        return movies.get(0).getDescription();

    }
}