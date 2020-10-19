package com.company.Players;

import com.company.Storage.Storage;

/**
 * Класс проигрывателя любых носителей со свойством <b>store</b>
 * @author Gurova Irina
 */
public class MultiPlayer implements Player {

    /**
     * Название проигрывателя
     */
    private String name = "MultiPlayer";

    /**
     * Носитель, откуда плеер считывает информацию
     */
    private Storage store;

    /**
     * Конструктор с конкретными значениями. Универсальный плеер может воспроизвести информацию с любого носителя.
     * @param s - носитель
     */
    public MultiPlayer(Storage s) {
        this.store = s;
    }

    /**
     * Функция воспроизведения песни с носителя
     */
    @Override
    public void play() {
        System.out.printf("%17s | %17s | ", this.name, store.getName());
        this.store.getSongsInfo();
        System.out.println("------------------------------------------------------------------------------------");
    }
}
