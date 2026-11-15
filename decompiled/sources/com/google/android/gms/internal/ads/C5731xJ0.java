package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5731xJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f34790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f34791b;

    private C5731xJ0(byte[] bArr, byte[] bArr2) {
        this.f34790a = bArr;
        this.f34791b = bArr2;
    }

    public static C5731xJ0 c() {
        byte[] bArrA = AbstractC5845yD0.a(32);
        if (bArrA.length == 32) {
            return new C5731xJ0(AbstractC3452fC0.a(AbstractC3452fC0.b(bArrA)), bArrA);
        }
        throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
    }

    public final byte[] a() {
        return Arrays.copyOf(this.f34790a, 32);
    }

    public final byte[] b() {
        byte[] bArr = this.f34791b;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
