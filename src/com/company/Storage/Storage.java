package com.company.Storage;

/**
 * Интерфейс носителя информации
 * @author Gurova Irina
 */
public interface Storage {
    /**
     * Функция получения названия носителя
     * @return Возвращает название носителя строкой
     */
    String getName();

    /**
     * Функция получения информаци о песне - название и автора
     */
    void getSongsInfo();
}
