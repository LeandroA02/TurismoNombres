package com.example.turismonombres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Método llamado cuando se hace clic en el botón de inicio de sesión
    public void iniciarSesion(View view) {
        EditText etUsuario = findViewById(R.id.etUsuario);
        EditText etContraseña = findViewById(R.id.etContraseña);

        String usuario = etUsuario.getText().toString();
        String contraseña = etContraseña.getText().toString();

        // Validación básica del usuario y la contraseña (puedes reemplazar esto con tu lógica de validación)
        if (usuario.equals("cristian") && contraseña.equals("123")) {
            // Inicio de sesión exitoso, navega a la siguiente actividad
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        } else {
            // Muestra un mensaje de error en caso de credenciales incorrectas
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
}
