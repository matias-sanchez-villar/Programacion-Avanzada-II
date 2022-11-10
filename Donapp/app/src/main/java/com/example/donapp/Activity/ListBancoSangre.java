package com.example.donapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.donapp.Entity.BancoSangre;
import com.example.donapp.Entity.Solicitud;
import com.example.donapp.R;

public class ListBancoSangre extends AppCompatActivity {

    ListView vtBancoSangre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_banco_sangre);

        vtBancoSangre = (ListView) findViewById(R.id.lvBancoSangre);
        setListeners();
    }

    public void setListeners(){
        vtBancoSangre.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                BancoSangre bancoSangre = (BancoSangre) parent.getItemAtPosition(position);
                /*Intent modificarSolicitud = new Intent(this, AltaSolicitudActivity.class);
                modificarSolicitud.putExtra("bancoSangre", bancoSangre);
                startActivity(modificarSolicitud);*/
            }
        });
    }

}