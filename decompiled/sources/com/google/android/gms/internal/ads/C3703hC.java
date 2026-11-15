package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3703hC implements InterfaceC3046bz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f28863c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f28864d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C5558vx f28865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C5558vx f28866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C5558vx f28867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C5558vx f28868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f28869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private GB f28870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ByteBuffer f28871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ByteBuffer f28872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f28873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f28874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f28875o;

    public C3703hC() {
        C5558vx c5558vx = C5558vx.f34193e;
        this.f28865e = c5558vx;
        this.f28866f = c5558vx;
        this.f28867g = c5558vx;
        this.f28868h = c5558vx;
        ByteBuffer byteBuffer = InterfaceC3046bz.f26964a;
        this.f28871k = byteBuffer;
        this.f28872l = byteBuffer;
        this.f28862b = -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final long a(long j10) {
        if (this.f28874n < 1024) {
            return (long) (j10 / ((double) this.f28863c));
        }
        long j11 = this.f28873m;
        GB gb = this.f28870j;
        gb.getClass();
        long jA = j11 - ((long) gb.a());
        int i10 = this.f28868h.f34194a;
        int i11 = this.f28867g.f34194a;
        return i10 == i11 ? AbstractC4634ob0.P(j10, this.f28874n, jA, RoundingMode.DOWN) : AbstractC4634ob0.P(j10, this.f28874n * ((long) i11), jA * ((long) i10), RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final ByteBuffer b() {
        int iF;
        GB gb = this.f28870j;
        if (gb != null && (iF = gb.f()) > 0) {
            if (this.f28871k.capacity() < iF) {
                this.f28871k = ByteBuffer.allocateDirect(iF).order(ByteOrder.nativeOrder());
            } else {
                this.f28871k.clear();
            }
            gb.c(this.f28871k);
            this.f28871k.flip();
            this.f28874n += (long) iF;
            this.f28872l = this.f28871k;
        }
        ByteBuffer byteBuffer = this.f28872l;
        this.f28872l = InterfaceC3046bz.f26964a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            GB gb = this.f28870j;
            gb.getClass();
            this.f28873m += (long) byteBuffer.remaining();
            gb.b(byteBuffer);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final void d() {
        this.f28863c = 1.0f;
        this.f28864d = 1.0f;
        C5558vx c5558vx = C5558vx.f34193e;
        this.f28865e = c5558vx;
        this.f28866f = c5558vx;
        this.f28867g = c5558vx;
        this.f28868h = c5558vx;
        ByteBuffer byteBuffer = InterfaceC3046bz.f26964a;
        this.f28871k = byteBuffer;
        this.f28872l = byteBuffer;
        this.f28862b = -1;
        this.f28869i = false;
        this.f28870j = null;
        this.f28873m = 0L;
        this.f28874n = 0L;
        this.f28875o = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final void e(C2739Yx c2739Yx) {
        if (zzc()) {
            C5558vx c5558vx = this.f28865e;
            this.f28867g = c5558vx;
            C5558vx c5558vx2 = this.f28866f;
            this.f28868h = c5558vx2;
            if (this.f28869i) {
                this.f28870j = new GB(c5558vx.f34194a, c5558vx.f34195b, this.f28863c, this.f28864d, c5558vx2.f34194a, c5558vx.f34196c == 4);
            } else {
                GB gb = this.f28870j;
                if (gb != null) {
                    gb.e();
                }
            }
        }
        this.f28872l = InterfaceC3046bz.f26964a;
        this.f28873m = 0L;
        this.f28874n = 0L;
        this.f28875o = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final C5558vx f(C5558vx c5558vx) throws C1494Ay {
        int i10 = c5558vx.f34196c;
        if (i10 != 2 && i10 != 4) {
            throw new C1494Ay("Unhandled input format:", c5558vx);
        }
        int i11 = this.f28862b;
        if (i11 == -1) {
            i11 = c5558vx.f34194a;
        }
        this.f28865e = c5558vx;
        C5558vx c5558vx2 = new C5558vx(i11, c5558vx.f34195b, i10);
        this.f28866f = c5558vx2;
        this.f28869i = true;
        return c5558vx2;
    }

    public final void g(float f10) {
        AbstractC2418Ss0.a(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.f28863c != f10) {
            this.f28863c = f10;
            this.f28869i = true;
        }
    }

    public final void h(float f10) {
        AbstractC2418Ss0.a(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.f28864d != f10) {
            this.f28864d = f10;
            this.f28869i = true;
        }
    }

    public final long i(long j10) {
        if (this.f28874n < 1024) {
            return (long) (((double) this.f28863c) * j10);
        }
        long j11 = this.f28873m;
        GB gb = this.f28870j;
        gb.getClass();
        long jA = j11 - ((long) gb.a());
        int i10 = this.f28868h.f34194a;
        int i11 = this.f28867g.f34194a;
        return i10 == i11 ? AbstractC4634ob0.P(j10, jA, this.f28874n, RoundingMode.DOWN) : AbstractC4634ob0.P(j10, jA * ((long) i10), this.f28874n * ((long) i11), RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final boolean zzc() {
        if (this.f28866f.f34194a != -1) {
            return Math.abs(this.f28863c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f28864d + (-1.0f)) >= 1.0E-4f || this.f28866f.f34194a != this.f28865e.f34194a;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final void zze() {
        GB gb = this.f28870j;
        if (gb != null) {
            gb.d();
        }
        this.f28875o = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final boolean zzg() {
        if (!this.f28875o) {
            return false;
        }
        GB gb = this.f28870j;
        return gb == null || gb.f() == 0;
    }
}
