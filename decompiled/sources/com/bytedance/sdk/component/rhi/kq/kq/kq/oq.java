package com.bytedance.sdk.component.rhi.kq.kq.kq;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.rhi.kq.syt;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class oq {
    private C0252oq kq;
    private Context oq;

    private class kq extends AbstractCursor {
        private kq() {
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

    oq(Context context) {
        try {
            this.oq = context.getApplicationContext();
            if (this.kq == null) {
                this.kq = new C0252oq();
            }
        } catch (Throwable unused) {
        }
    }

    public C0252oq kq() {
        return this.kq;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.rhi.kq.kq.kq.oq$oq, reason: collision with other inner class name */
    public class C0252oq {
        private volatile SQLiteDatabase oq = null;

        public C0252oq() {
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x000d */
        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void kq() {
            /*
                r2 = this;
                android.database.sqlite.SQLiteDatabase r0 = r2.oq     // Catch: java.lang.Throwable -> Ld
                if (r0 == 0) goto Lf
                android.database.sqlite.SQLiteDatabase r0 = r2.oq     // Catch: java.lang.Throwable -> Ld
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> Ld
                if (r0 != 0) goto L45
                goto Lf
            Ld:
                r0 = move-exception
                goto L3f
            Lf:
                monitor-enter(r2)     // Catch: java.lang.Throwable -> Ld
                android.database.sqlite.SQLiteDatabase r0 = r2.oq     // Catch: java.lang.Throwable -> L1d
                if (r0 == 0) goto L1f
                android.database.sqlite.SQLiteDatabase r0 = r2.oq     // Catch: java.lang.Throwable -> L1d
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L1d
                if (r0 != 0) goto L3b
                goto L1f
            L1d:
                r0 = move-exception
                goto L3d
            L1f:
                com.bytedance.sdk.component.rhi.kq.syt r0 = com.bytedance.sdk.component.rhi.kq.syt.rjo()     // Catch: java.lang.Throwable -> L1d
                com.bytedance.sdk.component.rhi.kq.kq.csi r0 = r0.fou()     // Catch: java.lang.Throwable -> L1d
                com.bytedance.sdk.component.rhi.kq.syt r1 = com.bytedance.sdk.component.rhi.kq.syt.rjo()     // Catch: java.lang.Throwable -> L1d
                android.content.Context r1 = r1.rhi()     // Catch: java.lang.Throwable -> L1d
                android.database.sqlite.SQLiteDatabase r0 = r0.kq(r1)     // Catch: java.lang.Throwable -> L1d
                r2.oq = r0     // Catch: java.lang.Throwable -> L1d
                android.database.sqlite.SQLiteDatabase r0 = r2.oq     // Catch: java.lang.Throwable -> L1d
                r1 = 0
                r0.setLockingEnabled(r1)     // Catch: java.lang.Throwable -> L1d
            L3b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
                return
            L3d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r0     // Catch: java.lang.Throwable -> Ld
            L3f:
                boolean r1 = r2.oq()
                if (r1 != 0) goto L46
            L45:
                return
            L46:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.rhi.kq.kq.kq.oq.C0252oq.kq():void");
        }

        private boolean oq() {
            SQLiteDatabase sQLiteDatabase = this.oq;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        public void kq(String str) {
            try {
                kq();
                this.oq.execSQL(str);
            } catch (Throwable th) {
                if (oq()) {
                    throw th;
                }
            }
        }

        public Cursor kq(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                kq();
                return this.oq.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                kq kqVar = new kq();
                if (oq()) {
                    throw th;
                }
                return kqVar;
            }
        }

        public int kq(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                kq();
                return this.oq.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                if (oq()) {
                    throw e10;
                }
                return 0;
            }
        }

        public long kq(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                kq();
                return this.oq.insert(str, str2, contentValues);
            } catch (Exception e10) {
                if (oq()) {
                    throw e10;
                }
                return -1L;
            }
        }

        public synchronized void kq(String str, String str2, List<com.bytedance.sdk.component.rhi.kq.fou.kq> list) {
            JSONObject jSONObjectRjo;
            try {
                try {
                    kq();
                    this.oq.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        com.bytedance.sdk.component.rhi.kq.fou.kq kqVar = list.get(i10);
                        if (kqVar != null && (jSONObjectRjo = kqVar.rjo()) != null) {
                            contentValues.put("id", kqVar.bob());
                            String strOq = syt.rjo().mxq().oq(jSONObjectRjo.toString());
                            if (!TextUtils.isEmpty(strOq)) {
                                contentValues.put("value", strOq);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.rhi.kq.bob.kq.fou() && kqVar.nn() > 0 && (kqVar.fou() == 0 || kqVar.fou() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(kqVar.nn()));
                                }
                                this.oq.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.oq.setTransactionSuccessful();
                    list.size();
                    if (this.oq != null) {
                        this.oq.endTransaction();
                    }
                } catch (Exception e10) {
                    list.size();
                    if (!oq()) {
                        if (this.oq != null) {
                            this.oq.endTransaction();
                        }
                    } else {
                        throw e10;
                    }
                }
            } catch (Throwable th) {
                if (this.oq != null) {
                    this.oq.endTransaction();
                }
                throw th;
            }
        }

        public int kq(String str, String str2, String[] strArr) throws Exception {
            try {
                kq();
                return this.oq.delete(str, str2, strArr);
            } catch (Exception e10) {
                if (oq()) {
                    throw e10;
                }
                return 0;
            }
        }
    }
}
