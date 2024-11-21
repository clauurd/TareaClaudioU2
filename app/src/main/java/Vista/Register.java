package Vista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tareaclaudiou2.R;

public class Register extends AppCompatActivity implements View.OnClickListener{

    private Button btnRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        btnRegistrarse = (Button) findViewById(R.id.btnRegistrarse);
        btnRegistrarse.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Button b = (Button) v;
        if(b.getId() == R.id.btnRegistrarse){
            Intent intent = new Intent(this,MainActivity.class);
            Toast.makeText(this, "Usuario correctamente registrado", Toast.LENGTH_LONG).show();

            startActivity(intent);
        }

    }

}