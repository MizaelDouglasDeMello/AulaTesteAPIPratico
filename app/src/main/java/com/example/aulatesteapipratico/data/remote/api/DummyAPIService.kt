package com.example.aulatesteapipratico.data.remote.api

import com.example.aulatesteapipratico.data.remote.dto.ResultadoDummyAPI
import retrofit2.Response
import retrofit2.http.GET

interface DummyAPIService {

    @GET("users")
    suspend fun recupearListaUsuarios() : Response<ResultadoDummyAPI>

}