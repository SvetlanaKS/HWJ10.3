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
        int resultlenght;
        if (count != 0 & count < items.length) {
            resultlenght = count;
        } else {
            resultlenght = items.length;
        }
        MoviesItem[] result = new MoviesItem[resultlenght];
        for (int i = 0; i < resultlenght; i++) {
            if (count != 0 & count < items.length) {
                int index = resultlenght - i;
                result[i] = items[index];

            } else {
                int index = resultlenght - i - 1;
                result[i] = items[index];
            }
        }
        return result;
    }

}