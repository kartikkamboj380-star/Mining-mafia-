package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3048c extends AbstractC3803i implements FS0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AbstractC5051rv0 f26966k = AbstractC5051rv0.c(T01.f23365a);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f26967l = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f26968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f26969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Y01 f26970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Thread f26971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k11 f26972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C4966rF f26973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f26974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final F01 f26975j;

    public C3048c(Context context) {
        F01 f01 = new F01();
        Y01 y01 = Y01.f25437a0;
        this.f26968c = new Object();
        byte[] bArr = null;
        this.f26969d = context != null ? context.getApplicationContext() : null;
        this.f26975j = f01;
        if (y01 != null) {
            this.f26970e = y01;
        } else {
            X01 x01 = new X01(y01, bArr);
            x01.G(y01);
            this.f26970e = new Y01(x01, bArr);
        }
        this.f26973h = C4966rF.f32864b;
        if (this.f26970e.f25448T && context == null) {
            YU.c("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    protected static String n(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int o(JY0 jy0, String str, boolean z9) {
        if (!TextUtils.isEmpty(str) && str.equals(jy0.f19918d)) {
            return 4;
        }
        String strN = n(str);
        String strN2 = n(jy0.f19918d);
        if (strN2 == null || strN == null) {
            return (z9 && strN2 == null) ? 1 : 0;
        }
        if (strN2.startsWith(strN) || strN.startsWith(strN2)) {
            return 3;
        }
        String str2 = AbstractC4634ob0.f32117a;
        return strN2.split("-", 2)[0].equals(strN.split("-", 2)[0]) ? 2 : 0;
    }

    static /* synthetic */ int r(int i10, int i11) {
        return (i10 == 0 || i10 != i11) ? Integer.bitCount(i10 & i11) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    static /* synthetic */ int s(JY0 jy0, AbstractC5931yu0 abstractC5931yu0) {
        for (int i10 = 0; i10 < abstractC5931yu0.size(); i10++) {
            int i11 = 0;
            while (true) {
                List list = jy0.f19917c;
                if (i11 < list.size()) {
                    if (((MZ0) list.get(i11)).f20865b.equals(abstractC5931yu0.get(i10))) {
                        return i10;
                    }
                    i11++;
                }
            }
        }
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        boolean z9;
        k11 k11Var;
        synchronized (this.f26968c) {
            try {
                z9 = false;
                if (this.f26970e.f25448T && Build.VERSION.SDK_INT >= 32 && (k11Var = this.f26972g) != null && k11Var.a()) {
                    z9 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            i();
        }
    }

    private static void v(A01 a01, C3771hk c3771hk, Map map) {
        for (int i10 = 0; i10 < a01.f17222a; i10++) {
            p070h.w.a(c3771hk.f29076H.get(a01.a(i10)));
        }
    }

    private static final Pair w(int i10, C3677h c3677h, int[][][] iArr, m11 m11Var, Comparator comparator) {
        RandomAccess randomAccessM;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 2; i11++) {
            if (i10 == c3677h.a(i11)) {
                A01 a01B = c3677h.b(i11);
                for (int i12 = 0; i12 < a01B.f17222a; i12++) {
                    C2495Uf c2495UfA = a01B.a(i12);
                    List listA = m11Var.a(i11, c2495UfA, iArr[i11][i12]);
                    int i13 = c2495UfA.f24070a;
                    boolean[] zArr = new boolean[i13];
                    int i14 = 0;
                    while (i14 < i13) {
                        int i15 = i14 + 1;
                        n11 n11Var = (n11) listA.get(i14);
                        int iZza = n11Var.zza();
                        if (!zArr[i14] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessM = AbstractC5931yu0.m(n11Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(n11Var);
                                for (int i16 = i15; i16 < i13; i16++) {
                                    n11 n11Var2 = (n11) listA.get(i16);
                                    if (n11Var2.zza() == 2 && n11Var.c(n11Var2)) {
                                        arrayList2.add(n11Var2);
                                        zArr[i16] = true;
                                    }
                                }
                                randomAccessM = arrayList2;
                            }
                            arrayList.add(randomAccessM);
                        }
                        i14 = i15;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((n11) list.get(i17)).f31648c;
        }
        n11 n11Var3 = (n11) list.get(0);
        return Pair.create(new C3174d(n11Var3.f31647b, iArr2, 0), Integer.valueOf(n11Var3.f31646a));
    }

    @Override // com.google.android.gms.internal.ads.FS0
    public final void a(ES0 es0) {
        synchronized (this.f26968c) {
            boolean z9 = this.f26970e.f25452X;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4179l
    public final void b() {
        k11 k11Var;
        synchronized (this.f26968c) {
            try {
                Thread thread = this.f26971f;
                if (thread != null) {
                    AbstractC2418Ss0.j(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (k11Var = this.f26972g) != null) {
            k11Var.e();
            this.f26972g = null;
        }
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4179l
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4179l
    public final void d(C4966rF c4966rF) {
        if (this.f26973h.equals(c4966rF)) {
            return;
        }
        this.f26973h = c4966rF;
        q();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4179l
    public final FS0 e() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3803i
    protected final Pair k(C3677h c3677h, int[][][] iArr, final int[] iArr2, C5637wZ0 c5637wZ0, AbstractC5270tf abstractC5270tf) {
        final Y01 y01;
        int i10;
        final boolean z9;
        final String str;
        final String languageTag;
        int[] iArr3;
        int length;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Context context3;
        synchronized (this.f26968c) {
            this.f26971f = Thread.currentThread();
            y01 = this.f26970e;
        }
        if (this.f26974i == null && (context3 = this.f26969d) != null) {
            this.f26974i = Boolean.valueOf(AbstractC4634ob0.m(context3));
        }
        if (y01.f25448T && Build.VERSION.SDK_INT >= 32 && this.f26972g == null) {
            this.f26972g = new k11(this.f26969d, this, this.f26974i);
        }
        int i11 = 2;
        C3174d[] c3174dArr = new C3174d[2];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= 2) {
                z9 = false;
                break;
            }
            if (c3677h.a(i13) == 2 && c3677h.b(i13).f17222a > 0) {
                z9 = true;
                break;
            }
            i13++;
        }
        Pair pairW = w(1, c3677h, iArr, new m11() { // from class: com.google.android.gms.internal.ads.P01
            @Override // com.google.android.gms.internal.ads.m11
            public final /* synthetic */ List a(int i14, C2495Uf c2495Uf, int[] iArr4) {
                final C3048c c3048c = this.f21998a;
                final Y01 y02 = y01;
                InterfaceC2470Ts0 interfaceC2470Ts0 = new InterfaceC2470Ts0() { // from class: com.google.android.gms.internal.ads.S01
                    @Override // com.google.android.gms.internal.ads.InterfaceC2470Ts0
                    public final /* synthetic */ boolean zza(Object obj) {
                        return c3048c.p(y02, (JY0) obj);
                    }
                };
                int i15 = iArr2[i14];
                int i16 = AbstractC5931yu0.f35482c;
                C5553vu0 c5553vu0 = new C5553vu0();
                for (int i17 = 0; i17 < c2495Uf.f24070a; i17++) {
                    c5553vu0.g(new J01(i14, c2495Uf, i17, y02, iArr4[i17], z9, interfaceC2470Ts0, i15));
                }
                return c5553vu0.j();
            }
        }, K01.f20039a);
        if (pairW != null) {
            c3174dArr[((Integer) pairW.second).intValue()] = (C3174d) pairW.first;
        }
        if (pairW == null) {
            str = null;
        } else {
            Object obj = pairW.first;
            str = ((C3174d) obj).f27267a.a(((C3174d) obj).f27268b[0]).f19918d;
        }
        int i14 = y01.f29100w.f28462a;
        final Point pointO = (!y01.f29088k || (context2 = this.f26969d) == null) ? null : AbstractC4634ob0.o(context2);
        Pair pairW2 = w(2, c3677h, iArr, new m11() { // from class: com.google.android.gms.internal.ads.U01
            /* JADX WARN: Code duplicated, block: B:29:0x004d  */
            @Override // com.google.android.gms.internal.ads.m11
            public final /* synthetic */ List a(int i15, C2495Uf c2495Uf, int[] iArr4) {
                int i16;
                int i17;
                int i18;
                int i19;
                int i20;
                int i21;
                Point point;
                C2495Uf c2495Uf2 = c2495Uf;
                int i22 = C3048c.f26967l;
                Point point2 = pointO;
                int i23 = iArr2[i15];
                Y01 y02 = y01;
                int i24 = point2 != null ? point2.x : y02.f29086i;
                int i25 = point2 != null ? point2.y : y02.f29087j;
                boolean z10 = y02.f29089l;
                if (i24 == Integer.MAX_VALUE) {
                    i16 = -1;
                    i17 = Integer.MAX_VALUE;
                } else if (i25 == Integer.MAX_VALUE) {
                    i17 = Integer.MAX_VALUE;
                    i16 = -1;
                } else {
                    int i26 = Integer.MAX_VALUE;
                    for (int i27 = 0; i27 < c2495Uf2.f24070a; i27++) {
                        JY0 jy0A = c2495Uf2.a(i27);
                        int i28 = jy0A.f19936v;
                        if (i28 > 0 && (i19 = jy0A.f19937w) > 0) {
                            if (!z10) {
                                i20 = i25;
                                i21 = i24;
                            } else if ((i28 > i19) != (i24 > i25)) {
                                i21 = i25;
                                i20 = i24;
                            } else {
                                i20 = i25;
                                i21 = i24;
                            }
                            int i29 = i28 * i20;
                            int i30 = i19 * i21;
                            if (i29 >= i30) {
                                String str2 = AbstractC4634ob0.f32117a;
                                point = new Point(i21, ((i30 + i28) - 1) / i28);
                            } else {
                                String str3 = AbstractC4634ob0.f32117a;
                                point = new Point(((i29 + i19) - 1) / i19, i20);
                            }
                            int i31 = i28 * i19;
                            if (i28 >= ((int) (point.x * 0.98f)) && i19 >= ((int) (point.y * 0.98f)) && i31 < i26) {
                                i26 = i31;
                            }
                        }
                    }
                    i16 = -1;
                    i17 = i26;
                }
                int i32 = AbstractC5931yu0.f35482c;
                C5553vu0 c5553vu0 = new C5553vu0();
                int i33 = 0;
                while (i33 < c2495Uf2.f24070a) {
                    int iC = c2495Uf2.a(i33).c();
                    if (i17 != Integer.MAX_VALUE) {
                        i18 = i16;
                        boolean z11 = iC != i18 && iC <= i17;
                        c5553vu0.g(new u11(i15, c2495Uf2, i33, y02, iArr4[i33], str, i23, z11));
                        i33++;
                        c2495Uf2 = c2495Uf;
                        i16 = i18;
                    } else {
                        i18 = i16;
                    }
                    c5553vu0.g(new u11(i15, c2495Uf2, i33, y02, iArr4[i33], str, i23, z11));
                    i33++;
                    c2495Uf2 = c2495Uf;
                    i16 = i18;
                }
                return c5553vu0.j();
            }
        }, O01.f21438a);
        int i15 = 4;
        Pair pairW3 = pairW2 == null ? w(4, c3677h, iArr, new m11() { // from class: com.google.android.gms.internal.ads.R01
            @Override // com.google.android.gms.internal.ads.m11
            public final /* synthetic */ List a(int i16, C2495Uf c2495Uf, int[] iArr4) {
                int i17 = C3048c.f26967l;
                int i18 = AbstractC5931yu0.f35482c;
                C5553vu0 c5553vu0 = new C5553vu0();
                for (int i19 = 0; i19 < c2495Uf.f24070a; i19++) {
                    c5553vu0.g(new V01(i16, c2495Uf, i19, y01, iArr4[i19]));
                }
                return c5553vu0.j();
            }
        }, L01.f20330a) : null;
        if (pairW3 != null) {
            c3174dArr[((Integer) pairW3.second).intValue()] = (C3174d) pairW3.first;
        } else if (pairW2 != null) {
            c3174dArr[((Integer) pairW2.second).intValue()] = (C3174d) pairW2.first;
        }
        if (!y01.f29070B || (context = this.f26969d) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = AbstractC4634ob0.f32117a;
            languageTag = locale.toLanguageTag();
        }
        int i16 = 3;
        Pair pairW4 = w(3, c3677h, iArr, new m11() { // from class: com.google.android.gms.internal.ads.Q01
            @Override // com.google.android.gms.internal.ads.m11
            public final /* synthetic */ List a(int i17, C2495Uf c2495Uf, int[] iArr4) {
                int i18 = C3048c.f26967l;
                int i19 = AbstractC5931yu0.f35482c;
                C5553vu0 c5553vu0 = new C5553vu0();
                for (int i20 = 0; i20 < c2495Uf.f24070a; i20++) {
                    c5553vu0.g(new l11(i17, c2495Uf, i20, y01, iArr4[i20], str, languageTag));
                }
                return c5553vu0.j();
            }
        }, N01.f21002a);
        if (pairW4 != null) {
            c3174dArr[((Integer) pairW4.second).intValue()] = (C3174d) pairW4.first;
        }
        int i17 = 0;
        while (i17 < i11) {
            int iA = c3677h.a(i17);
            if (iA != i11 && iA != i10 && iA != i16 && iA != i15) {
                A01 a01B = c3677h.b(i17);
                int[][] iArr4 = iArr[i17];
                int i18 = i12;
                int i19 = i18;
                C2495Uf c2495Uf = null;
                W01 w01 = null;
                while (i18 < a01B.f17222a) {
                    C2495Uf c2495UfA = a01B.a(i18);
                    int[] iArr5 = iArr4[i18];
                    W01 w02 = w01;
                    for (int i20 = i12; i20 < c2495UfA.f24070a; i20++) {
                        if (GS0.b(iArr5[i20], y01.f25449U)) {
                            W01 w03 = new W01(c2495UfA.a(i20), iArr5[i20]);
                            if (w02 == null || w03.compareTo(w02) > 0) {
                                c2495Uf = c2495UfA;
                                w02 = w03;
                                i19 = i20;
                            }
                        }
                    }
                    i18++;
                    w01 = w02;
                    i12 = 0;
                }
                c3174dArr[i17] = c2495Uf == null ? null : new C3174d(c2495Uf, new int[]{i19}, 0);
            }
            i17++;
            i11 = 2;
            i12 = 0;
            i16 = 3;
            i10 = 1;
            i15 = 4;
        }
        HashMap map = new HashMap();
        int i21 = 2;
        for (int i22 = 0; i22 < 2; i22++) {
            v(c3677h.b(i22), y01, map);
        }
        v(c3677h.e(), y01, map);
        for (int i23 = 0; i23 < 2; i23++) {
            p070h.w.a(map.get(Integer.valueOf(c3677h.a(i23))));
        }
        int i24 = 0;
        while (i24 < i21) {
            A01 a01B2 = c3677h.b(i24);
            if (y01.b(i24, a01B2)) {
                y01.c(i24, a01B2);
                c3174dArr[i24] = null;
            }
            i24++;
            i21 = 2;
        }
        int i25 = 0;
        while (i25 < i21) {
            int iA2 = c3677h.a(i25);
            if (y01.a(i25) || y01.f29077I.contains(Integer.valueOf(iA2))) {
                c3174dArr[i25] = null;
            }
            i25++;
            i21 = 2;
        }
        F01 f01 = this.f26975j;
        InterfaceC5312u interfaceC5312uJ = j();
        AbstractC5931yu0 abstractC5931yu0A = G01.a(c3174dArr);
        int i26 = 2;
        InterfaceC3299e[] interfaceC3299eArr = new InterfaceC3299e[2];
        int i27 = 0;
        while (i27 < i26) {
            C3174d c3174d = c3174dArr[i27];
            if (c3174d != null && (length = (iArr3 = c3174d.f27268b).length) != 0) {
                interfaceC3299eArr[i27] = length == 1 ? new C3425f(c3174d.f27267a, iArr3[0], 0, 0, null) : f01.a(c3174d.f27267a, iArr3, 0, interfaceC5312uJ, (AbstractC5931yu0) abstractC5931yu0A.get(i27));
            }
            i27++;
            i26 = 2;
        }
        HS0[] hs0Arr = new HS0[i26];
        for (int i28 = 0; i28 < i26; i28++) {
            hs0Arr[i28] = (y01.a(i28) || y01.f29077I.contains(Integer.valueOf(c3677h.a(i28))) || (c3677h.a(i28) != -2 && interfaceC3299eArr[i28] == null)) ? null : HS0.f19295b;
        }
        return Pair.create(hs0Arr, interfaceC3299eArr);
    }

    public final Y01 l() {
        Y01 y01;
        synchronized (this.f26968c) {
            y01 = this.f26970e;
        }
        return y01;
    }

    public final void m(X01 x01) {
        boolean zEquals;
        Y01 y01 = new Y01(x01, null);
        synchronized (this.f26968c) {
            zEquals = this.f26970e.equals(y01);
            this.f26970e = y01;
        }
        if (zEquals) {
            return;
        }
        if (y01.f25448T && this.f26969d == null) {
            YU.c("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        i();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final /* synthetic */ boolean p(Y01 y01, JY0 jy0) {
        Boolean bool;
        k11 k11Var;
        k11 k11Var2;
        if (!y01.f25448T || ((bool = this.f26974i) != null && bool.booleanValue())) {
            return true;
        }
        int i10 = jy0.f19906G;
        byte b10 = -1;
        if (i10 != -1 && i10 > 2) {
            String str = jy0.f19929o;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals("audio/eac3-joc")) {
                            b10 = 2;
                        }
                        break;
                    case 187078296:
                        if (str.equals("audio/ac3")) {
                            b10 = 0;
                        }
                        break;
                    case 187078297:
                        if (str.equals("audio/ac4")) {
                            b10 = 3;
                        }
                        break;
                    case 1504578661:
                        if (str.equals("audio/eac3")) {
                            b10 = 1;
                        }
                        break;
                }
                if ((b10 == 0 || b10 == 1 || b10 == 2 || b10 == 3) && (Build.VERSION.SDK_INT < 32 || (k11Var2 = this.f26972g) == null || !k11Var2.a())) {
                    return true;
                }
            }
            return Build.VERSION.SDK_INT >= 32 && (k11Var = this.f26972g) != null && k11Var.a() && k11Var.b() && this.f26972g.c() && this.f26972g.d(this.f26973h, jy0);
        }
        return true;
    }
}
