package com.neyamul.newsall;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dashbord extends AppCompatActivity {

    private Button btnBdnews;

    private Button btnDhakatribune;

    private Button btndw;

    private Button btnbusiness;

    private Button btnbonikbarta;

    private Button btnfinancial;

    private Button btnjayjaydin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord);


        btnBdnews=findViewById(R.id.btnBdnews);
        btnBdnews.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),BDNews24.class);
            startActivity(intent);
        });

        btnDhakatribune=findViewById(R.id.btnDhakatribune);
        btnDhakatribune.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),DhakaTribune.class);
            startActivity(intent);
        });

        btndw=findViewById(R.id.btndw);
        btndw.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),DW.class);
            startActivity(intent);
        });

        btnbusiness=findViewById(R.id.btnbusiness);
        btnbusiness.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),BusinessStandard.class);
            startActivity(intent);
        });


        btnbonikbarta=findViewById(R.id.btnbonikbarta);
        btnbonikbarta.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),BonikBarta.class);
            startActivity(intent);
        });

        btnfinancial=findViewById(R.id.btnfinancial);
        btnfinancial.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),TheFinancialExpress.class);
            startActivity(intent);
        });


        btnjayjaydin=findViewById(R.id.btnjayjaydin);
        btnjayjaydin.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(), JayJayDin.class);
            startActivity(intent);
        });



    }
}