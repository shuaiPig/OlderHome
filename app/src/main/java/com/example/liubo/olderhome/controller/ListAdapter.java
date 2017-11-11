package com.example.liubo.olderhome.controller;

import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.liubo.olderhome.R;
import com.example.liubo.olderhome.entity.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liubo on 2017/11/4.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    public ArrayList<Service> services=new ArrayList<>();

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView serviceImage;
        TextView serviceInfo;
        public ViewHolder(View itemView) {
            super(itemView);
            serviceImage=itemView.findViewById(R.id.serviceImage);
            serviceInfo=itemView.findViewById(R.id.serviceInfo);

        }
    }
    public ListAdapter(List<Service> services){
        this.services= (ArrayList<Service>) services;
    }
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main_list,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Service service=services.get(position);
        holder.serviceInfo.setText(service.getContext());
        holder.serviceImage.setImageResource(service.getCoin());
//        URL url;
//        try {
//            url = new URL(service.getEvaluation());
//            holder.serviceImage.setImageBitmap(
//            (BitmapFactory.decodeStream(url.openStream())));
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public int getItemCount() {
        return services.size();
    }
}
