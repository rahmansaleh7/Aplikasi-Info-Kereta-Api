package com.example.aplikasisubmissioniqbala.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.aplikasisubmissioniqbala.Model.Kereta;
import com.example.aplikasisubmissioniqbala.R;

import java.util.ArrayList;

public class KeretaListAdapter extends RecyclerView.Adapter<KeretaListAdapter.ListViewHolder> {
    private ArrayList<Kereta> listKereta;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public KeretaListAdapter(ArrayList<Kereta> list){
        this.listKereta = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.jenis_keretaapi, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Kereta kereta = listKereta.get(position);

        Glide.with(holder.itemView.getContext())
                .load(kereta.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvNama.setText(kereta.getNama());
        holder.tvKeterangan_kereta.setText(kereta.getKeterangan_kereta());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listKereta.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listKereta.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvKeterangan_kereta;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_keretaapi_photo);
            tvNama = itemView.findViewById(R.id.nama_kereta);
            tvKeterangan_kereta = itemView.findViewById(R.id.keterangan_kereta);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Kereta data);
    }
}
