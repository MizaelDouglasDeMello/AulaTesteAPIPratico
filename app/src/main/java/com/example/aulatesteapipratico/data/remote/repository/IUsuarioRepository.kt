package com.example.aulatesteapipratico.data.remote.repository

import com.example.aulatesteapipratico.data.remote.dto.Usuario

interface IUsuarioRepository {
    suspend fun listar() : List<Usuario>
}