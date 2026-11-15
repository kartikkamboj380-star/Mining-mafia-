package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class VC0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final VC0 f24213b = new VC0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f24214a = new HashMap();

    VC0() {
    }

    public static VC0 a() {
        return f24213b;
    }

    public final synchronized void b(String str, AbstractC1495Ay0 abstractC1495Ay0) {
        try {
            Map map = this.f24214a;
            if (!map.containsKey(str)) {
                map.put(str, abstractC1495Ay0);
                return;
            }
            if (((AbstractC1495Ay0) map.get(str)).equals(abstractC1495Ay0)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(abstractC1495Ay0);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb.append("Parameters object with name ");
            sb.append(str);
            sb.append(" already exists (");
            sb.append(strValueOf);
            sb.append("), cannot insert ");
            sb.append(strValueOf2);
            throw new GeneralSecurityException(sb.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized AbstractC1495Ay0 c(String str) {
        Map map;
        map = this.f24214a;
        if (!map.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (AbstractC1495Ay0) map.get("AES128_GCM");
    }

    public final synchronized void d(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            b((String) entry.getKey(), (AbstractC1495Ay0) entry.getValue());
        }
    }
}
