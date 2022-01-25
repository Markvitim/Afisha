package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

public class MovieManagerTestMovieLimit {


    @Test
    void shouldMovieLimitOver() {
        MovieManager manager = new MovieManager(30);
        Movie first = new Movie();
        Movie second = new Movie();
        Movie third = new Movie();
        Movie four = new Movie();
        Movie five = new Movie();
        Movie six = new Movie();
        Movie seven = new Movie();
        Movie eight = new Movie();
        Movie nine = new Movie();
        Movie ten = new Movie();
        Movie eleven = new Movie();
        Movie twelve = new Movie();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        manager.add(twelve);
        Movie[] actual = manager.movieLimit();
        Movie[] expected = new Movie[]{twelve, eleven, ten, nine, eight, seven, six, five, four, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void shouldMovieLimitLess() {
        MovieManager manager = new MovieManager(5);
        Movie first = new Movie();
        Movie second = new Movie();
        Movie third = new Movie();
        Movie four = new Movie();
        Movie five = new Movie();
        Movie six = new Movie();
        Movie seven = new Movie();
        Movie eight = new Movie();
        Movie nine = new Movie();
        Movie ten = new Movie();
        Movie eleven = new Movie();
        Movie twelve = new Movie();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        manager.add(twelve);
        Movie[] actual = manager.movieLimit();
        Movie[] expected = new Movie[]{twelve, eleven, ten, nine, eight};
        Assertions.assertArrayEquals(expected, actual);
    }

}
