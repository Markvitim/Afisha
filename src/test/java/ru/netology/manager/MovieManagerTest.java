package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;


class MovieManagerTest {
    private MovieManager manager = new MovieManager();
    private Movie first = new Movie(1, "url", "name", "genre", true);
    private Movie second = new Movie(2, "url", "name", "genre", true);
    private Movie third = new Movie(3, "url", "name", "genre", true);
    private Movie four = new Movie(4, "url", "name", "genre", true);


    public MovieManager getManager() {
        return manager;
    }

    public void setManager(MovieManager manager) {
        this.manager = manager;
    }

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
    }

    @Test
    public void add() {
        manager.add(four);
        Movie[] expected = new Movie[]{four, third, second, first};
        Movie[] actual = manager.getAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getAll() {
        Movie[] expected = new Movie[]{third, second, first};
        Movie[] actual = manager.getAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeById() {
        manager.removeById(1);
        Movie[] expected = new Movie[]{third, first};
        Movie[] actual = manager.getAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findByID() {
        manager.findByID(0);
    }

    @Test
    public void removeAll() {
        manager.removeAll();
        Movie[] expected = new Movie[]{};
        Movie[] actual = manager.getAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
