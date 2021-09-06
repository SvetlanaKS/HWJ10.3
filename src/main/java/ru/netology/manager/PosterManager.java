package ru.netology.manager;

import ru.netology.domain.MoviesItem;

public class PosterManager {
    private MoviesItem[] items = new MoviesItem[0];

    public PosterManager() {
        
    }

    public PosterManager(MoviesItem[] items) {
        this.items = items;
    }

    public void add(MoviesItem item) {
        int length = items.length + 1;
        MoviesItem[] tmp = new MoviesItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MoviesItem[] getLastTen() {
        int moviesCount = 10;
        int resultsLenght;
        if (moviesCount > items.length) {
            resultsLenght = items.length;
        } else {
            resultsLenght = moviesCount;
        }
        MoviesItem[] results = new MoviesItem[resultsLenght];
        for (int i = 0; i < resultsLenght; i++) {
            int index = items.length - i - 1;
            results[i] = items[index];
        }
        return results;
    }

    public MoviesItem[] getLast(int lenght) {
        int resultsLenght;
        if (lenght > items.length) {
            resultsLenght = items.length;
        } else {
            resultsLenght = lenght;
        }
        MoviesItem[] results = new MoviesItem[resultsLenght];
        for (int i = 0; i < resultsLenght; i++) {
            int index = items.length - i - 1;
            results[i] = items[index];
        }
        return results;
    }

    public void decreasePoster(int newLenght) {
        int lenght = newLenght;
        int index = 0;
        MoviesItem[] tmp = new MoviesItem[lenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[index];
            index++;
        }
        items = tmp;
    }
}