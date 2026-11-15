package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5438v implements InterfaceC4683p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33966c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4431n[] f33967d = new C4431n[100];

    public C5438v(boolean z9, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4683p
    public final synchronized void a(C4431n c4431n) {
        C4431n[] c4431nArr = this.f33967d;
        int i10 = this.f33966c;
        this.f33966c = i10 + 1;
        c4431nArr[i10] = c4431n;
        this.f33965b--;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4683p
    public final synchronized void b(InterfaceC4557o interfaceC4557o) {
        while (interfaceC4557o != null) {
            try {
                C4431n[] c4431nArr = this.f33967d;
                int i10 = this.f33966c;
                this.f33966c = i10 + 1;
                c4431nArr[i10] = interfaceC4557o.zzd();
                this.f33965b--;
                interfaceC4557o = interfaceC4557o.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void c() {
        d(0);
    }

    public final synchronized void d(int i10) {
        int i11 = this.f33964a;
        this.f33964a = i10;
        if (i10 < i11) {
            zzd();
        }
    }

    public final synchronized int e() {
        return this.f33965b * 65536;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4683p
    public final synchronized C4431n zza() {
        C4431n c4431n;
        try {
            this.f33965b++;
            int i10 = this.f33966c;
            if (i10 > 0) {
                C4431n[] c4431nArr = this.f33967d;
                int i11 = i10 - 1;
                this.f33966c = i11;
                c4431n = c4431nArr[i11];
                if (c4431n == null) {
                    throw null;
                }
                c4431nArr[i11] = null;
            } else {
                c4431n = new C4431n(new byte[65536], 0);
                int i12 = this.f33965b;
                C4431n[] c4431nArr2 = this.f33967d;
                int length = c4431nArr2.length;
                if (i12 > length) {
                    this.f33967d = (C4431n[]) Arrays.copyOf(c4431nArr2, length + length);
                    return c4431n;
                }
            }
            return c4431n;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4683p
    public final synchronized void zzd() {
        int i10 = this.f33964a;
        String str = AbstractC4634ob0.f32117a;
        int iMax = Math.max(0, ((i10 + 65535) / 65536) - this.f33965b);
        int i11 = this.f33966c;
        if (iMax >= i11) {
            return;
        }
        Arrays.fill(this.f33967d, iMax, i11, (Object) null);
        this.f33966c = iMax;
    }
}
