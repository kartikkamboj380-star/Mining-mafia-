package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LA0 extends AbstractC2482Ty0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KA0 f20406a;

    private LA0(KA0 ka0) {
        this.f20406a = ka0;
    }

    public static LA0 b(KA0 ka0) {
        return new LA0(ka0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f20406a != KA0.f20117d;
    }

    public final KA0 c() {
        return this.f20406a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof LA0) && ((LA0) obj).f20406a == this.f20406a;
    }

    public final int hashCode() {
        return Objects.hash(LA0.class, this.f20406a);
    }

    public final String toString() {
        String string = this.f20406a.toString();
        StringBuilder sb = new StringBuilder(string.length() + 40);
        sb.append("XChaCha20Poly1305 Parameters (variant: ");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
