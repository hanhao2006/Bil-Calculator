package com.example.billcalulation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNbPerson, editTextTotalBill, editTextTPS, editTextTVQ, editTextTOtalallbill;
    private TextView textViewResult;
    private Button btnCalculation;
    private Calculator cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculation();
    }

    private void calculation() {
        editTextNbPerson = findViewById(R.id.editTextNumberOfMember);
        editTextTotalBill = findViewById(R.id.editTextTotallBill);
        textViewResult = findViewById(R.id.textViewBill);
        editTextTPS = findViewById(R.id.tps);
        editTextTVQ = findViewById(R.id.tvq);
        editTextTOtalallbill = findViewById(R.id.totalbill);

        btnCalculation = findViewById((R.id.btnCal));
        btnCalculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal = new Calculator();
                String nb = editTextNbPerson.getText().toString();
                cal.setNb(Integer.valueOf(nb));
                String bill = editTextTotalBill.getText().toString();
                cal.setBill(Integer.valueOf(bill));
                double tps = cal.calTPS();
                double tvq = cal.calTVQ();
                editTextTPS.setText(String.valueOf(tps));
                editTextTVQ.setText(String.valueOf(tvq));
                double total = cal.totalbill(tps,tvq);
                editTextTOtalallbill.setText(String.valueOf(total));
                double eachPerson = cal.eachPerson(total);
                textViewResult.setText("Each person pay: " + String.valueOf(eachPerson));

            }
        });

    }
}
