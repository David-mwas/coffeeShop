package com.example.coffeeshop;

import static com.example.coffeeshop.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Minus, Plus, order;
    TextView coffee, ordertxt;
    EditText name;
int no_coffee=0, price_cup=200, total_price=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        Minus = findViewById(id.negative);
        Plus = findViewById(id.positive);
        coffee = findViewById(id.coffee);
        order = findViewById(id.orderButton);
        ordertxt = findViewById(id.orderTxt);
        name = findViewById(id.nameUser);
        Minus.setOnClickListener(view -> btnMinus());
        Plus.setOnClickListener(view -> btnPlus());
        order.setOnClickListener(view -> showOrder());
    }

    public void btnMinus() {

        if (no_coffee != 0) {
            //no_coffee = 0;

            no_coffee--;
            total_price = no_coffee * price_cup;
            coffee.setText(" " + no_coffee);
            Toast.makeText(this, "no of coffee "+no_coffee+" "+"total price"+total_price, Toast.LENGTH_SHORT).show();
        }
    }
    public void btnPlus() {
        if(no_coffee!=20) {
            no_coffee++;
            total_price = no_coffee * price_cup;
            coffee.setText("" + no_coffee);
            //The total price of x cups of coffeeis Ksh:
            Toast.makeText(this, "The total price of:" + " " + no_coffee + " " + "is Ksh" + " " + total_price, Toast.LENGTH_SHORT).show();
        }
        }
    public void showOrder(){
        ordertxt.setText(name.getText()+" "+"Your order of"+" "+no_coffee+" "+"Cups of Coffee is"+" "+total_price);
    }
}
