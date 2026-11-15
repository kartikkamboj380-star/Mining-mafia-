package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class q extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f17167b;

    q(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f17167b = bArr;
    }

    @Override // com.google.android.gms.common.p
    final byte[] J() {
        return this.f17167b;
    }
}
