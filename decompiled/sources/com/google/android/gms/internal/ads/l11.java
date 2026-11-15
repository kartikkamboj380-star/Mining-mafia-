package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class l11 extends n11 implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f31156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f31157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f31158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f31159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f31160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f31161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f31162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f31163l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f31164m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f31165v;

    public l11(int i10, C2495Uf c2495Uf, int i11, Y01 y01, int i12, String str, String str2) {
        int iO;
        super(i10, c2495Uf, i11);
        int i13 = 0;
        this.f31157f = GS0.b(i12, false);
        int i14 = this.f31649d.f19919e;
        int i15 = y01.f29071C;
        this.f31158g = 1 == (i14 & 1);
        this.f31159h = (i14 & 2) != 0;
        AbstractC5931yu0 abstractC5931yu0M = str2 != null ? AbstractC5931yu0.m(str2) : y01.f29102y.isEmpty() ? AbstractC5931yu0.m("") : y01.f29102y;
        int i16 = 0;
        while (true) {
            if (i16 >= abstractC5931yu0M.size()) {
                iO = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iO = C3048c.o(this.f31649d, (String) abstractC5931yu0M.get(i16), false);
                if (iO > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.f31160i = i16;
        this.f31161j = iO;
        int iR = C3048c.r(this.f31649d.f19920f, str2 != null ? 1088 : 0);
        this.f31162k = iR;
        JY0 jy0 = this.f31649d;
        this.f31165v = (1088 & jy0.f19920f) != 0;
        int iS = C3048c.s(jy0, y01.f29103z);
        this.f31163l = iS;
        int iO2 = C3048c.o(this.f31649d, str, C3048c.n(str) == null);
        this.f31164m = iO2;
        boolean z9 = iO > 0 || (y01.f29102y.isEmpty() && iR > 0) || ((y01.f29102y.isEmpty() && iS != Integer.MAX_VALUE) || this.f31158g || (this.f31159h && iO2 > 0));
        if (GS0.b(i12, y01.f25449U) && z9) {
            i13 = 1;
        }
        this.f31156e = i13;
    }

    @Override // com.google.android.gms.internal.ads.n11
    public final /* bridge */ /* synthetic */ boolean c(n11 n11Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l11 l11Var) {
        AbstractC4168ku0 abstractC4168ku0A = AbstractC4168ku0.f().d(this.f31157f, l11Var.f31157f).a(Integer.valueOf(this.f31160i), Integer.valueOf(l11Var.f31160i), AbstractC5051rv0.b().a());
        int i10 = this.f31161j;
        AbstractC4168ku0 abstractC4168ku0B = abstractC4168ku0A.b(i10, l11Var.f31161j);
        int i11 = this.f31162k;
        AbstractC4168ku0 abstractC4168ku0B2 = abstractC4168ku0B.b(i11, l11Var.f31162k).a(Integer.valueOf(this.f31163l), Integer.valueOf(l11Var.f31163l), AbstractC5051rv0.b().a()).d(this.f31158g, l11Var.f31158g).a(Boolean.valueOf(this.f31159h), Boolean.valueOf(l11Var.f31159h), i10 == 0 ? AbstractC5051rv0.b() : AbstractC5051rv0.b().a()).b(this.f31164m, l11Var.f31164m);
        if (i11 == 0) {
            abstractC4168ku0B2 = abstractC4168ku0B2.c(this.f31165v, l11Var.f31165v);
        }
        return abstractC4168ku0B2.e();
    }

    @Override // com.google.android.gms.internal.ads.n11
    public final int zza() {
        return this.f31156e;
    }
}
