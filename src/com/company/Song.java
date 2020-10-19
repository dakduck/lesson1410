package com.company;

/**
 * Класс, реализующий макет песни со свойствами <b>name<b/> и <b>author<b/>.
 *
 * @author GurovaIrina
 */
public class Song {
    /**
     * Название песни
     */
    public String name;
    /**
     * Автор песни
     */
    public String author;

    /**
     * Конструктор - создание нового объекта-песни с определенными значениями
     *
     * @param n - название песни
     * @param a - имя автора
     */
    public Song(String n, String a) {
        this.name = n;
        this.author = a;
    }

    /**
     * Функция получения информации о песне - название и автор
     */
    public void info() {
        System.out.printf("%20s | %20s\n", this.name, this.author);
    }
}
