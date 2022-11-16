package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    TextView tv1;
    int suma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv1 = findViewById(R.id.tv1);

        if(savedInstanceState!=null){
            suma = savedInstanceState.getInt("valor");
            tv1.setText("La suma: " + suma);
        }

    }

    public void sumar(View v) {
        suma = Integer.parseInt(et1.getText().toString()) + Integer.parseInt(et2.getText().toString());
        tv1.setText("La suma: " + suma);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("valor", suma);

    }

/*    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        suma = savedInstanceState.getInt("valor");
        tv1.setText("La suma: " + suma);
    }*/
}