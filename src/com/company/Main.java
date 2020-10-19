package com.company;

import com.company.Players.CassettePlayer;
import com.company.Players.CDplayer;
import com.company.Players.VinylPlayer;
import com.company.Players.FlashPlayer;
import com.company.Players.MultiPlayer;
import com.company.Storage.CDdisc;
import com.company.Storage.Cassette;
import com.company.Storage.FlashDrive;
import com.company.Storage.Vinyl;


/**
 * Класс для запуска программы
 * @author Gurova Irina
 */
public class Main {
    /**
     * Функция запуска программы.
     * Создание экземпляров плееров, носителей и песен. Попытка воспроизвести данные с носителя на данном плеере.
     *
     */
    public static void main(String[] args) {
    	// *** Создаем песни ***
        var song1 = new Song("Blank Space", "Taylor Swift");
		var song2 = new Song("Say So", "Doja Cat");
		var song3 = new Song("Merry Christmas", "Mariah Carry");
		var song4 = new Song("Молния", "Дима Билан");

		// *** Создаем носители (в качестве параметра песня, которая будет на нем храниться) ***
		var vinylStorage = new Vinyl(song1);
		var cdStorage = new CDdisc(song2);
        var cassetteStorage = new Cassette(song3);
        var flashDrive = new FlashDrive(song4);

		// *** Создаем плееры (в качестве параметра носитель, с кот-го нужно воспроизвести песню) ***
        var cdPlayer = new CDplayer(cdStorage);
        var vinylPlayer = new VinylPlayer(vinylStorage);
        var cassettePlayer = new CassettePlayer(cassetteStorage);
        var flashPlayer = new FlashPlayer(flashDrive);
        var multiPlayer = new MultiPlayer(cassetteStorage);


        System.out.printf("%-17s | %-17s | %-20s | %-20s\n", "Player", "Storage", "Song's name", "Song's Author");
        System.out.println("------------------------------------------------------------------------------------");

        // *** Пытаемся воспроизвести данные плеером с носителя ***
        // успешно
        cdPlayer.play();
        vinylPlayer.play();
        cassettePlayer.play();
        flashPlayer.play();
        multiPlayer.play();
        multiPlayer = new MultiPlayer(vinylStorage);
        multiPlayer.play(); // мультиплеер и винил

        // неудачно
        cdPlayer = new CDplayer(cassetteStorage);
        cdPlayer.play(); // СD плеер и кассета

        vinylPlayer = new VinylPlayer(flashDrive);
        vinylPlayer.play(); // виниловый проигрыватель и флешка

        cassettePlayer = new CassettePlayer(vinylStorage);
        cassettePlayer.play(); // кассетный проигрыватель и винил

        flashPlayer = new FlashPlayer(cassetteStorage);
        flashPlayer.play(); // usb проигрыватель и кассета
    }
}
