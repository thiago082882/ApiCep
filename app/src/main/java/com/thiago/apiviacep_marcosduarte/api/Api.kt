package com.thiago.apiviacep_marcosduarte.api

import com.thiago.apiviacep_marcosduarte.model.Endereco
import retrofit2.Call
import retrofit2.http.*


interface Api {

    @GET("ws/{cep}/json/")
    fun setEndereco(@Path("cep") cep : String):Call<Endereco>
}