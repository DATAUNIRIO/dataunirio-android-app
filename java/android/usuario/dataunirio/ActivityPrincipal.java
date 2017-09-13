package android.usuario.dataunirio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_principal);

        WebView webView = (WebView)findViewById(R.id.webView);
        // Habilita JavaScript (jQuery) - necessário para efeitos.
        webView.getSettings().setJavaScriptEnabled(true);
        // webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.loadUrl("https://dataunirio.github.io/");
        // Habilita links para navegação interna (sem redirecionamento para outros browsers).
        webView.setWebViewClient(new WebViewClient());
    }
}
