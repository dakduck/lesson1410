package com.company.Storage;

import com.company.Song;
import com.company.Storage.Storage;

/**
 * Класс, реализующий макет кассеты со свойствами <b>name</b> и <b>song</b>
 *
 * @author Gurova Irina
 */
public class Cassette implements Storage {
    /**
     * Название носителя
     */
    public String name = "Cassette";
    /**
     * Песня, хранящаяся на носителе
     *
     * @see Song
     */
    public Song song;

    /**
     * Конструктор с конкретными параметрами
     *
     * @param s - песня
     */
    public Cassette(Song s) {
        this.song = s;
    }

    /**
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
