package com.dicoding.mylibrary.domain.usecase

import androidx.lifecycle.LiveData
import com.dicoding.mylibrary.data.Resource
import com.dicoding.mylibrary.domain.model.Tourism
import com.dicoding.mylibrary.domain.repository.ITourismRepository

class TourismInteractor(private val tourismRepository: ITourismRepository): TourismUseCase {
    override fun getAllTourism() = tourismRepository.getAllTourism()

    override fun getFavoriteTourism() = tourismRepository.getFavoriteTourism()

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) = tourismRepository.setFavoriteTourism(tourism, state)

}