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
public final class SyncUpdateImages_Factory {
  private final Provider<ImageDao> imageDaoProvider;

  public SyncUpdateImages_Factory(Provider<ImageDao> imageDaoProvider) {
    this.imageDaoProvider = imageDaoProvider;
  }

  public SyncUpdateImages get(Context context, WorkerParameters params) {
    return newInstance(context, params, imageDaoProvider.get());
  }

  public static SyncUpdateImages_Factory create(Provider<ImageDao> imageDaoProvider) {
    return new SyncUpdateImages_Factory(imageDaoProvider);
  }

  public static SyncUpdateImages newInstance(Context context, WorkerParameters params,
      ImageDao imageDao) {
    return new SyncUpdateImages(context, params, imageDao);
  }
}
