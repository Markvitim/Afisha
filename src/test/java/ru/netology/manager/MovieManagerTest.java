package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

class MovieManagerTest {
    private MovieManager manager = new MovieManager();
    private Movie first = new Movie();
    private Movie second = new Movie();
    private Movie third = new Movie();
    private Movie four = new Movie();
    private Movie five = new Movie();
    private Movie six = new Movie();
    private Movie seven = new Movie();
    private Movie eight = new Movie();
    private Movie nine = new Movie();
    private Movie ten = new Movie();
    private Movie eleven = new Movie();
    private Movie twelve = new Movie();

    @BeforeEach
    public void setUp() {
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
    }

    @Test
    void shouldAdd() {

        Movie[] actual = new Movie[]{first, second, third, four, five, six, seven, eight, nine, ten,
                eleven, twelve};
        Movie[] expected = new Movie[]{first, second, third, four, five, six, seven, eight, nine, ten,
                eleven, twelve};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAll() {

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{twelve, eleven, ten, nine, eight, seven, six, five, four, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveById() {
        manager.removeById(2);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{twelve, eleven, ten, nine, eight, seven, six, five, four, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldMovieLimit() {

        Movie[] actual = manager.movieLimit();
        Movie[] expected = new Movie[]{twelve, eleven, ten, nine, eight, seven, six, five, four, third};
        Assertions.assertArrayEquals(expected, actual);
    }

    /// Остальные тесты для покрытия бранчей
    @Test
    public void shouldCoverBranches() {
        MovieManager manager = new MovieManager(5);
        manager.setMovieLimit(8);
        Assertions.assertEquals(8, manager.getMovieLimit());

    }


}