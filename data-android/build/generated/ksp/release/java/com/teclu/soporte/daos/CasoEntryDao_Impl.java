package com.teclu.soporte.daos;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.teclu.soporte.entities.CasoEntity;
import com.teclu.soporte.entities.CasosEntries;
import com.teclu.soporte.resultentity.CasosEntryWith;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CasoEntryDao_Impl extends CasoEntryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CasosEntries> __insertionAdapterOfCasosEntries;

  private final EntityDeletionOrUpdateAdapter<CasosEntries> __deletionAdapterOfCasosEntries;

  private final EntityDeletionOrUpdateAdapter<CasosEntries> __updateAdapterOfCasosEntries;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeletePage;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCasoEntry;

  public CasoEntryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCasosEntries = new EntityInsertionAdapter<CasosEntries>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `casos_entry` (`id`,`caso_id`,`page`,`page_order`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CasosEntries value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getCasoId());
        stmt.bindLong(3, value.getPage());
        stmt.bindLong(4, value.getPageOrder());
      }
    };
    this.__deletionAdapterOfCasosEntries = new EntityDeletionOrUpdateAdapter<CasosEntries>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `casos_entry` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CasosEntries value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfCasosEntries = new EntityDeletionOrUpdateAdapter<CasosEntries>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `casos_entry` SET `id` = ?,`caso_id` = ?,`page` = ?,`page_order` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CasosEntries value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getCasoId());
        stmt.bindLong(3, value.getPage());
        stmt.bindLong(4, value.getPageOrder());
        stmt.bindLong(5, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM casos_entry";
        return _query;
      }
    };
    this.__preparedStmtOfDeletePage = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM casos_entry WHERE page = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCasoEntry = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM casos_entry WHERE page = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final CasosEntries entity, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfCasosEntries.insertAndReturnId(entity);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertAll(final CasosEntries[] entity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCasosEntries.insert(entity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertAll(final List<? extends CasosEntries> entities,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCasosEntries.insert(entities);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteEntity(final CasosEntries entity,
      final Continuation<? super Integer> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__deletionAdapterOfCasosEntries.handle(entity);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final CasosEntries entity, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfCasosEntries.handle(entity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object withTransaction(final Function1<? super Continuation<? super Unit>, ?> tx,
      final Continuation<? super Unit> continuation) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> CasoEntryDao_Impl.super.withTransaction(tx, __cont), continuation);
  }

  @Override
  public Object insertOrUpdate(final List<? extends CasosEntries> entities,
      final Continuation<? super Unit> continuation) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> CasoEntryDao_Impl.super.insertOrUpdate(entities, __cont), continuation);
  }

  @Override
  public Object updatePage(final int page, final List<? extends CasosEntries> entities,
      final Continuation<? super Unit> continuation) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> CasoEntryDao_Impl.super.updatePage(page, entities, __cont), continuation);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object deletePage(final int page, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePage.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, page);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeletePage.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteCasoEntry(final int id, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCasoEntry.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteCasoEntry.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public PagingSource<Integer, CasosEntryWith> getCasosPaging() {
    final String _sql = "SELECT * from casos_entry";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<CasosEntryWith>(_statement, __db, "caso", "casos_entry") {
      @Override
      protected List<CasosEntryWith> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfCasoId = CursorUtil.getColumnIndexOrThrow(cursor, "caso_id");
        final int _cursorIndexOfPage = CursorUtil.getColumnIndexOrThrow(cursor, "page");
        final int _cursorIndexOfPageOrder = CursorUtil.getColumnIndexOrThrow(cursor, "page_order");
        final LongSparseArray<ArrayList<CasoEntity>> _collectionRelations = new LongSparseArray<ArrayList<CasoEntity>>();
        while (cursor.moveToNext()) {
          final long _tmpKey = cursor.getLong(_cursorIndexOfCasoId);
          ArrayList<CasoEntity> _tmpRelationsCollection = _collectionRelations.get(_tmpKey);
          if (_tmpRelationsCollection == null) {
            _tmpRelationsCollection = new ArrayList<CasoEntity>();
            _collectionRelations.put(_tmpKey, _tmpRelationsCollection);
          }
        }
        cursor.moveToPosition(-1);
        __fetchRelationshipcasoAscomTecluSoporteEntitiesCasoEntity(_collectionRelations);
        final List<CasosEntryWith> _result = new ArrayList<CasosEntryWith>(cursor.getCount());
        while(cursor.moveToNext()) {
          final CasosEntryWith _item;
          final CasosEntries _tmpEntry;
          if (! (cursor.isNull(_cursorIndexOfId) && cursor.isNull(_cursorIndexOfCasoId) && cursor.isNull(_cursorIndexOfPage) && cursor.isNull(_cursorIndexOfPageOrder))) {
            final long _tmpId;
            _tmpId = cursor.getLong(_cursorIndexOfId);
            final long _tmpCasoId;
            _tmpCasoId = cursor.getLong(_cursorIndexOfCasoId);
            final int _tmpPage;
            _tmpPage = cursor.getInt(_cursorIndexOfPage);
            final int _tmpPageOrder;
            _tmpPageOrder = cursor.getInt(_cursorIndexOfPageOrder);
            _tmpEntry = new CasosEntries(_tmpId,_tmpCasoId,_tmpPage,_tmpPageOrder);
          }  else  {
            _tmpEntry = null;
          }
          ArrayList<CasoEntity> _tmpRelationsCollection_1 = null;
          final long _tmpKey_1 = cursor.getLong(_cursorIndexOfCasoId);
          _tmpRelationsCollection_1 = _collectionRelations.get(_tmpKey_1);
          if (_tmpRelationsCollection_1 == null) {
            _tmpRelationsCollection_1 = new ArrayList<CasoEntity>();
          }
          _item = new CasosEntryWith();
          _item.setEntry(_tmpEntry);
          _item.setRelations(_tmpRelationsCollection_1);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public List<CasosEntryWith> getCasosEntries() {
    final String _sql = "SELECT * from casos_entry";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
      try {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
        final int _cursorIndexOfCasoId = CursorUtil.getColumnIndexOrThrow(_cursor, "caso_id");
        final int _cursorIndexOfPage = CursorUtil.getColumnIndexOrThrow(_cursor, "page");
        final int _cursorIndexOfPageOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "page_order");
        final LongSparseArray<ArrayList<CasoEntity>> _collectionRelations = new LongSparseArray<ArrayList<CasoEntity>>();
        while (_cursor.moveToNext()) {
          final long _tmpKey = _cursor.getLong(_cursorIndexOfCasoId);
          ArrayList<CasoEntity> _tmpRelationsCollection = _collectionRelations.get(_tmpKey);
          if (_tmpRelationsCollection == null) {
            _tmpRelationsCollection = new ArrayList<CasoEntity>();
            _collectionRelations.put(_tmpKey, _tmpRelationsCollection);
          }
        }
        _cursor.moveToPosition(-1);
        __fetchRelationshipcasoAscomTecluSoporteEntitiesCasoEntity(_collectionRelations);
        final List<CasosEntryWith> _result = new ArrayList<CasosEntryWith>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final CasosEntryWith _item;
          final CasosEntries _tmpEntry;
          if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfCasoId) && _cursor.isNull(_cursorIndexOfPage) && _cursor.isNull(_cursorIndexOfPageOrder))) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpCasoId;
            _tmpCasoId = _cursor.getLong(_cursorIndexOfCasoId);
            final int _tmpPage;
            _tmpPage = _cursor.getInt(_cursorIndexOfPage);
            final int _tmpPageOrder;
            _tmpPageOrder = _cursor.getInt(_cursorIndexOfPageOrder);
            _tmpEntry = new CasosEntries(_tmpId,_tmpCasoId,_tmpPage,_tmpPageOrder);
          }  else  {
            _tmpEntry = null;
          }
          ArrayList<CasoEntity> _tmpRelationsCollection_1 = null;
          final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfCasoId);
          _tmpRelationsCollection_1 = _collectionRelations.get(_tmpKey_1);
          if (_tmpRelationsCollection_1 == null) {
            _tmpRelationsCollection_1 = new ArrayList<CasoEntity>();
          }
          _item = new CasosEntryWith();
          _item.setEntry(_tmpEntry);
          _item.setRelations(_tmpRelationsCollection_1);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<CasosEntries>> entriesObservable(final int page) {
    final String _sql = "SELECT * FROM casos_entry WHERE page = ? ORDER BY page_order";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, page);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"casos_entry"}, new Callable<List<CasosEntries>>() {
      @Override
      public List<CasosEntries> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfCasoId = CursorUtil.getColumnIndexOrThrow(_cursor, "caso_id");
            final int _cursorIndexOfPage = CursorUtil.getColumnIndexOrThrow(_cursor, "page");
            final int _cursorIndexOfPageOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "page_order");
            final List<CasosEntries> _result = new ArrayList<CasosEntries>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final CasosEntries _item;
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              final long _tmpCasoId;
              _tmpCasoId = _cursor.getLong(_cursorIndexOfCasoId);
              final int _tmpPage;
              _tmpPage = _cursor.getInt(_cursorIndexOfPage);
              final int _tmpPageOrder;
              _tmpPageOrder = _cursor.getInt(_cursorIndexOfPageOrder);
              _item = new CasosEntries(_tmpId,_tmpCasoId,_tmpPage,_tmpPageOrder);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipcasoAscomTecluSoporteEntitiesCasoEntity(
      final LongSparseArray<ArrayList<CasoEntity>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<CasoEntity>> _tmpInnerMap = new LongSparseArray<ArrayList<CasoEntity>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipcasoAscomTecluSoporteEntitiesCasoEntity(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<CasoEntity>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipcasoAscomTecluSoporteEntitiesCasoEntity(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`areaCaso`,`clienteName`,`created`,`descripcion`,`estado`,`fecha_fin`,`fecha_inicio`,`funcionarioName`,`prioridad`,`titulo`,`updated` FROM `caso` WHERE `id` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfAreaCaso = 1;
      final int _cursorIndexOfClienteName = 2;
      final int _cursorIndexOfCreated = 3;
      final int _cursorIndexOfDescripcion = 4;
      final int _cursorIndexOfEstado = 5;
      final int _cursorIndexOfFechaFin = 6;
      final int _cursorIndexOfFechaInicio = 7;
      final int _cursorIndexOfFuncionarioName = 8;
      final int _cursorIndexOfPrioridad = 9;
      final int _cursorIndexOfTitulo = 10;
      final int _cursorIndexOfUpdated = 11;
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<CasoEntity> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final CasoEntity _item_1;
          final long _tmpId;
          _tmpId = _cursor.getLong(_cursorIndexOfId);
          final String _tmpAreaCaso;
          if (_cursor.isNull(_cursorIndexOfAreaCaso)) {
            _tmpAreaCaso = null;
          } else {
            _tmpAreaCaso = _cursor.getString(_cursorIndexOfAreaCaso);
          }
          final String _tmpClienteName;
          if (_cursor.isNull(_cursorIndexOfClienteName)) {
            _tmpClienteName = null;
          } else {
            _tmpClienteName = _cursor.getString(_cursorIndexOfClienteName);
          }
          final String _tmpCreated;
          if (_cursor.isNull(_cursorIndexOfCreated)) {
            _tmpCreated = null;
          } else {
            _tmpCreated = _cursor.getString(_cursorIndexOfCreated);
          }
          final String _tmpDescripcion;
          if (_cursor.isNull(_cursorIndexOfDescripcion)) {
            _tmpDescripcion = null;
          } else {
            _tmpDescripcion = _cursor.getString(_cursorIndexOfDescripcion);
          }
          final int _tmpEstado;
          _tmpEstado = _cursor.getInt(_cursorIndexOfEstado);
          final String _tmpFecha_fin;
          if (_cursor.isNull(_cursorIndexOfFechaFin)) {
            _tmpFecha_fin = null;
          } else {
            _tmpFecha_fin = _cursor.getString(_cursorIndexOfFechaFin);
          }
          final String _tmpFecha_inicio;
          if (_cursor.isNull(_cursorIndexOfFechaInicio)) {
            _tmpFecha_inicio = null;
          } else {
            _tmpFecha_inicio = _cursor.getString(_cursorIndexOfFechaInicio);
          }
          final String _tmpFuncionarioName;
          if (_cursor.isNull(_cursorIndexOfFuncionarioName)) {
            _tmpFuncionarioName = null;
          } else {
            _tmpFuncionarioName = _cursor.getString(_cursorIndexOfFuncionarioName);
          }
          final int _tmpPrioridad;
          _tmpPrioridad = _cursor.getInt(_cursorIndexOfPrioridad);
          final String _tmpTitulo;
          if (_cursor.isNull(_cursorIndexOfTitulo)) {
            _tmpTitulo = null;
          } else {
            _tmpTitulo = _cursor.getString(_cursorIndexOfTitulo);
          }
          final String _tmpUpdated;
          if (_cursor.isNull(_cursorIndexOfUpdated)) {
            _tmpUpdated = null;
          } else {
            _tmpUpdated = _cursor.getString(_cursorIndexOfUpdated);
          }
          _item_1 = new CasoEntity(_tmpId,_tmpAreaCaso,_tmpClienteName,_tmpCreated,_tmpDescripcion,_tmpEstado,_tmpFecha_fin,_tmpFecha_inicio,_tmpFuncionarioName,_tmpPrioridad,_tmpTitulo,_tmpUpdated);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
