package com.horcrux.svg;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.horcrux.svg.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6792x {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final C6792x f41668p = new C6792x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f41669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f41670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final e0 f41671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ReadableMap f41672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g0 f41673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f41674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f41675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f41676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final f0 f41677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final h0 f41678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i0 f41679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final double f41680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final double f41681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final double f41682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f41683o;

    /* JADX INFO: renamed from: com.horcrux.svg.x$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g0[] f41684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int[] f41685b;

        static {
            g0 g0Var = g0.w100;
            g0 g0Var2 = g0.w200;
            g0 g0Var3 = g0.w300;
            g0 g0Var4 = g0.Normal;
            g0 g0Var5 = g0.w500;
            g0 g0Var6 = g0.w600;
            g0 g0Var7 = g0.Bold;
            g0 g0Var8 = g0.w800;
            g0 g0Var9 = g0.w900;
            f41684a = new g0[]{g0Var, g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9, g0Var9};
            f41685b = new int[]{CommonGatewayClient.CODE_400, 700, 100, TTAdConstant.MATE_VALID, 300, CommonGatewayClient.CODE_400, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, 600, 700, 800, 900};
        }

        private static int a(int i10) {
            if (i10 < 350) {
                return CommonGatewayClient.CODE_400;
            }
            if (i10 < 550) {
                return 700;
            }
            if (i10 < 900) {
                return 900;
            }
            return i10;
        }

        static int b(g0 g0Var, C6792x c6792x) {
            if (g0Var == g0.Bolder) {
                return a(c6792x.f41674f);
            }
            return g0Var == g0.Lighter ? c(c6792x.f41674f) : f41685b[g0Var.ordinal()];
        }

        private static int c(int i10) {
            if (i10 < 100) {
                return i10;
            }
            if (i10 < 550) {
                return 100;
            }
            if (i10 < 750) {
                return CommonGatewayClient.CODE_400;
            }
            return 700;
        }

        static g0 d(int i10) {
            return f41684a[Math.round(i10 / 100.0f)];
        }
    }

    private C6792x() {
        this.f41672d = null;
        this.f41670b = "";
        this.f41671c = e0.normal;
        this.f41673e = g0.Normal;
        this.f41674f = CommonGatewayClient.CODE_400;
        this.f41675g = "";
        this.f41676h = "";
        this.f41677i = f0.normal;
        this.f41678j = h0.start;
        this.f41679k = i0.None;
        this.f41683o = false;
        this.f41680l = 0.0d;
        this.f41669a = 12.0d;
        this.f41681m = 0.0d;
        this.f41682n = 0.0d;
    }

    private void a(C6792x c6792x, double d10) {
        long jRound = Math.round(d10);
        if (jRound < 1 || jRound > 1000) {
            b(c6792x);
            return;
        }
        int i10 = (int) jRound;
        this.f41674f = i10;
        this.f41673e = a.d(i10);
    }

    private void b(C6792x c6792x) {
        this.f41674f = c6792x.f41674f;
        this.f41673e = c6792x.f41673e;
    }

    private double c(ReadableMap readableMap, String str, double d10, double d11, double d12) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) : M.b(readableMap.getString(str), d12, d10, d11);
    }

    C6792x(ReadableMap readableMap, C6792x c6792x, double d10) {
        String string;
        String string2;
        f0 f0VarValueOf;
        h0 h0VarValueOf;
        i0 i0VarD;
        double dC;
        double dC2;
        double d11 = c6792x.f41669a;
        if (readableMap.hasKey("fontSize")) {
            this.f41669a = c(readableMap, "fontSize", 1.0d, d11, d11);
        } else {
            this.f41669a = d11;
        }
        if (readableMap.hasKey("fontWeight")) {
            if (readableMap.getType("fontWeight") == ReadableType.Number) {
                a(c6792x, readableMap.getDouble("fontWeight"));
            } else {
                String string3 = readableMap.getString("fontWeight");
                if (g0.e(string3)) {
                    int iB = a.b(g0.d(string3), c6792x);
                    this.f41674f = iB;
                    this.f41673e = a.d(iB);
                } else if (string3 != null) {
                    a(c6792x, Double.parseDouble(string3));
                } else {
                    b(c6792x);
                }
            }
        } else {
            b(c6792x);
        }
        this.f41672d = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : c6792x.f41672d;
        this.f41670b = readableMap.hasKey("fontFamily") ? readableMap.getString("fontFamily") : c6792x.f41670b;
        this.f41671c = readableMap.hasKey("fontStyle") ? e0.valueOf(readableMap.getString("fontStyle")) : c6792x.f41671c;
        if (readableMap.hasKey("fontFeatureSettings")) {
            string = readableMap.getString("fontFeatureSettings");
        } else {
            string = c6792x.f41675g;
        }
        this.f41675g = string;
        if (readableMap.hasKey("fontVariationSettings")) {
            string2 = readableMap.getString("fontVariationSettings");
        } else {
            string2 = c6792x.f41676h;
        }
        this.f41676h = string2;
        if (readableMap.hasKey("fontVariantLigatures")) {
            f0VarValueOf = f0.valueOf(readableMap.getString("fontVariantLigatures"));
        } else {
            f0VarValueOf = c6792x.f41677i;
        }
        this.f41677i = f0VarValueOf;
        if (readableMap.hasKey("textAnchor")) {
            h0VarValueOf = h0.valueOf(readableMap.getString("textAnchor"));
        } else {
            h0VarValueOf = c6792x.f41678j;
        }
        this.f41678j = h0VarValueOf;
        if (readableMap.hasKey("textDecoration")) {
            i0VarD = i0.d(readableMap.getString("textDecoration"));
        } else {
            i0VarD = c6792x.f41679k;
        }
        this.f41679k = i0VarD;
        boolean zHasKey = readableMap.hasKey("kerning");
        this.f41683o = zHasKey || c6792x.f41683o;
        this.f41680l = zHasKey ? c(readableMap, "kerning", d10, this.f41669a, 0.0d) : c6792x.f41680l;
        if (readableMap.hasKey("wordSpacing")) {
            dC = c(readableMap, "wordSpacing", d10, this.f41669a, 0.0d);
        } else {
            dC = c6792x.f41681m;
        }
        this.f41681m = dC;
        if (readableMap.hasKey("letterSpacing")) {
            dC2 = c(readableMap, "letterSpacing", d10, this.f41669a, 0.0d);
        } else {
            dC2 = c6792x.f41682n;
        }
        this.f41682n = dC2;
    }
}
