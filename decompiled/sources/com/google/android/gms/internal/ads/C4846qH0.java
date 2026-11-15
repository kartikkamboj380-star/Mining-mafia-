package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4846qH0 extends AbstractC5603wI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4720pH0 f32610a;

    private C4846qH0(C4720pH0 c4720pH0) {
        this.f32610a = c4720pH0;
    }

    public static C4846qH0 b(C4720pH0 c4720pH0) {
        return new C4846qH0(c4720pH0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f32610a != C4720pH0.f32354e;
    }

    public final C4720pH0 c() {
        return this.f32610a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4846qH0) && ((C4846qH0) obj).f32610a == this.f32610a;
    }

    public final int hashCode() {
        return Objects.hash(C4846qH0.class, this.f32610a);
    }

    public final String toString() {
        String string = this.f32610a.toString();
        StringBuilder sb = new StringBuilder(string.length() + 30);
        sb.append("Ed25519 Parameters (variant: ");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
