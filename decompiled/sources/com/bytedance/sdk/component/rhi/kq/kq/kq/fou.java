package com.bytedance.sdk.component.rhi.kq.kq.kq;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.rhi.kq.syt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class fou extends SQLiteOpenHelper {
    final Context kq;

    public fou(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.kq = context;
    }

    private ArrayList<String> bob(SQLiteDatabase sQLiteDatabase) {
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
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private void kq(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.rhi.kq.kq.kq.kq.kq.oq(syt.rjo().fou().oq()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.rhi.kq.kq.kq.kq.fou.bob(syt.rjo().fou().kq()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.rhi.kq.kq.kq.kq.rjo.bob(syt.rjo().fou().fou()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.rhi.kq.kq.kq.kq.rhi.kq(syt.rjo().fou().csi()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.rhi.kq.rhi.rhi.oq());
    }

    private void oq(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListBob = bob(sQLiteDatabase);
        if (arrayListBob == null || arrayListBob.size() <= 0) {
            return;
        }
        int size = arrayListBob.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayListBob.get(i10);
            i10++;
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", str));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            kq(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 <= i11) {
                kq(sQLiteDatabase);
            } else {
                oq(sQLiteDatabase);
                kq(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }
}
