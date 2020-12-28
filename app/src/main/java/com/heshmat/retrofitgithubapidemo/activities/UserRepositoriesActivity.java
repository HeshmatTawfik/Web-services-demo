package com.heshmat.retrofitgithubapidemo.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.heshmat.retrofitgithubapidemo.R;
import com.heshmat.retrofitgithubapidemo.RetrofitInit;
import com.heshmat.retrofitgithubapidemo.adapters.RepoAdapter;
import com.heshmat.retrofitgithubapidemo.models.UserRepos;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoriesActivity extends AppCompatActivity {
    RecyclerView repoRv;
    RepoAdapter mRepoAdapter;
    RetrofitInit retrofitInit;
    List<UserRepos> mUserReposList;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_repositories);
        retrofitInit = RetrofitInit.getInstance();

        Intent intent = getIntent();
        String userName = intent.getStringExtra("name");
        progressBar = findViewById(R.id.progressBar2);
        progressBar.setVisibility(View.VISIBLE);
        repoRv = findViewById(R.id.repoRv);
        mUserReposList = new ArrayList<>();
        mRepoAdapter = new RepoAdapter(this, mUserReposList);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        repoRv.setLayoutManager(llm);
        repoRv.setAdapter(mRepoAdapter);
        if (userName != null)
            retrofitInit.getApiInterface().getRepos(userName).enqueue(new Callback<List<UserRepos>>() {

                @Override
                public void onResponse(Call<List<UserRepos>> call, Response<List<UserRepos>> response) {
                    progressBar.setVisibility(View.GONE);
                    if (response.body() != null) {
                        List<UserRepos> repos = response.body();
                        mUserReposList.addAll(repos);
                        mRepoAdapter.notifyDataSetChanged();

                    }
                }

                @Override
                public void onFailure(Call<List<UserRepos>> call, Throwable t) {
                    progressBar.setVisibility(View.GONE);

                    String s = t.getLocalizedMessage();
                }
            });
    }
}
