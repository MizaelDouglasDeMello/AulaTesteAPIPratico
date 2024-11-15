package com.example.aulatesteapipratico.view.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aulatesteapipratico.data.remote.dto.Usuario
import com.example.aulatesteapipratico.domain.UsuarioUseCase
import kotlinx.coroutines.launch

class UsuarioViewModel(
    private val usuarioUseCase: UsuarioUseCase
) : ViewModel() {

    private val _listaUsuarios = MutableLiveData<List<Usuario>>()
    val listaUsuarios: LiveData<List<Usuario>>
        get() = _listaUsuarios

    fun recuperarListaUsuarios(){
        viewModelScope.launch {
            val listaUsuarios = usuarioUseCase()
            _listaUsuarios.postValue( listaUsuarios )
        }
    }

}