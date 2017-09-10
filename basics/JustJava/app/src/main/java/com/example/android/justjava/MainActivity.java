package com.example.android.justjava;

import java.text.NumberFormat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        quantity += 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        quantity -= 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        EditText nameEditText = (EditText) findViewById(R.id.name_edit_text);
        String name = nameEditText.getText().toString();
        Log.v("MainActivity", "name: " + name);

        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();
        Log.v("MainActivity", "hasWhippedCream: " + hasWhippedCream);

        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = chocolateCheckBox.isChecked();
        Log.v("MainActivity", "hasChocolate: " + hasChocolate);

        int price = calculatePrice(hasWhippedCream, hasChocolate);
        String orderSummary = createOrderSummary(name, hasWhippedCream, hasChocolate, price);
        displayMessage(orderSummary);
    }

    /**
     * This method creates order summary.
     *
     * @param name customer's name
     * @param hasWhippedCream add whipped cream
     * @param hasChocolate add chocolate
     * @param price total price
     * @return message order summary
     */
    private String createOrderSummary(String name, boolean hasWhippedCream, boolean hasChocolate, int price) {
        String message = "Name: " + name;
        message += "\nAdd whipped cream? " + hasWhippedCream;
        message += "\nAdd chocolate? " + hasChocolate;
        message += "\nQuantity: " + quantity;
        message += "\nTotal: " + NumberFormat.getCurrencyInstance().format(price);
        message += "\nThank you!";
        return message;
    }

    /**
     * Calculate the price of the order.
     *
     * @param hasWhippedCream
     * @param hasChocolate
     * @return total price
     */
    private int calculatePrice(boolean hasWhippedCream, boolean hasChocolate) {
        int pricePerCupOfCoffee = 5;

        // add $1 if customer wants whipped cream
        if (hasWhippedCream) {
            pricePerCupOfCoffee += 1;
        }

        // add $2 if customer wants chocolate
        if (hasChocolate) {
            pricePerCupOfCoffee += 2;
        }
        return quantity * pricePerCupOfCoffee;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}
