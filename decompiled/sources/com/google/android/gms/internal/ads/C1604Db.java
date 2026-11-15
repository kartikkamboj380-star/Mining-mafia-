package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1604Db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f18255a = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18257c;

    public C1604Db(byte[] bArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            this.f18255a[i10] = (byte) i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.f18255a;
            byte b10 = bArr2[i12];
            i11 = (i11 + b10 + bArr[i12 % bArr.length]) & 255;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b10;
        }
        this.f18256b = 0;
        this.f18257c = 0;
    }

    public final void a(byte[] bArr) {
        int i10 = this.f18256b;
        int i11 = this.f18257c;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.f18255a;
            i10 = (i10 + 1) & 255;
            byte b10 = bArr2[i10];
            i11 = (i11 + b10) & 255;
            bArr2[i10] = bArr2[i11];
            bArr2[i11] = b10;
            bArr[i12] = (byte) (bArr2[(bArr2[i10] + b10) & 255] ^ bArr[i12]);
        }
        this.f18256b = i10;
        this.f18257c = i11;
    }
}
