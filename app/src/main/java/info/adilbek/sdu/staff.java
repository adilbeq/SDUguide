package info.adilbek.sdu;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;

public class staff extends AppCompatActivity {
    TextView textfont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        Typeface MMBold = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Bold.ttf");
        Typeface MMMedium = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Medium.ttf");

        textfont = findViewById(R.id.facultylaw);
        textfont.setTypeface(MMMedium);
    }

}
