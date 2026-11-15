package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class QD0 extends AbstractC3834iE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PD0 f22331c;

    /* synthetic */ QD0(int i10, int i11, PD0 pd0, byte[] bArr) {
        this.f22329a = i10;
        this.f22330b = i11;
        this.f22331c = pd0;
    }

    public static OD0 b() {
        return new OD0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f22331c != PD0.f22068e;
    }

    public final int c() {
        return this.f22329a;
    }

    public final int d() {
        return this.f22330b;
    }

    public final int e() {
        PD0 pd0 = this.f22331c;
        if (pd0 == PD0.f22068e) {
            return this.f22330b;
        }
        if (pd0 == PD0.f22065b || pd0 == PD0.f22066c || pd0 == PD0.f22067d) {
            return this.f22330b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof QD0)) {
            return false;
        }
        QD0 qd0 = (QD0) obj;
        return qd0.f22329a == this.f22329a && qd0.e() == e() && qd0.f22331c == this.f22331c;
    }

    public final PD0 f() {
        return this.f22331c;
    }

    public final int hashCode() {
        return Objects.hash(QD0.class, Integer.valueOf(this.f22329a), Integer.valueOf(this.f22330b), this.f22331c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f22331c);
        int length = strValueOf.length();
        int i10 = this.f22330b;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f22329a;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i11).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i10);
        sb.append("-byte tags, and ");
        sb.append(i11);
        sb.append("-byte key)");
        return sb.toString();
    }
}
