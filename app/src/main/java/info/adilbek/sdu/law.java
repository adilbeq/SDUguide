package info.adilbek.sdu;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class law extends AppCompatActivity {
    TextView textfont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law);
        Typeface MMBold = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Bold.ttf");
        Typeface MMMedium = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Medium.ttf");

        textfont = findViewById(R.id.facultylaw);
        textfont.setTypeface(MMMedium);
    }
}
