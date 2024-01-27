package ru.shitikov.zuzel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout Petr1;
    private LinearLayout Nicola , Da;
    private Button Zuz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Petr1 = findViewById(R.id.Petr1);
        Nicola = findViewById(R.id.Nicola);
        Da = findViewById(R.id.Da);
        Zuz = findViewById(R.id.button2);
    }

    public void OnClickStartZuzel(View view) {
    }
}