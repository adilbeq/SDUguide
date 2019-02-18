package info.adilbek.sdu;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

public class contacts extends AppCompatActivity {
   /* private MapView mapView;
    private GoogleMap gmap;
    private static final String MAP_VIEW_BUNDLE_KEY = "MapViewBundleKey";
    @Override*/
   TextView textfont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        Typeface MMBold = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Bold.ttf");
        Typeface MMMedium = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Medium.ttf");

        textfont = findViewById(R.id.contas);
        textfont.setTypeface(MMMedium);
    }
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_contacts);
//        /*Bundle mapViewBundle = null;
//        if (savedInstanceState != null) {
//            mapViewBundle = savedInstanceState.getBundle(MAP_VIEW_BUNDLE_KEY);
//        }
//        mapView = findViewById(R.id.mapView);
//        mapView.onCreate(mapViewBundle);
//        mapView.getMapAsync((OnMapReadyCallback) this);*/
//    }
    /*public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Bundle mapViewBundle = outState.getBundle(MAP_VIEW_BUNDLE_KEY);
        if (mapViewBundle == null) {
            mapViewBundle = new Bundle();
            outState.putBundle(MAP_VIEW_BUNDLE_KEY, mapViewBundle);
        }

        mapView.onSaveInstanceState(mapViewBundle);
    }
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }
    protected void onPause() {
        mapView.onPause();
        super.onPause();
    }
    protected void onDestroy() {
        mapView.onDestroy();
        super.onDestroy();
    }
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }
    public void onMapReady(GoogleMap googleMap) {
        gmap = googleMap;
        gmap.setMinZoomPreference(12);
        LatLng ny = new LatLng(40.7143528, -74.0059731);
        gmap.moveCamera(CameraUpdateFactory.newLatLng(ny));
    }*/
}
