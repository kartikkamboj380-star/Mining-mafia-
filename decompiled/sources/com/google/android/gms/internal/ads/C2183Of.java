package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2183Of extends PushbackInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2339Rf f21626a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2183Of(C2339Rf c2339Rf, InputStream inputStream, int i10) {
        super(inputStream, 1);
        Objects.requireNonNull(c2339Rf);
        this.f21626a = c2339Rf;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f21626a.f22883c.b();
        super.close();
    }
}
