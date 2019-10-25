package com.example.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class CustomAdapterGallery extends BaseAdapter {
    Context context;
    public int[] images;
    CustomAdapterGallery(Context context, int[] images){
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[i]);
        imageView.setLayoutParams(new Gallery.LayoutParams(500, 500));
        return imageView;
    }
}
