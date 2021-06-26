package com.jherrera.myapplistpaises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MAPais extends AppCompatActivity {
    private ImageView img;
    private TextView tex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapais);
        img = findViewById(R.id.imgBandera);
        tex = findViewById(R.id.txtTexto);
        this.recibirImagen();
    }
    private void recibirImagen(){
        Bundle bundle = getIntent().getExtras();
        int imagen = bundle.getInt("imagen");
        int text = bundle.getInt("texto");
        img.setImageResource(imagen);
        tex.setText(text);
    }
}