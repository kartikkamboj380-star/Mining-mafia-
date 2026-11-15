package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class EA0 extends AbstractC2482Ty0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DA0 f18427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18428b;

    private EA0(DA0 da0, int i10) {
        this.f18427a = da0;
        this.f18428b = i10;
    }

    public static EA0 b(DA0 da0, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new EA0(da0, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f18427a != DA0.f18101c;
    }

    public final DA0 c() {
        return this.f18427a;
    }

    public final int d() {
        return this.f18428b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EA0)) {
            return false;
        }
        EA0 ea0 = (EA0) obj;
        return ea0.f18427a == this.f18427a && ea0.f18428b == this.f18428b;
    }

    public final int hashCode() {
        return Objects.hash(EA0.class, this.f18427a, Integer.valueOf(this.f18428b));
    }

    public final String toString() {
        String string = this.f18427a.toString();
        int length = string.length();
        int i10 = this.f18428b;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i10).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(string);
        sb.append("salt_size_bytes: ");
        sb.append(i10);
        sb.append(")");
        return sb.toString();
    }
}
