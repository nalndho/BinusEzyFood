package com.example.uts;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap mapAPI;
    SupportMapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        mapFragment =(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapAPI);

        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mapAPI = googleMap;

        LatLng AlamSutera = new LatLng(-6.223087, 106.649442);

        mapAPI.addMarker(new MarkerOptions().position(AlamSutera).title("AlamSutera"));

        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(AlamSutera));
    }
}
