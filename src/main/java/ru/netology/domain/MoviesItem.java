package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoviesItem {
    private int id;
    private int movieId;
    private String movieName;
    private int movieGenre;
    private int count;
}