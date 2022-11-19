package com.teclu.soporte.tasks;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.teclu.soporte.daos.ImageDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SyncUpdateData_Factory {
  private final Provider<ImageDao> imageDaoProvider;

  public SyncUpdateData_Factory(Provider<ImageDao> imageDaoProvider) {
    this.imageDaoProvider = imageDaoProvider;
  }

  public SyncUpdateData get(Context context, WorkerParameters params) {
    return newInstance(context, params, imageDaoProvider.get());
  }

  public static SyncUpdateData_Factory create(Provider<ImageDao> imageDaoProvider) {
    return new SyncUpdateData_Factory(imageDaoProvider);
  }

  public static SyncUpdateData newInstance(Context context, WorkerParameters params,
      ImageDao imageDao) {
    return new SyncUpdateData(context, params, imageDao);
  }
}
