package com.dicoding.tourismapp.detail

import androidx.lifecycle.ViewModel
import com.dicoding.mylibrary.data.TourismRepository
import com.dicoding.mylibrary.data.source.local.entity.TourismEntity
import com.dicoding.mylibrary.domain.model.Tourism
import com.dicoding.mylibrary.domain.usecase.TourismUseCase

class DetailTourismViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus:Boolean) = tourismUseCase.setFavoriteTourism(tourism, newStatus)
}

