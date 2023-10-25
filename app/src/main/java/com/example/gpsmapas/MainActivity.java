package com.example.gpsmapas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {
    EditText txtLatitud, txtLongitud; //declaran e inicializan las variables
    GoogleMap mMap; // Objeto que se utiliza para interactuar con el mapa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitud = findViewById(R.id.txt_latitud);
        txtLongitud = findViewById(R.id.txt_longitud);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(@NonNull GoogleMap googleMap){
        mMap = googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

        LatLng Chile = new LatLng(-35.675147, -71.542969);
        mMap.addMarker(new MarkerOptions().position(Chile).title("Chile"));
        //UNIVERSIDAD ARICA
        LatLng arica = new LatLng(-18.4832126007107, -70.31035394605763);
        mMap.addMarker(new MarkerOptions().position(arica).title("Sede Arica"));
        //UNIVERSIDAD IQUIQUE
        LatLng iquique = new LatLng(-20.238507550842492, -70.14472782573823);
        mMap.addMarker(new MarkerOptions().position(iquique).title("Sede iquique"));
        //UNIVERSIDAD ANTOFAGASTE
        LatLng antofagasta = new LatLng(-23.634495584846203, -70.39402041706951);
        mMap.addMarker(new MarkerOptions().position(antofagasta).title("Sede antofagasta"));
        //UNIVERSIDAD LA SERENA
        LatLng laserena = new LatLng(-29.907721753442356, -71.25706493315894);
        mMap.addMarker(new MarkerOptions().position(laserena).title("Sede la serena"));
        //UNIVERSIDAD VIÑA DEL MAR
        LatLng viña = new LatLng(-33.03688587807562, -71.5222165743905);
        mMap.addMarker(new MarkerOptions().position(viña).title("Sede viña del mar"));
        //UNIVERSIDAD SANTIAGO
        LatLng santiago = new LatLng(-33.44418285631855, -70.66056093450682);
        mMap.addMarker(new MarkerOptions().position(santiago).title("Sede santiago"));
        //UNIVERSIDAD TALCA
        LatLng talca = new LatLng(-35.42853375706412, -71.67290429302253);
        mMap.addMarker(new MarkerOptions().position(talca).title("Sede talca"));
        //UNIVERSIDAD CONCEPCION
        LatLng conce = new LatLng(-36.82605639049783, -73.0616235183252);
        mMap.addMarker(new MarkerOptions().position(conce).title("Sede concepcion"));
        //UNIVERSIDAD LOS ANGELES
        LatLng angeles = new LatLng(-37.46961898158142, -72.35457418076943);
        mMap.addMarker(new MarkerOptions().position(angeles).title("Sede los angeles"));
        //UNIVERSIDAD TEMUCO
        LatLng temuco = new LatLng(-38.73340052159866, -72.60183813974459);
        mMap.addMarker(new MarkerOptions().position(temuco).title("Sede temuco"));
        //UNIVERSIDAD VALDIVIA
        LatLng valdivia = new LatLng(-39.81633676834092, -73.23341525674886);
        mMap.addMarker(new MarkerOptions().position(valdivia).title("Sede valdivia"));
        //UNIVERSIDAD OSORNO
        LatLng osorno = new LatLng(-40.57167667772045, -73.13773666055336);
        mMap.addMarker(new MarkerOptions().position(osorno).title("Sede osorno"));
        //UNIVERSIDAD PUERTO MONTT
        LatLng puerto = new LatLng(-41.472659832886855, -72.92877269647491);
        mMap.addMarker(new MarkerOptions().position(puerto).title("Sede puerto montt"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chile));

    }
    @Override
    public void onMapClick(@NonNull LatLng latLng){
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng){
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }
}