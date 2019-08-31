package com.example.testeandroidvalendoumpt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class N2Activity extends AppCompatActivity {


    public EditText resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n2);

        resultado = findViewById(R.id.editText2);

        Intent intentRecebido = getIntent();
        Bundle buundle = intentRecebido.getExtras();
        String media = (String) buundle.get("media");
        resultado.setText(media, TextView.BufferType.EDITABLE );


//        System.out.println(media);
    }
}
