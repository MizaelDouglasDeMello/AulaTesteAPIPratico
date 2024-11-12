package com.example.aulatesteapipratico.domain

import com.example.aulatesteapipratico.data.remote.dto.Usuario
import com.example.aulatesteapipratico.data.remote.repository.UsuarioRepositoryImpl
import com.google.common.truth.Truth.assertThat

import kotlinx.coroutines.test.runTest

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class UsuarioUseCaseTest {

    @Mock
    private lateinit var usuarioRepositoryImpl: UsuarioRepositoryImpl
    private lateinit var usuarioUseCase: UsuarioUseCase

    //    private lateinit var dummyApiServiceFake: DammyApiServiceFake
    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        usuarioUseCase = UsuarioUseCase(usuarioRepositoryImpl)
    }


    @Test
    fun invoke_retornaUsuarioFiltrados_retonaLista() = runTest {
        Mockito.`when`(usuarioRepositoryImpl.listar()).thenReturn(
            listOf(
                Usuario(15, "Usuario1@email", "Mizael ", "masc"),
                Usuario(25, "Usuario2@email", "Carol ", "fem"),
                Usuario(40, "Usuario3@email", "Jaque ", "fem"),
                Usuario(22, "Usuario4@email", "Tiago ", "masc"),
            )
        )

        val listaUsuarioFiltrados = usuarioUseCase()

        assertThat(listaUsuarioFiltrados).isNotEmpty()

    }


    @After
    fun tearDown() {
    }
}