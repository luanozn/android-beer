package com.example.consultordecerveja_luanribeiro.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.consultordecerveja_luanribeiro.R;
import com.example.consultordecerveja_luanribeiro.entities.Beer;

import java.util.List;

public class BeerListAdapter extends BaseAdapter {

    private final List<Beer> beerList;
    private LayoutInflater inflater;
    private Context context;

   public BeerListAdapter(Context context, List<Beer> beerList){
       this.beerList = beerList;
       this.context = context;
       this.inflater = LayoutInflater.from(context);
   }

    @Override
    public int getCount() {
        return beerList.size();
    }

    @Override
    public Beer getItem(int i) {
        return beerList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
       convertView = inflater.inflate(R.layout.activity_beer_list, null);

        TextView txtView = (TextView) convertView.findViewById(R.id.beer_name);
        ImageView icon = convertView.findViewById(R.id.image_icon);

        Beer beer = beerList.get(i);

        txtView.setText(beer.getName());
        icon.setImageResource(beer.getPicture());

        return convertView;
   }
}
