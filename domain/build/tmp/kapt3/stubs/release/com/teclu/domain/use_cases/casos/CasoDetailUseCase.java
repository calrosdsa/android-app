package com.teclu.domain.use_cases.casos;

import com.teclu.soporte.repositories.ApiService;
import com.teclu.util.Resource;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/teclu/domain/use_cases/casos/CasoDetailUseCase;", "", "apiService", "Lcom/teclu/soporte/repositories/ApiService;", "(Lcom/teclu/soporte/repositories/ApiService;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/teclu/util/Resource;", "Lcom/teclu/soporte/dto/casoDetail/CasoDetailDto;", "casoId", "", "domain_release"})
public final class CasoDetailUseCase {
    private final com.teclu.soporte.repositories.ApiService apiService = null;
    
    @javax.inject.Inject()
    public CasoDetailUseCase(@org.jetbrains.annotations.NotNull()
    com.teclu.soporte.repositories.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.teclu.util.Resource<com.teclu.soporte.dto.casoDetail.CasoDetailDto>> invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String casoId) {
        return null;
    }
}