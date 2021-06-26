package com.jherrera.myapplistpaises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lista;
    ArrayList<String> paises = new ArrayList<>();
    ArrayList<Integer> img = new ArrayList<>();
    ArrayList<Integer> texto = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.listaPaises);

        //Llenado de arrayList
        paises.add("Guatemala");
        paises.add("Ecuador");
        paises.add("Brasil");
        paises.add("Honduras");
        paises.add("Francia");
        paises.add("Estados Unidos");
        paises.add("Panama");
        paises.add("Portugal");
        paises.add("Alemania");
        paises.add("Mexico");

        //llenado de arrayList de imagenes a trasladar
        img.add(R.drawable.guatemala);
        img.add(R.drawable.ecuador);
        img.add(R.drawable.brasil);
        img.add(R.drawable.honduras);
        img.add(R.drawable.francia);
        img.add(R.drawable.estados_unidos);
        img.add(R.drawable.panama);
        img.add(R.drawable.portugal);
        img.add(R.drawable.alemania);
        img.add(R.drawable.mexico);

        texto.add(R.string.guate);
        texto.add(R.string.ecu);
        texto.add(R.string.bra);
        texto.add(R.string.hon);
        texto.add(R.string.fran);
        texto.add(R.string.usa);
        texto.add(R.string.pam);
        texto.add(R.string.por);
        texto.add(R.string.ale);
        texto.add(R.string.mexi);

        //Declaracion del adaptador para la visualizacion de la informacion de la lista
        //Llenado de la lista
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, paises);
        lista.setAdapter(adapter);

        //Metodo para poder activar la funcion de presionar los componenetes de la lista
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"A pulsado "+paises.get(position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),MAPais.class);
                intent.putExtra("imagen",img.get(position));
                intent.putExtra("texto",texto.get(position));
                startActivity(intent);
            }
        });
    }
}