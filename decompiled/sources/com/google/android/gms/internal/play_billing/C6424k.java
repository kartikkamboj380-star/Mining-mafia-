package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6424k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f37241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f37242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f37243c;

    C6424k(Object obj, Object obj2, Object obj3) {
        this.f37241a = obj;
        this.f37242b = obj2;
        this.f37243c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f37243c;
        Object obj2 = this.f37242b;
        Object obj3 = this.f37241a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
