package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1744Ft {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f18861a = BigInteger.ONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18862b = "0";

    public final synchronized String a() {
        String string;
        string = this.f18861a.toString();
        this.f18861a = this.f18861a.add(BigInteger.ONE);
        this.f18862b = string;
        return string;
    }

    public final synchronized String b() {
        return this.f18862b;
    }
}
