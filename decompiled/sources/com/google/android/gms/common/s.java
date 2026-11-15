package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
abstract class s extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final WeakReference f17171c = new WeakReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f17172b;

    s(byte[] bArr) {
        super(bArr);
        this.f17172b = f17171c;
    }

    @Override // com.google.android.gms.common.p
    final byte[] J() {
        byte[] bArrN0;
        synchronized (this) {
            try {
                bArrN0 = (byte[]) this.f17172b.get();
                if (bArrN0 == null) {
                    bArrN0 = N0();
                    this.f17172b = new WeakReference(bArrN0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrN0;
    }

    protected abstract byte[] N0();
}
