package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class L6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f20375f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f20376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f20380e = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];

    public L6(int i10) {
    }

    public final void a() {
        this.f20376a = false;
        this.f20378c = 0;
        this.f20377b = 0;
    }

    public final boolean b(int i10, int i11) {
        int i12 = this.f20377b;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i10 == 179 || i10 == 181) {
                            this.f20378c -= i11;
                            this.f20376a = false;
                            return true;
                        }
                    } else if ((i10 & 240) != 32) {
                        YU.c("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.f20379d = this.f20378c;
                        this.f20377b = 4;
                    }
                } else if (i10 > 31) {
                    YU.c("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.f20377b = 3;
                }
            } else if (i10 != 181) {
                YU.c("H263Reader", "Unexpected start code value");
                a();
            } else {
                this.f20377b = 2;
            }
        } else if (i10 == 176) {
            this.f20377b = 1;
            this.f20376a = true;
        }
        c(f20375f, 0, 3);
        return false;
    }

    public final void c(byte[] bArr, int i10, int i11) {
        if (this.f20376a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f20380e;
            int length = bArr2.length;
            int i13 = this.f20378c + i12;
            if (length < i13) {
                this.f20380e = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f20380e, this.f20378c, i12);
            this.f20378c += i12;
        }
    }
}
