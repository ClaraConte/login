package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private Button btnLogin;
private EditText usuario;
private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.login);
        usuario = findViewById(R.id.editTextUser);
        password = findViewById(R.id.editTexttPass);


        // Uso de clase anónima
        btnLogin.setOnClickListener(new View.OnClickListener() {
            // Equivalente a crear una clase que implemente la interfaz y luego enviar el objeto de la misma como parametro
            @Override
            public void onClick(View view) {

               if(usuario.getText().toString().equals("clara") && password.getText().toString().equals("1234")) {

                   Intent i = new Intent (getApplicationContext(), SegundaActividad.class);
                   i.putExtra("usuario", usuario.getText().toString());
                   startActivity(i);

               }else{
                   Toast.makeText(getApplicationContext(),"Usuario y/o password incorrecto",Toast.LENGTH_LONG).show();
               }
            }
        });
    }


}
