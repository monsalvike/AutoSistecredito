package com.Sistecredito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;

public class paginaPrincipal {
    public static Target BTNPAGORAPIDO = Target.the("btn pago rapido").located(By.id("com.sistecredito.credinet.personas:id/linearLayout_fastPayment_start"));
    public static Target CAMPOCEDULA = Target.the("campo cedula").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"));
public static Target BTNCONTINUAR = Target.the("btn continar").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button"));
public static Target RESULTADO = Target.the("resultado").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.widget.TextView[1]"));

}
