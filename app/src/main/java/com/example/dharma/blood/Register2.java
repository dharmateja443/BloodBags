package com.example.dharma.blood;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.BitSet;
import java.util.Calendar;

public class Register2 extends AppCompatActivity {

    private static Button submit;
    private static ImageButton btn;
    int d,m,y;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        findcontrol();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                Calendar calendar = Calendar.getInstance();
                d=calendar.get(Calendar.DAY_OF_MONTH);
                m=calendar.get(Calendar.MONTH);
                y=calendar.get(Calendar.YEAR);
                DatePickerDialog pickerDialog = new DatePickerDialog(Register2.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        i1=i1+1;
                        textView.setText("Last Donation Date="+i2+"/"+i1+"/"+i);
                    }
                }, y, m, d);
                pickerDialog.show();
            }
        });
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register2.this, Mainpage.class));
            }
        });
    }
    private void findcontrol(){
        btn = (ImageButton) findViewById(R.id.date);
        textView= (TextView) findViewById(R.id.txtdate);
    }
}
