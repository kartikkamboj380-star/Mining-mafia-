package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class fax {
    private static final Map<Integer, kq<?, ?>> kq = new ConcurrentHashMap();

    public static kq<?, ?> kq(Context context, int i10) {
        kq<?, ?> kqVarOq;
        Map<Integer, kq<?, ?>> map = kq;
        kq<?, ?> kqVar = map.get(Integer.valueOf(i10));
        if (kqVar != null) {
            return kqVar;
        }
        synchronized (fax.class) {
            try {
                kqVarOq = map.get(Integer.valueOf(i10));
                if (kqVarOq == null) {
                    kqVarOq = oq(context, i10);
                    map.put(Integer.valueOf(i10), kqVarOq);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kqVarOq;
    }

    private static kq<?, ?> oq(Context context, int i10) {
        if (i10 == 7) {
            return new sns(context);
        }
        if (i10 == 8) {
            return new rjo(context);
        }
        throw new IllegalArgumentException("Unsupported ad type: ".concat(String.valueOf(i10)));
    }
}
