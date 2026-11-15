package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class KE0 extends NE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20159a;

    private KE0(int i10) {
        this.f20159a = i10;
    }

    public static KE0 b(int i10) throws InvalidAlgorithmParameterException {
        if (i10 == 16 || i10 == 32) {
            return new KE0(i10);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i10 * 8)));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return false;
    }

    public final int c() {
        return this.f20159a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof KE0) && ((KE0) obj).f20159a == this.f20159a;
    }

    public final int hashCode() {
        return Objects.hash(KE0.class, Integer.valueOf(this.f20159a));
    }

    public final String toString() {
        int i10 = this.f20159a;
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 34);
        sb.append("AesCmac PRF Parameters (");
        sb.append(i10);
        sb.append("-byte key)");
        return sb.toString();
    }
}
