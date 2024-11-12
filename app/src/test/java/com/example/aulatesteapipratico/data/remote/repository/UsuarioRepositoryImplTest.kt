package com.example.aulatesteapipratico.data.remote.repository

import com.example.aulatesteapipratico.data.remote.api.DummyAPIService
import com.example.aulatesteapipratico.data.remote.dto.ResultadoDummyAPI
import com.example.aulatesteapipratico.data.remote.dto.Usuario
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
import retrofit2.Response

@RunWith(MockitoJUnitRunner::class)
class UsuarioRepositoryImplTest {

    @Mock
    private lateinit var dummyAPIService: DummyAPIService

    private lateinit var dummyAPIServiceFake: DammyApiServiceFake

    @Before
    fun setUp() {
        dummyAPIServiceFake = DammyApiServiceFake()
        MockitoAnnotations.openMocks(this)
    }

//    @Test
//    fun listar_recuperarListaUsuarios() = runTest {
//
//        Mockito.`when`(dummyAPIService.recuperarListaUsuarios()).thenReturn(
//            Response.success(
//                ResultadoDummyAPI(
//                    1000, 10, 100,
//                    listOf(
//                        Usuario(15, "Usuario1@email", "Mizael ", "masc"),
//                        Usuario(25, "Usuario2@email", "Carol ", "fem"),
//                        Usuario(40, "Usuario3@email", "Jaque ", "fem"),
//                        Usuario(22, "Usuario4@email", "Tiago ", "masc"),
//                    )
//                )
//            )
//        )
//
//
//        // Given
//        val repository = UsuarioRepositoryImpl(dummyAPIService)
//
//        // When
//        val result = repository.listar()
//
//        // Then
////        assertNotNull(result)
//        assertThat(result).isNotEmpty()
//    }



    @Test
    fun listar_recuperarListaUsuarios() = runTest {



        // Given
        val repository = UsuarioRepositoryImpl(dummyAPIServiceFake)

        // When
        val result = repository.listar()

        // Then
//        assertNotNull(result)
        assertThat(result).isNotEmpty()
    }


    @After
    fun tearDown() {
    }
}