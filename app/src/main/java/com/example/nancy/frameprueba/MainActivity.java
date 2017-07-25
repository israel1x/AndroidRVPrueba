package com.example.nancy.frameprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import android.widget.ScrollView;

import java.util.ArrayList;

import github.hellocsl.layoutmanager.gallery.GalleryLayoutManager;

public class MainActivity extends AppCompatActivity {

    //ELEMENTOS NECESARIO PARA LA LISTA DE TERAPIAS ANTERIORES
    ArrayList<TerapiaAnterior> terapiasAnterioresData;
    private FrameLayout frameTerapiasAnteriores;
    private RecyclerView listaDeTerapiasAnteriores;

    private FrameLayout frameGallery;
    private RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameTerapiasAnteriores  = (FrameLayout) findViewById(R.id.frameTerapAnteriores);

        //TERAPIAS MEDICAS ANTERIORES
        listaDeTerapiasAnteriores = (RecyclerView) findViewById(R.id.rvTerapiasAnteriores);



        frameGallery  = (FrameLayout) findViewById(R.id.frameGallery);
        recyclerView = (RecyclerView) findViewById(R.id.rvGallery);

        GalleryLayoutManager layoutManager = new GalleryLayoutManager(GalleryLayoutManager.HORIZONTAL);
//layoutManager.attach(mPagerRecycleView);  default selected position is 0
        layoutManager.attach(recyclerView, 30);

//...
//setup adapter for your RecycleView
        recyclerView.setAdapter(imageAdapter);




        LinearLayoutManager llmterapante = new LinearLayoutManager(this);
        llmterapante.setOrientation(LinearLayoutManager.VERTICAL);
        listaDeTerapiasAnteriores.setLayoutManager(llmterapante);


        inicializarListaDeTerapiasAnteriores();
        inicializarAdaptadorTerapiasAnteriores();

        ((ScrollView)listaDeTerapiasAnteriores.getParent()).removeView(listaDeTerapiasAnteriores);
        frameTerapiasAnteriores.addView(listaDeTerapiasAnteriores);


    }

    public void inicializarAdaptadorTerapiasAnteriores() {
        TerapiaAnteriorAdaptador adaptador2 = new TerapiaAnteriorAdaptador(terapiasAnterioresData);
        listaDeTerapiasAnteriores.setAdapter(adaptador2);
    }


    public void inicializarListaDeTerapiasAnteriores() {

        terapiasAnterioresData = new ArrayList<TerapiaAnterior>();
        terapiasAnterioresData.add(new TerapiaAnterior("15 jul. 2017","Daniel Garcia","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","1"));
        terapiasAnterioresData.add(new TerapiaAnterior("10 jul. 2017","Ariel Cedenio","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","1"));
        terapiasAnterioresData.add(new TerapiaAnterior("5 jul. 2017","Ariel Cedenio","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","1"));
        terapiasAnterioresData.add(new TerapiaAnterior("1 jul. 2017","Rosa Maria","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","1"));
        terapiasAnterioresData.add(new TerapiaAnterior("25 jun. 2017","Juan Piguave","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","1"));
        terapiasAnterioresData.add(new TerapiaAnterior("20 jun. 2017","Luis Ernesto","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","1"));
        terapiasAnterioresData.add(new TerapiaAnterior("15 jun. 2017","Sara Poveda","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","1"));
        terapiasAnterioresData.add(new TerapiaAnterior("10 jun. 2017","Silvia Paredes","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","1"));

    }




}
