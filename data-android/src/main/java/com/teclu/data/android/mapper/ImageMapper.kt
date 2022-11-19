package com.teclu.data.android.mapper

import com.teclu.soporte.dto.photos.PhotosDtoItem
import com.teclu.soporte.entities.ImageEntity


fun PhotosDtoItem.toImagesEntity():ImageEntity{
     return ImageEntity(
         id = id,
         title = title,
         thumbnailUrl = thumbnailUrl,
     )
}
