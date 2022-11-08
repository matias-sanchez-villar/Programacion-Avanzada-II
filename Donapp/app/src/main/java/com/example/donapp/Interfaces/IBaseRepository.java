package com.example.donapp.Interfaces;

import android.content.Context;
import android.os.AsyncTask;

import com.example.donapp.Enums.StatusResponse;

public interface IBaseRepository<T> {
    Integer createAsync(AsyncTask<String, Void, Integer> thread);
    StatusResponse updateAsync(AsyncTask<String, Void, StatusResponse> thread);
    StatusResponse deleteAsync(int id, AsyncTask<String, Void, StatusResponse> thread);
    StatusResponse selectAllAsync(AsyncTask<String, Void, StatusResponse> thread);
    T selectEntity(AsyncTask<String, Void, T> thread);
}
