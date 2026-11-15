package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2915aw implements InterfaceC4176ky0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4176ky0 f26668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4176ky0 f26670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f26671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Uri f26672e;

    C2915aw(InterfaceC4176ky0 interfaceC4176ky0, int i10, InterfaceC4176ky0 interfaceC4176ky1) {
        this.f26668a = interfaceC4176ky0;
        this.f26669b = i10;
        this.f26670c = interfaceC4176ky1;
    }

    @Override // com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) {
        int i12;
        long j10 = this.f26671d;
        long j11 = this.f26669b;
        if (j10 < j11) {
            int iF = this.f26668a.F(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.f26671d + ((long) iF);
            this.f26671d = j12;
            i12 = iF;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < j11) {
            return i12;
        }
        int iF2 = this.f26670c.F(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + iF2;
        this.f26671d += (long) iF2;
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final long a(C4454nA0 c4454nA0) {
        Uri uri;
        C4454nA0 c4454nA1;
        Uri uri2 = c4454nA0.f31730a;
        this.f26672e = uri2;
        long j10 = c4454nA0.f31734e;
        long j11 = this.f26669b;
        C4454nA0 c4454nA2 = null;
        if (j10 >= j11) {
            uri = uri2;
            c4454nA1 = null;
        } else {
            long j12 = c4454nA0.f31735f;
            long jMin = j11 - j10;
            if (j12 != -1) {
                jMin = Math.min(j12, jMin);
            }
            uri = uri2;
            c4454nA1 = new C4454nA0(uri, j10, jMin, null);
        }
        long j13 = c4454nA0.f31735f;
        if (j13 == -1 || j10 + j13 > j11) {
            c4454nA2 = new C4454nA0(uri, Math.max(j11, j10), j13 != -1 ? Math.min(j13, (j10 + j13) - j11) : -1L, null);
        }
        long jA = c4454nA1 != null ? this.f26668a.a(c4454nA1) : 0L;
        long jA2 = c4454nA2 != null ? this.f26670c.a(c4454nA2) : 0L;
        this.f26671d = j10;
        if (jA == -1 || jA2 == -1) {
            return -1L;
        }
        return jA + jA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void b(GK0 gk0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0, com.google.android.gms.internal.ads.InterfaceC2962bI0
    public final Map d() {
        return AbstractC1539Bu0.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final Uri zzc() {
        return this.f26672e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void zzd() {
        this.f26668a.zzd();
        this.f26670c.zzd();
    }
}
