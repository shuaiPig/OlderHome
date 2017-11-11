package com.example.liubo.olderhome.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.liubo.olderhome.R;
import com.example.liubo.olderhome.entity.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liubo on 2017/11/10.
 */

public class ServiceListAdapter extends RecyclerView.Adapter<ServiceListAdapter.ServiceViewHolder> {
    ArrayList<Service> services=new ArrayList<>();

    public ServiceListAdapter(List<Service> services){
        this.services= (ArrayList<Service>) services;
;    }

    @Override
    public ServiceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_service_list,parent,false);
        ServiceViewHolder holder=new ServiceViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ServiceViewHolder holder, int position) {
        Service service=services.get(position);
        holder.textView.setText(service.getContext());
        holder.imageView.setImageResource(service.getCoin());
    }

    @Override
    public int getItemCount() {
        return services.size();
    }


    public class ServiceViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ServiceViewHolder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.servicesImage);
            textView=itemView.findViewById(R.id.servicesInfo);
        }
    }
}
