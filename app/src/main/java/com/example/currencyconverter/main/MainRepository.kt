package com.example.currencyconverter.main

import com.example.currencyconverter.Resource
import com.example.currencyconverter.models.CurrencyResponse

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>

}