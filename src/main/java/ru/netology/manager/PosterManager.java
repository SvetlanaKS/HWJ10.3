package ru.netology.manager;

import ru.netology.domain.MoviesItem;

public class PosterManager {
    private MoviesItem[] items = new MoviesItem[0];
    private int count;


    public PosterManager() {
    }

    public PosterManager(int limit) {
        this.count = limit;
    }

    //добавление фильма
    public void add(MoviesItem item) {
        int length = items.length + 1;
        MoviesItem[] tmp = new MoviesItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    // вывести фильмы в обратном порядке
    public MoviesItem[] getLast() {
        int resultsLenght;
        if (items.length != count) {
            resultsLenght = count;
        } else {
            resultsLenght = items.length;
        }
        MoviesItem[] results = new MoviesItem[resultsLenght];
        for (int i = 0; i < resultsLenght; i++) {
            int index = items.length - i - 1;
            results[i] = items[index];
        }
        return results;
    }

    //удаление фильма
    public void decreasePoster(int newLenght) {
        int lenght = newLenght;
        int index = 0;
        MoviesItem[] tmp = new MoviesItem[lenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[index];
            index++;
        }
        items = tmp;
        count = tmp.length;
    }
}