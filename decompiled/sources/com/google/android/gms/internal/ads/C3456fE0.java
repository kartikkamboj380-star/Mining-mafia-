package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3456fE0 extends AbstractC3834iE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3330eE0 f28226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3205dE0 f28227d;

    /* synthetic */ C3456fE0(int i10, int i11, C3330eE0 c3330eE0, C3205dE0 c3205dE0, byte[] bArr) {
        this.f28224a = i10;
        this.f28225b = i11;
        this.f28226c = c3330eE0;
        this.f28227d = c3205dE0;
    }

    public static C3079cE0 b() {
        return new C3079cE0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f28226c != C3330eE0.f27725e;
    }

    public final int c() {
        return this.f28224a;
    }

    public final int d() {
        return this.f28225b;
    }

    public final int e() {
        C3330eE0 c3330eE0 = this.f28226c;
        if (c3330eE0 == C3330eE0.f27725e) {
            return this.f28225b;
        }
        if (c3330eE0 == C3330eE0.f27722b || c3330eE0 == C3330eE0.f27723c || c3330eE0 == C3330eE0.f27724d) {
            return this.f28225b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3456fE0)) {
            return false;
        }
        C3456fE0 c3456fE0 = (C3456fE0) obj;
        return c3456fE0.f28224a == this.f28224a && c3456fE0.e() == e() && c3456fE0.f28226c == this.f28226c && c3456fE0.f28227d == this.f28227d;
    }

    public final C3330eE0 f() {
        return this.f28226c;
    }

    public final C3205dE0 g() {
        return this.f28227d;
    }

    public final int hashCode() {
        return Objects.hash(C3456fE0.class, Integer.valueOf(this.f28224a), Integer.valueOf(this.f28225b), this.f28226c, this.f28227d);
    }

    public final String toString() {
        C3205dE0 c3205dE0 = this.f28227d;
        String strValueOf = String.valueOf(this.f28226c);
        String strValueOf2 = String.valueOf(c3205dE0);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i10 = this.f28225b;
        int length3 = String.valueOf(i10).length();
        int i11 = this.f28224a;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i11).length() + 10);
        sb.append("HMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", hashType: ");
        sb.append(strValueOf2);
        sb.append(", ");
        sb.append(i10);
        sb.append("-byte tags, and ");
        sb.append(i11);
        sb.append("-byte key)");
        return sb.toString();
    }
}
