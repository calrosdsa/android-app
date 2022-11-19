package com.teclu.soporte.dto.photos

data class PhotosDtoItem(
    val albumId: Int,
    val id: Int,
    val thumbnailUrl: String,
    val title: String,
    val url: String
)