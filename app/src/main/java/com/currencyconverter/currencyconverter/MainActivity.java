package com.currencyconverter.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner currency1;
    private Spinner currency2;
    private String currency1Items[] = {"AUD", "BGN", "BRL", "CAD", "CHF", "CNY", "CZK", "DKK", "GBP"
                                        , "HKD", "HUF", "IDR", "ILS", "INR", "JPY", "KRW", "MXN", "MYR"
                                        , "NOK", "NZD", "PHP", "PLN", "RON", "RUB", "SEK", "SGD", "THB"
                                        , "TRY", "USD", "ZAR"};
    private String currency2Items[] = {"AUD", "BGN", "BRL", "CAD", "CHF", "CNY", "CZK", "DKK", "GBP"
                                        , "HKD", "HUF", "IDR", "ILS", "INR", "JPY", "KRW", "MXN", "MYR"
                                        , "NOK", "NZD", "PHP", "PLN", "RON", "RUB", "SEK", "SGD", "THB"
                                        , "TRY", "USD", "ZAR"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currency1 = (Spinner) findViewById(R.id.spinner1);
        currency2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> adapterForSpinner1
                = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, currency1Items);
        adapterForSpinner1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapterForSpinner2
                = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, currency2Items);
        adapterForSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        currency1.setAdapter(adapterForSpinner1);
        currency2.setAdapter(adapterForSpinner2);

        //debug to check conversion rates

        //TextView test2 = (TextView) findViewById(R.id.textViewName);
       // test2.setText("the number is "+ test);

        //setOnItemSelectedListener will come here

        //
    }
}