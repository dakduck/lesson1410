package com.company.Storage;

import com.company.Song;

public class Vinyl implements Storage {
    /**
     * Название носителя
     */
    public String name = "Vinyl";

    /**
     * Песня, хранящаяся на носителе
     * @see Song
     */
    public Song song;

    /**
     * Конструктор с конкретными параметрами
     * @param s - песня
     */
    public Vinyl(Song s) {
        this.song = s;
    }

    /**
     *
     * @return возвращает название носителя
     * @see Storage#getName()
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Функция, выводящая информацию о песне на экран
     */
    @Override
    public void getSongsInfo() {
        this.song.info();
    }
}
