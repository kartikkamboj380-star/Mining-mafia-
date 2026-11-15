package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2686Xw0 extends AbstractC3044bx0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final C1701Ex0 f25404w = new C1701Ex0(AbstractC2686Xw0.class);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AbstractC5427uu0 f25405l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f25406m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f25407v;

    AbstractC2686Xw0(AbstractC5427uu0 abstractC5427uu0, boolean z9, boolean z10) {
        super(abstractC5427uu0.size());
        this.f25405l = abstractC5427uu0;
        this.f25406m = z9;
        this.f25407v = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void O(int i10, com.google.common.util.concurrent.p pVar) {
        try {
            if (pVar.isCancelled()) {
                this.f25405l = null;
                cancel(false);
            } else {
                I(i10, pVar);
            }
        } finally {
            P(null);
        }
    }

    private final void G(Throwable th) {
        th.getClass();
        if (this.f25406m && !l(th) && K(B(), th)) {
            H(th);
        } else if (th instanceof Error) {
            H(th);
        }
    }

    private static void H(Throwable th) {
        f25404w.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private final void I(int i10, Future future) {
        try {
            M(i10, AbstractC2792Zx0.a(future));
        } catch (ExecutionException e10) {
            G(e10.getCause());
        } catch (Throwable th) {
            G(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void P(AbstractC5427uu0 abstractC5427uu0) {
        int iC = C();
        int i10 = 0;
        AbstractC2418Ss0.j(iC >= 0, "Less than 0 remaining futures");
        if (iC == 0) {
            if (abstractC5427uu0 != null) {
                AbstractC2112Mv0 abstractC2112Mv0A = abstractC5427uu0.a();
                while (abstractC2112Mv0A.hasNext()) {
                    Future future = (Future) abstractC2112Mv0A.next();
                    if (!future.isCancelled()) {
                        I(i10, future);
                    }
                    i10++;
                }
            }
            this.f26962h = null;
            N();
            E(2);
        }
    }

    private static boolean K(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3044bx0
    final void D(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thA = a();
        Objects.requireNonNull(thA);
        K(set, thA);
    }

    void E(int i10) {
        this.f25405l = null;
    }

    final void L() {
        Objects.requireNonNull(this.f25405l);
        if (this.f25405l.isEmpty()) {
            N();
            return;
        }
        if (this.f25406m) {
            AbstractC2112Mv0 abstractC2112Mv0A = this.f25405l.a();
            final int i10 = 0;
            while (abstractC2112Mv0A.hasNext()) {
                final com.google.common.util.concurrent.p pVar = (com.google.common.util.concurrent.p) abstractC2112Mv0A.next();
                int i11 = i10 + 1;
                if (pVar.isDone()) {
                    O(i10, pVar);
                } else {
                    pVar.e(new Runnable() { // from class: com.google.android.gms.internal.ads.Ww0
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f24892a.O(i10, pVar);
                        }
                    }, EnumC4300lx0.INSTANCE);
                }
                i10 = i11;
            }
            return;
        }
        AbstractC5427uu0 abstractC5427uu0 = this.f25405l;
        final AbstractC5427uu0 abstractC5427uu1 = true != this.f25407v ? null : abstractC5427uu0;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.Vw0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f24603a.P(abstractC5427uu1);
            }
        };
        AbstractC2112Mv0 abstractC2112Mv0A2 = abstractC5427uu0.a();
        while (abstractC2112Mv0A2.hasNext()) {
            com.google.common.util.concurrent.p pVar2 = (com.google.common.util.concurrent.p) abstractC2112Mv0A2.next();
            if (pVar2.isDone()) {
                P(abstractC5427uu1);
            } else {
                pVar2.e(runnable, EnumC4300lx0.INSTANCE);
            }
        }
    }

    abstract void M(int i10, Object obj);

    abstract void N();

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    protected final void m() {
        AbstractC5427uu0 abstractC5427uu0 = this.f25405l;
        E(1);
        if ((abstractC5427uu0 != null) && isCancelled()) {
            boolean zT = t();
            AbstractC2112Mv0 abstractC2112Mv0A = abstractC5427uu0.a();
            while (abstractC2112Mv0A.hasNext()) {
                ((Future) abstractC2112Mv0A.next()).cancel(zT);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    protected final String n() {
        AbstractC5427uu0 abstractC5427uu0 = this.f25405l;
        return abstractC5427uu0 != null ? "futures=".concat(abstractC5427uu0.toString()) : super.n();
    }
}
