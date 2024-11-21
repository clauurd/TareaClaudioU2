package Vista;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tareaclaudiou2.R;

import java.util.ArrayList;
import java.util.List;

import Controlador.RecyclerAdapter;
import Controlador.Utilidades;
import Modelo.Libros;

public class Lista extends AppCompatActivity {
    //Declaracion de variables
    RecyclerView recyclerView;
    RecyclerAdapter recAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lista);

        recyclerView = (RecyclerView) findViewById(R.id.recView);

        recAdapter = new RecyclerAdapter(Utilidades.getListLibros(),this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(recAdapter);
        recyclerView.setLayoutManager(layoutManager);

    }

}