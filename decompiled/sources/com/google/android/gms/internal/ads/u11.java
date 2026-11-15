package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class u11 extends n11 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f33701G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f33702H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final int f33703I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final int f33704J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final boolean f33705K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final boolean f33706L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int f33707M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f33708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Y01 f33709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f33710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f33711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f33712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f33713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f33714k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f33715l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f33716m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f33717v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f33718w;

    /* JADX WARN: Code duplicated, block: B:120:0x017e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX WARN: Code duplicated, block: B:33:0x004d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0124  */
    public u11(int i10, C2495Uf c2495Uf, int i11, Y01 y01, int i12, String str, int i13, boolean z9) {
        boolean z10;
        boolean z11;
        int i14;
        int iO;
        int i15;
        byte b10;
        boolean z12;
        JY0 jy0;
        int i16;
        int i17;
        int i18;
        JY0 jy1;
        int i19;
        int i20;
        int i21;
        super(i10, c2495Uf, i11);
        this.f33709f = y01;
        int i22 = 1;
        int i23 = true != y01.f25440L ? 16 : 24;
        if (!z9 || (((i19 = (jy1 = this.f31649d).f19936v) != -1 && i19 > y01.f29078a) || ((i20 = jy1.f19937w) != -1 && i20 > y01.f29079b))) {
            z10 = false;
        } else {
            float f10 = jy1.f19940z;
            if ((f10 == -1.0f || f10 <= y01.f29080c) && ((i21 = jy1.f19924j) == -1 || i21 <= y01.f29081d)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        this.f33708e = z10;
        if (!z9 || (((i16 = (jy0 = this.f31649d).f19936v) != -1 && i16 < 0) || ((i17 = jy0.f19937w) != -1 && i17 < 0))) {
            z11 = false;
        } else {
            float f11 = jy0.f19940z;
            if ((f11 == -1.0f || f11 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && ((i18 = jy0.f19924j) == -1 || i18 >= 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.f33710g = z11;
        this.f33711h = GS0.b(i12, false);
        JY0 jy2 = this.f31649d;
        float f12 = jy2.f19940z;
        this.f33712i = f12 != -1.0f && f12 >= 10.0f;
        this.f33713j = jy2.f19924j;
        this.f33714k = jy2.c();
        int i24 = 0;
        while (true) {
            int size = y01.f29092o.size();
            i14 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i24 >= size) {
                iO = 0;
                i24 = Integer.MAX_VALUE;
                break;
            } else {
                iO = C3048c.o(this.f31649d, (String) y01.f29092o.get(i24), false);
                if (iO > 0) {
                    break;
                } else {
                    i24++;
                }
            }
        }
        this.f33716m = i24;
        this.f33717v = iO;
        this.f33718w = C3048c.r(this.f31649d.f19920f, 0);
        int i25 = this.f31649d.f19920f;
        this.f33702H = i25 == 0 || (i25 & 1) != 0;
        this.f33703I = C3048c.o(this.f31649d, str, C3048c.n(str) == null);
        for (int i26 = 0; i26 < y01.f29090m.size(); i26++) {
            String str2 = this.f31649d.f19929o;
            if (str2 != null && str2.equals(y01.f29090m.get(i26))) {
                i14 = i26;
                break;
            }
        }
        this.f33715l = i14;
        this.f33701G = C3048c.s(this.f31649d, y01.f29091n);
        this.f33705K = (i12 & 384) == 128;
        this.f33706L = (i12 & 64) == 64;
        JY0 jy3 = this.f31649d;
        String str3 = jy3.f19929o;
        if (str3 == null) {
            i15 = 0;
        } else {
            i15 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    b10 = 0;
                    break;
                case "video/av01":
                    b10 = 1;
                    break;
                case "video/hevc":
                    b10 = 2;
                    break;
                case "video/avc":
                    b10 = 4;
                    break;
                case "video/x-vnd.on2.vp9":
                    b10 = 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                i15 = 5;
            } else if (b10 != 1) {
                if (b10 == 2) {
                    i15 = 3;
                } else if (b10 == 3) {
                    i15 = 2;
                } else if (b10 != 4) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
            }
        }
        this.f33707M = i15;
        if ((jy3.f19920f & 16384) != 0) {
            i22 = 0;
        } else {
            Y01 y02 = this.f33709f;
            if (!GS0.b(i12, y02.f25449U) || (!(z12 = this.f33708e) && !y02.f25438J)) {
                i22 = 0;
            } else if (GS0.b(i12, false) && this.f33710g && z12 && jy3.f19924j != -1 && (i23 & i12) != 0) {
                i22 = 2;
            }
        }
        this.f33704J = i22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(u11 u11Var, u11 u11Var2) {
        AbstractC4168ku0 abstractC4168ku0A = AbstractC4168ku0.f().d(u11Var.f33711h, u11Var2.f33711h).a(Integer.valueOf(u11Var.f33716m), Integer.valueOf(u11Var2.f33716m), AbstractC5051rv0.b().a()).b(u11Var.f33717v, u11Var2.f33717v).b(u11Var.f33718w, u11Var2.f33718w).a(Integer.valueOf(u11Var.f33701G), Integer.valueOf(u11Var2.f33701G), AbstractC5051rv0.b().a()).d(u11Var.f33702H, u11Var2.f33702H).b(u11Var.f33703I, u11Var2.f33703I).d(u11Var.f33712i, u11Var2.f33712i).d(u11Var.f33708e, u11Var2.f33708e).d(u11Var.f33710g, u11Var2.f33710g).a(Integer.valueOf(u11Var.f33715l), Integer.valueOf(u11Var2.f33715l), AbstractC5051rv0.b().a());
        boolean z9 = u11Var.f33705K;
        AbstractC4168ku0 abstractC4168ku0D = abstractC4168ku0A.d(z9, u11Var2.f33705K);
        boolean z10 = u11Var.f33706L;
        AbstractC4168ku0 abstractC4168ku0D2 = abstractC4168ku0D.d(z10, u11Var2.f33706L);
        if (z9 && z10) {
            abstractC4168ku0D2 = abstractC4168ku0D2.b(u11Var.f33707M, u11Var2.f33707M);
        }
        return abstractC4168ku0D2.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(u11 u11Var, u11 u11Var2) {
        AbstractC5051rv0 abstractC5051rv0A = (u11Var.f33708e && u11Var.f33711h) ? C3048c.f26966k : C3048c.f26966k.a();
        AbstractC4168ku0 abstractC4168ku0F = AbstractC4168ku0.f();
        boolean z9 = u11Var.f33709f.f29074F;
        return abstractC4168ku0F.a(Integer.valueOf(u11Var.f33714k), Integer.valueOf(u11Var2.f33714k), abstractC5051rv0A).a(Integer.valueOf(u11Var.f33713j), Integer.valueOf(u11Var2.f33713j), abstractC5051rv0A).e();
    }

    @Override // com.google.android.gms.internal.ads.n11
    public final /* bridge */ /* synthetic */ boolean c(n11 n11Var) {
        u11 u11Var = (u11) n11Var;
        if (!Objects.equals(this.f31649d.f19929o, u11Var.f31649d.f19929o)) {
            return false;
        }
        boolean z9 = this.f33709f.f25441M;
        return this.f33705K == u11Var.f33705K && this.f33706L == u11Var.f33706L;
    }

    @Override // com.google.android.gms.internal.ads.n11
    public final int zza() {
        return this.f33704J;
    }
}
