package com.example.android.depotapp.network

import com.example.android.depotapp.database.entities.ShareDatabaseItem
import com.example.android.depotapp.model.Share
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.coroutines.processNextEventInCurrentThread
import java.util.*

/**
DTO = DataTransferObjects -> responsible for paring response from the server or formatting objects to send to the server
 */


@JsonClass(generateAdapter = true)
data class ShareDTO(
    val symbol: String,
    @Json(name = "close") val price: Double,
    @Json(name = "from") val date: String
)

fun ShareDTO.parseToDomainModel() = Share(
    id = 0,
    symbol = symbol,
    date = date,
    depotId = 0,
    logo = "",
    country = "",
    industry = "",
    description = "",
    employees = "",
    name = "",
    sector = ""
)

fun ShareDTO.parseToDatabaseModel() = ShareDatabaseItem(
    id = 0,
    symbol = symbol,
    date = date,
    depotId = 0,
    logo = "",
    country = "",
    industry = "",
    description = "",
    employees = "",
    name = "",
    sector = ""
)




