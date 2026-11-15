package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3588gH0 extends AbstractC5603wI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3336eH0 f28610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3085cH0 f28611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3211dH0 f28612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3462fH0 f28613d;

    /* synthetic */ C3588gH0(C3336eH0 c3336eH0, C3085cH0 c3085cH0, C3211dH0 c3211dH0, C3462fH0 c3462fH0, byte[] bArr) {
        this.f28610a = c3336eH0;
        this.f28611b = c3085cH0;
        this.f28612c = c3211dH0;
        this.f28613d = c3462fH0;
    }

    public static C2960bH0 b() {
        return new C2960bH0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f28613d != C3462fH0.f28236e;
    }

    public final C3336eH0 c() {
        return this.f28610a;
    }

    public final C3085cH0 d() {
        return this.f28611b;
    }

    public final C3211dH0 e() {
        return this.f28612c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3588gH0)) {
            return false;
        }
        C3588gH0 c3588gH0 = (C3588gH0) obj;
        return c3588gH0.f28610a == this.f28610a && c3588gH0.f28611b == this.f28611b && c3588gH0.f28612c == this.f28612c && c3588gH0.f28613d == this.f28613d;
    }

    public final C3462fH0 f() {
        return this.f28613d;
    }

    public final int hashCode() {
        return Objects.hash(C3588gH0.class, this.f28610a, this.f28611b, this.f28612c, this.f28613d);
    }

    public final String toString() {
        String string = this.f28613d.toString();
        int length = string.length();
        String string2 = this.f28612c.toString();
        int length2 = string2.length();
        String string3 = this.f28610a.toString();
        int length3 = string3.length();
        String string4 = this.f28611b.toString();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + string4.length() + 1);
        sb.append("ECDSA Parameters (variant: ");
        sb.append(string);
        sb.append(", hashType: ");
        sb.append(string2);
        sb.append(", encoding: ");
        sb.append(string3);
        sb.append(", curve: ");
        sb.append(string4);
        sb.append(")");
        return sb.toString();
    }
}
