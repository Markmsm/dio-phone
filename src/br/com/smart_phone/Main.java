package br.com.smart_phone;

import br.com.smart_phone.browser.Browser;
import br.com.smart_phone.browser.safari.Safari;
import br.com.smart_phone.music_player.MusicPlayer;
import br.com.smart_phone.phone.Phone;

public class Main {
    public static void main(String[] args) {
        Browser browser = new Safari();
        MusicPlayer musicPlayer = new MusicPlayer();
        Phone phone = new Phone();

        browser.showPage();
        browser.refreshPage();
        browser.addNewTab();

        musicPlayer.play();
        musicPlayer.pause();
        musicPlayer.selectMusic();

        phone.call();
        phone.answer();
        phone.startVoiceMail();
    }
}