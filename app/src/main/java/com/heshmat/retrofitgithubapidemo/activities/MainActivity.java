package com.heshmat.retrofitgithubapidemo.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.heshmat.retrofitgithubapidemo.R;
import com.heshmat.retrofitgithubapidemo.RetrofitInit;
import com.heshmat.retrofitgithubapidemo.adapters.ProfileAdapter;
import com.heshmat.retrofitgithubapidemo.models.GitHubUsers;
import com.heshmat.retrofitgithubapidemo.models.Items;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "getGitHubUsers";
    EditText searchET;
    RecyclerView recyclerView;
    List<Items> itemsList;
    ProgressBar progressBar;
    RetrofitInit retrofitInit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchET = findViewById(R.id.searchET);
        retrofitInit = RetrofitInit.getInstance();
        recyclerView = findViewById(R.id.rv);
        itemsList = new ArrayList<>();
        progressBar = findViewById(R.id.progressBar);

        mAdapter = new ProfileAdapter(this, itemsList);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(mAdapter);


    }

    ProfileAdapter mAdapter;

    public void search(View view) {
        if (!searchET.getText().toString().trim().isEmpty()) {
            progressBar.setVisibility(View.VISIBLE);

            retrofitInit.getApiInterface().getResponse(searchET.getText().toString().trim()).enqueue(new Callback<GitHubUsers>() {
                @Override
                public void onResponse(Call<GitHubUsers> call, Response<GitHubUsers> response) {
                    progressBar.setVisibility(View.GONE);
                    GitHubUsers gitHubUsers = response.body();
                    if (gitHubUsers != null && gitHubUsers.getItems() != null) {

                        mAdapter.updateAdapter(gitHubUsers.getItems());
                    }

                }

                @Override
                public void onFailure(Call<GitHubUsers> call, Throwable t) {
                    progressBar.setVisibility(View.GONE);

                }
            });

        }

    }
}
//https://api.github.com/search/users?q=heshmatTawfik
