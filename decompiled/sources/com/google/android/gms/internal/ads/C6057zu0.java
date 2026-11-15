package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6057zu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f35875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f35876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f35877c;

    C6057zu0(Object obj, Object obj2, Object obj3) {
        this.f35875a = obj;
        this.f35876b = obj2;
        this.f35877c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f35877c;
        Object obj2 = this.f35876b;
        Object obj3 = this.f35875a;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(obj3);
        String strValueOf4 = String.valueOf(obj);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 5 + strValueOf3.length() + 1 + strValueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
