package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class Q8 implements T8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ File f22316a;

    Q8(U8 u10, File file) {
        this.f22316a = file;
        Objects.requireNonNull(u10);
    }

    @Override // com.google.android.gms.internal.ads.T8
    public final File zza() {
        return this.f22316a;
    }
}
