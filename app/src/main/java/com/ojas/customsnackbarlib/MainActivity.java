package com.ojas.customsnackbarlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ojas.customsanckbar.CustomSnackBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonSuccessSnackBar = findViewById(R.id.successShowSnackBarBtn);
        buttonSuccessSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomSnackBar.showSnackBarSuccess(v, getApplicationContext(), "Success Snack Bar", 10);

            }
        });

        Button buttonErrorSnackBar = findViewById(R.id.errorShowSnackBarBtn);
        buttonErrorSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomSnackBar.showSnackBarError(v, "Error Snack Bar", 10);

            }
        });
    }
}
