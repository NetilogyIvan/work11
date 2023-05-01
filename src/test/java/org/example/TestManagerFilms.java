package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestManagerFilms {
    @Test
    public void maxAddFilms() {
        ManagerFilms managerFilms = new ManagerFilms();
        managerFilms.addFilm("Movie I");
        managerFilms.addFilm("Movie II");
        managerFilms.addFilm("Movie III");
        managerFilms.addFilm("Movie IV");
        managerFilms.addFilm("Movie V");
        String[] actual = managerFilms.findAll();
        String[] expected = {"Movie I", "Movie II", "Movie III", "Movie IV", "Movie V"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void nullAddFilms() {
        ManagerFilms managerFilms = new ManagerFilms();

        String[] actual = managerFilms.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void minAddFilms() {
        ManagerFilms managerFilms = new ManagerFilms();
        managerFilms.addFilm("Movie I");
        String[] actual = managerFilms.findAll();
        String[] expected = {"Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void maxAddFindLastFilms() {
        ManagerFilms managerFilms = new ManagerFilms();
        managerFilms.addFilm("Movie I");
        managerFilms.addFilm("Movie II");
        managerFilms.addFilm("Movie III");
        managerFilms.addFilm("Movie IV");
        managerFilms.addFilm("Movie V");
        String[] actual = managerFilms.findLast();
        String[] expected = {"Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void moreMaxAddFindLastFilms() {
        ManagerFilms managerFilms = new ManagerFilms();
        managerFilms.addFilm("Movie I");
        managerFilms.addFilm("Movie II");
        managerFilms.addFilm("Movie III");
        managerFilms.addFilm("Movie IV");
        managerFilms.addFilm("Movie V");
        managerFilms.addFilm("Movie VI");
        String[] actual = managerFilms.findLast();
        String[] expected = {"Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void nullAddFindLastFilms() {
        ManagerFilms managerFilms = new ManagerFilms();

        String[] actual = managerFilms.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }
}
