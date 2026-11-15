package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4711pD implements InterfaceC2925b00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C5011rb0 f32335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C3502fb0 f32336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5976zG f32337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MG f32338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S90 f32339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RF f32340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C5350uI f32341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final QG f32342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C3216dK f32343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C4337mF f32344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C5496vS f32345k;

    protected AbstractC4711pD(C4585oD c4585oD) {
        this.f32335a = c4585oD.a();
        this.f32336b = c4585oD.b();
        this.f32337c = c4585oD.c();
        this.f32338d = c4585oD.d();
        this.f32339e = c4585oD.e();
        this.f32340f = c4585oD.f();
        this.f32341g = c4585oD.g();
        this.f32342h = c4585oD.h();
        this.f32343i = c4585oD.i();
        this.f32344j = c4585oD.j();
        this.f32345k = c4585oD.k();
    }

    public void a() {
        this.f32337c.l1(null);
    }

    public void b() {
        this.f32338d.zzg();
        this.f32342h.W0(this);
    }

    public final C5976zG c() {
        return this.f32337c;
    }

    public final RF d() {
        return this.f32340f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2925b00
    public final void e() {
        this.f32343i.zzi();
    }

    public final C4337mF f() {
        return this.f32344j;
    }

    public final S90 g() {
        return this.f32339e;
    }

    public final SH h() {
        return this.f32341g.h();
    }

    public final C5011rb0 i() {
        return this.f32335a;
    }

    public final boolean j() {
        return this.f32336b.f28428q0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        C5496vS c5496vS;
        List list = this.f32336b.f28366C0;
        if (list == null || list.isEmpty() || (c5496vS = this.f32345k) == null) {
            return;
        }
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29668Q8)).booleanValue() || list.isEmpty()) {
            return;
        }
        AbstractC2164Nv0 abstractC2164Nv0ListIterator = ((AbstractC5931yu0) list).listIterator(0);
        while (abstractC2164Nv0ListIterator.hasNext()) {
            C5622wS c5622wS = (C5622wS) abstractC2164Nv0ListIterator.next();
            for (int i10 : c5622wS.f34557b) {
                if (i10 == 1) {
                    c5496vS.a(c5622wS.f34556a, 1, G4.t.o().currentTimeMillis());
                    break;
                }
            }
        }
    }
}
