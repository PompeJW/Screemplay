package com.devcognitio.screenplay.avianca.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;

public class LocalizadoresAuto {
    public static final Target DESKTOPS = Target.the("localizadr de la lista desplegable de desktops")
            .locatedBy("div.container:nth-child(3) nav.navbar div.collapse.navbar-collapse.navbar-ex1-collapse ul.nav.navbar-nav li.dropdown:nth-child(1) > a.dropdown-toggle");

    public static final Target PC = Target.the("seccion de pc")
            .locatedBy("//a[@href='http://opencart.abstracta.us:80/index.php?route=product/category&path=20_27']");

    public static final  Target ADDTOCARD = Target.the("agregar al carrito")
            .locatedBy("//span[contains(text(),'Add to Cart')]");

    public static final Target CAR = Target.the("buttom shopping")
            .locatedBy("//span[@id='cart-total']");

    public static final Target CHEKOUT = Target.the("chetkout ")
            .locatedBy("//strong[contains(text(),' Checkout')]");

    public static final Target  CONTINUE = Target.the("continuar con el registro")
            .locatedBy("//input[@id='button-account']");

    public static final Target NAME = Target.the("nombre")
            .locatedBy("//input[@name='firstname']");

    public static final Target LASTNAME = Target.the("apellido")
            .locatedBy("//input[@name='lastname']");

    public static final Target EMAIL = Target.the("email")
            .locatedBy("//input[@id='input-payment-email']");

    public static final Target CELL = Target.the("cell")
            .locatedBy("//input[@id='input-payment-telephone']");

    public static final Target PASSWORD = Target.the("password")
            .locatedBy("//input[@id='input-payment-password']");

    public static final Target CONFIRM = Target.the("confirm pasword")
            .locatedBy("//input[@id='input-payment-confirm']");

    public static final  Target ADDRESS = Target.the("direccion casa")
            .locatedBy("//input[@placeholder='Address 1']");

    public static final Target CITY = Target.the("city")
            .locatedBy("//input[@id='input-payment-city']");

    public static final Target POSSTCODE = Target.the("codigo postal")
            .locatedBy("//input[@id='input-payment-postcode']");

    public static final Target CIUDAD =Target.the("prueba de ciudad en lista")
            .locatedBy("//option[@value='47']");

    public static final Target DEPARTAMENTO = Target.the("prueba con el departamento")
            .locatedBy("//option[@value='721']");

    public static final Target POLITICA = Target.the("aceptar politica de privacidad")
            .locatedBy("//input[@name='agree']");

    public static final Target CONTINIUN =Target.the("continuar con el registro")
            .locatedBy("//input[@id='button-register']");

    public static final Target CONTINUE3 = Target.the("continuar paso 3")
            .locatedBy("//input[@id='button-shipping-address']");

    public static final Target CONTINUE4 = Target.the("continuar paso 4")
            .locatedBy("//input[@id='button-shipping-method']");

    public static final Target TERMINOS = Target.the("aceptar terminos #2")
            .locatedBy("//input[@name='agree']");

    public static final Target CONFIRMACION  = Target.the("confirmar pago")
            .locatedBy("//input[@id='button-payment-method']");

    public static final Target PASOFINAL = Target.the("ultimo paso final")
            .locatedBy("//input[@id='button-confirm']");




}
