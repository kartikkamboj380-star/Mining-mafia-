package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class VJ0 implements LE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final LE0 f24237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final LE0 f24238b;

    /* synthetic */ VJ0(LE0 le0, LE0 le1, byte[] bArr) {
        this.f24237a = le0;
        this.f24238b = le1;
    }

    @Override // com.google.android.gms.internal.ads.LE0
    public final byte[] a(byte[] bArr, int i10) {
        return bArr.length <= 64 ? this.f24237a.a(bArr, i10) : this.f24238b.a(bArr, i10);
    }
}
