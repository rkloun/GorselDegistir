package com.example.gorseldegistir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.gorseldegistir.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<Gorsel> gorselArrayList;
    int seciliSiraNO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        gorselArrayList = new ArrayList<>();

        Gorsel ada = new Gorsel("Ada",1,R.drawable.ada);
        Gorsel balik = new Gorsel("Balık",2,R.drawable.balik);
        Gorsel ozelm = new Gorsel("The most Beatiful girl in the World" ,3,R.drawable.ozelm);



        gorselArrayList.add(ada);
        gorselArrayList.add(balik);
        gorselArrayList.add(ozelm);


        binding.imageViewGorsel.setImageResource(gorselArrayList.get(0).foto);
        binding.bilgi.setText("Bilgi: " + gorselArrayList.get(0).bilgi);
        seciliSiraNO=0;
    }

    public void geriGelme(View view){
        if(seciliSiraNO<gorselArrayList.size()-1){
            seciliSiraNO ++;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNO).foto);
            binding.bilgi.setText("Bilgi: " + gorselArrayList.get(seciliSiraNO).bilgi);
        }
    }

    public void ileriGitme(View view){
        if(seciliSiraNO>0){
            seciliSiraNO--;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNO).foto);
            binding.bilgi.setText("Bilgi: " + gorselArrayList.get(seciliSiraNO).bilgi);
        }
    }

}