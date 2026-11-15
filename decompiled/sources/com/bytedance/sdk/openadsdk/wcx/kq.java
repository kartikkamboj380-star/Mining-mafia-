package com.bytedance.sdk.openadsdk.wcx;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private static Context csi;
    private com.bytedance.sdk.openadsdk.wcx.bob.kq bob;
    private Boolean fou;
    private oq oq;
    private static final long rhi = System.currentTimeMillis();
    public static final long kq = com.bytedance.sdk.openadsdk.wcx.fou.kq.kq();
    private int rjo = 0;
    private final ArrayList<fou> syt = new ArrayList<>();
    private final Runnable dgq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.wcx.kq.2
        @Override // java.lang.Runnable
        public void run() {
            kq kqVar = kq.this;
            kqVar.fou = Boolean.valueOf(kqVar.oq.isMonitorOpen());
            if (!kq.this.fou.booleanValue() || kq.this.syt.isEmpty()) {
                return;
            }
            kq kqVar2 = kq.this;
            kqVar2.kq(kqVar2.syt);
            kq.this.syt.clear();
        }
    };
    private Runnable nn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.wcx.kq.4
        @Override // java.lang.Runnable
        public void run() {
            String str = "extra";
            String str2 = "is_init";
            try {
                SQLiteDatabase sQLiteDatabaseOq = com.bytedance.sdk.openadsdk.wcx.kq.kq.oq();
                if (sQLiteDatabaseOq != null) {
                    String[] strArr = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"};
                    String[] strArr2 = {String.valueOf(kq.this.oq.getOnceLogInterval() < 86400000 ? kq.rhi : kq.kq)};
                    int iMax = Math.max(10, kq.this.oq.getOnceLogCount());
                    int i10 = iMax > 100 ? 10 : iMax;
                    int i11 = i10;
                    Cursor cursorQuery = sQLiteDatabaseOq.query("monitor_table", strArr, "timestamp < ?", strArr2, null, null, null, String.valueOf(i10));
                    if (cursorQuery != null) {
                        ArrayList arrayList = new ArrayList();
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            while (cursorQuery.moveToNext()) {
                                ArrayList arrayList3 = arrayList;
                                com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                                if (cursorQuery.getColumnIndex("_id") >= 0) {
                                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                                    kqVar.kq(j10);
                                    arrayList2.add(String.valueOf(j10));
                                }
                                if (cursorQuery.getColumnIndex("sdk_version") >= 0) {
                                    kqVar.kq(cursorQuery.getString(cursorQuery.getColumnIndex("sdk_version")));
                                }
                                if (cursorQuery.getColumnIndex("scene") >= 0) {
                                    kqVar.oq(cursorQuery.getString(cursorQuery.getColumnIndex("scene")));
                                }
                                if (cursorQuery.getColumnIndex("start_count") >= 0) {
                                    kqVar.kq(cursorQuery.getInt(cursorQuery.getColumnIndex("start_count")));
                                }
                                if (cursorQuery.getColumnIndex("success_count") >= 0) {
                                    kqVar.oq(cursorQuery.getInt(cursorQuery.getColumnIndex("success_count")));
                                }
                                if (cursorQuery.getColumnIndex("fail_count") >= 0) {
                                    kqVar.bob(cursorQuery.getInt(cursorQuery.getColumnIndex("fail_count")));
                                }
                                if (cursorQuery.getColumnIndex("rit") >= 0) {
                                    kqVar.bob(cursorQuery.getString(cursorQuery.getColumnIndex("rit")));
                                }
                                if (cursorQuery.getColumnIndex("tag") >= 0) {
                                    kqVar.fou(cursorQuery.getString(cursorQuery.getColumnIndex("tag")));
                                }
                                if (cursorQuery.getColumnIndex("label") >= 0) {
                                    kqVar.csi(cursorQuery.getString(cursorQuery.getColumnIndex("label")));
                                }
                                if (cursorQuery.getColumnIndex("timestamp") >= 0) {
                                    kqVar.oq(cursorQuery.getLong(cursorQuery.getColumnIndex("timestamp")));
                                }
                                if (cursorQuery.getColumnIndex("mediation") >= 0) {
                                    kqVar.rhi(cursorQuery.getString(cursorQuery.getColumnIndex("mediation")));
                                }
                                String str3 = str2;
                                if (cursorQuery.getColumnIndex(str3) >= 0) {
                                    kqVar.fou(cursorQuery.getInt(cursorQuery.getColumnIndex(str3)));
                                }
                                String str4 = str;
                                if (cursorQuery.getColumnIndex(str4) >= 0) {
                                    kqVar.rjo(cursorQuery.getString(cursorQuery.getColumnIndex(str4)));
                                }
                                arrayList3.add(kqVar);
                                arrayList = arrayList3;
                                str = str4;
                                str2 = str3;
                            }
                            ArrayList arrayList4 = arrayList;
                            cursorQuery.close();
                            if (!arrayList4.isEmpty()) {
                                try {
                                    kq.this.oq.onMonitorUpload(arrayList4);
                                    SQLiteDatabase sQLiteDatabaseKq = com.bytedance.sdk.openadsdk.wcx.kq.kq.kq();
                                    if (sQLiteDatabaseKq != null && sQLiteDatabaseKq.isOpen()) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("_id IN (");
                                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                            sb.append("?");
                                            if (i12 < arrayList2.size() - 1) {
                                                sb.append(",");
                                            }
                                        }
                                        sb.append(")");
                                        sQLiteDatabaseKq.delete("monitor_table", sb.toString(), (String[]) arrayList2.toArray(new String[0]));
                                        if (kq.this.bob != null) {
                                            kq.this.bob.kq(kq.rhi);
                                        }
                                    }
                                    if (arrayList4.size() < i11 || kq.this.rjo > 1000) {
                                        return;
                                    }
                                    kq.this.kq(false);
                                } catch (Throwable unused) {
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    };

    private kq(oq oqVar) {
        try {
            this.oq = new BusMonitorDependWrapper(oqVar);
            this.bob = new com.bytedance.sdk.openadsdk.wcx.bob.kq(oqVar.getContext());
            csi = oqVar.getContext();
        } catch (Throwable unused) {
        }
    }

    static /* synthetic */ int csi(kq kqVar) {
        int i10 = kqVar.rjo;
        kqVar.rjo = i10 + 1;
        return i10;
    }

    private boolean bob() {
        if (this.fou == null) {
            oq oqVar = this.oq;
            return (oqVar == null || oqVar.getContext() == null || this.oq.getHandler() == null) ? false : true;
        }
        oq oqVar2 = this.oq;
        return (oqVar2 == null || oqVar2.getContext() == null || !this.oq.isMonitorOpen() || this.oq.getHandler() == null) ? false : true;
    }

    public static kq kq(oq oqVar) {
        return new kq(oqVar);
    }

    public static Context kq() {
        Context context = csi;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void kq(final fou fouVar) {
        if (fouVar == null || !bob()) {
            return;
        }
        this.oq.getHandler().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wcx.kq.1
            @Override // java.lang.Runnable
            public void run() {
                kq kqVar = kq.this;
                kqVar.fou = Boolean.valueOf(kqVar.oq.isMonitorOpen());
                if (kq.this.fou.booleanValue()) {
                    kq.this.syt.add(fouVar);
                    if (kq.this.syt.size() >= 10) {
                        kq.this.oq.getHandler().removeCallbacks(kq.this.dgq);
                        kq kqVar2 = kq.this;
                        kqVar2.kq(kqVar2.syt);
                        kq.this.syt.clear();
                    }
                }
            }
        });
        this.oq.getHandler().removeCallbacks(this.dgq);
        this.oq.getHandler().postDelayed(this.dgq, ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(List<fou> list) {
        com.bytedance.sdk.openadsdk.wcx.oq.kq kqVarKq;
        SQLiteDatabase sQLiteDatabase = null;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    SQLiteDatabase sQLiteDatabaseKq = com.bytedance.sdk.openadsdk.wcx.kq.kq.kq();
                    if (sQLiteDatabaseKq != null) {
                        try {
                            sQLiteDatabaseKq.beginTransaction();
                            for (int i10 = 0; i10 < list.size(); i10++) {
                                fou fouVar = list.get(i10);
                                if (fouVar != null && (kqVarKq = fouVar.kq()) != null) {
                                    Cursor cursorQuery = sQLiteDatabaseKq.query("monitor_table", new String[]{"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"}, new StringBuilder("sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND timestamp = ? AND extra = ?").toString(), new String[]{kqVarKq.oq(), kqVarKq.bob(), kqVarKq.rjo(), kqVarKq.syt(), kqVarKq.dgq(), kqVarKq.ubx(), String.valueOf(kqVarKq.vvw()), String.valueOf(kqVarKq.nn()), kqVarKq.wki()}, null, null, null);
                                    if (cursorQuery != null) {
                                        if (cursorQuery.moveToNext()) {
                                            int columnIndex = cursorQuery.getColumnIndex("_id");
                                            if (columnIndex >= 0) {
                                                kqVarKq.kq(cursorQuery.getLong(columnIndex));
                                            }
                                            int columnIndex2 = cursorQuery.getColumnIndex("start_count");
                                            if (columnIndex2 >= 0) {
                                                kqVarKq.kq(cursorQuery.getInt(columnIndex2) + kqVarKq.fou());
                                            }
                                            int columnIndex3 = cursorQuery.getColumnIndex("success_count");
                                            if (columnIndex3 >= 0) {
                                                kqVarKq.oq(cursorQuery.getInt(columnIndex3) + kqVarKq.csi());
                                            }
                                            int columnIndex4 = cursorQuery.getColumnIndex("fail_count");
                                            if (columnIndex4 >= 0) {
                                                kqVarKq.bob(cursorQuery.getInt(columnIndex4) + kqVarKq.rhi());
                                            }
                                        }
                                        cursorQuery.close();
                                    }
                                    ContentValues contentValues = new ContentValues();
                                    if (kqVarKq.kq() > 0) {
                                        contentValues.put("_id", Long.valueOf(kqVarKq.kq()));
                                    }
                                    contentValues.put("sdk_version", kqVarKq.oq());
                                    contentValues.put("scene", kqVarKq.bob());
                                    contentValues.put("start_count", Integer.valueOf(kqVarKq.fou()));
                                    contentValues.put("success_count", Integer.valueOf(kqVarKq.csi()));
                                    contentValues.put("fail_count", Integer.valueOf(kqVarKq.rhi()));
                                    contentValues.put("rit", kqVarKq.rjo());
                                    contentValues.put("tag", kqVarKq.syt());
                                    contentValues.put("label", kqVarKq.dgq());
                                    contentValues.put("timestamp", Long.valueOf(kqVarKq.nn()));
                                    contentValues.put("mediation", kqVarKq.ubx());
                                    contentValues.put("is_init", Integer.valueOf(kqVarKq.vvw()));
                                    contentValues.put("extra", kqVarKq.wki());
                                    sQLiteDatabaseKq.insertWithOnConflict("monitor_table", null, contentValues, 5);
                                }
                            }
                            sQLiteDatabaseKq.setTransactionSuccessful();
                        } catch (Throwable unused) {
                            sQLiteDatabase = sQLiteDatabaseKq;
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                    return;
                                } catch (Throwable unused2) {
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    sQLiteDatabase = sQLiteDatabaseKq;
                }
            } catch (Throwable unused3) {
            }
        }
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused4) {
            }
        }
    }

    public void kq(final boolean z9) {
        oq oqVar = this.oq;
        if (oqVar == null || oqVar.getHandler() == null || this.oq.getContext() == null || this.bob == null || !this.oq.isMonitorOpen()) {
            return;
        }
        this.oq.getHandler().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wcx.kq.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    kq.csi(kq.this);
                    if (z9) {
                        long jKq = kq.this.bob.kq();
                        if (jKq == 0) {
                            kq.this.bob.kq(System.currentTimeMillis());
                            return;
                        } else if (com.bytedance.sdk.openadsdk.wcx.fou.kq.kq(jKq) && System.currentTimeMillis() - jKq < kq.this.oq.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    if (kq.this.oq.getHandler() != null) {
                        kq.this.oq.getHandler().post(kq.this.nn);
                    }
                } catch (Throwable unused) {
                }
            }
        }, Math.max(this.oq.getOnceLogInterval(), UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS));
    }
}
