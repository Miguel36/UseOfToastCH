package com.example.useoftoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLeft;
    Button btnRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLeft = findViewById(R.id.btn_izquierda);
        btnRight = findViewById(R.id.btn_derecha);
        pressButtonLeftRight();
    }

    public void onClick(View view) {

        switch (view.getId()) {

            case (R.id.btn_superior):
                Toast.makeText(getApplicationContext(), "Push into button of top", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.btn_inferior):
                Toast.makeText(getApplicationContext(), "Push into button of bottom", Toast.LENGTH_LONG).show();
                break;
        }
    }

    private void translateDescButton() {

        if (btnLeft.isPressed()) {
            btnLeft.setText(R.string.translate_btn_left);
        }
        if (btnRight.isPressed()) {
            btnRight.setText(R.string.translate_btn_right);
        }
    }

    private void pressButtonLeftRight() {

        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Push into button of right", Toast.LENGTH_LONG).show();
                translateDescButton();
            }
        });

        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Push into button of left", Toast.LENGTH_LONG).show();
                translateDescButton();
            }
        });
    }
}
