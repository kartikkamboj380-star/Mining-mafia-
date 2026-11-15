package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5733xK0 extends AbstractC5859yK0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5859yK0 f34792a;

    /* synthetic */ C5733xK0(AbstractC5859yK0 abstractC5859yK0, byte[] bArr) {
        Objects.requireNonNull(abstractC5859yK0);
        this.f34792a = abstractC5859yK0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5859yK0
    public final void a(ZK0 zk0, Object obj) {
        throw null;
    }

    public final String toString() {
        String string = this.f34792a.toString();
        StringBuilder sb = new StringBuilder(string.length() + 21);
        sb.append("NullSafeTypeAdapter[");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
