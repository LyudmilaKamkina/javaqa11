package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Posters;

public class PosterManagerTest {
    Posters first = new Posters("Б00001", "Боевик", "боевик", 1999);
    Posters second = new Posters("М00002", "Мелодрама", "мелодрама", 2000);
    Posters third = new Posters("K00003", "Комедия", "комедия", 1998);
    Posters fourth = new Posters("A0010", "Мультфильм", "мультфильм", 2010);
    Posters fifth = new Posters("Д0001", "Детектив", "детектив", 2015);

    @Test
    public void addFilmTest(){
        PosterManager manager = new PosterManager();
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        Posters[] expected = new Posters[] {first, second, third, fourth, fifth};
        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    @Test
    public void shouldShowLastThreeFilms(){
        PosterManager manager = new PosterManager(3);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        Posters[] expected = new Posters[] {fifth, fourth, third};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
}
