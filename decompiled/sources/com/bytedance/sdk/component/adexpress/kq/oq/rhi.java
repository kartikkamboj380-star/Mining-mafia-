package com.bytedance.sdk.component.adexpress.kq.oq;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    public static int kq = 20;
    private static volatile rhi oq;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.kq.bob.bob> csi;
    private final Object fou = new Object();
    private AtomicBoolean rhi = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.kq.bob.oq> rjo = new LruCache<String, com.bytedance.sdk.component.adexpress.kq.bob.oq>(kq) { // from class: com.bytedance.sdk.component.adexpress.kq.oq.rhi.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.kq.bob.oq oqVar) {
            return 1;
        }
    };
    private Set<String> bob = Collections.synchronizedSet(new HashSet());

    private rhi() {
    }

    private void fou(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.kq.bob.oq> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.rjo) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.fou) {
            this.rjo.remove(str);
        }
    }

    public static void kq(int i10) {
        kq = i10;
    }

    void bob(String str) {
        com.bytedance.sdk.component.adexpress.kq.bob.bob bobVar;
        try {
            if (this.csi != null && !this.csi.isEmpty() && (bobVar = this.csi.get(str)) != null) {
                if (!TextUtils.isEmpty(bobVar.kq()) && com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().rhi() != null) {
                    com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().rhi();
                }
                this.csi.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    Set<String> oq(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().oq() != null) {
            HashSet hashSet = new HashSet();
            Cursor cursorKq = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().oq().kq("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            if (cursorKq != null) {
                try {
                    try {
                        if (cursorKq.moveToFirst()) {
                            do {
                                hashSet.add(cursorKq.getString(cursorKq.getColumnIndex("id")));
                            } while (cursorKq.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e10) {
                        Log.e("TmplDbHelper", "", e10);
                    }
                } finally {
                    cursorKq.close();
                }
            }
        }
        return null;
    }

    public static rhi kq() {
        if (oq == null) {
            synchronized (rhi.class) {
                try {
                    if (oq == null) {
                        oq = new rhi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oq;
    }

    public static String bob() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)").toString();
    }

    com.bytedance.sdk.component.adexpress.kq.bob.oq kq(String str) {
        com.bytedance.sdk.component.adexpress.kq.bob.oq oqVar;
        com.bytedance.sdk.component.adexpress.kq.bob.oq oqVarKq;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().oq() == null) {
            return null;
        }
        synchronized (this.fou) {
            oqVar = this.rjo.get(String.valueOf(str));
        }
        if (oqVar != null) {
            return oqVar;
        }
        Cursor cursorKq = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().oq().kq("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (cursorKq != null) {
            try {
                if (cursorKq.moveToFirst()) {
                    do {
                        String string = cursorKq.getString(cursorKq.getColumnIndex("rit"));
                        String string2 = cursorKq.getString(cursorKq.getColumnIndex("id"));
                        String string3 = cursorKq.getString(cursorKq.getColumnIndex("md5"));
                        String string4 = cursorKq.getString(cursorKq.getColumnIndex("url"));
                        String string5 = cursorKq.getString(cursorKq.getColumnIndex(JsonStorageKeyNames.DATA_KEY));
                        String string6 = cursorKq.getString(cursorKq.getColumnIndex("version"));
                        oqVarKq = new com.bytedance.sdk.component.adexpress.kq.bob.oq().kq(string).oq(string2).bob(string3).fou(string4).csi(string5).rhi(string6).kq(Long.valueOf(cursorKq.getLong(cursorKq.getColumnIndex("update_time"))));
                        synchronized (this.fou) {
                            this.rjo.put(string2, oqVarKq);
                        }
                        this.bob.add(string2);
                    } while (cursorKq.moveToNext());
                    cursorKq.close();
                    return oqVarKq;
                }
            } catch (Throwable unused) {
            }
            cursorKq.close();
        }
        return null;
    }

    List<com.bytedance.sdk.component.adexpress.kq.bob.oq> oq() {
        if (com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().oq() == null) {
            return null;
        }
        boolean z9 = this.rhi.get();
        this.rhi.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorKq = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().oq().kq("template_diff_new", null, null, null, null, null, null);
        if (cursorKq != null) {
            while (cursorKq.moveToNext()) {
                try {
                    String string = cursorKq.getString(cursorKq.getColumnIndex("rit"));
                    String string2 = cursorKq.getString(cursorKq.getColumnIndex("id"));
                    String string3 = cursorKq.getString(cursorKq.getColumnIndex("md5"));
                    String string4 = cursorKq.getString(cursorKq.getColumnIndex("url"));
                    String string5 = cursorKq.getString(cursorKq.getColumnIndex(JsonStorageKeyNames.DATA_KEY));
                    String string6 = cursorKq.getString(cursorKq.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.kq.bob.oq().kq(string).oq(string2).bob(string3).fou(string4).csi(string5).rhi(string6).kq(Long.valueOf(cursorKq.getLong(cursorKq.getColumnIndex("update_time")))));
                    synchronized (this.fou) {
                        this.rjo.put(string2, (com.bytedance.sdk.component.adexpress.kq.bob.oq) arrayList.get(arrayList.size() - 1));
                    }
                    this.bob.add(string2);
                    if (!z9 && com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().rhi() != null) {
                        if (this.csi == null) {
                            this.csi = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.csi.contains(string2)) {
                            this.csi.put(string2, new com.bytedance.sdk.component.adexpress.kq.bob.bob(string, string2, string3));
                        }
                    }
                } catch (Throwable unused) {
                    cursorKq.close();
                }
            }
            cursorKq.close();
            return arrayList;
        }
        return arrayList;
    }

    void kq(com.bytedance.sdk.component.adexpress.kq.bob.oq oqVar, boolean z9) {
        if (oqVar == null || com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().oq() == null || TextUtils.isEmpty(oqVar.oq())) {
            return;
        }
        Cursor cursorKq = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().oq().kq("template_diff_new", null, "id=?", new String[]{oqVar.oq()}, null, null, null);
        boolean z10 = cursorKq != null && cursorKq.getCount() > 0;
        String string = null;
        if (cursorKq != null) {
            try {
                string = cursorKq.moveToFirst() ? cursorKq.getString(cursorKq.getColumnIndex("rit")) : null;
                cursorKq.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", oqVar.kq());
        contentValues.put("id", oqVar.oq());
        contentValues.put("md5", oqVar.bob());
        contentValues.put("url", oqVar.fou());
        contentValues.put(JsonStorageKeyNames.DATA_KEY, oqVar.csi());
        contentValues.put("version", oqVar.rhi());
        contentValues.put("update_time", oqVar.rjo());
        if (z10) {
            com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().oq().kq("template_diff_new", contentValues, "id=?", new String[]{oqVar.oq()});
        } else {
            com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().oq().kq("template_diff_new", contentValues);
        }
        synchronized (this.fou) {
            this.rjo.put(oqVar.oq(), oqVar);
        }
        this.bob.add(oqVar.oq());
        if (z9) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().rhi() == null) {
                return;
            }
            if (this.csi == null) {
                this.csi = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.kq.bob.bob bobVar = new com.bytedance.sdk.component.adexpress.kq.bob.bob(oqVar.kq(), oqVar.oq(), oqVar.bob());
            this.csi.put(oqVar.oq(), bobVar);
            if (string != null) {
                com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().rhi();
                bobVar.oq();
            }
            com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().rhi();
            oqVar.kq();
        } catch (Throwable unused2) {
        }
    }

    void kq(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().oq() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                fou(strArr[i10]);
                com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().oq().kq("template_diff_new", "id=?", new String[]{strArr[i10]});
                bob(strArr[i10]);
            }
        }
    }
}
