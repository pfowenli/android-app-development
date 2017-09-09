package com.example.android.chunkcookies;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.chunkcookies.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // hange cookie image view.
        ImageView cookieImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        cookieImageView.setImageResource(R.drawable.after_cookie);

        //  change status text view
        TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
        statusTextView.setText("I want some more");

    }
}
