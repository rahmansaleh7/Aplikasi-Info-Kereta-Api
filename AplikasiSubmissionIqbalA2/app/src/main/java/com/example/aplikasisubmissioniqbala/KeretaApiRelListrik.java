package com.example.aplikasisubmissioniqbala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;

public class KeretaApiRelListrik extends AppCompatActivity {
    private SliderLayout sliderLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kereta_api_rel_listrik);
        sliderLayout = (SliderLayout) findViewById(R.id.slider);

        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Kereta Api Rel Listrik 1",R.drawable.keretaapirellistrik1);
        file_maps.put("Kereta Api Rel Listrik 2",R.drawable.keretaapirellistrik2);
        file_maps.put("Kereta Api Rel Listrik 3",R.drawable.keretaapirellistrik3);
        file_maps.put("Kereta Api Rel Listrik 4", R.drawable.keretaapirellistrik4);
        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(this);
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit);
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);
            sliderLayout.addSlider(textSliderView);
        }
        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        sliderLayout.setCustomAnimation(new DescriptionAnimation());
        sliderLayout.setDuration(4000);
    }
}
