package com.dicoding.mylibrary.domain.usecase

import androidx.lifecycle.LiveData
import com.dicoding.mylibrary.data.Resource
import com.dicoding.mylibrary.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface TourismUseCase {
    fun getAllTourism(): Flow<com.dicoding.mylibrary.data.Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flow<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}