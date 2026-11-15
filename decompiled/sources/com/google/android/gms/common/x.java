package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class x extends zzy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Callable f17193a;

    /* synthetic */ x(Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.f17193a = callable;
    }

    @Override // com.google.android.gms.common.zzy
    final String zza() {
        try {
            return (String) this.f17193a.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
