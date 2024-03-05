package com.example.capstoneapp.model

class Country(
    var countryName: String, var countryDescription: String,
    var historicalSites: List<HistoricalSites> = ArrayList(),
    var culturalCentres: List<CulturalCenters> = ArrayList(),
    var museum: List<Museums> = ArrayList(),
    var food: List<Food> = ArrayList()) {
}

