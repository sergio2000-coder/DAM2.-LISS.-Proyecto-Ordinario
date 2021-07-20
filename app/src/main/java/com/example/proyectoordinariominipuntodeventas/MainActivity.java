package com.example.proyectoordinariominipuntodeventas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView= (ListView)findViewById(R.id.List);
        String[] nombres= {"Manzana","Pera","Uva","Fresa","Durazno"};
        String[] precios= {"40","50","30","70","90"};
        Integer[] idmage= {R.drawable.manzana,R.drawable.pera,R.drawable.uva,R.drawable.fresa,R.drawable.durazno,R.d};
        AdapterList adapter = new AdapterList(this,nombres,precios,idmage,);
        ListView.setAdapter(adapter);

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Seleccionaste el elemento: "+nombres[position],Toast.LENGTH_LONG).show();
            }
        });
        ListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Seleccionaste el elemento: "+nombres[position]+"con precio de :$"+precios[position], Toast.LENGTH_LONG).show();
                return true;
            }

        });
    }
}