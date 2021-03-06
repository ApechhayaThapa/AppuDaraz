package com.example.appudaraz.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appudaraz.R;
import com.example.appudaraz.modal.CollectionModal;
import com.example.appudaraz.retrofit_class.Client;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder>{

    Context context;
    List<CollectionModal> collectionModals;

    public RecyclerviewAdapter(Context context, List<CollectionModal> collectionModals) {
        this.context = context;
        this.collectionModals = collectionModals;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_collection,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //// getting data according to position
        final CollectionModal collectionModal = collectionModals.get(position);

        holder.txt_item_collection_title.setText(collectionModal.getC_title());
        holder.txt_item_collection_des.setText(collectionModal.getC_intro());

        Picasso.get().load(Client.image_url+collectionModals.get(position).getImage())
                .into(holder.item_collection_image);

    }

    @Override
    public int getItemCount() {
        return collectionModals.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txt_item_collection_title,txt_item_collection_des;
        ImageView item_collection_image, item_background_image;

        public MyViewHolder(View itemView) {
            super(itemView);

            txt_item_collection_title = itemView.findViewById(R.id.collectionTitle);
            txt_item_collection_des = itemView.findViewById(R.id.collectionDes);
            item_collection_image = itemView.findViewById(R.id.collectionImage);
            item_background_image = itemView.findViewById(R.id.background_collection);
        }
    }
}