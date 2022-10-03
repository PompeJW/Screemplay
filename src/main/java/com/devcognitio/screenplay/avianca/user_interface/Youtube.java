package com.devcognitio.screenplay.avianca.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class Youtube {
    public static final Target SEARCH = Target.the("buscardor de youtube")
            .locatedBy("//input[@id='search']");

    public static final Target NAME = Target.the("nombre de la cancion")
            .locatedBy("//img[@src='https://i.ytimg.com/vi/TnSfwONWlk8/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAAEkEMNfUspgDERcWaJRn_YGo_aA']");

    public static final Target ANUNCIO = Target.the("salta el anuncio")
            .locatedBy("//button[@class='ytp-ad-skip-button ytp-button']");

    public static final Target LIKE = Target.the("click en el me gusta")
            .locatedBy("//yt-icon[@class='style-scope ytd-toggle-button-renderer']");

    public static final Target LIST_VIDEOS = Target.the("click en el me gusta")
            .locatedBy("//a[@id='video-title']//yt-formatted-string[contains(text(),'{0}')]");







}
