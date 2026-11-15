package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2744Yz0 extends AbstractC2482Ty0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2692Xz0 f26063b;

    private C2744Yz0(String str, C2692Xz0 c2692Xz0) {
        this.f26062a = str;
        this.f26063b = c2692Xz0;
    }

    public static C2744Yz0 b(String str, C2692Xz0 c2692Xz0) {
        return new C2744Yz0(str, c2692Xz0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f26063b != C2692Xz0.f25425c;
    }

    public final String c() {
        return this.f26062a;
    }

    public final C2692Xz0 d() {
        return this.f26063b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2744Yz0)) {
            return false;
        }
        C2744Yz0 c2744Yz0 = (C2744Yz0) obj;
        return c2744Yz0.f26062a.equals(this.f26062a) && c2744Yz0.f26063b.equals(this.f26063b);
    }

    public final int hashCode() {
        return Objects.hash(C2744Yz0.class, this.f26062a, this.f26063b);
    }

    public final String toString() {
        String string = this.f26063b.toString();
        String str = this.f26062a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + string.length() + 1);
        sb.append("LegacyKmsAead Parameters (keyUri: ");
        sb.append(str);
        sb.append(", variant: ");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
