package com.example.testeandroidvalendoumpt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static int CADATRADO_SUCESSO = 12;

    private EditText n1;
    private EditText n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.formulario_notan1);
        n2 = findViewById(R.id.formulario_notan2);

        Button botaoAvancar = (Button) findViewById(R.id.formulario_avancar);
        botaoAvancar.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v) {

                String n1Value = n1.getText().toString();
                String n2Value = n2.getText().toString();

                Float media = (Float.parseFloat(n1Value)+Float.parseFloat(n2Value))/2;

                Intent intentCalculaMedia = new Intent (MainActivity.this, N2Activity.class);
                intentCalculaMedia.putExtra("media", media.toString());
                startActivityForResult(intentCalculaMedia, CADATRADO_SUCESSO);
            }
        });

    }
}
