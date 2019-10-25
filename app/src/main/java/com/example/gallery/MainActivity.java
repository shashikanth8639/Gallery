package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.channels.GatheringByteChannel;

public class MainActivity extends AppCompatActivity {
    public int[] images = { R.drawable.img1, R.drawable.img2, R.drawable.img3,
                                R.drawable.img4, R.drawable.img5};
    ImageView imageView;
    TextView textView;
    Gallery gallery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        gallery = (Gallery)findViewById(R.id.gallery);
        gallery.setAdapter(new CustomAdapterGallery(this, images));
        gallery.setSpacing(10);

        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                imageView.setImageResource(images[i]);
                Toast.makeText(MainActivity.this, "Selected item is "+i
                                , Toast.LENGTH_SHORT).show();
            }
        });
    }

}
