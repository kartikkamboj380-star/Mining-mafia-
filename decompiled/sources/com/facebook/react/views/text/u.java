package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.uimanager.C1356f0;
import com.facebook.react.uimanager.C1360h0;
import com.facebook.react.uimanager.C1385u0;
import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.DescriptorProtos;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int f16270F = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f16280e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f16282g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected float f16276a = Float.NaN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f16277b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f16278c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f16279d = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f16281f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected float f16283h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f16284i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f16285j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f16286k = -1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected float f16287l = -1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected float f16288m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f16289n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f16290o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected y f16291p = y.NONE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected float f16292q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected float f16293r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected float f16294s = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f16295t = 1426063360;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f16296u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f16297v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f16298w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected C1360h0.d f16299x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected C1360h0.e f16300y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f16301z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected int f16271A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected String f16272B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected String f16273C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected boolean f16274D = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected float f16275E = Float.NaN;

    private u() {
    }

    private void C(String str) {
        if (str == null) {
            this.f16299x = null;
        } else {
            this.f16299x = C1360h0.d.e(str);
        }
    }

    private void D(boolean z9) {
        if (z9 != this.f16278c) {
            this.f16278c = z9;
            H(this.f16286k);
            N(this.f16287l);
        }
    }

    private void E(Integer num) {
        this.f16281f = num != null;
        if (num != null) {
            this.f16282g = num.intValue();
        }
    }

    private void F(Integer num) {
        this.f16277b = num != null;
        if (num != null) {
            this.f16280e = num.intValue();
        }
    }

    private void G(String str) {
        this.f16272B = str;
    }

    private void H(float f10) {
        this.f16286k = f10;
        if (f10 != -1.0f) {
            f10 = (float) (this.f16278c ? Math.ceil(C1356f0.l(f10, this.f16279d)) : Math.ceil(C1356f0.i(f10)));
        }
        this.f16285j = (int) f10;
    }

    private void I(String str) {
        this.f16301z = s.b(str);
    }

    private void J(com.facebook.react.common.mapbuffer.a aVar) {
        if (aVar == null || aVar.getCount() == 0) {
            this.f16273C = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            String stringValue = ((com.facebook.react.common.mapbuffer.a.c) it.next()).getStringValue();
            if (stringValue != null) {
                switch (stringValue) {
                    case "stylistic-thirteen":
                        arrayList.add("'ss13'");
                        break;
                    case "stylistic-fifteen":
                        arrayList.add("'ss15'");
                        break;
                    case "stylistic-eighteen":
                        arrayList.add("'ss18'");
                        break;
                    case "proportional-nums":
                        arrayList.add("'pnum'");
                        break;
                    case "lining-nums":
                        arrayList.add("'lnum'");
                        break;
                    case "tabular-nums":
                        arrayList.add("'tnum'");
                        break;
                    case "oldstyle-nums":
                        arrayList.add("'onum'");
                        break;
                    case "stylistic-eight":
                        arrayList.add("'ss08'");
                        break;
                    case "stylistic-seven":
                        arrayList.add("'ss07'");
                        break;
                    case "stylistic-three":
                        arrayList.add("'ss03'");
                        break;
                    case "stylistic-eleven":
                        arrayList.add("'ss11'");
                        break;
                    case "stylistic-five":
                        arrayList.add("'ss05'");
                        break;
                    case "stylistic-four":
                        arrayList.add("'ss04'");
                        break;
                    case "stylistic-nine":
                        arrayList.add("'ss09'");
                        break;
                    case "stylistic-one":
                        arrayList.add("'ss01'");
                        break;
                    case "stylistic-six":
                        arrayList.add("'ss06'");
                        break;
                    case "stylistic-ten":
                        arrayList.add("'ss10'");
                        break;
                    case "stylistic-two":
                        arrayList.add("'ss02'");
                        break;
                    case "stylistic-sixteen":
                        arrayList.add("'ss16'");
                        break;
                    case "stylistic-twelve":
                        arrayList.add("'ss12'");
                        break;
                    case "stylistic-twenty":
                        arrayList.add("'ss20'");
                        break;
                    case "small-caps":
                        arrayList.add("'smcp'");
                        break;
                    case "stylistic-nineteen":
                        arrayList.add("'ss19'");
                        break;
                    case "stylistic-fourteen":
                        arrayList.add("'ss14'");
                        break;
                    case "stylistic-seventeen":
                        arrayList.add("'ss17'");
                        break;
                }
            }
        }
        this.f16273C = TextUtils.join(", ", arrayList);
    }

    private void K(String str) {
        this.f16271A = s.d(str);
    }

    private void L(String str) {
        this.f16290o = n(str);
    }

    private void M(float f10) {
        this.f16288m = f10;
    }

    private void N(float f10) {
        this.f16287l = f10;
        if (f10 == -1.0f) {
            this.f16276a = Float.NaN;
        } else {
            this.f16276a = this.f16278c ? C1356f0.k(f10) : C1356f0.i(f10);
        }
    }

    private void O(float f10) {
        if (f10 != this.f16279d) {
            this.f16279d = f10;
            H(this.f16286k);
            N(this.f16287l);
        }
    }

    private void P(float f10) {
        this.f16283h = f10;
    }

    private void Q(C1360h0.e eVar) {
        this.f16300y = eVar;
    }

    private void R(String str) {
        this.f16296u = false;
        this.f16297v = false;
        if (str != null) {
            for (String str2 : str.split("-")) {
                if ("underline".equals(str2)) {
                    this.f16296u = true;
                } else if ("strikethrough".equals(str2)) {
                    this.f16297v = true;
                }
            }
        }
    }

    private void S(int i10) {
        if (i10 != this.f16295t) {
            this.f16295t = i10;
        }
    }

    private void T(float f10) {
        this.f16292q = C1356f0.i(f10);
    }

    private void U(float f10) {
        this.f16293r = C1356f0.i(f10);
    }

    private void V(float f10) {
        if (f10 != this.f16294s) {
            this.f16294s = f10;
        }
    }

    private void W(String str) {
        if (str == null || "none".equals(str)) {
            this.f16291p = y.NONE;
            return;
        }
        if ("uppercase".equals(str)) {
            this.f16291p = y.UPPERCASE;
            return;
        }
        if ("lowercase".equals(str)) {
            this.f16291p = y.LOWERCASE;
            return;
        }
        if ("capitalize".equals(str)) {
            this.f16291p = y.CAPITALIZE;
            return;
        }
        Z1.a.I("ReactNative", "Invalid textTransform: " + str);
        this.f16291p = y.NONE;
    }

    public static u a(com.facebook.react.common.mapbuffer.a aVar) {
        u uVar = new u();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            com.facebook.react.common.mapbuffer.a.c cVar = (com.facebook.react.common.mapbuffer.a.c) it.next();
            switch (cVar.getKey()) {
                case 0:
                    uVar.F(Integer.valueOf(cVar.getIntValue()));
                    break;
                case 1:
                    uVar.E(Integer.valueOf(cVar.getIntValue()));
                    break;
                case 2:
                    uVar.P((float) cVar.getDoubleValue());
                    break;
                case 3:
                    uVar.G(cVar.getStringValue());
                    break;
                case 4:
                    uVar.H((float) cVar.getDoubleValue());
                    break;
                case 6:
                    uVar.K(cVar.getStringValue());
                    break;
                case 7:
                    uVar.I(cVar.getStringValue());
                    break;
                case 8:
                    uVar.J(cVar.b());
                    break;
                case 9:
                    uVar.D(cVar.c());
                    break;
                case 10:
                    uVar.M((float) cVar.getDoubleValue());
                    break;
                case 11:
                    uVar.N((float) cVar.getDoubleValue());
                    break;
                case 15:
                    uVar.R(cVar.getStringValue());
                    break;
                case 18:
                    uVar.V((float) cVar.getDoubleValue());
                    break;
                case 19:
                    uVar.S(cVar.getIntValue());
                    break;
                case 20:
                    uVar.T((float) cVar.getDoubleValue());
                    break;
                case 21:
                    uVar.U((float) cVar.getDoubleValue());
                    break;
                case 23:
                    uVar.L(cVar.getStringValue());
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    uVar.C(cVar.getStringValue());
                    break;
                case 26:
                    uVar.Q(C1360h0.e.values()[cVar.getIntValue()]);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    uVar.W(cVar.getStringValue());
                    break;
                case 29:
                    uVar.O((float) cVar.getDoubleValue());
                    break;
            }
        }
        return uVar;
    }

    public static TextUtils.TruncateAt g(String str) {
        if (str != null) {
            switch (str) {
                case "middle":
                    return TextUtils.TruncateAt.MIDDLE;
                case "clip":
                    return null;
                case "head":
                    return TextUtils.TruncateAt.START;
                case "tail":
                    return TextUtils.TruncateAt.END;
            }
        }
        return null;
    }

    public static int l(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals("normal")) {
            return 1;
        }
        return !str.equals("none") ? 2 : 0;
    }

    public static int m(C1385u0 c1385u0, int i10) {
        if (!c1385u0.c("textAlign")) {
            return i10;
        }
        if (!"justify".equals(c1385u0.b("textAlign")) || Build.VERSION.SDK_INT < 26) {
            return f16270F;
        }
        return 1;
    }

    public static int n(String str) {
        if (str != null && !"undefined".equals(str)) {
            if ("rtl".equals(str)) {
                return 1;
            }
            if ("ltr".equals(str)) {
                return 0;
            }
            Z1.a.I("ReactNative", "Invalid layoutDirection: " + str);
        }
        return -1;
    }

    public static int r(C1385u0 c1385u0, boolean z9, int i10) {
        if (!c1385u0.c("textAlign")) {
            return i10;
        }
        String strB = c1385u0.b("textAlign");
        if ("justify".equals(strB)) {
            return 3;
        }
        if (strB != null && !"auto".equals(strB)) {
            if ("left".equals(strB)) {
                return z9 ? 5 : 3;
            }
            if ("right".equals(strB)) {
                return z9 ? 3 : 5;
            }
            if ("center".equals(strB)) {
                return 1;
            }
            Z1.a.I("ReactNative", "Invalid textAlign: " + strB);
        }
        return 0;
    }

    public static int s(String str) {
        if (str == null) {
            return 1;
        }
        if (str.equals("balanced")) {
            return 2;
        }
        return !str.equals("simple") ? 1 : 0;
    }

    public boolean A() {
        return this.f16297v;
    }

    public boolean B() {
        return this.f16296u;
    }

    public C1360h0.d b() {
        return this.f16299x;
    }

    public int c() {
        return this.f16282g;
    }

    public int d() {
        return this.f16280e;
    }

    public int e() {
        return this.f16285j;
    }

    public float f() {
        if (!Float.isNaN(this.f16276a) && !Float.isNaN(this.f16275E)) {
            float f10 = this.f16275E;
            if (f10 > this.f16276a) {
                return f10;
            }
        }
        return this.f16276a;
    }

    public String h() {
        return this.f16272B;
    }

    public String i() {
        return this.f16273C;
    }

    public int j() {
        return this.f16301z;
    }

    public int k() {
        return this.f16271A;
    }

    public float o() {
        float fK = this.f16278c ? C1356f0.k(this.f16288m) : C1356f0.i(this.f16288m);
        int i10 = this.f16285j;
        if (i10 > 0) {
            return fK / i10;
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.f16285j);
    }

    public float p() {
        return this.f16283h;
    }

    public C1360h0.e q() {
        return this.f16300y;
    }

    public int t() {
        return this.f16295t;
    }

    public float u() {
        return this.f16292q;
    }

    public float v() {
        return this.f16293r;
    }

    public float w() {
        return this.f16294s;
    }

    public y x() {
        return this.f16291p;
    }

    public boolean y() {
        return this.f16281f;
    }

    public boolean z() {
        return this.f16277b;
    }
}
