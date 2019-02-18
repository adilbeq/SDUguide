package info.adilbek.sdu;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView law;
    TextView txtSDU;
    TextView txtSDUF;
    TextView lawtext;
    TextView textfont2;
    TextView textfont3;
    TextView textfont4;
    TextView textfont5;
    TextView textfont6;
    TextView textfont7;

    CardView human;
    CardView engeen;
    CardView busin;
    CardView staff;
    CardView news;
    CardView contacts;
    CardView gall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSDU = findViewById(R.id.txtSDU);
        txtSDUF = findViewById(R.id.txtSDUF);
        lawtext = findViewById(R.id.lawtext);
        textfont2 = findViewById(R.id.txtfont2);
        textfont3 = findViewById(R.id.txtfont3);
        textfont4 = findViewById(R.id.txtfont4);
        textfont5 = findViewById(R.id.txtfont5);
        textfont6 = findViewById(R.id.txtfont6);
        textfont7 = findViewById(R.id.txtfont7);


        Typeface MMBold = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Bold.ttf");
        Typeface MMMedium = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Medium.ttf");
        txtSDU.setTypeface(MMBold);
        txtSDUF.setTypeface(MMMedium);
        lawtext.setTypeface(MMMedium);
        textfont2.setTypeface(MMMedium);
        textfont3.setTypeface(MMMedium);
        textfont4.setTypeface(MMMedium);
        textfont5.setTypeface(MMMedium);
        textfont6.setTypeface(MMMedium);
        textfont7.setTypeface(MMMedium);

        law = findViewById(R.id.lawid);
        law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, law.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        human = findViewById(R.id.human);
        human.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, human.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        engeen = findViewById(R.id.engeen);
        engeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, engeen.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        busin = findViewById(R.id.busin);
        busin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, business.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        staff = findViewById(R.id.staff);
        staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, staff.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        news = findViewById(R.id.news);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, news.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        contacts = findViewById(R.id.contacts);
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, contacts.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        gall = findViewById(R.id.gall);
        gall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, gall.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

    }
}
