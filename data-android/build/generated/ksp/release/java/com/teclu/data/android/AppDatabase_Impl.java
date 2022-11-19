package com.teclu.data.android;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.teclu.soporte.daos.CasoEntryDao;
import com.teclu.soporte.daos.CasoEntryDao_Impl;
import com.teclu.soporte.daos.CasosDao;
import com.teclu.soporte.daos.CasosDao_Impl;
import com.teclu.soporte.daos.ImageDao;
import com.teclu.soporte.daos.ImageDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CasosDao _casosDao;

  private volatile CasoEntryDao _casoEntryDao;

  private volatile ImageDao _imageDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `caso` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `areaCaso` TEXT NOT NULL, `clienteName` TEXT NOT NULL, `created` TEXT NOT NULL, `descripcion` TEXT NOT NULL, `estado` INTEGER NOT NULL, `fecha_fin` TEXT NOT NULL, `fecha_inicio` TEXT NOT NULL, `funcionarioName` TEXT NOT NULL, `prioridad` INTEGER NOT NULL, `titulo` TEXT NOT NULL, `updated` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `casos_entry` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `caso_id` INTEGER NOT NULL, `page` INTEGER NOT NULL, `page_order` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `image_db` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `url` BLOB, `thumbnailUrl` TEXT NOT NULL, `isSaved` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '103c3e40abcdcf26d74da19024abd385')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `caso`");
        _db.execSQL("DROP TABLE IF EXISTS `casos_entry`");
        _db.execSQL("DROP TABLE IF EXISTS `image_db`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCaso = new HashMap<String, TableInfo.Column>(12);
        _columnsCaso.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCaso.put("areaCaso", new TableInfo.Column("areaCaso", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCaso.put("clienteName", new TableInfo.Column("clienteName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCaso.put("created", new TableInfo.Column("created", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCaso.put("descripcion", new TableInfo.Column("descripcion", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCaso.put("estado", new TableInfo.Column("estado", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCaso.put("fecha_fin", new TableInfo.Column("fecha_fin", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCaso.put("fecha_inicio", new TableInfo.Column("fecha_inicio", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCaso.put("funcionarioName", new TableInfo.Column("funcionarioName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCaso.put("prioridad", new TableInfo.Column("prioridad", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCaso.put("titulo", new TableInfo.Column("titulo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCaso.put("updated", new TableInfo.Column("updated", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCaso = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCaso = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCaso = new TableInfo("caso", _columnsCaso, _foreignKeysCaso, _indicesCaso);
        final TableInfo _existingCaso = TableInfo.read(_db, "caso");
        if (! _infoCaso.equals(_existingCaso)) {
          return new RoomOpenHelper.ValidationResult(false, "caso(com.teclu.soporte.entities.CasoEntity).\n"
                  + " Expected:\n" + _infoCaso + "\n"
                  + " Found:\n" + _existingCaso);
        }
        final HashMap<String, TableInfo.Column> _columnsCasosEntry = new HashMap<String, TableInfo.Column>(4);
        _columnsCasosEntry.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCasosEntry.put("caso_id", new TableInfo.Column("caso_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCasosEntry.put("page", new TableInfo.Column("page", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCasosEntry.put("page_order", new TableInfo.Column("page_order", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCasosEntry = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCasosEntry = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCasosEntry = new TableInfo("casos_entry", _columnsCasosEntry, _foreignKeysCasosEntry, _indicesCasosEntry);
        final TableInfo _existingCasosEntry = TableInfo.read(_db, "casos_entry");
        if (! _infoCasosEntry.equals(_existingCasosEntry)) {
          return new RoomOpenHelper.ValidationResult(false, "casos_entry(com.teclu.soporte.entities.CasosEntries).\n"
                  + " Expected:\n" + _infoCasosEntry + "\n"
                  + " Found:\n" + _existingCasosEntry);
        }
        final HashMap<String, TableInfo.Column> _columnsImageDb = new HashMap<String, TableInfo.Column>(5);
        _columnsImageDb.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsImageDb.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsImageDb.put("url", new TableInfo.Column("url", "BLOB", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsImageDb.put("thumbnailUrl", new TableInfo.Column("thumbnailUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsImageDb.put("isSaved", new TableInfo.Column("isSaved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysImageDb = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesImageDb = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoImageDb = new TableInfo("image_db", _columnsImageDb, _foreignKeysImageDb, _indicesImageDb);
        final TableInfo _existingImageDb = TableInfo.read(_db, "image_db");
        if (! _infoImageDb.equals(_existingImageDb)) {
          return new RoomOpenHelper.ValidationResult(false, "image_db(com.teclu.soporte.entities.ImageEntity).\n"
                  + " Expected:\n" + _infoImageDb + "\n"
                  + " Found:\n" + _existingImageDb);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "103c3e40abcdcf26d74da19024abd385", "119884b54c3f35721d3c33e802622ee6");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "caso","casos_entry","image_db");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `caso`");
      _db.execSQL("DELETE FROM `casos_entry`");
      _db.execSQL("DELETE FROM `image_db`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CasosDao.class, CasosDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(CasoEntryDao.class, CasoEntryDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ImageDao.class, ImageDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public CasosDao casosDao() {
    if (_casosDao != null) {
      return _casosDao;
    } else {
      synchronized(this) {
        if(_casosDao == null) {
          _casosDao = new CasosDao_Impl(this);
        }
        return _casosDao;
      }
    }
  }

  @Override
  public CasoEntryDao casoEntriesDao() {
    if (_casoEntryDao != null) {
      return _casoEntryDao;
    } else {
      synchronized(this) {
        if(_casoEntryDao == null) {
          _casoEntryDao = new CasoEntryDao_Impl(this);
        }
        return _casoEntryDao;
      }
    }
  }

  @Override
  public ImageDao imageDao() {
    if (_imageDao != null) {
      return _imageDao;
    } else {
      synchronized(this) {
        if(_imageDao == null) {
          _imageDao = new ImageDao_Impl(this);
        }
        return _imageDao;
      }
    }
  }
}
