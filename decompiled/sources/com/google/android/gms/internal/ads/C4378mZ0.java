package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4378mZ0 implements InterfaceC4176ky0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4176ky0 f31538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4126kZ0 f31540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f31541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31542e;

    public C4378mZ0(InterfaceC4176ky0 interfaceC4176ky0, int i10, InterfaceC4126kZ0 interfaceC4126kZ0) {
        AbstractC2418Ss0.a(i10 > 0);
        this.f31538a = interfaceC4176ky0;
        this.f31539b = i10;
        this.f31540c = interfaceC4126kZ0;
        this.f31541d = new byte[1];
        this.f31542e = i10;
    }

    @Override // com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) {
        int i12 = this.f31542e;
        if (i12 == 0) {
            InterfaceC4176ky0 interfaceC4176ky0 = this.f31538a;
            byte[] bArr2 = this.f31541d;
            int i13 = 0;
            if (interfaceC4176ky0.F(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int iF = interfaceC4176ky0.F(bArr3, i13, i15);
                        if (iF != -1) {
                            i13 += iF;
                            i15 -= iF;
                        }
                    }
                    while (i14 > 0) {
                        int i16 = i14 - 1;
                        if (bArr3[i16] != 0) {
                            break;
                        }
                        i14 = i16;
                    }
                    if (i14 > 0) {
                        this.f31540c.a(new P10(bArr3, i14));
                    }
                }
                i12 = this.f31539b;
                this.f31542e = i12;
            }
            return -1;
        }
        int iF2 = this.f31538a.F(bArr, i10, Math.min(i12, i11));
        if (iF2 != -1) {
            this.f31542e -= iF2;
        }
        return iF2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final long a(C4454nA0 c4454nA0) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void b(GK0 gk0) {
        gk0.getClass();
        this.f31538a.b(gk0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0, com.google.android.gms.internal.ads.InterfaceC2962bI0
    public final Map d() {
        return this.f31538a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final Uri zzc() {
        return this.f31538a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void zzd() {
        throw new UnsupportedOperationException();
    }
}
