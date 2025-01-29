package com.example.appgeradormetasdiarias;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

        public void gerarMetas(View view){

        String[] metas = {

                "Caminhe por 30 minutos ao ar livre.",
                "Leia um capítulo de um livro que você goste.",
                "Escreva três coisas pelas quais você é grato hoje.",
                "Aprenda uma nova palavra em outro idioma.",
                "Organize uma gaveta ou espaço da sua casa."

            };

        int numeroAleatorio = new Random().nextInt(5);

            TextView texto = findViewById(R.id.textMetas);
            texto.setText(metas[numeroAleatorio]);


        }



}