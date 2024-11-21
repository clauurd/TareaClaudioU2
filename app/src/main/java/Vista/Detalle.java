package Vista;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tareaclaudiou2.R;

public class Detalle extends AppCompatActivity {
    //declaración de variables
    private TextView detalleTexto;
    private TextView titulo;
    private ImageView imagen;
    private Intent iteminfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalle);

        detalleTexto = findViewById(R.id.descDetalle);
        titulo = findViewById(R.id.tituloDetalle);
        imagen = findViewById(R.id.imagenDetalle);

        iteminfo = getIntent();

        detalleTexto.setText(iteminfo.getStringExtra("descripcion"));
        titulo.setText(iteminfo.getStringExtra("titulo"));
        imagen.setImageResource(iteminfo.getIntExtra("imageId",0));

        detalleTexto.setMovementMethod(new ScrollingMovementMethod());


    }
}