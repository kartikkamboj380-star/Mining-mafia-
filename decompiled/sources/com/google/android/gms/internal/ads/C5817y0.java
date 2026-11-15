package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5817y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5691x0 f35200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L0 f35201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35202c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f35205f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35208i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35212m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35203d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f35204e = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f35206g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f35207h = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f35209j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC3471fM f35210k = InterfaceC3471fM.f28270a;

    public C5817y0(Context context, InterfaceC5691x0 interfaceC5691x0, long j10) {
        this.f35200a = interfaceC5691x0;
        this.f35201b = new L0(context);
    }

    private final void o(int i10) {
        this.f35203d = Math.min(this.f35203d, i10);
    }

    public final void a(int i10) {
        if (i10 == 0) {
            this.f35203d = 1;
        } else if (i10 != 1) {
            o(2);
        } else {
            this.f35203d = 0;
        }
        this.f35201b.d();
    }

    public final void b() {
        this.f35202c = true;
        this.f35205f = AbstractC4634ob0.M(this.f35210k.zzb());
        this.f35201b.b();
    }

    public final void c() {
        this.f35202c = false;
        this.f35207h = -9223372036854775807L;
        this.f35201b.h();
    }

    public final void d(Surface surface) {
        this.f35211l = surface != null;
        this.f35212m = false;
        this.f35201b.c(surface);
        o(1);
    }

    public final void e(float f10) {
        this.f35201b.f(f10);
    }

    public final boolean f() {
        int i10 = this.f35203d;
        this.f35203d = 3;
        this.f35205f = AbstractC4634ob0.M(this.f35210k.zzb());
        return i10 != 3;
    }

    public final void g(InterfaceC3471fM interfaceC3471fM) {
        this.f35210k = interfaceC3471fM;
    }

    public final void h() {
        if (this.f35203d == 0) {
            this.f35203d = 1;
        }
    }

    public final boolean i(boolean z9) {
        if (z9 && (this.f35203d == 3 || (!this.f35211l && this.f35212m))) {
            this.f35207h = -9223372036854775807L;
            return true;
        }
        if (this.f35207h == -9223372036854775807L) {
            return false;
        }
        if (this.f35210k.zzb() < this.f35207h) {
            return true;
        }
        this.f35207h = -9223372036854775807L;
        return false;
    }

    public final void j(boolean z9) {
        this.f35208i = z9;
        this.f35207h = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
    
        if (r17 > 100000) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        if (r24 >= r28) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
    
        if (r21.f35202c != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(long r22, long r24, long r26, long r28, boolean r30, boolean r31, com.google.android.gms.internal.ads.C5565w0 r32) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5817y0.k(long, long, long, long, boolean, boolean, com.google.android.gms.internal.ads.w0):int");
    }

    public final void l() {
        this.f35201b.d();
        this.f35206g = -9223372036854775807L;
        this.f35204e = -9223372036854775807L;
        o(1);
        this.f35207h = -9223372036854775807L;
    }

    public final void m(int i10) {
        this.f35201b.a(i10);
    }

    public final void n(float f10) {
        AbstractC2418Ss0.a(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (f10 == this.f35209j) {
            return;
        }
        this.f35209j = f10;
        this.f35201b.e(f10);
    }
}
