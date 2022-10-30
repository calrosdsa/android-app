package com.teclu.soporte.daos;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.teclu.soporte.entities.CasoEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
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
public final class CasosDao_Impl extends CasosDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CasoEntity> __insertionAdapterOfCasoEntity;

  private final EntityDeletionOrUpdateAdapter<CasoEntity> __deletionAdapterOfCasoEntity;

  private final EntityDeletionOrUpdateAdapter<CasoEntity> __updateAdapterOfCasoEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCaso;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public CasosDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCasoEntity = new EntityInsertionAdapter<CasoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `caso` (`idEntity`,`id`,`areaCaso`,`clienteName`,`created`,`descripcion`,`estado`,`fecha_fin`,`fecha_inicio`,`funcionarioName`,`prioridad`,`titulo`,`updated`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CasoEntity value) {
        stmt.bindLong(1, value.getIdEntity());
        stmt.bindLong(2, value.getIdCaso());
        if (value.getAreaCaso() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAreaCaso());
        }
        if (value.getClienteName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getClienteName());
        }
        if (value.getCreated() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCreated());
        }
        if (value.getDescripcion() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescripcion());
        }
        stmt.bindLong(7, value.getEstado());
        if (value.getFecha_fin() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getFecha_fin());
        }
        if (value.getFecha_inicio() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getFecha_inicio());
        }
        if (value.getFuncionarioName() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getFuncionarioName());
        }
        stmt.bindLong(11, value.getPrioridad());
        if (value.getTitulo() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getTitulo());
        }
        if (value.getUpdated() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getUpdated());
        }
      }
    };
    this.__deletionAdapterOfCasoEntity = new EntityDeletionOrUpdateAdapter<CasoEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `caso` WHERE `idEntity` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CasoEntity value) {
        stmt.bindLong(1, value.getIdEntity());
      }
    };
    this.__updateAdapterOfCasoEntity = new EntityDeletionOrUpdateAdapter<CasoEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `caso` SET `idEntity` = ?,`id` = ?,`areaCaso` = ?,`clienteName` = ?,`created` = ?,`descripcion` = ?,`estado` = ?,`fecha_fin` = ?,`fecha_inicio` = ?,`funcionarioName` = ?,`prioridad` = ?,`titulo` = ?,`updated` = ? WHERE `idEntity` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CasoEntity value) {
        stmt.bindLong(1, value.getIdEntity());
        stmt.bindLong(2, value.getIdCaso());
        if (value.getAreaCaso() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAreaCaso());
        }
        if (value.getClienteName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getClienteName());
        }
        if (value.getCreated() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCreated());
        }
        if (value.getDescripcion() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescripcion());
        }
        stmt.bindLong(7, value.getEstado());
        if (value.getFecha_fin() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getFecha_fin());
        }
        if (value.getFecha_inicio() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getFecha_inicio());
        }
        if (value.getFuncionarioName() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getFuncionarioName());
        }
        stmt.bindLong(11, value.getPrioridad());
        if (value.getTitulo() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getTitulo());
        }
        if (value.getUpdated() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getUpdated());
        }
        stmt.bindLong(14, value.getIdEntity());
      }
    };
    this.__preparedStmtOfDeleteCaso = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM caso WHERE titulo = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM caso";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final CasoEntity entity, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfCasoEntity.insertAndReturnId(entity);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertAll(final CasoEntity[] entity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCasoEntity.insert(entity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertAll(final List<? extends CasoEntity> entities,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCasoEntity.insert(entities);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteEntity(final CasoEntity entity,
      final Continuation<? super Integer> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__deletionAdapterOfCasoEntity.handle(entity);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final CasoEntity entity, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfCasoEntity.handle(entity);
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
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> CasosDao_Impl.super.withTransaction(tx, __cont), continuation);
  }

  @Override
  public Object insertOrUpdate(final List<? extends CasoEntity> entities,
      final Continuation<? super Unit> continuation) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> CasosDao_Impl.super.insertOrUpdate(entities, __cont), continuation);
  }

  @Override
  public Object deleteCaso(final int id, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCaso.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteCaso.release(_stmt);
        }
      }
    }, continuation);
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
  public Flow<List<CasoEntity>> getCasosDao() {
    final String _sql = "SELECT *  from caso";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"caso"}, new Callable<List<CasoEntity>>() {
      @Override
      public List<CasoEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdEntity = CursorUtil.getColumnIndexOrThrow(_cursor, "idEntity");
          final int _cursorIndexOfIdCaso = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAreaCaso = CursorUtil.getColumnIndexOrThrow(_cursor, "areaCaso");
          final int _cursorIndexOfClienteName = CursorUtil.getColumnIndexOrThrow(_cursor, "clienteName");
          final int _cursorIndexOfCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "created");
          final int _cursorIndexOfDescripcion = CursorUtil.getColumnIndexOrThrow(_cursor, "descripcion");
          final int _cursorIndexOfEstado = CursorUtil.getColumnIndexOrThrow(_cursor, "estado");
          final int _cursorIndexOfFechaFin = CursorUtil.getColumnIndexOrThrow(_cursor, "fecha_fin");
          final int _cursorIndexOfFechaInicio = CursorUtil.getColumnIndexOrThrow(_cursor, "fecha_inicio");
          final int _cursorIndexOfFuncionarioName = CursorUtil.getColumnIndexOrThrow(_cursor, "funcionarioName");
          final int _cursorIndexOfPrioridad = CursorUtil.getColumnIndexOrThrow(_cursor, "prioridad");
          final int _cursorIndexOfTitulo = CursorUtil.getColumnIndexOrThrow(_cursor, "titulo");
          final int _cursorIndexOfUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "updated");
          final List<CasoEntity> _result = new ArrayList<CasoEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CasoEntity _item;
            final long _tmpIdEntity;
            _tmpIdEntity = _cursor.getLong(_cursorIndexOfIdEntity);
            final int _tmpIdCaso;
            _tmpIdCaso = _cursor.getInt(_cursorIndexOfIdCaso);
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
            _item = new CasoEntity(_tmpIdEntity,_tmpIdCaso,_tmpAreaCaso,_tmpClienteName,_tmpCreated,_tmpDescripcion,_tmpEstado,_tmpFecha_fin,_tmpFecha_inicio,_tmpFuncionarioName,_tmpPrioridad,_tmpTitulo,_tmpUpdated);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
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
}
