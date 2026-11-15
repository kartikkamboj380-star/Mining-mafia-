package com.facebook.react.views.text;

import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1350c0;
import com.facebook.react.uimanager.C1356f0;
import com.facebook.react.uimanager.C1360h0;
import com.facebook.react.uimanager.C1383t0;
import com.facebook.react.uimanager.InterfaceC1381s0;
import com.facebook.react.uimanager.P;
import com.facebook.react.uimanager.U;
import com.facebook.yoga.YogaValue;
import com.horcrux.svg.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends U {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected r f16176A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected v f16177B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected boolean f16178C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected int f16179D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected boolean f16180E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected int f16181F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected C1360h0.d f16182G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected C1360h0.e f16183H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected int f16184I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected int f16185J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected int f16186K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    protected int f16187L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    protected int f16188M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    protected float f16189N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected float f16190O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    protected float f16191P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    protected int f16192Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected boolean f16193R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected boolean f16194S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected boolean f16195T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    protected boolean f16196U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    protected float f16197V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    protected int f16198W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    protected int f16199X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    protected String f16200Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    protected String f16201Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected boolean f16202a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected Map f16203b0;

    public d() {
        this(null);
    }

    private static void u1(d dVar, SpannableStringBuilder spannableStringBuilder, List list, v vVar, boolean z9, Map map, int i10) {
        float fC0;
        float fH;
        v vVarA = vVar != null ? vVar.a(dVar.f16177B) : dVar.f16177B;
        int iB = dVar.b();
        for (int i11 = 0; i11 < iB; i11++) {
            C1383t0 c1383t0A = dVar.a(i11);
            if (c1383t0A instanceof f) {
                String strT1 = ((f) c1383t0A).t1();
                if (strT1 != null) {
                    spannableStringBuilder.append((CharSequence) y.d(strT1, vVarA.f16308f));
                }
            } else if (c1383t0A instanceof d) {
                u1((d) c1383t0A, spannableStringBuilder, list, vVarA, z9, map, spannableStringBuilder.length());
            } else if (c1383t0A instanceof p015b4.a) {
                spannableStringBuilder.append("0");
                list.add(new p025c4.n(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((p015b4.a) c1383t0A).u1()));
            } else {
                if (!z9) {
                    throw new P("Unexpected view type nested under a <Text> or <TextInput> node: " + c1383t0A.getClass());
                }
                int iM = c1383t0A.M();
                YogaValue yogaValueS = c1383t0A.s();
                YogaValue yogaValueK = c1383t0A.K();
                com.facebook.yoga.w wVar = yogaValueS.f16610b;
                com.facebook.yoga.w wVar2 = com.facebook.yoga.w.POINT;
                if (wVar == wVar2 && yogaValueK.f16610b == wVar2) {
                    fC0 = yogaValueS.f16609a;
                    fH = yogaValueK.f16609a;
                } else {
                    c1383t0A.O();
                    fC0 = c1383t0A.c0();
                    fH = c1383t0A.h();
                }
                spannableStringBuilder.append("0");
                list.add(new p025c4.n(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new p025c4.q(iM, (int) fC0, (int) fH)));
                ((Map) p004a3.a.c(map)).put(Integer.valueOf(iM), c1383t0A);
            }
            c1383t0A.d();
        }
        int length = spannableStringBuilder.length();
        if (length >= i10) {
            if (dVar.f16178C) {
                list.add(new p025c4.n(i10, length, new p025c4.g(dVar.f16179D)));
            }
            if (dVar.f16180E) {
                list.add(new p025c4.n(i10, length, new p025c4.e(dVar.f16181F)));
            }
            C1360h0.e eVar = dVar.f16183H;
            if (eVar == null ? dVar.f16182G == C1360h0.d.LINK : eVar == C1360h0.e.LINK) {
                list.add(new p025c4.n(i10, length, new p025c4.f(dVar.M())));
            }
            float fD = vVarA.d();
            if (!Float.isNaN(fD) && (vVar == null || vVar.d() != fD)) {
                list.add(new p025c4.n(i10, length, new p025c4.a(fD)));
            }
            int iC = vVarA.c();
            if (vVar == null || vVar.c() != iC) {
                list.add(new p025c4.n(i10, length, new p025c4.d(iC)));
            }
            if (dVar.f16198W != -1 || dVar.f16199X != -1 || dVar.f16200Y != null) {
                list.add(new p025c4.n(i10, length, new p025c4.c(dVar.f16198W, dVar.f16199X, dVar.f16201Z, dVar.f16200Y, dVar.R().getAssets())));
            }
            if (dVar.f16193R) {
                list.add(new p025c4.n(i10, length, new p025c4.m()));
            }
            if (dVar.f16194S) {
                list.add(new p025c4.n(i10, length, new p025c4.j()));
            }
            if ((dVar.f16189N != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || dVar.f16190O != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || dVar.f16191P != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && Color.alpha(dVar.f16192Q) != 0) {
                list.add(new p025c4.n(i10, length, new p025c4.o(dVar.f16189N, dVar.f16190O, dVar.f16191P, dVar.f16192Q)));
            }
            float fE = vVarA.e();
            if (!Float.isNaN(fE) && (vVar == null || vVar.e() != fE)) {
                list.add(new p025c4.n(i10, length, new p025c4.b(fE)));
            }
            list.add(new p025c4.n(i10, length, new p025c4.k(dVar.M())));
        }
    }

    @O3.a(name = "accessibilityRole")
    public void setAccessibilityRole(String str) {
        if (P()) {
            this.f16182G = C1360h0.d.e(str);
            w0();
        }
    }

    @O3.a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z9) {
        if (z9 != this.f16196U) {
            this.f16196U = z9;
            w0();
        }
    }

    @O3.a(defaultBoolean = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z9) {
        if (z9 != this.f16177B.b()) {
            this.f16177B.h(z9);
            w0();
        }
    }

    @O3.a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (P()) {
            if (num != null) {
                this.f16180E = true;
                this.f16181F = num.intValue();
            }
            w0();
        }
    }

    @O3.a(customType = "Color", name = "color")
    public void setColor(Integer num) {
        if (num != null) {
            this.f16178C = true;
            this.f16179D = num.intValue();
        }
        w0();
    }

    @O3.a(name = "fontFamily")
    public void setFontFamily(String str) {
        this.f16200Y = str;
        w0();
    }

    @O3.a(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f10) {
        this.f16177B.i(f10);
        w0();
    }

    @O3.a(name = "fontStyle")
    public void setFontStyle(String str) {
        int iB = s.b(str);
        if (iB != this.f16198W) {
            this.f16198W = iB;
            w0();
        }
    }

    @O3.a(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String strC = s.c(readableArray);
        if (TextUtils.equals(strC, this.f16201Z)) {
            return;
        }
        this.f16201Z = strC;
        w0();
    }

    @O3.a(name = "fontWeight")
    public void setFontWeight(String str) {
        int iD = s.d(str);
        if (iD != this.f16199X) {
            this.f16199X = iD;
            w0();
        }
    }

    @O3.a(defaultBoolean = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z9) {
        this.f16195T = z9;
    }

    @O3.a(defaultFloat = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, name = "letterSpacing")
    public void setLetterSpacing(float f10) {
        this.f16177B.k(f10);
        w0();
    }

    @O3.a(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f10) {
        this.f16177B.l(f10);
        w0();
    }

    @O3.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f10) {
        if (f10 != this.f16177B.g()) {
            this.f16177B.m(f10);
            w0();
        }
    }

    @O3.a(name = "minimumFontScale")
    public void setMinimumFontScale(float f10) {
        if (f10 != this.f16197V) {
            this.f16197V = f10;
            w0();
        }
    }

    @O3.a(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i10) {
        if (i10 == 0) {
            i10 = -1;
        }
        this.f16184I = i10;
        w0();
    }

    @O3.a(name = "role")
    public void setRole(String str) {
        if (P()) {
            this.f16183H = C1360h0.e.d(str);
            w0();
        }
    }

    @O3.a(name = "textAlign")
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f16188M = 1;
            }
            this.f16185J = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f16188M = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.f16185J = 0;
            } else if ("left".equals(str)) {
                this.f16185J = 3;
            } else if ("right".equals(str)) {
                this.f16185J = 5;
            } else if ("center".equals(str)) {
                this.f16185J = 1;
            } else {
                Z1.a.I("ReactNative", "Invalid textAlign: " + str);
                this.f16185J = 0;
            }
        }
        w0();
    }

    @O3.a(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (str == null || "highQuality".equals(str)) {
            this.f16186K = 1;
        } else if ("simple".equals(str)) {
            this.f16186K = 0;
        } else if ("balanced".equals(str)) {
            this.f16186K = 2;
        } else {
            Z1.a.I("ReactNative", "Invalid textBreakStrategy: " + str);
            this.f16186K = 1;
        }
        w0();
    }

    @O3.a(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.f16193R = false;
        this.f16194S = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.f16193R = true;
                } else if ("line-through".equals(str2)) {
                    this.f16194S = true;
                }
            }
        }
        w0();
    }

    @O3.a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i10) {
        if (i10 != this.f16192Q) {
            this.f16192Q = i10;
            w0();
        }
    }

    @O3.a(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.f16189N = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f16190O = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.f16189N = C1356f0.h(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.f16190O = C1356f0.h(readableMap.getDouble("height"));
            }
        }
        w0();
    }

    @O3.a(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f10) {
        if (f10 != this.f16191P) {
            this.f16191P = f10;
            w0();
        }
    }

    @O3.a(name = "textTransform")
    public void setTextTransform(String str) {
        y yVar = y.UNSET;
        if (str != null) {
            if ("none".equals(str)) {
                yVar = y.NONE;
            } else if ("uppercase".equals(str)) {
                yVar = y.UPPERCASE;
            } else if ("lowercase".equals(str)) {
                yVar = y.LOWERCASE;
            } else if ("capitalize".equals(str)) {
                yVar = y.CAPITALIZE;
            } else {
                Z1.a.I("ReactNative", "Invalid textTransform: " + str);
            }
        }
        this.f16177B.f16308f = yVar;
        w0();
    }

    protected Spannable v1(d dVar, String str, boolean z9, C1350c0 c1350c0) {
        int iB;
        p004a3.a.b((z9 && c1350c0 == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap map = z9 ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) y.d(str, dVar.f16177B.f16308f));
        }
        u1(dVar, spannableStringBuilder, arrayList, null, z9, map, 0);
        dVar.f16202a0 = false;
        dVar.f16203b0 = map;
        float f10 = Float.NaN;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            p025c4.n nVar = (p025c4.n) arrayList.get((arrayList.size() - i10) - 1);
            p025c4.i iVar = nVar.f11836c;
            boolean z10 = iVar instanceof p025c4.p;
            if (z10 || (iVar instanceof p025c4.q)) {
                if (z10) {
                    iB = ((p025c4.p) iVar).b();
                    dVar.f16202a0 = true;
                } else {
                    p025c4.q qVar = (p025c4.q) iVar;
                    int iA = qVar.a();
                    InterfaceC1381s0 interfaceC1381s0 = (InterfaceC1381s0) ((Map) p004a3.a.c(map)).get(Integer.valueOf(qVar.b()));
                    p004a3.a.c(interfaceC1381s0);
                    p004a3.a.c(c1350c0);
                    c1350c0.h(interfaceC1381s0);
                    interfaceC1381s0.x(dVar);
                    iB = iA;
                }
                if (Float.isNaN(f10) || iB > f10) {
                    f10 = iB;
                }
            }
            nVar.a(spannableStringBuilder, i10);
        }
        dVar.f16177B.j(f10);
        r rVar = this.f16176A;
        if (rVar != null) {
            rVar.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public d(r rVar) {
        this.f16178C = false;
        this.f16180E = false;
        this.f16182G = null;
        this.f16183H = null;
        this.f16184I = -1;
        this.f16185J = 0;
        this.f16186K = 1;
        this.f16187L = 0;
        this.f16188M = 0;
        this.f16189N = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f16190O = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f16191P = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f16192Q = 1426063360;
        this.f16193R = false;
        this.f16194S = false;
        this.f16195T = true;
        this.f16196U = false;
        this.f16197V = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f16198W = -1;
        this.f16199X = -1;
        this.f16200Y = null;
        this.f16201Z = null;
        this.f16202a0 = false;
        this.f16177B = new v();
        this.f16176A = rVar;
    }
}
