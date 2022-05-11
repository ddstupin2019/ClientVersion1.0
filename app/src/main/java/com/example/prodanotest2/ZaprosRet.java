package com.example.prodanotest2;

import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ZaprosRet {
    private String ur = "http://localhost:8080/dfgh367327ghciutfu6734_ju/";
    private Zapros zapros;

    public ZaprosRet() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://" + ur)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        zapros = retrofit.create(Zapros.class);
    }

    public ArrayList<Integer> createPlayer(String gson){
        Call<ArrayList<Integer>> call= zapros.addPlayer(gson);
        Log.d("MY", gson);
        try {
            Response<ArrayList<Integer>> response=call.execute();
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Boolean getStatus(int id){
        Call<Boolean> call=zapros.getStatus(id);
        try {
            Response<Boolean> response=call.execute();
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<Integer> getNedCol(int id){
        Call<ArrayList<Integer>> call=zapros.getNedCol(id);
        try {
            Response<ArrayList<Integer>> response=call.execute();
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
    public ArrayList<Integer> getNumPlayer(int id){
        Call<ArrayList<Integer>> call =zapros.getPlayerShod(id);
        try {
            Response<ArrayList<Integer>> response=call.execute();
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void setStavka(String param){
        Call<Integer> call= zapros.setStavka(param);
        try {
            call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setNedColPlayer(String param){
        Call<Integer> call=zapros.setNedColPlayer(param);
        try {
            call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
public ArrayList<Integer> getMonCol(int id){
        Call<ArrayList<Integer>> call=zapros.getMoneyCol(id);
    try {
        Response<ArrayList<Integer>> response=call.execute();
        return response.body();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
}
public Integer setMonColDlylud(String param){
        Call<Integer> call=zapros.setMonColDlylud(param);
    try {
        Response<Integer>response=call.execute();
        return response.body();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
}
public ArrayList<Integer> getMonColDlylud(int id){
        Call<ArrayList<Integer>> call=zapros.getMonColDlylud(id);
    try {
        Response<ArrayList<Integer>> response=call.execute();
        return response.body();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
}
public void setBalans(String param){
        Call<Integer> call=zapros.setBalance(param);
    try {
        Response<Integer> response=call.execute();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
public ArrayList<Integer> getBalance(int id){
        Call<ArrayList<Integer>> call=zapros.getMonColDlylud(id);
    try {
        Response<ArrayList<Integer>> response=call.execute();
        return response.body();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
}
}
