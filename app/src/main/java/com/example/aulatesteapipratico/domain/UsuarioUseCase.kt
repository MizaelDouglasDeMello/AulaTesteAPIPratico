package com.example.aulatesteapipratico.domain

import com.example.aulatesteapipratico.data.remote.dto.Usuario
import com.example.aulatesteapipratico.data.remote.repository.IUsuarioRepository

class UsuarioUseCase(
    private val iUsuarioRepository: IUsuarioRepository
) {

    suspend operator fun invoke() : List<Usuario> { // getListUserUseCase
        val listaUsuarios = iUsuarioRepository.listar()
        return listaUsuarios.filter { it.age >= 40 }
    }

}