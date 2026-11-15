package com.bytedance.sdk.openadsdk.wcx.kq;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.fax;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class kq extends SQLiteOpenHelper {
    private static volatile kq oq;
    final Context kq;

    private kq(Context context) {
        super(context, "pag_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.kq = context;
    }

    private static kq bob() {
        if (oq == null) {
            synchronized (kq.class) {
                try {
                    if (oq == null) {
                        oq = new kq(com.bytedance.sdk.openadsdk.wcx.kq.kq());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oq;
    }

    public static SQLiteDatabase kq() {
        try {
            kq kqVarBob = bob();
            if (kqVarBob == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = kqVarBob.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    public static SQLiteDatabase oq() {
        try {
            kq kqVarBob = bob();
            if (kqVarBob == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = kqVarBob.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(new StringBuilder("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )").toString());
        } catch (Throwable th) {
            Log.e("MonitorSQLiteOpenHelper", th.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 <= i11) {
                onCreate(sQLiteDatabase);
            } else {
                kq(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    private void kq(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListOq = oq(sQLiteDatabase);
        if (arrayListOq == null || arrayListOq.size() <= 0) {
            return;
        }
        int size = arrayListOq.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayListOq.get(i10);
            i10++;
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", str));
        }
    }

    private ArrayList<String> oq(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
            }
            return arrayList;
        } catch (Exception e10) {
            fax.bob("MonitorSQLiteOpenHelper", e10.getMessage());
            return arrayList;
        }
    }
}
