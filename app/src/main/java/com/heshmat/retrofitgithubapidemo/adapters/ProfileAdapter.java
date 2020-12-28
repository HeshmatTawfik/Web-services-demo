package com.heshmat.retrofitgithubapidemo.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.heshmat.retrofitgithubapidemo.models.Items;
import com.heshmat.retrofitgithubapidemo.R;
import com.heshmat.retrofitgithubapidemo.activities.UserRepositoriesActivity;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {
    Context context;
    List<Items> itemsList;

    public ProfileAdapter(Context context, List<Items> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileAdapter.ViewHolder holder, int position) {
        final Items items=itemsList.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, UserRepositoriesActivity.class);
                intent.putExtra("name",items.getLogin());
                context.startActivity(intent);
            }
        });
        holder.textView.setText(items.getLogin());
        Glide.with(context).load(items.getAvatarUrl()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.userImage);
            textView=itemView.findViewById(R.id.userName);
        }
    }
    public void updateAdapter(List<Items> newList) {
        itemsList.clear();
        itemsList.addAll(newList);
        this.notifyDataSetChanged();
    }
}
