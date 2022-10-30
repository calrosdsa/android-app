package com.teclu.casos;

import android.util.Log;
import androidx.compose.foundation.layout.*;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi;
import androidx.paging.compose.LazyPagingItems;
import com.teclu.soporte.common.compose.ui.*;
import com.teclu.soporte.resultentity.CasosEntryWith;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0001\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0001\u00a8\u0006\f"}, d2 = {"CasosScreen", "", "navigateToCasoDetail", "Lkotlin/Function1;", "", "state", "Lcom/teclu/casos/CasosState;", "pagingItems", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/teclu/soporte/resultentity/CasosEntryWith;", "viewModel", "Lcom/teclu/casos/CasosViewModel;", "casos_debug"})
public final class CasosScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void CasosScreen(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> navigateToCasoDetail) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.lifecycle.compose.ExperimentalLifecycleComposeApi.class})
    public static final void CasosScreen(@org.jetbrains.annotations.NotNull()
    com.teclu.casos.CasosViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> navigateToCasoDetail) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void CasosScreen(@org.jetbrains.annotations.NotNull()
    com.teclu.casos.CasosState state, @org.jetbrains.annotations.NotNull()
    androidx.paging.compose.LazyPagingItems<com.teclu.soporte.resultentity.CasosEntryWith> pagingItems, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> navigateToCasoDetail) {
    }
}