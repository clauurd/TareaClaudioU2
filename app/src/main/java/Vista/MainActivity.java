package Vista;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tareaclaudiou2.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declaracion de objetos
    private Button btnRegister;
    private Button btnLista;
    private ImageView imagenMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //Metodo que conecta la vista con la actividad
        setContentView(R.layout.activity_main);

        this.imagenMain = (ImageView)findViewById(R.id.imgLogo);
        this.imagenMain.setImageResource(R.drawable.iconolibros);
        this.btnRegister = (Button) findViewById(R.id.btnRegister);
        this.btnRegister.setOnClickListener(this);
        this.btnLista = (Button) findViewById(R.id.btnLista);
        this.btnLista.setOnClickListener(this);



    }
    @Override
    public void onClick(View v) {
        Button btn = (Button) v;
        if(btn.getId() == R.id.btnRegister){
            Intent intent = new Intent(MainActivity.this, Register.class);
            startActivity(intent);
        }else{
            if(btn.getId() == R.id.btnLista){
                Intent intent = new Intent(MainActivity.this, Lista.class);
                startActivity(intent);
            }
        }
    }





}

