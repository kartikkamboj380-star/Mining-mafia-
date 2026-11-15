package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5623wS0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final C5637wZ0 f34558u = new C5637wZ0(new Object(), -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC5270tf f34559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5637wZ0 f34560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f34561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f34562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LQ0 f34564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f34565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A01 f34566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C4305m f34567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f34568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C5637wZ0 f34569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f34570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f34571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f34572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3122ca f34573o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f34574p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f34575q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f34576r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f34577s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f34578t;

    public C5623wS0(AbstractC5270tf abstractC5270tf, C5637wZ0 c5637wZ0, long j10, long j11, int i10, LQ0 lq0, boolean z9, A01 a01, C4305m c4305m, List list, C5637wZ0 c5637wZ1, boolean z10, int i11, int i12, C3122ca c3122ca, long j12, long j13, long j14, long j15, boolean z11) {
        this.f34559a = abstractC5270tf;
        this.f34560b = c5637wZ0;
        this.f34561c = j10;
        this.f34562d = j11;
        this.f34563e = i10;
        this.f34564f = lq0;
        this.f34565g = z9;
        this.f34566h = a01;
        this.f34567i = c4305m;
        this.f34568j = list;
        this.f34569k = c5637wZ1;
        this.f34570l = z10;
        this.f34571m = i11;
        this.f34572n = i12;
        this.f34573o = c3122ca;
        this.f34575q = j12;
        this.f34576r = j13;
        this.f34577s = j14;
        this.f34578t = j15;
    }

    public static C5623wS0 a(C4305m c4305m) {
        AbstractC5270tf abstractC5270tf = AbstractC5270tf.f33438a;
        C5637wZ0 c5637wZ0 = f34558u;
        return new C5623wS0(abstractC5270tf, c5637wZ0, -9223372036854775807L, 0L, 1, null, false, A01.f17221d, c4305m, AbstractC5931yu0.l(), c5637wZ0, false, 1, 0, C3122ca.f27149d, 0L, 0L, 0L, 0L, false);
    }

    public static C5637wZ0 b() {
        return f34558u;
    }

    public final C5623wS0 c(C5637wZ0 c5637wZ0, long j10, long j11, long j12, long j13, A01 a01, C4305m c4305m, List list) {
        C5637wZ0 c5637wZ1 = this.f34569k;
        boolean z9 = this.f34570l;
        int i10 = this.f34571m;
        int i11 = this.f34572n;
        C3122ca c3122ca = this.f34573o;
        long j14 = this.f34575q;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new C5623wS0(this.f34559a, c5637wZ0, j11, j12, this.f34563e, this.f34564f, this.f34565g, a01, c4305m, list, c5637wZ1, z9, i10, i11, c3122ca, j14, j13, j10, jElapsedRealtime, false);
    }

    public final C5623wS0 d(AbstractC5270tf abstractC5270tf) {
        return new C5623wS0(abstractC5270tf, this.f34560b, this.f34561c, this.f34562d, this.f34563e, this.f34564f, this.f34565g, this.f34566h, this.f34567i, this.f34568j, this.f34569k, this.f34570l, this.f34571m, this.f34572n, this.f34573o, this.f34575q, this.f34576r, this.f34577s, this.f34578t, false);
    }

    public final C5623wS0 e(int i10) {
        return new C5623wS0(this.f34559a, this.f34560b, this.f34561c, this.f34562d, i10, this.f34564f, this.f34565g, this.f34566h, this.f34567i, this.f34568j, this.f34569k, this.f34570l, this.f34571m, this.f34572n, this.f34573o, this.f34575q, this.f34576r, this.f34577s, this.f34578t, false);
    }

    public final C5623wS0 f(LQ0 lq0) {
        return new C5623wS0(this.f34559a, this.f34560b, this.f34561c, this.f34562d, this.f34563e, lq0, this.f34565g, this.f34566h, this.f34567i, this.f34568j, this.f34569k, this.f34570l, this.f34571m, this.f34572n, this.f34573o, this.f34575q, this.f34576r, this.f34577s, this.f34578t, false);
    }

    public final C5623wS0 g(boolean z9) {
        return new C5623wS0(this.f34559a, this.f34560b, this.f34561c, this.f34562d, this.f34563e, this.f34564f, z9, this.f34566h, this.f34567i, this.f34568j, this.f34569k, this.f34570l, this.f34571m, this.f34572n, this.f34573o, this.f34575q, this.f34576r, this.f34577s, this.f34578t, false);
    }

    public final C5623wS0 h(C5637wZ0 c5637wZ0) {
        return new C5623wS0(this.f34559a, this.f34560b, this.f34561c, this.f34562d, this.f34563e, this.f34564f, this.f34565g, this.f34566h, this.f34567i, this.f34568j, c5637wZ0, this.f34570l, this.f34571m, this.f34572n, this.f34573o, this.f34575q, this.f34576r, this.f34577s, this.f34578t, false);
    }

    public final C5623wS0 i(boolean z9, int i10, int i11) {
        return new C5623wS0(this.f34559a, this.f34560b, this.f34561c, this.f34562d, this.f34563e, this.f34564f, this.f34565g, this.f34566h, this.f34567i, this.f34568j, this.f34569k, z9, i10, i11, this.f34573o, this.f34575q, this.f34576r, this.f34577s, this.f34578t, false);
    }

    public final boolean j() {
        return this.f34563e == 3 && this.f34570l && this.f34572n == 0;
    }
}
