package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class csi implements kq {
    private static final List<kq> bob;
    private static volatile csi kq;
    private static WeakReference<Context> oq;

    static {
        List<kq> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        bob = listSynchronizedList;
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.fou.bob());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.kq.oq());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.bob.kq());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.fou.kq.bob(new com.bytedance.sdk.component.rhi.kq.oq.oq.oq()));
        Iterator<kq> it = listSynchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private csi() {
    }

    private boolean bob(Uri uri) {
        return true;
    }

    public static csi kq(Context context) {
        if (context != null) {
            oq = new WeakReference<>(context.getApplicationContext());
        }
        if (kq == null) {
            synchronized (csi.class) {
                try {
                    if (kq == null) {
                        kq = new csi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }

    private kq oq(Uri uri) {
        if (uri == null || !bob(uri)) {
            return null;
        }
        String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (kq kqVar : bob) {
            if (str.equals(kqVar.kq())) {
                return kqVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    @NonNull
    public String kq() {
        return "";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public Cursor kq(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            kq kqVarOq = oq(uri);
            if (kqVarOq != null) {
                return kqVarOq.kq(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public String kq(@NonNull Uri uri) {
        try {
            kq kqVarOq = oq(uri);
            if (kqVarOq != null) {
                return kqVarOq.kq(uri);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public Uri kq(@NonNull Uri uri, ContentValues contentValues) {
        try {
            kq kqVarOq = oq(uri);
            if (kqVarOq != null) {
                return kqVarOq.kq(uri, contentValues);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public int kq(@NonNull Uri uri, String str, String[] strArr) {
        try {
            kq kqVarOq = oq(uri);
            if (kqVarOq != null) {
                return kqVarOq.kq(uri, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public int kq(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            kq kqVarOq = oq(uri);
            if (kqVarOq != null) {
                return kqVarOq.kq(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
