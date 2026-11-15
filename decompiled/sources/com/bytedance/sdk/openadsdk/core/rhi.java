package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class rhi {
    private static final Object bob = new Object();
    private bob kq;
    private Context oq;

    private class oq extends AbstractCursor {
        private oq() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i10) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i10) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i10) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i10) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i10) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i10) {
            return true;
        }
    }

    rhi(Context context) {
        try {
            this.oq = context == null ? sns.kq() : context.getApplicationContext();
            if (this.kq == null) {
                this.kq = new bob();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context bob() {
        Context context = this.oq;
        return context == null ? sns.kq() : context;
    }

    public class bob {
        private SQLiteDatabase oq = null;

        public bob() {
        }

        private synchronized void csi() {
            try {
                synchronized (rhi.bob) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.oq;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            rhi rhiVar = rhi.this;
                            SQLiteDatabase writableDatabase = rhiVar.new kq(rhiVar.bob()).getWritableDatabase();
                            this.oq = writableDatabase;
                            writableDatabase.setLockingEnabled(false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.fax.bob("DBHelper", th2.getMessage());
                if (rhi()) {
                    throw th2;
                }
            }
        }

        private synchronized boolean rhi() {
            SQLiteDatabase sQLiteDatabase = this.oq;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        public synchronized void bob() {
            csi();
            SQLiteDatabase sQLiteDatabase = this.oq;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void fou() {
            csi();
            SQLiteDatabase sQLiteDatabase = this.oq;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        public SQLiteDatabase kq() {
            csi();
            return this.oq;
        }

        public synchronized void oq() {
            csi();
            SQLiteDatabase sQLiteDatabase = this.oq;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public synchronized void kq(String str) {
            try {
                csi();
                this.oq.execSQL(str);
            } catch (Throwable th) {
                if (rhi()) {
                    throw th;
                }
            }
        }

        public synchronized Cursor kq(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                csi();
                cursorQuery = this.oq.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.fax.bob("DBHelper", th.getMessage());
                oq oqVar = new oq();
                if (rhi()) {
                    throw th;
                }
                cursorQuery = oqVar;
            }
            return cursorQuery;
        }

        public synchronized int kq(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                csi();
                iUpdate = this.oq.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.fax.bob("DBHelper", e10.getMessage());
                if (rhi()) {
                    throw e10;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public synchronized long kq(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                csi();
                jReplace = this.oq.replace(str, str2, contentValues);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.fax.bob("DBHelper", e10.getMessage());
                if (rhi()) {
                    throw e10;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public synchronized int kq(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                csi();
                iDelete = this.oq.delete(str, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.fax.bob("DBHelper", e10.getMessage());
                if (rhi()) {
                    throw e10;
                }
                iDelete = 0;
            }
            return iDelete;
        }
    }

    public bob kq() {
        return this.kq;
    }

    private class kq extends SQLiteOpenHelper {
        final Context kq;

        public kq(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.kq = context;
        }

        private void bob(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayListFou = fou(sQLiteDatabase);
            if (arrayListFou == null || arrayListFou.size() <= 0) {
                return;
            }
            int size = arrayListFou.size();
            int i10 = 0;
            while (i10 < size) {
                String str = arrayListFou.get(i10);
                i10++;
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", str));
            }
        }

        private ArrayList<String> fou(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        String string = cursorRawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return arrayList;
                }
            } catch (Exception unused) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
            return arrayList;
        }

        private void kq(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fou.fou.kq());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fou.ubx.bob());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fou.mxq.kq());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fou.nze.kq());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ou.oq.kq());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fou.wcx.bob());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.kq.oq.oq.bob());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.ubx.kq.bob.bob());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fou.sns.kq());
        }

        private void oq(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.ubx.kq.bob.fou());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                kq(sQLiteDatabase, this.kq);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.fax.bob("DBHelper", th.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 > i11) {
                try {
                    bob(sQLiteDatabase);
                    kq(sQLiteDatabase, rhi.this.oq);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.fax.bob(th.getMessage(), new Object[0]);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:11:0x0037 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:12:0x0040 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:6:0x0011 A[DONT_GENERATE] */
        /* JADX WARN: Code duplicated, block: B:7:0x0012 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:8:0x0016 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0021 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 <= i11) {
                kq(sQLiteDatabase, rhi.this.oq);
                switch (i10) {
                    case 1:
                        kq(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                        kq(sQLiteDatabase);
                        break;
                    case 3:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fou.mxq.kq());
                        kq(sQLiteDatabase);
                        break;
                    case 4:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.kq.oq.oq.bob());
                        kq(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fou.nze.kq());
                        kq(sQLiteDatabase);
                        break;
                    case 6:
                        kq(sQLiteDatabase);
                        break;
                }
            } else {
                try {
                    bob(sQLiteDatabase);
                    kq(sQLiteDatabase, rhi.this.oq);
                    switch (i10) {
                        case 1:
                            kq(sQLiteDatabase);
                            break;
                        case 2:
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                            kq(sQLiteDatabase);
                            break;
                        case 3:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fou.mxq.kq());
                            kq(sQLiteDatabase);
                            break;
                        case 4:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.kq.oq.oq.bob());
                            kq(sQLiteDatabase);
                            break;
                        case 5:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fou.nze.kq());
                            kq(sQLiteDatabase);
                            break;
                        case 6:
                            kq(sQLiteDatabase);
                            break;
                    }
                } catch (Throwable unused) {
                }
            }
            if (i10 < 11) {
                try {
                    oq(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.ou.oq.kq(sQLiteDatabase);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.fax.bob("DBHelper", th.getMessage());
                }
            }
        }

        private void kq(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fou.fou.oq());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fou.ubx.fou());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fou.mxq.oq());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fou.nze.oq());
        }
    }
}
