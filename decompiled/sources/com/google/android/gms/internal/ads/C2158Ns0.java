package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ns0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2158Ns0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2106Ms0 f21361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2106Ms0 f21362c;

    /* synthetic */ C2158Ns0(String str, byte[] bArr) {
        C2106Ms0 c2106Ms0 = new C2106Ms0();
        this.f21361b = c2106Ms0;
        this.f21362c = c2106Ms0;
        str.getClass();
        this.f21360a = str;
    }

    public final C2158Ns0 a(Object obj) {
        C2106Ms0 c2106Ms0 = new C2106Ms0();
        this.f21362c.f20943b = c2106Ms0;
        this.f21362c = c2106Ms0;
        c2106Ms0.f20942a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f21360a);
        sb.append('{');
        C2106Ms0 c2106Ms0 = this.f21361b.f20943b;
        String str = "";
        while (c2106Ms0 != null) {
            Object obj = c2106Ms0.f20942a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            c2106Ms0 = c2106Ms0.f20943b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
