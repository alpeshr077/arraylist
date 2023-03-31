package com.alpesh1.myapplication;

import static androidx.appcompat.R.layout.support_simple_spinner_dropdown_item;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class NameListAdapter extends BaseAdapter {

    String names[];
    int image[];
    public NameListAdapter(String[] name, int[] img) {
        this.names = name;
        this.image = img;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(viewGroup.getContext()).inflate(androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,viewGroup,false);

        ImageView Image = view.findViewById(R.id.Image);
        TextView Text = view.findViewById(R.id.Text);

        Glide.with(viewGroup.getContext()).load(image[i]).into(Image);
        Text.setText(names[i]);


        return view;
    }
}
