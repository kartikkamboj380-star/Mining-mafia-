package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4305m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HS0[] f31401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3299e[] f31402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3395el f31403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f31404e;

    public C4305m(HS0[] hs0Arr, InterfaceC3299e[] interfaceC3299eArr, C3395el c3395el, Object obj) {
        int length = hs0Arr.length;
        AbstractC2418Ss0.a(length == interfaceC3299eArr.length);
        this.f31401b = hs0Arr;
        this.f31402c = (InterfaceC3299e[]) interfaceC3299eArr.clone();
        this.f31403d = c3395el;
        this.f31404e = obj;
        this.f31400a = length;
    }

    public final boolean a(int i10) {
        return this.f31401b[i10] != null;
    }

    public final boolean b(C4305m c4305m, int i10) {
        return c4305m != null && Objects.equals(this.f31401b[i10], c4305m.f31401b[i10]) && Objects.equals(this.f31402c[i10], c4305m.f31402c[i10]);
    }
}
