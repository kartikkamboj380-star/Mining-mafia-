package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes2.dex */
public final class VM0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f24247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f24248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f24250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f24251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f24255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C5485vM0 f24256j;

    public VM0() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f24255i = cryptoInfo;
        this.f24256j = new C5485vM0(cryptoInfo, null);
    }

    public final void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f24252f = i10;
        this.f24250d = iArr;
        this.f24251e = iArr2;
        this.f24248b = bArr;
        this.f24247a = bArr2;
        this.f24249c = i11;
        this.f24253g = i12;
        this.f24254h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f24255i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        C5485vM0 c5485vM0 = this.f24256j;
        c5485vM0.getClass();
        c5485vM0.a(i12, i13);
    }

    public final MediaCodec.CryptoInfo b() {
        return this.f24255i;
    }

    public final void c(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f24250d == null) {
            int[] iArr = new int[1];
            this.f24250d = iArr;
            this.f24255i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f24250d;
        iArr2[0] = iArr2[0] + i10;
    }
}
