package ru.netology.manager;

import ru.netology.domain.Posters;

public class PosterManager {
    private Posters[] posters = new Posters[0];
    private int howMuchToShow = 10;

    public PosterManager(int howMuchToShow) {
        this.howMuchToShow = howMuchToShow;
    }

    public PosterManager() {

    }

    public void addFilm(Posters poster) {
        Posters[] tmp = new Posters[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        this.posters = tmp;
    }

    public Posters[] findAll() {
        return this.posters;
    }

    public Posters[] findLast() {
        int lastFilmNumber;
        if (posters.length > howMuchToShow) {
            lastFilmNumber = howMuchToShow;
        } else {
            lastFilmNumber = posters.length;
        }
        Posters[] tmp = new Posters[lastFilmNumber];
        for (int i = 0; i < lastFilmNumber; i++) {
            tmp[i] = posters[posters.length - i - 1];
        }
        return tmp;
    }
}
