package com.teclu.domain.observers

import com.teclu.domain.interactors.UpdateCasos
import com.teclu.soporte.daos.CasosDao
import javax.inject.Inject

class ObservePagedCasos @Inject constructor(
    private val casosDao: CasosDao,
    private val updateCasos: UpdateCasos
) {
}