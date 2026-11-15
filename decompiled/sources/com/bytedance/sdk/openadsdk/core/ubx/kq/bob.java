package com.bytedance.sdk.openadsdk.core.ubx.kq;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.core.sns;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    public static int kq = 20;
    private static volatile bob oq;
    private final Object bob = new Object();
    private final LruCache<String, kq> fou = new LruCache<String, kq>(kq) { // from class: com.bytedance.sdk.openadsdk.core.ubx.kq.bob.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, kq kqVar) {
            return 1;
        }
    };

    private bob() {
    }

    public static String bob() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)").toString();
    }

    public static String fou() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public static bob kq() {
        if (oq == null) {
            synchronized (bob.class) {
                try {
                    if (oq == null) {
                        oq = new bob();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oq;
    }

    List<kq> oq() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.multipro.aidl.bob bobVar = new com.bytedance.sdk.openadsdk.multipro.aidl.bob(com.bytedance.sdk.openadsdk.multipro.kq.kq.kq(sns.kq(), "ugen_template", null, null, null, null, null, null));
        try {
            if (bobVar.moveToFirst()) {
                do {
                    int columnIndex = bobVar.getColumnIndex("id");
                    int columnIndex2 = bobVar.getColumnIndex("md5");
                    int columnIndex3 = bobVar.getColumnIndex("url");
                    int columnIndex4 = bobVar.getColumnIndex(JsonStorageKeyNames.DATA_KEY);
                    int columnIndex5 = bobVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = bobVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? bobVar.getString(columnIndex6) : null;
                        String string2 = bobVar.getString(columnIndex);
                        String string3 = bobVar.getString(columnIndex2);
                        String string4 = bobVar.getString(columnIndex3);
                        kq kqVarKq = new kq().kq(string2).oq(string3).bob(string4).fou(bobVar.getString(columnIndex4)).csi(string).kq(Long.valueOf(bobVar.getLong(columnIndex5)));
                        arrayList.add(kqVarKq);
                        synchronized (this.bob) {
                            this.fou.put(string2, kqVarKq);
                        }
                    }
                } while (bobVar.moveToNext());
            }
            bobVar.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                fax.kq("UGTmplDbHelper", "getUgenTemplate error", th);
                return arrayList;
            } finally {
                bobVar.close();
            }
        }
    }

    kq kq(String str, String str2) {
        kq kqVar;
        kq kqVarKq;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.bob) {
            kqVar = this.fou.get(str);
        }
        if (kqVar != null) {
            if (TextUtils.equals(str2, kqVar.oq())) {
                return kqVar;
            }
            oq(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.bob bobVar = new com.bytedance.sdk.openadsdk.multipro.aidl.bob(com.bytedance.sdk.openadsdk.multipro.kq.kq.kq(sns.kq(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (bobVar.moveToFirst()) {
                do {
                    int columnIndex = bobVar.getColumnIndex("id");
                    int columnIndex2 = bobVar.getColumnIndex("md5");
                    int columnIndex3 = bobVar.getColumnIndex("url");
                    int columnIndex4 = bobVar.getColumnIndex(JsonStorageKeyNames.DATA_KEY);
                    int columnIndex5 = bobVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = bobVar.getColumnIndex("rit");
                        String string = bobVar.getString(columnIndex);
                        String string2 = bobVar.getString(columnIndex2);
                        String string3 = bobVar.getString(columnIndex3);
                        String string4 = bobVar.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            bobVar.close();
                            return null;
                        }
                        kqVarKq = new kq().kq(string).oq(string2).fou(string4).bob(string3).csi(columnIndex6 != -1 ? bobVar.getString(columnIndex6) : null).kq(Long.valueOf(bobVar.getLong(columnIndex5)));
                        synchronized (this.bob) {
                            this.fou.put(string, kqVarKq);
                        }
                    }
                    bobVar.close();
                    return null;
                } while (bobVar.moveToNext());
                bobVar.close();
                return kqVarKq;
            }
        } catch (Throwable th) {
            try {
                fax.kq("UGTmplDbHelper", "getGgenTemplate error", th);
            } finally {
                bobVar.close();
            }
        }
        return null;
    }

    private void oq(String str) {
        if (!TextUtils.isEmpty(str) && this.fou.size() > 0) {
            synchronized (this.bob) {
                this.fou.remove(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void kq(com.bytedance.sdk.openadsdk.core.ubx.kq.kq r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L4
            goto La5
        L4:
            java.lang.String r0 = r10.kq()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            goto La5
        L10:
            com.bytedance.sdk.openadsdk.multipro.aidl.bob r0 = new com.bytedance.sdk.openadsdk.multipro.aidl.bob
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.sns.kq()
            java.lang.String r2 = "ugen_template"
            java.lang.String r4 = "id=?"
            java.lang.String r3 = r10.kq()
            java.lang.String[] r5 = new java.lang.String[]{r3}
            r7 = 0
            r8 = 0
            r3 = 0
            r6 = 0
            java.util.Map r1 = com.bytedance.sdk.openadsdk.multipro.kq.kq.kq(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.<init>(r1)
            int r1 = r0.getCount()
            if (r1 <= 0) goto L35
            r1 = 1
            goto L36
        L35:
            r1 = 0
        L36:
            r0.close()     // Catch: java.lang.Throwable -> La5
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> La5
            r0.<init>()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "id"
            java.lang.String r3 = r10.kq()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "md5"
            java.lang.String r3 = r10.oq()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "url"
            java.lang.String r3 = r10.bob()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "data"
            java.lang.String r3 = r10.csi()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "rit"
            java.lang.String r3 = r10.rhi()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "update_time"
            java.lang.Long r3 = r10.fou()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto L8a
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.sns.kq()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "ugen_template"
            java.lang.String r3 = "id=?"
            java.lang.String r4 = r10.kq()     // Catch: java.lang.Throwable -> La5
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> La5
            com.bytedance.sdk.openadsdk.multipro.kq.kq.kq(r1, r2, r0, r3, r4)     // Catch: java.lang.Throwable -> La5
            goto L93
        L8a:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.sns.kq()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "ugen_template"
            com.bytedance.sdk.openadsdk.multipro.kq.kq.kq(r1, r2, r0)     // Catch: java.lang.Throwable -> La5
        L93:
            java.lang.Object r1 = r9.bob     // Catch: java.lang.Throwable -> La5
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La5
            android.util.LruCache<java.lang.String, com.bytedance.sdk.openadsdk.core.ubx.kq.kq> r0 = r9.fou     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = r10.kq()     // Catch: java.lang.Throwable -> La1
            r0.put(r2, r10)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La1
            return
        La1:
            r0 = move-exception
            r10 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La5
            throw r10     // Catch: java.lang.Throwable -> La5
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ubx.kq.bob.kq(com.bytedance.sdk.openadsdk.core.ubx.kq.kq):void");
    }

    Set<kq> kq(String str) {
        kq kqVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.multipro.aidl.bob bobVar = new com.bytedance.sdk.openadsdk.multipro.aidl.bob(com.bytedance.sdk.openadsdk.multipro.kq.kq.kq(sns.kq(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (bobVar.moveToFirst()) {
                do {
                    int columnIndex = bobVar.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = bobVar.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.bob) {
                                kqVar = this.fou.get(string);
                            }
                            if (kqVar != null) {
                                hashSet.add(kqVar);
                            } else {
                                kq kqVar2 = new kq();
                                int columnIndex2 = bobVar.getColumnIndex(JsonStorageKeyNames.DATA_KEY);
                                if (columnIndex2 != -1) {
                                    String string2 = bobVar.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        kqVar2.fou(string2);
                                        kqVar2.kq(string);
                                        kqVar2.csi(str);
                                        int columnIndex3 = bobVar.getColumnIndex("md5");
                                        int columnIndex4 = bobVar.getColumnIndex("url");
                                        int columnIndex5 = bobVar.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            kqVar2.oq(bobVar.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            kqVar2.bob(bobVar.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            kqVar2.kq(Long.valueOf(bobVar.getLong(columnIndex5)));
                                        }
                                        hashSet.add(kqVar2);
                                        synchronized (this.bob) {
                                            this.fou.put(string, kqVar2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (bobVar.moveToNext());
            }
            bobVar.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                fax.kq("UGTmplDbHelper", "getUgenTemplateFormRit error", th);
                return hashSet;
            } finally {
                bobVar.close();
            }
        }
    }

    void kq(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                oq(str);
                com.bytedance.sdk.openadsdk.multipro.kq.kq.kq(sns.kq(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}
