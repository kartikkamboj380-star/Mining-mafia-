package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Iz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1913Iz0 extends AbstractC2482Ty0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1861Hz0 f19704b;

    /* synthetic */ C1913Iz0(int i10, C1861Hz0 c1861Hz0, byte[] bArr) {
        this.f19703a = i10;
        this.f19704b = c1861Hz0;
    }

    public static C1809Gz0 b() {
        return new C1809Gz0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f19704b != C1861Hz0.f19427d;
    }

    public final int c() {
        return this.f19703a;
    }

    public final C1861Hz0 d() {
        return this.f19704b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1913Iz0)) {
            return false;
        }
        C1913Iz0 c1913Iz0 = (C1913Iz0) obj;
        return c1913Iz0.f19703a == this.f19703a && c1913Iz0.f19704b == this.f19704b;
    }

    public final int hashCode() {
        return Objects.hash(C1913Iz0.class, Integer.valueOf(this.f19703a), this.f19704b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19704b);
        int length = strValueOf.length();
        int i10 = this.f19703a;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i10).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i10);
        sb.append("-byte key)");
        return sb.toString();
    }
}
