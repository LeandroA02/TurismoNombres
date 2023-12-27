package com.example.turismonombres;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Methods {
    @GET("turismo/lugar_turistico/json_getlistadoGrid")
    Call<Model> getAllData();
}
