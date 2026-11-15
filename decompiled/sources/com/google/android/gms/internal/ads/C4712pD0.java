package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4712pD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f32346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f32347b;

    /* synthetic */ C4712pD0(Class cls, Class cls2, byte[] bArr) {
        this.f32346a = cls;
        this.f32347b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4712pD0)) {
            return false;
        }
        C4712pD0 c4712pD0 = (C4712pD0) obj;
        return c4712pD0.f32346a.equals(this.f32346a) && c4712pD0.f32347b.equals(this.f32347b);
    }

    public final int hashCode() {
        return Objects.hash(this.f32346a, this.f32347b);
    }

    public final String toString() {
        Class cls = this.f32347b;
        String simpleName = this.f32346a.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        StringBuilder sb = new StringBuilder(simpleName.length() + 22 + simpleName2.length());
        sb.append(simpleName);
        sb.append(" with primitive type: ");
        sb.append(simpleName2);
        return sb.toString();
    }
}
