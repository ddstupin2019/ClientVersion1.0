package com.example.prodanotest2;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;

public interface Zapros {
    @GET("/getStavka")
    Call<ArrayList<Integer>> getStavka(int id);

    @GET("/getNedCol")
    Call<ArrayList<Integer>> getNedCol(int id);

    @GET("/getMoneyCol")
    Call<ArrayList<Integer>> getMoneyCol(int id);

    @DELETE("/deleteIgra")
    Call<ArrayList<Integer>> deleteIgra(int id);

    @GET("/getStatus")
    Call<Boolean> getStatus(int id);

    @GET("/getNumPlayer")
    Call<Integer> getNumPlayer(int id);

    @GET("/getPlayerShod")
    Call<ArrayList<Integer>> getPlayerShod(int id);

    @GET("/setNedColPlayer")
    Call<Integer> setNedColPlayer(@Body String param);

    @PUT("/addPlayer")
    Call<ArrayList<Integer>> addPlayer(@Body String param);

    @PUT("/setStavka")
    Call<Integer> setStavka(@Body String param);

    @PUT("/setMonColDlylud")
    Call<Integer> setMonColDlylud(@Body String param);

    @PUT("/setBalance")
    Call<Integer> setBalance(@Body String param);

    @GET("/getMonColDlylud")
    Call<ArrayList<Integer>> getMonColDlylud(int id);



}
