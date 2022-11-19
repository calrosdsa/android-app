package com.teclu.data.android.repositories;

import com.teclu.data.android.mapper.CasoDtoToCasoEnitity;
import com.teclu.soporte.dto.casos.Caso;
import com.teclu.soporte.entities.CasoEntity;
import com.teclu.soporte.entities.CasosEntries;
import com.teclu.soporte.mapper.IndexedMapper;
import com.teclu.soporte.repositories.ApiService;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J3\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f0\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000RG\u0010\u000b\u001a6\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f0\r0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/teclu/data/android/repositories/CasosDataSource;", "", "apiService", "Lcom/teclu/soporte/repositories/ApiService;", "casoMapper", "Lcom/teclu/data/android/mapper/CasoDtoToCasoEnitity;", "(Lcom/teclu/soporte/repositories/ApiService;Lcom/teclu/data/android/mapper/CasoDtoToCasoEnitity;)V", "entryMapper", "Lcom/teclu/soporte/mapper/IndexedMapper;", "Lcom/teclu/soporte/dto/casos/Caso;", "Lcom/teclu/soporte/entities/CasosEntries;", "resultMapper", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "Lkotlin/Pair;", "Lcom/teclu/soporte/entities/CasoEntity;", "Lkotlin/jvm/functions/Function2;", "invoke", "token", "", "page", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data-android_release"})
public final class CasosDataSource {
    private final com.teclu.soporte.repositories.ApiService apiService = null;
    private final com.teclu.soporte.mapper.IndexedMapper<com.teclu.soporte.dto.casos.Caso, com.teclu.soporte.entities.CasosEntries> entryMapper = null;
    private final kotlin.jvm.functions.Function2<java.util.List<com.teclu.soporte.dto.casos.Caso>, kotlin.coroutines.Continuation<? super java.util.List<kotlin.Pair<com.teclu.soporte.entities.CasoEntity, com.teclu.soporte.entities.CasosEntries>>>, java.lang.Object> resultMapper = null;
    
    @javax.inject.Inject()
    public CasosDataSource(@org.jetbrains.annotations.NotNull()
    com.teclu.soporte.repositories.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.teclu.data.android.mapper.CasoDtoToCasoEnitity casoMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<kotlin.Pair<com.teclu.soporte.entities.CasoEntity, com.teclu.soporte.entities.CasosEntries>>> continuation) {
        return null;
    }
}