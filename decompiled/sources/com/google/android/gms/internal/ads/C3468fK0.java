package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3468fK0 implements InterfaceC4176ky0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4176ky0 f28257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f28258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f28259c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f28260d = Collections.EMPTY_MAP;

    public C3468fK0(InterfaceC4176ky0 interfaceC4176ky0) {
        this.f28257a = interfaceC4176ky0;
    }

    @Override // com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) {
        int iF = this.f28257a.F(bArr, i10, i11);
        if (iF != -1) {
            this.f28258b += (long) iF;
        }
        return iF;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final long a(C4454nA0 c4454nA0) {
        this.f28259c = c4454nA0.f31730a;
        this.f28260d = Collections.EMPTY_MAP;
        try {
            long jA = this.f28257a.a(c4454nA0);
            if (zzc() != null) {
            }
            return jA;
        } finally {
            Uri uriZzc = zzc();
            if (uriZzc != null) {
                this.f28259c = uriZzc;
            }
            this.f28260d = d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void b(GK0 gk0) {
        gk0.getClass();
        this.f28257a.b(gk0);
    }

    public final long c() {
        return this.f28258b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0, com.google.android.gms.internal.ads.InterfaceC2962bI0
    public final Map d() {
        return this.f28257a.d();
    }

    public final Uri f() {
        return this.f28259c;
    }

    public final Map g() {
        return this.f28260d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final Uri zzc() {
        return this.f28257a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void zzd() {
        this.f28257a.zzd();
    }
}
