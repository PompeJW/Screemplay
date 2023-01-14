package com.devcognitio.screenplay.avianca.user_interface;

import net.serenitybdd.screenplay.targets.Target;

import java.nio.charset.StandardCharsets;

public class Facebook {
    public static final Target CORREO =Target.the("este es el localizador del correo")
            .locatedBy("//input[@name='email']");
    public static final Target CONTRASEÑA = Target.the("este es el localizador de la contraseña")
            .locatedBy("//input[@name='pass']");
    public static final Target LOGIN = Target.the("loguearce")
            .locatedBy("//button[@name='login']");
    public static final Target BUSCAR = Target.the("barra de busqueda")
            .locatedBy("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]");


}
