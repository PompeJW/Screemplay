package com.devcognitio.screenplay.avianca.user_interface;


import net.serenitybdd.screenplay.targets.Target;

public class BusquedaBiblicaPage {

    public static final Target SEARCH = Target.the("Buscar tema")
            .locatedBy("//input[@placeholder='Buscar']");

    public static final Target LINK = Target.the("verificar link")
            .locatedBy("/html[1]/body[1]/div[7]/div[1]/div[1]/main[1]/article[1]/div[2]/section[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/h4[1]/a[1]/span[1]");

    public static final Target BIBLIOTECA = Target.the("buscar revistas")
            .locatedBy("//a[@class='iconLink jsDropdownNavButton']//span[contains(text(),'BIBLIOTECA')]");

    public static final Target  REVISTAS = Target.the("click revistas")
            .locatedBy("//span[@class='iconLink-icon jwIcon mid1011209']");

    public static final Target FILTRO = Target.the("selecciones el tipo")
            .locatedBy("//input[@placeholder='Elija o escriba un título']");

    public static final Target BUSQUEDA =Target.the("buscar la especificacion")
            .locatedBy("//input[@value='Buscar']");

    public static final Target VALIDACION = Target.the("verificar el contenido")
            .locatedBy("//div[@class='synopsis publication  publications pub-wp iss-202109 dir-ltr ml-S ms-ROMAN PublicationIssue']");


}
