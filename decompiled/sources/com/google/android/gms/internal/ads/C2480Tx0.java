package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2480Tx0 extends TimeoutException {
    /* synthetic */ C2480Tx0(String str, byte[] bArr) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
