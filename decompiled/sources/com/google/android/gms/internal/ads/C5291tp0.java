package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5291tp0 implements InterfaceC4410mp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2978bQ0 f33497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1737Fp0 f33498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5043rr0 f33499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExecutorService f33500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1943Jo0 f33501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1721Fh0 f33502g;

    C5291tp0(Context context, InterfaceC2978bQ0 interfaceC2978bQ0, InterfaceC1737Fp0 interfaceC1737Fp0, C5043rr0 c5043rr0, ExecutorService executorService, C1943Jo0 c1943Jo0, C1721Fh0 c1721Fh0) {
        this.f33496a = context;
        this.f33497b = interfaceC2978bQ0;
        this.f33498c = interfaceC1737Fp0;
        this.f33499d = c5043rr0;
        this.f33500e = executorService;
        this.f33501f = c1943Jo0;
        this.f33502g = c1721Fh0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C2352Rl0 e(int i10) {
        C2300Ql0 c2300Ql0G0 = C2352Rl0.g0();
        c2300Ql0G0.E(i10);
        return (C2352Rl0) c2300Ql0G0.w();
    }

    final /* synthetic */ int a(EnumC2647Xd enumC2647Xd) {
        if (AbstractC3265di0.a(enumC2647Xd)) {
            return 0;
        }
        this.f33499d.c(15204, enumC2647Xd.name());
        throw new C4536np0(null);
    }

    final /* synthetic */ com.google.common.util.concurrent.p b(Integer num) {
        return this.f33498c.zzb();
    }

    final /* synthetic */ C2352Rl0 c(C2456Tl0 c2456Tl0) {
        String strD0 = c2456Tl0.d0().d0();
        String strE0 = c2456Tl0.d0().e0();
        C4792pr0 c4792pr0A = this.f33499d.a(15203);
        try {
            c4792pr0A.a();
            C5403ui0 c5403ui0A = AbstractC2188Oh0.a(this.f33496a, 1, (EnumC2647Xd) this.f33497b.zzb(), strD0, strE0, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, this.f33502g);
            c4792pr0A.c();
            int i10 = 2;
            if (c5403ui0A.f33886c == 2) {
                this.f33499d.b(15208);
                return e(4);
            }
            byte[] bArr = c5403ui0A.f33885b;
            if (bArr == null || bArr.length == 0) {
                this.f33499d.b(5010);
                return e(8);
            }
            try {
                C2751Zd c2751ZdH0 = C2751Zd.h0(bArr, HL0.b());
                if (c2751ZdH0.d0().d0().isEmpty() || c2751ZdH0.d0().e0().isEmpty() || c2751ZdH0.f0().D().length == 0) {
                    this.f33499d.b(15207);
                } else {
                    if (c2456Tl0.equals(C2456Tl0.i0()) || !TextUtils.equals(c2456Tl0.d0().d0(), c2751ZdH0.d0().d0()) || !TextUtils.equals(c2456Tl0.d0().e0(), c2751ZdH0.d0().e0())) {
                        int i11 = c5403ui0A.f33886c;
                        if (i11 == 4) {
                            if (!this.f33501f.a(c2751ZdH0.e0().D())) {
                                this.f33499d.b(15206);
                                return e(12);
                            }
                            i11 = 4;
                        }
                        C2300Ql0 c2300Ql0G0 = C2352Rl0.g0();
                        if (i11 == 2) {
                            i10 = 4;
                        } else if (i11 != 3) {
                            if (i11 != 4) {
                                i10 = i11 != 6 ? 1 : 5;
                            } else {
                                i10 = 3;
                            }
                        }
                        c2300Ql0G0.E(i10);
                        C2404Sl0 c2404Sl0H0 = C2456Tl0.h0();
                        c2404Sl0H0.A(c2751ZdH0.d0());
                        c2404Sl0H0.C((EnumC2647Xd) this.f33497b.zzb());
                        c2300Ql0G0.A((C2456Tl0) c2404Sl0H0.w());
                        c2300Ql0G0.D(c2751ZdH0.e0());
                        c2300Ql0G0.C(c2751ZdH0.f0());
                        return (C2352Rl0) c2300Ql0G0.w();
                    }
                    this.f33499d.b(15209);
                }
                return e(11);
            } catch (C3598gM0 e10) {
                this.f33499d.d(15205, e10);
                return e(9);
            } catch (NullPointerException unused) {
                this.f33499d.b(15210);
                return e(10);
            }
        } catch (Throwable th) {
            try {
                c4792pr0A.b(th);
                throw th;
            } catch (Throwable th2) {
                c4792pr0A.c();
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410mp0
    public final com.google.common.util.concurrent.p zza() {
        final InterfaceC2978bQ0 interfaceC2978bQ0 = this.f33497b;
        Objects.requireNonNull(interfaceC2978bQ0);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.op0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return interfaceC2978bQ0.zzb();
            }
        };
        ExecutorService executorService = this.f33500e;
        AbstractC4678ox0 abstractC4678ox0 = (AbstractC4678ox0) AbstractC5685wx0.g((AbstractC4678ox0) AbstractC5685wx0.k((AbstractC4678ox0) AbstractC5685wx0.j((AbstractC4678ox0) AbstractC5685wx0.k(AbstractC4678ox0.B(AbstractC5685wx0.d(callable, executorService)), new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.sp0
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                this.f33236a.a((EnumC2647Xd) obj);
                return new Integer(0);
            }
        }, AbstractC2272Px0.a()), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.pp0
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f32479a.b((Integer) obj);
            }
        }, AbstractC2272Px0.a()), new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.qp0
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                return this.f32729a.c((C2456Tl0) obj);
            }
        }, executorService), C4536np0.class, C5039rp0.f33030a, AbstractC2272Px0.a());
        this.f33499d.e(15202, abstractC4678ox0);
        return abstractC4678ox0;
    }
}
