package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Movie;

@ExtendWith(MockitoExtension.class)
class MovieManagerTest {
    @Mock
    private MovieManager manager = new MovieManager();
    @InjectMocks
    private Movie first = new Movie();
    private Movie second = new Movie();


    public MovieManager getManager() {
        return manager;
    }

    public void setManager(MovieManager manager) {
        this.manager = manager;
    }

    @BeforeEach

    @Test
    public void add() {
        manager.add(first);
        manager.add(second);
        manager.getAll();
        Movie[] returned = new Movie[]{first, second};
        Mockito.doReturn(returned).when(manager).getAll();
        Mockito.verify(manager).getAll();
    }

    @Test
    public void getAll() {
        Movie[] returned = new Movie[]{first, second};
        Mockito.doReturn(returned).when(manager).getAll();
        Mockito.verify(manager).getAll();
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

