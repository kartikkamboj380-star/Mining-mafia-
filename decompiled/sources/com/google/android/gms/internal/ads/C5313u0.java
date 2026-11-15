package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5313u0 implements InterfaceC3025bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1472An f33662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f33663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f33664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3303e1 f33665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3471fM f33666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArraySet f33667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f33668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C5943z0 f33669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C4074k90 f33670j = new C4074k90(10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JY0 f33671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC4739pR f33672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Pair f33673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f33675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f33676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f33677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f33678r;

    /* synthetic */ C5313u0(C4306m0 c4306m0, byte[] bArr) {
        this.f33661a = c4306m0.e();
        InterfaceC1472An interfaceC1472AnG = c4306m0.g();
        interfaceC1472AnG.getClass();
        this.f33662b = interfaceC1472AnG;
        this.f33663c = new SparseArray();
        AbstractC5931yu0.l();
        this.f33664d = c4306m0.h();
        InterfaceC3471fM interfaceC3471fMI = c4306m0.i();
        this.f33666f = interfaceC3471fMI;
        this.f33668h = c4306m0.j() != -9223372036854775807L ? -c4306m0.j() : -9223372036854775807L;
        C5943z0 c5943z0K = c4306m0.k();
        this.f33669i = c5943z0K;
        this.f33665e = new X(c4306m0.f(), c5943z0K, interfaceC3471fMI);
        new C4180l0(this);
        this.f33667g = new CopyOnWriteArraySet();
        this.f33671k = new C5507vX0().m();
        this.f33676p = -9223372036854775807L;
        this.f33677q = -9223372036854775807L;
        this.f33678r = -1;
        this.f33675o = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3470fL0 c(C3470fL0 c3470fL0) {
        return (c3470fL0 == null || !c3470fL0.f()) ? C3470fL0.f28262h : c3470fL0;
    }

    final /* synthetic */ void A(C4074k90 c4074k90) {
        this.f33670j = c4074k90;
    }

    final /* synthetic */ long B() {
        return this.f33676p;
    }

    final /* synthetic */ long C() {
        return this.f33677q;
    }

    final /* synthetic */ void a(long j10) {
        this.f33677q = j10;
    }

    public final void d(int i10) {
        this.f33678r = 1;
    }

    public final InterfaceC3303e1 e(int i10) {
        SparseArray sparseArray = this.f33663c;
        if (AbstractC4634ob0.w(sparseArray, 0)) {
            return (InterfaceC3303e1) sparseArray.get(0);
        }
        C4558o0 c4558o0 = new C4558o0(this, this.f33661a, 0);
        this.f33667g.add(c4558o0);
        sparseArray.put(0, c4558o0);
        return c4558o0;
    }

    public final void f(Surface surface, C4816q20 c4816q20) {
        Pair pair = this.f33673m;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C4816q20) this.f33673m.second).equals(c4816q20)) {
            return;
        }
        this.f33673m = Pair.create(surface, c4816q20);
        c4816q20.a();
        c4816q20.b();
    }

    public final void g() {
        C4816q20 c4816q20 = C4816q20.f32548c;
        c4816q20.a();
        c4816q20.b();
        this.f33673m = null;
    }

    public final void h() {
        this.f33665e.zza();
    }

    public final void i() {
        this.f33665e.zzb();
    }

    public final void j() {
        if (this.f33675o == 2) {
            return;
        }
        InterfaceC4739pR interfaceC4739pR = this.f33672l;
        if (interfaceC4739pR != null) {
            interfaceC4739pR.h(null);
        }
        this.f33673m = null;
        this.f33675o = 2;
    }

    final /* synthetic */ void k() {
        this.f33674n--;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[Catch: MP -> 0x0031, TRY_LEAVE, TryCatch #0 {MP -> 0x0031, blocks: (B:7:0x0010, B:9:0x0015, B:11:0x001b, B:14:0x0023, B:18:0x0034, B:20:0x003a, B:23:0x0041, B:28:0x0062), top: B:34:0x0010 }] */
    final /* synthetic */ boolean l(JY0 jy0, int i10) throws C3178d1 {
        AbstractC2418Ss0.i(this.f33675o == 0);
        C3470fL0 c3470fL0C = c(jy0.f19904E);
        try {
            int i11 = c3470fL0C.f28265c;
            if (i11 != 7) {
                if (AbstractC4485nQ.c(i11) && Build.VERSION.SDK_INT >= 29) {
                    Object[] objArr = {Integer.valueOf(i11)};
                    String str = AbstractC4634ob0.f32117a;
                    YU.c("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr));
                    c3470fL0C = C3470fL0.f28262h;
                } else if (i11 != 2 || i11 == 10) {
                    c3470fL0C = C3470fL0.f28262h;
                }
            } else if (Build.VERSION.SDK_INT >= 34 || !AbstractC4485nQ.d()) {
                i11 = 7;
                if (AbstractC4485nQ.c(i11)) {
                    if (i11 != 2) {
                        c3470fL0C = C3470fL0.f28262h;
                    } else {
                        c3470fL0C = C3470fL0.f28262h;
                    }
                } else if (i11 != 2) {
                    c3470fL0C = C3470fL0.f28262h;
                } else {
                    c3470fL0C = C3470fL0.f28262h;
                }
            } else {
                C1909Ix0 c1909Ix0D = c3470fL0C.d();
                c1909Ix0D.c(6);
                c3470fL0C = c1909Ix0D.g();
            }
            C3470fL0 c3470fL0 = c3470fL0C;
            InterfaceC3471fM interfaceC3471fM = this.f33666f;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            final InterfaceC4739pR interfaceC4739pRA = interfaceC3471fM.a(looperMyLooper, null);
            this.f33672l = interfaceC4739pRA;
            InterfaceC1472An interfaceC1472An = this.f33662b;
            Context context = this.f33661a;
            TR0 tr0 = TR0.f23512a;
            Objects.requireNonNull(interfaceC4739pRA);
            interfaceC1472An.a(context, c3470fL0, tr0, this, new Executor() { // from class: com.google.android.gms.internal.ads.n0
                @Override // java.util.concurrent.Executor
                public final /* synthetic */ void execute(Runnable runnable) {
                    interfaceC4739pRA.g(runnable);
                }
            }, 0L, false);
            throw null;
        } catch (MP e10) {
            throw new C3178d1(e10, jy0);
        }
    }

    final /* synthetic */ boolean m(boolean z9) {
        return this.f33665e.U(false);
    }

    final /* synthetic */ void n() {
        this.f33665e.zzi();
    }

    final /* synthetic */ void o(long j10, long j11) {
        this.f33665e.i(j10, j11);
    }

    final /* synthetic */ void p(boolean z9) {
        if (this.f33675o == 1) {
            this.f33674n++;
            InterfaceC3303e1 interfaceC3303e1 = this.f33665e;
            interfaceC3303e1.Z(z9);
            while (this.f33670j.c() > 1) {
                this.f33670j.d();
            }
            if (this.f33670j.c() == 1) {
                C5187t0 c5187t0 = (C5187t0) this.f33670j.d();
                c5187t0.getClass();
                interfaceC3303e1.k(1, this.f33671k, c5187t0.f33292a, c5187t0.f33293b, AbstractC5931yu0.l());
            }
            this.f33676p = -9223372036854775807L;
            if (z9) {
                this.f33677q = -9223372036854775807L;
            }
            InterfaceC4739pR interfaceC4739pR = this.f33672l;
            interfaceC4739pR.getClass();
            interfaceC4739pR.g(new Runnable() { // from class: com.google.android.gms.internal.ads.p0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f32237a.k();
                }
            });
        }
    }

    final /* synthetic */ void q(boolean z9) {
        this.f33665e.Q(z9);
    }

    final /* synthetic */ void r() {
        this.f33665e.g();
    }

    final /* synthetic */ void s(InterfaceC5439v0 interfaceC5439v0) {
        this.f33665e.m(interfaceC5439v0);
    }

    final /* synthetic */ void t(float f10) {
        this.f33669i.c(f10);
        this.f33665e.l(f10);
    }

    final /* synthetic */ void u(int i10) {
        this.f33665e.n(i10);
    }

    final /* synthetic */ boolean v() {
        int i10 = this.f33678r;
        return i10 != -1 && i10 == 0;
    }

    final /* synthetic */ boolean w() {
        return this.f33664d;
    }

    final /* synthetic */ long x() {
        return this.f33668h;
    }

    final /* synthetic */ C5943z0 y() {
        return this.f33669i;
    }

    final /* synthetic */ C4074k90 z() {
        return this.f33670j;
    }
}
