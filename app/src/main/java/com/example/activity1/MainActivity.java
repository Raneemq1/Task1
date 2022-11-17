package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText task_edt;
    private Spinner spinner;
    private Switch switcher;
    private String task;
    private String vibration;
    private String reminder_choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        extracted();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                task=task_edt.getText().toString();
                if(!task.isEmpty()) {
                    if (switcher.isChecked()) {
                        vibration = "High Sound";
                    } else {
                        vibration = "low Sound";
                    }

                    reminder_choice = spinner.getSelectedItem().toString();

                    Toast.makeText(MainActivity.this, "Your task is " + task + "\nShall reminde you " + reminder_choice + "\nVibration mode= " + vibration, Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    private void extracted() {
        btn=findViewById(R.id.btn);
        task_edt=findViewById(R.id.task_edt);
        spinner=findViewById(R.id.spinner);
        switcher=findViewById(R.id.switcher);

    }
}