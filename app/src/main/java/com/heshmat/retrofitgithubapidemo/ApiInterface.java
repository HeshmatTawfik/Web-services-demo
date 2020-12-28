package com.heshmat.retrofitgithubapidemo;



import com.heshmat.retrofitgithubapidemo.models.GitHubUsers;
import com.heshmat.retrofitgithubapidemo.models.UserRepos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("search/users")
    Call<GitHubUsers> getResponse(@Query("q") String name);
    @GET("users/{user}/repos")
    Call<List<UserRepos>> getRepos(@Path("user") String name);

}
