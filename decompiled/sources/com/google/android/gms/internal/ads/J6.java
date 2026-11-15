package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class J6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f19756e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f19760d = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];

    public J6(int i10) {
    }

    public final void a() {
        this.f19757a = false;
        this.f19758b = 0;
        this.f19759c = 0;
    }

    public final boolean b(int i10, int i11) {
        if (this.f19757a) {
            int i12 = this.f19758b - i11;
            this.f19758b = i12;
            if (this.f19759c != 0 || i10 != 181) {
                this.f19757a = false;
                return true;
            }
            this.f19759c = i12;
        } else if (i10 == 179) {
            this.f19757a = true;
        }
        c(f19756e, 0, 3);
        return false;
    }

    public final void c(byte[] bArr, int i10, int i11) {
        if (this.f19757a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f19760d;
            int length = bArr2.length;
            int i13 = this.f19758b + i12;
            if (length < i13) {
                this.f19760d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f19760d, this.f19758b, i12);
            this.f19758b += i12;
        }
    }
}
