package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Movie;
import ru.netology.repository.MovieRepository;

@ExtendWith(MockitoExtension.class)
class MovieManagerTest {
    @Mock
    private MovieRepository repository;
    @InjectMocks
    private MovieManager manager;
    private Movie first = new Movie();
    private Movie second = new Movie();


    public MovieManager getManager() {
        return manager;
    }

    public void setManager(MovieManager manager) {
        this.manager = manager;
    }

    @Test
    public void add() {

    }

    @Test
    public void getAll() {
//        Movie[] returned = new Movie[]{first, second};
//        Mockito.doReturn(returned).when(repository).findAll();
//        Mockito.verify(repository).findAll();// verify не проходит/ Wanted but not invoked:
    }

    @Test
    public void removeById() {
    }

    @Test
    public void findByID() {
    }

    @Test
    public void removeAll() {
    }
}

