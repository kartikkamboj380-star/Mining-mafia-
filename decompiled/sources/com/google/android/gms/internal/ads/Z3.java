package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
final class Z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f26093a = new P10(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26094b;

    private final long b(J1 j10) {
        int i10;
        P10 p10 = this.f26093a;
        C5946z1 c5946z1 = (C5946z1) j10;
        int i11 = 0;
        c5946z1.H(p10.H(), 0, 1, false);
        int i12 = p10.H()[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        int i14 = 0;
        while (true) {
            i10 = i14 + 1;
            if ((i12 & i13) != 0) {
                break;
            }
            i13 >>= 1;
            i14 = i10;
        }
        int i15 = i12 & (~i13);
        c5946z1.H(p10.H(), 1, i14, false);
        while (i11 < i14) {
            i11++;
            i15 = (p10.H()[i11] & 255) + (i15 << 8);
        }
        this.f26094b += i10;
        return i15;
    }

    public final boolean a(J1 j10) throws EOFException, InterruptedIOException {
        long jZzo = j10.zzo();
        long j11 = 1024;
        if (jZzo != -1 && jZzo <= 1024) {
            j11 = jZzo;
        }
        P10 p10 = this.f26093a;
        C5946z1 c5946z1 = (C5946z1) j10;
        c5946z1.H(p10.H(), 0, 4, false);
        this.f26094b = 4;
        for (long jY = p10.Y(); jY != 440786851; jY = ((jY << 8) & (-256)) | ((long) (p10.H()[0] & 255))) {
            int i10 = (int) j11;
            int i11 = this.f26094b + 1;
            this.f26094b = i11;
            if (i11 == i10) {
                return false;
            }
            c5946z1.H(p10.H(), 0, 1, false);
        }
        long jB = b(j10);
        long j12 = this.f26094b;
        if (jB != Long.MIN_VALUE) {
            long j13 = j12 + jB;
            if (jZzo == -1 || j13 < jZzo) {
                while (true) {
                    long j14 = this.f26094b;
                    if (j14 < j13) {
                        if (b(j10) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jB2 = b(j10);
                        if (jB2 < 0) {
                            return false;
                        }
                        if (jB2 != 0) {
                            int i12 = (int) jB2;
                            c5946z1.c(i12, false);
                            this.f26094b += i12;
                        }
                    } else if (j14 == j13) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
