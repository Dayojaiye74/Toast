package com.dev_app.toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


/* TOAST is used to display information in a brief way, most importantly
* to tell the user the current event taking place in the app when they perform
* certain actions --- Created by Dayo Jaiye (D++)*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Call your Button -- Step 1
        Button btn = findViewById(R.id.button);

        //Create onClick Listener for the button to perform the toast action -- step 2

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The toast is inside the onClick method -- step 3
                Toast.makeText(MainActivity.this, "Button is Clicked :)", Toast.LENGTH_LONG).show();

            }
        });
    }
}