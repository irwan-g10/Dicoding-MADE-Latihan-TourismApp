package com.dicoding.mylibrary.data.source.remote.network

import com.dicoding.mylibrary.data.source.remote.response.ListTourismResponse
import retrofit2.http.GET

interface ApiService {
    @GET("list")
    suspend fun getList(): ListTourismResponse
}