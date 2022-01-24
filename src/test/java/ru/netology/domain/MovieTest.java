package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieTest {

        @Test
        public void shouldCoverageBranches () {
            Movie movie = new Movie(3, "ooo", "hhh", "fff", true, 2);
            movie.setId(1);
            movie.setImageUrlId("url");
            movie.setName("name");
            movie.setGenre("none");
            movie.setPremierTomorrow(true);

            Assertions.assertEquals(1, movie.getId());
            Assertions.assertEquals("url", movie.getImageUrlId());
            Assertions.assertEquals("name", movie.getName());
            Assertions.assertEquals("none", movie.getGenre());
            Assertions.assertEquals(true, movie.isPremierTomorrow());
        }

    }
