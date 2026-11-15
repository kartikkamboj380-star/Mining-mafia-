package com.bytedance.sdk.openadsdk.multipro.kq;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.rhi.kq.rhi;
import com.bytedance.sdk.openadsdk.core.csi;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.multipro.fou;
import com.bytedance.sdk.openadsdk.utils.wol;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    public static rhi kq;
    private static final ConcurrentHashMap<String, Object> oq = new ConcurrentHashMap<>();

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x000f A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    public static rhi kq(Context context) {
        if (context == null) {
            try {
                sns.kq();
                if (kq == null) {
                    if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                        kq = rhi.kq.kq(com.bytedance.sdk.openadsdk.multipro.aidl.kq.kq().kq(5));
                    } else {
                        kq = com.bytedance.sdk.openadsdk.multipro.aidl.kq.rhi.oq();
                    }
                }
            } catch (Throwable unused) {
                wol.syt("binder error");
            }
        } else if (kq == null) {
            if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                kq = rhi.kq.kq(com.bytedance.sdk.openadsdk.multipro.aidl.kq.kq().kq(5));
            } else {
                kq = com.bytedance.sdk.openadsdk.multipro.aidl.kq.rhi.oq();
            }
        }
        return kq;
    }

    private static String kq() {
        return fou.oq + "/t_db/ttopensdk.db/";
    }

    public static void kq(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (kq(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                        csi.kq(context).kq().kq(str, (String) null, contentValues);
                        return;
                    }
                    rhi rhiVarKq = kq(context);
                    if (rhiVarKq != null) {
                        rhiVarKq.kq(Uri.parse(kq() + str), contentValues);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static int kq(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (kq(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                        return csi.kq(context).kq().kq(str, str2, strArr);
                    }
                    rhi rhiVarKq = kq(context);
                    if (rhiVarKq != null) {
                        return rhiVarKq.kq(Uri.parse(kq() + str), str2, strArr);
                    }
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static int kq(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (kq(str)) {
                try {
                    try {
                        if (!com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                            return csi.kq(context).kq().kq(str, contentValues, str2, strArr);
                        }
                        rhi rhiVarKq = kq(context);
                        if (rhiVarKq != null) {
                            return rhiVarKq.kq(Uri.parse(kq() + str), contentValues, str2, strArr);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return 0;
    }

    public static Map<String, List<String>> kq(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (kq(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                        return kq(csi.kq(context).kq().kq(str, strArr, str2, strArr2, str3, str4, str5));
                    }
                    rhi rhiVarKq = kq(context);
                    if (rhiVarKq != null) {
                        return rhiVarKq.kq(Uri.parse(kq() + str), strArr, str2, strArr2, str5);
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static Map<String, List<String>> kq(Cursor cursor) {
        HashMap map = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!map.containsKey(str)) {
                            map.put(str, new LinkedList());
                        }
                        ((List) map.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
                cursor.close();
                return map;
            } catch (Throwable unused) {
                cursor.close();
            }
        }
        return map;
    }

    private static Object kq(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = oq;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (kq.class) {
            try {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
