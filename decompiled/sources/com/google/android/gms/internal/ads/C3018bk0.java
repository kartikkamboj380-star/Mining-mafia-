package com.google.android.gms.internal.ads;

import I8.AbstractC0677k;
import W.InterfaceC0984i;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3018bk0 implements InterfaceC4650oj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I8.O f26907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R8.a f26908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final R8.a f26909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final R8.a f26910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4398mj0 f26912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f26913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0984i f26914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C5744xQ f26915i;

    public C3018bk0(InterfaceC0984i adQualityDataStore, InterfaceC1517Bj0 coroutineScopeProvider, C5744xQ dataPinger, C5909yj0 clock) {
        Intrinsics.checkNotNullParameter(adQualityDataStore, "adQualityDataStore");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(dataPinger, "dataPinger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f26915i = dataPinger;
        this.f26907a = coroutineScopeProvider.zza();
        this.f26908b = R8.g.b(false, 1, null);
        this.f26909c = R8.g.b(false, 1, null);
        this.f26910d = R8.g.b(false, 1, null);
        this.f26914h = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(String str, p169q8.b bVar) throws Throwable {
        C1673Ej0 c1673Ej0;
        R8.a aVar;
        Throwable th;
        R8.a aVar2;
        if (bVar instanceof C1673Ej0) {
            c1673Ej0 = (C1673Ej0) bVar;
            int i10 = c1673Ej0.f18554e;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c1673Ej0.f18554e = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                c1673Ej0 = new C1673Ej0(this, bVar);
            }
        } else {
            c1673Ej0 = new C1673Ej0(this, bVar);
        }
        Object obj = c1673Ej0.f18552c;
        Object objE = p179r8.b.e();
        int i11 = c1673Ej0.f18554e;
        try {
            if (i11 == 0) {
                p129m8.n.b(obj);
                aVar = this.f26910d;
                c1673Ej0.f18550a = str;
                c1673Ej0.f18551b = aVar;
                c1673Ej0.f18554e = 1;
                if (aVar.d(null, c1673Ej0) != objE) {
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (R8.a) c1673Ej0.f18550a;
                try {
                    p129m8.n.b(obj);
                    aVar2.e(null);
                    return Unit.f45918a;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.e(null);
                    throw th;
                }
            }
            R8.a aVar3 = (R8.a) c1673Ej0.f18551b;
            String str2 = (String) c1673Ej0.f18550a;
            p129m8.n.b(obj);
            aVar = aVar3;
            str = str2;
            InterfaceC0984i interfaceC0984i = this.f26914h;
            C1725Fj0 c1725Fj0 = new C1725Fj0(str, null);
            c1673Ej0.f18550a = aVar;
            c1673Ej0.f18551b = null;
            c1673Ej0.f18554e = 2;
            Object objA = interfaceC0984i.a(c1725Fj0, c1673Ej0);
            if (objA != objE) {
                R8.a aVar4 = aVar;
                obj = objA;
                aVar2 = aVar4;
                aVar2.e(null);
                return Unit.f45918a;
            }
            return objE;
        } catch (Throwable th3) {
            R8.a aVar5 = aVar;
            th = th3;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(p169q8.b bVar) throws Throwable {
        C1829Hj0 c1829Hj0;
        R8.a aVar;
        R8.a aVar2;
        Throwable th;
        if (bVar instanceof C1829Hj0) {
            c1829Hj0 = (C1829Hj0) bVar;
            int i10 = c1829Hj0.f19382d;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c1829Hj0.f19382d = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                c1829Hj0 = new C1829Hj0(this, bVar);
            }
        } else {
            c1829Hj0 = new C1829Hj0(this, bVar);
        }
        Object obj = c1829Hj0.f19380b;
        Object objE = p179r8.b.e();
        int i11 = c1829Hj0.f19382d;
        try {
            if (i11 == 0) {
                p129m8.n.b(obj);
                aVar = this.f26910d;
                c1829Hj0.f19379a = aVar;
                c1829Hj0.f19382d = 1;
                if (aVar.d(null, c1829Hj0) != objE) {
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (R8.a) c1829Hj0.f19379a;
                try {
                    p129m8.n.b(obj);
                    aVar2.e(null);
                    return Unit.f45918a;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.e(null);
                    throw th;
                }
            }
            R8.a aVar3 = (R8.a) c1829Hj0.f19379a;
            p129m8.n.b(obj);
            aVar = aVar3;
            InterfaceC0984i interfaceC0984i = this.f26914h;
            C1881Ij0 c1881Ij0 = new C1881Ij0(null);
            c1829Hj0.f19379a = aVar;
            c1829Hj0.f19382d = 2;
            Object objA = interfaceC0984i.a(c1881Ij0, c1829Hj0);
            if (objA != objE) {
                aVar2 = aVar;
                obj = objA;
                aVar2.e(null);
                return Unit.f45918a;
            }
            return objE;
        } catch (Throwable th3) {
            aVar2 = aVar;
            th = th3;
            aVar2.e(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(long j10, p169q8.b bVar) {
        C1777Gj0 c1777Gj0;
        R8.a aVar;
        if (bVar instanceof C1777Gj0) {
            c1777Gj0 = (C1777Gj0) bVar;
            int i10 = c1777Gj0.f19123e;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c1777Gj0.f19123e = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                c1777Gj0 = new C1777Gj0(this, bVar);
            }
        } else {
            c1777Gj0 = new C1777Gj0(this, bVar);
        }
        Object obj = c1777Gj0.f19121c;
        Object objE = p179r8.b.e();
        int i11 = c1777Gj0.f19123e;
        if (i11 == 0) {
            p129m8.n.b(obj);
            R8.a aVar2 = this.f26908b;
            c1777Gj0.f19120b = aVar2;
            c1777Gj0.f19119a = j10;
            c1777Gj0.f19123e = 1;
            if (aVar2.d(null, c1777Gj0) == objE) {
                return objE;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = c1777Gj0.f19119a;
            aVar = (R8.a) c1777Gj0.f19120b;
            p129m8.n.b(obj);
        }
        try {
            C4398mj0 c4398mj0 = this.f26912f;
            if (c4398mj0 == null) {
                Intrinsics.r("adQualityDataBuilder");
                c4398mj0 = null;
            }
            C4398mj0 c4398mj1 = this.f26912f;
            if (c4398mj1 == null) {
                Intrinsics.r("adQualityDataBuilder");
                c4398mj1 = null;
            }
            long jI = j10 - c4398mj1.I();
            C4398mj0 c4398mj2 = this.f26912f;
            if (c4398mj2 == null) {
                Intrinsics.r("adQualityDataBuilder");
                c4398mj2 = null;
            }
            c4398mj0.B(jI - c4398mj2.G());
            return Unit.f45918a;
        } finally {
            aVar.e(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(p169q8.b bVar) throws Throwable {
        C2037Lj0 c2037Lj0;
        R8.a aVar;
        R8.a aVar2;
        C4524nj0 c4524nj0;
        R8.a aVar3;
        if (bVar instanceof C2037Lj0) {
            c2037Lj0 = (C2037Lj0) bVar;
            int i10 = c2037Lj0.f20601e;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c2037Lj0.f20601e = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                c2037Lj0 = new C2037Lj0(this, bVar);
            }
        } else {
            c2037Lj0 = new C2037Lj0(this, bVar);
        }
        Object objA = c2037Lj0.f20599c;
        Object objE = p179r8.b.e();
        int i11 = c2037Lj0.f20601e;
        try {
            if (i11 == 0) {
                p129m8.n.b(objA);
                aVar = this.f26908b;
                c2037Lj0.f20597a = aVar;
                c2037Lj0.f20601e = 1;
                if (aVar.d(null, c2037Lj0) != objE) {
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (R8.a) c2037Lj0.f20597a;
                    try {
                        p129m8.n.b(objA);
                        aVar3.e(null);
                        return Unit.f45918a;
                    } catch (Throwable th) {
                        th = th;
                        aVar3.e(null);
                        throw th;
                    }
                }
                aVar2 = (R8.a) c2037Lj0.f20598b;
                c4524nj0 = (C4524nj0) c2037Lj0.f20597a;
                p129m8.n.b(objA);
                try {
                    InterfaceC0984i interfaceC0984i = this.f26914h;
                    C2088Mj0 c2088Mj0 = new C2088Mj0(c4524nj0, null);
                    c2037Lj0.f20597a = aVar2;
                    c2037Lj0.f20598b = null;
                    c2037Lj0.f20601e = 3;
                    objA = interfaceC0984i.a(c2088Mj0, c2037Lj0);
                    if (objA != objE) {
                        aVar3 = aVar2;
                        aVar3.e(null);
                        return Unit.f45918a;
                    }
                    return objE;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3 = aVar2;
                    aVar3.e(null);
                    throw th;
                }
            }
            aVar = (R8.a) c2037Lj0.f20597a;
            p129m8.n.b(objA);
            C4398mj0 c4398mj0 = this.f26912f;
            if (c4398mj0 == null) {
                Intrinsics.r("adQualityDataBuilder");
                c4398mj0 = null;
            }
            C4524nj0 c4524nj1 = (C4524nj0) c4398mj0.w();
            aVar.e(null);
            Intrinsics.c(c4524nj1);
            aVar2 = this.f26910d;
            c2037Lj0.f20597a = c4524nj1;
            c2037Lj0.f20598b = aVar2;
            c2037Lj0.f20601e = 2;
            if (aVar2.d(null, c2037Lj0) != objE) {
                c4524nj0 = c4524nj1;
                InterfaceC0984i interfaceC0984i2 = this.f26914h;
                C2088Mj0 c2088Mj1 = new C2088Mj0(c4524nj0, null);
                c2037Lj0.f20597a = aVar2;
                c2037Lj0.f20598b = null;
                c2037Lj0.f20601e = 3;
                objA = interfaceC0984i2.a(c2088Mj1, c2037Lj0);
                if (objA != objE) {
                    aVar3 = aVar2;
                    aVar3.e(null);
                    return Unit.f45918a;
                }
            }
            return objE;
        } catch (Throwable th3) {
            aVar.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    private static final boolean r(C4524nj0 c4524nj0) {
        boolean z9;
        List listQ0 = c4524nj0.q0();
        Long l10 = listQ0 != null ? (Long) CollectionsKt.h0(listQ0) : null;
        boolean z10 = c4524nj0.r0() > c4524nj0.s0() && !c4524nj0.k0();
        if (l10 != null) {
            if (c4524nj0.o0() - l10.longValue() > ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT) {
                z9 = true;
            } else {
                z9 = false;
            }
        } else {
            z9 = false;
        }
        return z10 || z9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (o(r0) == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [R8.a] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [R8.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.bk0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p169q8.b r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3018bk0.a(q8.b):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4650oj0
    public final void b() {
        AbstractC0677k.d(this.f26907a, null, null, new C2712Yj0(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, p169q8.b bVar) {
        C2140Nj0 c2140Nj0;
        String str2;
        R8.a aVar;
        long j10;
        if (bVar instanceof C2140Nj0) {
            c2140Nj0 = (C2140Nj0) bVar;
            int i10 = c2140Nj0.f21332e;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c2140Nj0.f21332e = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                c2140Nj0 = new C2140Nj0(this, bVar);
            }
        } else {
            c2140Nj0 = new C2140Nj0(this, bVar);
        }
        Object obj = c2140Nj0.f21330c;
        Object objE = p179r8.b.e();
        int i11 = c2140Nj0.f21332e;
        if (i11 == 0) {
            p129m8.n.b(obj);
            R8.a aVar2 = this.f26908b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c2140Nj0.f21333f = str;
            c2140Nj0.f21328a = aVar2;
            c2140Nj0.f21329b = jCurrentTimeMillis;
            c2140Nj0.f21332e = 1;
            if (aVar2.d(null, c2140Nj0) == objE) {
                return objE;
            }
            str2 = str;
            aVar = aVar2;
            j10 = jCurrentTimeMillis;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = c2140Nj0.f21329b;
            aVar = (R8.a) c2140Nj0.f21328a;
            str2 = c2140Nj0.f21333f;
            p129m8.n.b(obj);
        }
        try {
            if (this.f26911e) {
                return Unit.f45918a;
            }
            this.f26911e = true;
            QL0 ql0Q = C4524nj0.v0().Q();
            Intrinsics.checkNotNullExpressionValue(ql0Q, "toBuilder(...)");
            C4398mj0 c4398mj0 = (C4398mj0) ql0Q;
            this.f26912f = c4398mj0;
            if (c4398mj0 == null) {
                Intrinsics.r("adQualityDataBuilder");
                c4398mj0 = null;
            }
            c4398mj0.A(str2);
            c4398mj0.K(j10);
            return Unit.f45918a;
        } finally {
            aVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:33:0x0087, B:35:0x008b, B:38:0x0094), top: B:51:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (q(r0) == r1) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(p169q8.b r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.internal.ads.C1933Jj0
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.gms.internal.ads.Jj0 r0 = (com.google.android.gms.internal.ads.C1933Jj0) r0
            int r1 = r0.f19983e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19983e = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.Jj0 r0 = new com.google.android.gms.internal.ads.Jj0
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f19981c
            java.lang.Object r1 = p179r8.b.e()
            int r2 = r0.f19983e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L52
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            p129m8.n.b(r11)
            goto Lad
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3c:
            p129m8.n.b(r11)
            goto La4
        L40:
            long r5 = r0.f19980b
            java.lang.Object r2 = r0.f19979a
            R8.a r2 = (R8.a) r2
            p129m8.n.b(r11)
            goto L87
        L4a:
            java.lang.Object r2 = r0.f19979a
            R8.a r2 = (R8.a) r2
            p129m8.n.b(r11)
            goto L61
        L52:
            p129m8.n.b(r11)
            R8.a r2 = r10.f26909c
            r0.f19979a = r2
            r0.f19983e = r6
            java.lang.Object r11 = r2.d(r7, r0)
            if (r11 == r1) goto Lb8
        L61:
            boolean r11 = r10.f26913g     // Catch: java.lang.Throwable -> L6b
            if (r11 == 0) goto L6d
            kotlin.Unit r11 = kotlin.Unit.f45918a     // Catch: java.lang.Throwable -> L6b
            r2.e(r7)
            return r11
        L6b:
            r11 = move-exception
            goto Lb4
        L6d:
            r10.f26913g = r6     // Catch: java.lang.Throwable -> L6b
            kotlin.Unit r11 = kotlin.Unit.f45918a     // Catch: java.lang.Throwable -> L6b
            r2.e(r7)
            R8.a r2 = r10.f26908b
            long r8 = java.lang.System.currentTimeMillis()
            r0.f19979a = r2
            r0.f19980b = r8
            r0.f19983e = r5
            java.lang.Object r11 = r2.d(r7, r0)
            if (r11 == r1) goto Lb8
            r5 = r8
        L87:
            com.google.android.gms.internal.ads.mj0 r11 = r10.f26912f     // Catch: java.lang.Throwable -> L92
            if (r11 != 0) goto L94
            java.lang.String r11 = "adQualityDataBuilder"
            kotlin.jvm.internal.Intrinsics.r(r11)     // Catch: java.lang.Throwable -> L92
            r11 = r7
            goto L94
        L92:
            r11 = move-exception
            goto Lb0
        L94:
            r11.R(r5)     // Catch: java.lang.Throwable -> L92
            r2.e(r7)
            r0.f19979a = r7
            r0.f19983e = r4
            java.lang.Object r11 = r10.p(r5, r0)
            if (r11 == r1) goto Lb8
        La4:
            r0.f19983e = r3
            java.lang.Object r11 = r10.q(r0)
            if (r11 != r1) goto Lad
            goto Lb8
        Lad:
            kotlin.Unit r11 = kotlin.Unit.f45918a
            return r11
        Lb0:
            r2.e(r7)
            throw r11
        Lb4:
            r2.e(r7)
            throw r11
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3018bk0.d(q8.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0081 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0095 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0104 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0114 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(p169q8.b bVar) {
        C2764Zj0 c2764Zj0;
        R8.a aVar;
        R8.a aVar2;
        long j10;
        C4398mj0 c4398mj0;
        C4398mj0 c4398mj1;
        C4398mj0 c4398mj2;
        C4398mj0 c4398mj3;
        C4398mj0 c4398mj4;
        C4398mj0 c4398mj5;
        long jLongValue;
        C4398mj0 c4398mj6;
        C4398mj0 c4398mj7;
        if (bVar instanceof C2764Zj0) {
            c2764Zj0 = (C2764Zj0) bVar;
            int i10 = c2764Zj0.f26285e;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c2764Zj0.f26285e = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                c2764Zj0 = new C2764Zj0(this, bVar);
            }
        } else {
            c2764Zj0 = new C2764Zj0(this, bVar);
        }
        Object obj = c2764Zj0.f26283c;
        Object objE = p179r8.b.e();
        int i11 = c2764Zj0.f26285e;
        try {
            if (i11 == 0) {
                p129m8.n.b(obj);
                aVar = this.f26909c;
                c2764Zj0.f26281a = aVar;
                c2764Zj0.f26285e = 1;
                if (aVar.d(null, c2764Zj0) != objE) {
                }
                return objE;
            }
            if (i11 == 1) {
                aVar = (R8.a) c2764Zj0.f26281a;
                p129m8.n.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = c2764Zj0.f26282b;
                aVar2 = (R8.a) c2764Zj0.f26281a;
                p129m8.n.b(obj);
            }
            try {
                c4398mj0 = this.f26912f;
                if (c4398mj0 == null) {
                    Intrinsics.r("adQualityDataBuilder");
                    c4398mj0 = null;
                }
                if (c4398mj0.W() > 0) {
                    c4398mj5 = this.f26912f;
                    if (c4398mj5 == null) {
                        Intrinsics.r("adQualityDataBuilder");
                        c4398mj5 = null;
                    }
                    List listV = c4398mj5.V();
                    Intrinsics.checkNotNullExpressionValue(listV, "getAdClickTimestampsMsList(...)");
                    Object objG0 = CollectionsKt.g0(listV);
                    Intrinsics.checkNotNullExpressionValue(objG0, "last(...)");
                    jLongValue = j10 - ((Number) objG0).longValue();
                    c4398mj6 = this.f26912f;
                    if (c4398mj6 == null) {
                        Intrinsics.r("adQualityDataBuilder");
                        c4398mj6 = null;
                    }
                    c4398mj6.Y();
                    if (jLongValue < ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT) {
                        c4398mj7 = this.f26912f;
                        if (c4398mj7 == null) {
                            Intrinsics.r("adQualityDataBuilder");
                            c4398mj7 = null;
                        }
                        c4398mj7.D(c4398mj7.C() + 1);
                    }
                }
                c4398mj1 = this.f26912f;
                if (c4398mj1 == null) {
                    Intrinsics.r("adQualityDataBuilder");
                    c4398mj1 = null;
                }
                if (c4398mj1.P() > 0) {
                    c4398mj3 = this.f26912f;
                    if (c4398mj3 == null) {
                        Intrinsics.r("adQualityDataBuilder");
                        c4398mj3 = null;
                    }
                    List listO = c4398mj3.O();
                    Intrinsics.checkNotNullExpressionValue(listO, "getAppBackgroundTimestampsMsList(...)");
                    Object objG1 = CollectionsKt.g0(listO);
                    Intrinsics.checkNotNullExpressionValue(objG1, "last(...)");
                    long jLongValue2 = j10 - ((Number) objG1).longValue();
                    c4398mj4 = this.f26912f;
                    if (c4398mj4 == null) {
                        Intrinsics.r("adQualityDataBuilder");
                        c4398mj4 = null;
                    }
                    c4398mj4.H(c4398mj4.G() + jLongValue2);
                }
                c4398mj2 = this.f26912f;
                if (c4398mj2 == null) {
                    Intrinsics.r("adQualityDataBuilder");
                    c4398mj2 = null;
                }
                c4398mj2.U(j10);
                return Unit.f45918a;
            } finally {
                aVar2.e(null);
            }
            if (!this.f26913g) {
                Unit unit = Unit.f45918a;
                aVar.e(null);
                return unit;
            }
            this.f26913g = false;
            Unit unit2 = Unit.f45918a;
            aVar.e(null);
            R8.a aVar3 = this.f26908b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c2764Zj0.f26281a = aVar3;
            c2764Zj0.f26282b = jCurrentTimeMillis;
            c2764Zj0.f26285e = 2;
            if (aVar3.d(null, c2764Zj0) != objE) {
                aVar2 = aVar3;
                j10 = jCurrentTimeMillis;
                c4398mj0 = this.f26912f;
                if (c4398mj0 == null) {
                    Intrinsics.r("adQualityDataBuilder");
                    c4398mj0 = null;
                }
                if (c4398mj0.W() > 0) {
                    c4398mj5 = this.f26912f;
                    if (c4398mj5 == null) {
                        Intrinsics.r("adQualityDataBuilder");
                        c4398mj5 = null;
                    }
                    List listV2 = c4398mj5.V();
                    Intrinsics.checkNotNullExpressionValue(listV2, "getAdClickTimestampsMsList(...)");
                    Object objG2 = CollectionsKt.g0(listV2);
                    Intrinsics.checkNotNullExpressionValue(objG2, "last(...)");
                    jLongValue = j10 - ((Number) objG2).longValue();
                    c4398mj6 = this.f26912f;
                    if (c4398mj6 == null) {
                        Intrinsics.r("adQualityDataBuilder");
                        c4398mj6 = null;
                    }
                    c4398mj6.Y();
                    if (jLongValue < ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT) {
                        c4398mj7 = this.f26912f;
                        if (c4398mj7 == null) {
                            Intrinsics.r("adQualityDataBuilder");
                            c4398mj7 = null;
                        }
                        c4398mj7.D(c4398mj7.C() + 1);
                    }
                }
                c4398mj1 = this.f26912f;
                if (c4398mj1 == null) {
                    Intrinsics.r("adQualityDataBuilder");
                    c4398mj1 = null;
                }
                if (c4398mj1.P() > 0) {
                    c4398mj3 = this.f26912f;
                    if (c4398mj3 == null) {
                        Intrinsics.r("adQualityDataBuilder");
                        c4398mj3 = null;
                    }
                    List listO2 = c4398mj3.O();
                    Intrinsics.checkNotNullExpressionValue(listO2, "getAppBackgroundTimestampsMsList(...)");
                    Object objG3 = CollectionsKt.g0(listO2);
                    Intrinsics.checkNotNullExpressionValue(objG3, "last(...)");
                    long jLongValue3 = j10 - ((Number) objG3).longValue();
                    c4398mj4 = this.f26912f;
                    if (c4398mj4 == null) {
                        Intrinsics.r("adQualityDataBuilder");
                        c4398mj4 = null;
                    }
                    c4398mj4.H(c4398mj4.G() + jLongValue3);
                }
                c4398mj2 = this.f26912f;
                if (c4398mj2 == null) {
                    Intrinsics.r("adQualityDataBuilder");
                    c4398mj2 = null;
                }
                c4398mj2.U(j10);
                return Unit.f45918a;
            }
            return objE;
        } catch (Throwable th) {
            aVar.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0094 A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009f A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8 A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fc, code lost:
    
        if (n(r14, r0) == r1) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(p169q8.b r14) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3018bk0.f(q8.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093 A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009f A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0107, code lost:
    
        if (n(r15, r0) == r1) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(p169q8.b r15) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3018bk0.g(q8.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(p169q8.b bVar) {
        C2244Pj0 c2244Pj0;
        R8.a aVar;
        long j10;
        if (bVar instanceof C2244Pj0) {
            c2244Pj0 = (C2244Pj0) bVar;
            int i10 = c2244Pj0.f22159e;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c2244Pj0.f22159e = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                c2244Pj0 = new C2244Pj0(this, bVar);
            }
        } else {
            c2244Pj0 = new C2244Pj0(this, bVar);
        }
        Object obj = c2244Pj0.f22157c;
        Object objE = p179r8.b.e();
        int i11 = c2244Pj0.f22159e;
        if (i11 == 0) {
            p129m8.n.b(obj);
            R8.a aVar2 = this.f26908b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c2244Pj0.f22156b = aVar2;
            c2244Pj0.f22155a = jCurrentTimeMillis;
            c2244Pj0.f22159e = 1;
            if (aVar2.d(null, c2244Pj0) == objE) {
                return objE;
            }
            aVar = aVar2;
            j10 = jCurrentTimeMillis;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = c2244Pj0.f22155a;
            aVar = (R8.a) c2244Pj0.f22156b;
            p129m8.n.b(obj);
        }
        try {
            C4398mj0 c4398mj0 = this.f26912f;
            if (c4398mj0 == null) {
                Intrinsics.r("adQualityDataBuilder");
                c4398mj0 = null;
            }
            c4398mj0.X(j10);
            return Unit.f45918a;
        } finally {
            aVar.e(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4650oj0
    public final void j(String gwsQueryId) {
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        AbstractC0677k.d(this.f26907a, null, null, new C2192Oj0(this, gwsQueryId, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4650oj0
    public final void zza() {
        AbstractC0677k.d(this.f26907a, null, null, new C2608Wj0(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4650oj0
    public final void zzc() {
        AbstractC0677k.d(this.f26907a, null, null, new C1985Kj0(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4650oj0
    public final void zzd() {
        AbstractC0677k.d(this.f26907a, null, null, new C2892ak0(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4650oj0
    public final void zze() {
        AbstractC0677k.d(this.f26907a, null, null, new C2400Sj0(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4650oj0
    public final void zzg() {
        AbstractC0677k.d(this.f26907a, null, null, new C2296Qj0(this, null), 3, null);
    }
}
