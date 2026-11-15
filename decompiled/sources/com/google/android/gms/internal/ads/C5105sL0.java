package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5105sL0 extends OutputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f33142f = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33145c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33147e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33143a = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f33144b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f33146d = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];

    C5105sL0(int i10) {
    }

    private final void h(int i10) {
        this.f33144b.add(new C4979rL0(this.f33146d));
        int length = this.f33145c + this.f33146d.length;
        this.f33145c = length;
        this.f33146d = new byte[Math.max(this.f33143a, Math.max(i10, length >>> 1))];
        this.f33147e = 0;
    }

    public final synchronized AbstractC5231tL0 a() {
        try {
            int i10 = this.f33147e;
            byte[] bArr = this.f33146d;
            if (i10 >= bArr.length) {
                this.f33144b.add(new C4979rL0(this.f33146d));
                this.f33146d = f33142f;
            } else if (i10 > 0) {
                this.f33144b.add(new C4979rL0(Arrays.copyOf(bArr, i10)));
            }
            this.f33145c += this.f33147e;
            this.f33147e = 0;
        } catch (Throwable th) {
            throw th;
        }
        return AbstractC5231tL0.B(this.f33144b);
    }

    public final synchronized int c() {
        return this.f33145c + this.f33147e;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(c()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        try {
            if (this.f33147e == this.f33146d.length) {
                h(1);
            }
            byte[] bArr = this.f33146d;
            int i11 = this.f33147e;
            this.f33147e = i11 + 1;
            bArr[i11] = (byte) i10;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f33146d;
        int length = bArr2.length;
        int i12 = this.f33147e;
        int i13 = length - i12;
        if (i11 <= i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f33147e += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i13);
        int i14 = i11 - i13;
        h(i14);
        System.arraycopy(bArr, i10 + i13, this.f33146d, 0, i14);
        this.f33147e = i14;
    }
}
