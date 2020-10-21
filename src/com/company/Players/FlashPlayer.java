package com.company.Players;

import com.company.Storage.Cassette;
import com.company.Storage.FlashDrive;
import com.company.Storage.Storage;

/**
 * Класс проигрывателя с разъемом USB со свойством <b>store</b>
 *
 * @author Gurova Irina
 */
public class FlashPlayer implements Player {

    /**
     * Название проигрывателя
     */
    private String name = "USB Player";

    /**
     * Носитель, откуда плеер считывает информацию
     */
    private Storage store;

    /**
     * Конструктор с конкретными значениями. Носитель можно использовать с данным плеером, если они совместимы.
     *
     * @param s - носитель
     */
    public FlashPlayer(Storage s) {
        if (s instanceof FlashDrive) {
            this.store = s;
        } else {
            System.out.printf("%17s | DOESN'T support %s\n", this.name, s.getName());
        }
    }

    /**
     * Функция воспроизведения песни с носителя
     */
    @Override
    public void play() {
        if (store != null) {
            System.out.printf("%17s | %17s | ", this.name, store.getName());
            this.store.getSongsInfo();
            System.out.println("------------------------------------------------------------------------------------");
        } else {
            System.out.println("There's nothing to play 'cause the storage is empty");
            System.out.println("------------------------------------------------------------------------------------");
        }
    }
}
