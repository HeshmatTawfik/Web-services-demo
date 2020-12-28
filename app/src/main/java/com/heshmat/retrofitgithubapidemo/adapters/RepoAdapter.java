package com.heshmat.retrofitgithubapidemo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.heshmat.retrofitgithubapidemo.R;
import com.heshmat.retrofitgithubapidemo.models.UserRepos;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.ViewHolder> {
    Context context;
    List<UserRepos> userReposList;

    public RepoAdapter(Context context, List<UserRepos> userReposList) {
        this.context = context;
        this.userReposList = userReposList;
    }

    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.repo_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RepoAdapter.ViewHolder holder, int position) {
        UserRepos userRepo=userReposList.get(position);
        holder.repoName.setText(userRepo.getName());
        holder.stars.setText(String.valueOf(userRepo.getStargazersCount()));
        holder.lang.setText(userRepo.getLanguage());
        holder.counter.setText(String.valueOf(position+1));


    }

    @Override
    public int getItemCount() {
        return userReposList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView repoName,stars,lang,counter;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            repoName=itemView.findViewById(R.id.repoNameTv);
            stars=itemView.findViewById(R.id.starsTv);
            lang=itemView.findViewById(R.id.langTv);
            counter=itemView.findViewById(R.id.counterTv);

        }
    }
}
