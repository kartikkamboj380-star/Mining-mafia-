package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class J01 extends n11 implements Comparable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f19711G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f19712H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final int f19713I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final int f19714J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final int f19715K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final int f19716L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final boolean f19717M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final boolean f19718N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f19719O;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Y01 f19723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f19724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f19725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f19726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f19727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f19728m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f19729v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f19730w;

    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    public J01(int i10, C2495Uf c2495Uf, int i11, Y01 y01, int i12, boolean z9, InterfaceC2470Ts0 interfaceC2470Ts0, int i13) {
        int i14;
        int iO;
        byte b10;
        boolean z10;
        int iO2;
        boolean z11;
        super(i10, c2495Uf, i11);
        this.f19723h = y01;
        int i15 = 1;
        int i16 = true != y01.f25447S ? 16 : 24;
        this.f19722g = C3048c.n(this.f31649d.f19918d);
        this.f19724i = GS0.b(i12, false);
        int i17 = 0;
        while (true) {
            int size = y01.f29094q.size();
            i14 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i17 >= size) {
                iO = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iO = C3048c.o(this.f31649d, (String) y01.f29094q.get(i17), false);
                if (iO > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f19726k = i17;
        this.f19725j = iO;
        this.f19727l = C3048c.r(this.f31649d.f19920f, 0);
        this.f19728m = C3048c.s(this.f31649d, y01.f29095r);
        JY0 jy0 = this.f31649d;
        int i18 = jy0.f19920f;
        this.f19729v = i18 == 0 || (i18 & 1) != 0;
        this.f19712H = 1 == (jy0.f19919e & 1);
        String str = jy0.f19929o;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2123537834) {
                if (iHashCode != 187078297) {
                    if (iHashCode == 1504698186 && str.equals("audio/iamf")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals("audio/ac4")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("audio/eac3-joc")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
            if (b10 == 0 || b10 == 1 || b10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f19719O = z10;
        int i19 = jy0.f19906G;
        this.f19713I = i19;
        this.f19714J = jy0.f19907H;
        int i20 = jy0.f19924j;
        this.f19715K = i20;
        this.f19721f = (i20 == -1 || i20 <= y01.f29098u) && (i19 == -1 || i19 <= y01.f29097t) && interfaceC2470Ts0.zza(jy0);
        String str2 = AbstractC4634ob0.f32117a;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i21 = 0; i21 < strArrSplit.length; i21++) {
            strArrSplit[i21] = AbstractC4634ob0.D(strArrSplit[i21]);
        }
        int i22 = 0;
        while (true) {
            if (i22 >= strArrSplit.length) {
                iO2 = 0;
                i22 = Integer.MAX_VALUE;
                break;
            } else {
                iO2 = C3048c.o(this.f31649d, strArrSplit[i22], false);
                if (iO2 > 0) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.f19730w = i22;
        this.f19711G = iO2;
        for (int i23 = 0; i23 < y01.f29099v.size(); i23++) {
            String str3 = this.f31649d.f19929o;
            if (str3 != null && str3.equals(y01.f29099v.get(i23))) {
                i14 = i23;
                break;
            }
        }
        this.f19716L = i14;
        this.f19717M = (i12 & 384) == 128;
        this.f19718N = (i12 & 64) == 64;
        Y01 y02 = this.f19723h;
        if (GS0.b(i12, y02.f25449U) && ((z11 = this.f19721f) || y02.f25442N)) {
            int i24 = y02.f29100w.f28462a;
            if (GS0.b(i12, false) && z11 && this.f31649d.f19924j != -1 && ((y02.f25451W || !z9) && (i16 & i12) != 0)) {
                i15 = 2;
            }
        } else {
            i15 = 0;
        }
        this.f19720e = i15;
    }

    @Override // com.google.android.gms.internal.ads.n11
    public final /* bridge */ /* synthetic */ boolean c(n11 n11Var) {
        String str;
        int i10;
        J01 j01 = (J01) n11Var;
        boolean z9 = this.f19723h.f25445Q;
        JY0 jy0 = this.f31649d;
        int i11 = jy0.f19906G;
        if (i11 == -1) {
            return false;
        }
        JY0 jy1 = j01.f31649d;
        return i11 == jy1.f19906G && (str = jy0.f19929o) != null && TextUtils.equals(str, jy1.f19929o) && (i10 = jy0.f19907H) != -1 && i10 == jy1.f19907H && this.f19717M == j01.f19717M && this.f19718N == j01.f19718N;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(J01 j01) {
        boolean z9 = this.f19721f;
        AbstractC5051rv0 abstractC5051rv0A = (z9 && this.f19724i) ? C3048c.f26966k : C3048c.f26966k.a();
        AbstractC4168ku0 abstractC4168ku0A = AbstractC4168ku0.f().d(this.f19724i, j01.f19724i).a(Integer.valueOf(this.f19726k), Integer.valueOf(j01.f19726k), AbstractC5051rv0.b().a()).b(this.f19725j, j01.f19725j).b(this.f19727l, j01.f19727l).a(Integer.valueOf(this.f19728m), Integer.valueOf(j01.f19728m), AbstractC5051rv0.b().a()).d(this.f19712H, j01.f19712H).d(this.f19729v, j01.f19729v).a(Integer.valueOf(this.f19730w), Integer.valueOf(j01.f19730w), AbstractC5051rv0.b().a()).b(this.f19711G, j01.f19711G).d(z9, j01.f19721f).a(Integer.valueOf(this.f19716L), Integer.valueOf(j01.f19716L), AbstractC5051rv0.b().a());
        boolean z10 = this.f19723h.f29074F;
        AbstractC4168ku0 abstractC4168ku0A2 = abstractC4168ku0A.d(this.f19717M, j01.f19717M).d(this.f19718N, j01.f19718N).d(this.f19719O, j01.f19719O).a(Integer.valueOf(this.f19713I), Integer.valueOf(j01.f19713I), abstractC5051rv0A).a(Integer.valueOf(this.f19714J), Integer.valueOf(j01.f19714J), abstractC5051rv0A);
        if (Objects.equals(this.f19722g, j01.f19722g)) {
            abstractC4168ku0A2 = abstractC4168ku0A2.a(Integer.valueOf(this.f19715K), Integer.valueOf(j01.f19715K), abstractC5051rv0A);
        }
        return abstractC4168ku0A2.e();
    }

    @Override // com.google.android.gms.internal.ads.n11
    public final int zza() {
        return this.f19720e;
    }
}
