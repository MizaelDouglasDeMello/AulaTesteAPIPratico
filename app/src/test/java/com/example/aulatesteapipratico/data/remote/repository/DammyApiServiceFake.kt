package com.example.aulatesteapipratico.data.remote.repository

import com.example.aulatesteapipratico.data.remote.api.DummyAPIService
import com.example.aulatesteapipratico.data.remote.dto.ResultadoDummyAPI
import com.example.aulatesteapipratico.data.remote.dto.Usuario
import retrofit2.Response

class DammyApiServiceFake: DummyAPIService {
    override suspend fun recuperarListaUsuarios(): Response<ResultadoDummyAPI> {
        return Response.success(
            ResultadoDummyAPI(
                1000, 10, 100,
                listOf(
                    Usuario(15, "Usuario1@email", "Mizael ", "masc"),
                    Usuario(25, "Usuario2@email", "Carol ", "fem"),
                    Usuario(40, "Usuario3@email", "Jaque ", "fem"),
                    Usuario(22, "Usuario4@email", "Tiago ", "masc"),
                )
            )
        )
    }
}