package p240y;

import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import p230x.d;
import p230x.i;
import p250z.c;
import p250z.f;
import p250z.j;
import p250z.l;
import p250z.m;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static float f50601v0 = 0.5f;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    d f50610I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public d[] f50611J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected ArrayList f50612K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean[] f50613L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public b[] f50614M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public e f50615N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f50616O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    int f50617P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f50618Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected int f50619R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected int f50620S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected int f50621T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f50622U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    int f50623V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    protected int f50624W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    protected int f50625X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    int f50626Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    protected int f50627Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected int f50629a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    float f50631b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f50632c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    float f50633c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f50634d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Object f50635d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f50637e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f50639f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private String f50641g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private String f50643h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    boolean f50645i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    boolean f50647j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    boolean f50649k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    boolean f50651l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    int f50653m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    int f50655n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    boolean f50657o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    boolean f50659p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float[] f50661q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    protected e[] f50663r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    protected e[] f50665s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    e f50667t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    e f50669u0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f50674z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f50628a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m[] f50630b = new m[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f50636e = new j(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f50638f = new l(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f50640g = {true, true};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f50642h = {0, 0, 0, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f50644i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f50646j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f50648k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f50650l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f50652m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f50654n = new int[2];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f50656o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f50658p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f50660q = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f50662r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f50664s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f50666t = 1.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f50668u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    float f50670v = 1.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f50671w = {Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f50672x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f50673y = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f50602A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public d f50603B = new d(this, d.b.LEFT);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public d f50604C = new d(this, d.b.TOP);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public d f50605D = new d(this, d.b.RIGHT);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public d f50606E = new d(this, d.b.BOTTOM);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    d f50607F = new d(this, d.b.BASELINE);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    d f50608G = new d(this, d.b.CENTER_X);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    d f50609H = new d(this, d.b.CENTER_Y);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f50676b;

        static {
            int[] iArr = new int[b.values().length];
            f50676b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50676b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50676b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50676b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f50675a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50675a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50675a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50675a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f50675a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f50675a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f50675a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f50675a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f50675a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.f50610I = dVar;
        this.f50611J = new d[]{this.f50603B, this.f50605D, this.f50604C, this.f50606E, this.f50607F, dVar};
        this.f50612K = new ArrayList();
        this.f50613L = new boolean[2];
        b bVar = b.FIXED;
        this.f50614M = new b[]{bVar, bVar};
        this.f50615N = null;
        this.f50616O = 0;
        this.f50617P = 0;
        this.f50618Q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f50619R = -1;
        this.f50620S = 0;
        this.f50621T = 0;
        this.f50622U = 0;
        this.f50623V = 0;
        this.f50624W = 0;
        this.f50625X = 0;
        this.f50626Y = 0;
        float f10 = f50601v0;
        this.f50631b0 = f10;
        this.f50633c0 = f10;
        this.f50637e0 = 0;
        this.f50639f0 = 0;
        this.f50641g0 = null;
        this.f50643h0 = null;
        this.f50649k0 = false;
        this.f50651l0 = false;
        this.f50653m0 = 0;
        this.f50655n0 = 0;
        this.f50661q0 = new float[]{-1.0f, -1.0f};
        this.f50663r0 = new e[]{null, null};
        this.f50665s0 = new e[]{null, null};
        this.f50667t0 = null;
        this.f50669u0 = null;
        d();
    }

    private boolean U(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.f50611J;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f50586d;
        return (dVar4 == null || dVar4.f50586d == dVar3 || (dVar2 = (dVar = dVarArr[i11 + 1]).f50586d) == null || dVar2.f50586d != dVar) ? false : true;
    }

    private void d() {
        this.f50612K.add(this.f50603B);
        this.f50612K.add(this.f50604C);
        this.f50612K.add(this.f50605D);
        this.f50612K.add(this.f50606E);
        this.f50612K.add(this.f50608G);
        this.f50612K.add(this.f50609H);
        this.f50612K.add(this.f50610I);
        this.f50612K.add(this.f50607F);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x01e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:180:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:182:0x02df  */
    /* JADX WARN: Code duplicated, block: B:184:0x0307  */
    /* JADX WARN: Code duplicated, block: B:188:0x031c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x031e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0336  */
    /* JADX WARN: Code duplicated, block: B:202:0x034e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0364  */
    /* JADX WARN: Code duplicated, block: B:212:0x036a  */
    /* JADX WARN: Code duplicated, block: B:216:0x0373  */
    /* JADX WARN: Code duplicated, block: B:236:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:243:0x03be  */
    /* JADX WARN: Code duplicated, block: B:245:0x03c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:246:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:247:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:249:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:258:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:269:0x0401  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:290:0x0443  */
    /* JADX WARN: Code duplicated, block: B:301:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:72:0x0102  */
    /* JADX WARN: Code duplicated, block: B:75:0x010c  */
    /* JADX WARN: Code duplicated, block: B:76:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0111  */
    /* JADX WARN: Code duplicated, block: B:81:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x011c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0122  */
    /* JADX WARN: Code duplicated, block: B:85:0x012a  */
    /* JADX WARN: Code duplicated, block: B:88:0x013e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0141  */
    /* JADX WARN: Code duplicated, block: B:92:0x0149  */
    /* JADX WARN: Code duplicated, block: B:97:0x016c  */
    /* JADX WARN: Code duplicated, block: B:99:0x019f  */
    private void h(d dVar, boolean z9, boolean z10, boolean z11, boolean z12, i iVar, i iVar2, b bVar, boolean z13, d dVar2, d dVar3, int i10, int i11, int i12, int i13, float f10, boolean z14, boolean z15, boolean z16, boolean z17, int i14, int i15, int i16, int i17, float f11, boolean z18) {
        int i18;
        boolean z19;
        int iMin;
        int i19;
        int i20;
        int i21;
        i iVar3;
        int i22;
        boolean z20;
        boolean z21;
        d.b bVarH;
        d.b bVar2;
        i iVarQ;
        i iVarQ2;
        char c10;
        char c11;
        d dVar4;
        d dVar5;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        int i23;
        int i24;
        boolean z26;
        i iVar4;
        boolean z27;
        e eVar;
        i iVar5;
        int i25;
        e eVar2;
        e eVar3;
        int iMin2;
        int i26;
        int iC;
        e eVar4;
        int i27;
        int i28;
        int i29;
        d dVar6 = dVar;
        i iVarQ3 = dVar6.q(dVar2);
        i iVarQ4 = dVar6.q(dVar3);
        i iVarQ5 = dVar6.q(dVar2.g());
        i iVarQ6 = dVar6.q(dVar3.g());
        d.w();
        boolean zJ = dVar2.j();
        boolean zJ2 = dVar3.j();
        boolean zJ3 = this.f50610I.j();
        int i30 = zJ2 ? (zJ ? 1 : 0) + 1 : zJ ? 1 : 0;
        if (zJ3) {
            i30++;
        }
        int i31 = z14 ? 3 : i14;
        int i32 = a.f50676b[bVar.ordinal()];
        if (i32 != 1 && i32 != 2 && i32 != 3 && i32 == 4) {
            i18 = i31;
            if (i18 != 4) {
                z19 = true;
            }
            if (this.f50639f0 == 8) {
                iMin = 0;
                z19 = false;
            } else {
                iMin = i11;
            }
            if (!z18) {
                if (zJ && !zJ2 && !zJ3) {
                    dVar6.f(iVarQ3, i10);
                } else if (zJ && !zJ2) {
                    i19 = 8;
                    dVar6.e(iVarQ3, iVarQ5, dVar2.c(), 8);
                }
                i19 = 8;
            } else {
                i19 = 8;
            }
            if (!z19) {
                if (z13) {
                    dVar6.e(iVarQ4, iVarQ3, 0, 3);
                    if (i12 > 0) {
                        dVar6.h(iVarQ4, iVarQ3, i12, 8);
                    }
                    if (i13 < Integer.MAX_VALUE) {
                        dVar6.j(iVarQ4, iVarQ3, i13, 8);
                    }
                } else {
                    dVar6.e(iVarQ4, iVarQ3, iMin, i19);
                }
                z21 = z12;
                i30 = i30 == true ? 1 : 0;
                iVarQ6 = iVarQ6;
                z20 = z19;
                i20 = i16;
                i22 = i17;
                iVar3 = iVarQ4;
            } else if (i30 == 2 && !z14 && (i18 == 1 || i18 == 0)) {
                int iMax = Math.max(i16, iMin);
                if (i17 > 0) {
                    iMax = Math.min(i17, iMax);
                }
                dVar6.e(iVarQ4, iVarQ3, iMax, 8);
                z21 = z12;
                i20 = i16;
                i22 = i17;
                iVar3 = iVarQ4;
                i30 = i30 == true ? 1 : 0;
                iVarQ6 = iVarQ6;
                z20 = false;
            } else {
                if (i16 == -2) {
                    i20 = iMin;
                } else {
                    i20 = i16;
                }
                if (i17 == -2) {
                    i21 = iMin;
                } else {
                    i21 = i17;
                }
                if (iMin > 0 && i18 != 1) {
                    iMin = 0;
                }
                if (i20 > 0) {
                    dVar6.h(iVarQ4, iVarQ3, i20, 8);
                    iMin = Math.max(iMin, i20);
                }
                if (i21 > 0) {
                    if (z10 || i18 != 1) {
                        dVar6.j(iVarQ4, iVarQ3, i21, 8);
                    }
                    iMin = Math.min(iMin, i21);
                }
                if (i18 == 1) {
                    if (z10) {
                        dVar6.e(iVarQ4, iVarQ3, iMin, 8);
                    } else if (z15) {
                        dVar6.e(iVarQ4, iVarQ3, iMin, 5);
                        dVar6.j(iVarQ4, iVarQ3, iMin, 8);
                    } else {
                        dVar6.e(iVarQ4, iVarQ3, iMin, 5);
                        dVar6.j(iVarQ4, iVarQ3, iMin, 8);
                    }
                    i22 = i21;
                    iVar3 = iVarQ4;
                    z20 = z19;
                } else if (i18 == 2) {
                    bVarH = dVar2.h();
                    bVar2 = d.b.TOP;
                    if (bVarH != bVar2 || dVar2.h() == d.b.BOTTOM) {
                        iVarQ = dVar6.q(this.f50615N.m(bVar2));
                        iVarQ2 = dVar6.q(this.f50615N.m(d.b.BOTTOM));
                    } else {
                        iVarQ = dVar6.q(this.f50615N.m(d.b.LEFT));
                        iVarQ2 = dVar6.q(this.f50615N.m(d.b.RIGHT));
                    }
                    iVar3 = iVarQ4;
                    dVar6.d(dVar6.r().k(iVar3, iVarQ3, iVarQ2, iVarQ, f11));
                    i22 = i21;
                    z20 = false;
                } else {
                    int i33 = i21;
                    iVar3 = iVarQ4;
                    i30 = i30 == true ? 1 : 0;
                    iVarQ6 = iVarQ6;
                    i22 = i33;
                    z20 = z19;
                    i20 = i20;
                    z21 = true;
                }
                z21 = z12;
            }
            if (z18) {
                c10 = 1;
                c11 = 2;
            } else {
                if (z15) {
                    if ((!zJ || zJ2 || zJ3) && (!zJ || zJ2)) {
                        if (zJ && zJ2) {
                            dVar6.e(iVar3, iVarQ6, -dVar3.c(), 8);
                            if (z10) {
                                dVar6.h(iVarQ3, iVar, 0, 5);
                            }
                        } else if (zJ && zJ2) {
                            e eVar5 = dVar2.f50586d.f50584b;
                            dVar5 = dVar3;
                            e eVar6 = dVar5.f50586d.f50584b;
                            e eVarG = G();
                            int i34 = 6;
                            if (z20) {
                                if (i18 == 0) {
                                    if (i22 == 0 && i20 == 0) {
                                        z23 = false;
                                        z25 = true;
                                        i24 = 8;
                                        i23 = 8;
                                    } else {
                                        z23 = true;
                                        z25 = false;
                                        i24 = 5;
                                        i23 = 5;
                                    }
                                    if ((eVar5 instanceof p240y.a) || (eVar6 instanceof p240y.a)) {
                                        z22 = true;
                                        z24 = false;
                                        i23 = 4;
                                    } else {
                                        z22 = true;
                                        z24 = false;
                                    }
                                    i34 = 6;
                                } else {
                                    if (i18 == 1) {
                                        i34 = 6;
                                        z23 = true;
                                        z22 = true;
                                        z25 = false;
                                        z24 = true;
                                        i23 = 4;
                                    } else if (i18 == 3) {
                                        int i35 = i22;
                                        if (this.f50668u == -1) {
                                            if (z16) {
                                                z23 = true;
                                                z22 = true;
                                                z25 = true;
                                                i34 = z10 ? 5 : 4;
                                            } else {
                                                z23 = true;
                                                z22 = true;
                                                z25 = true;
                                                i34 = 8;
                                            }
                                            z24 = true;
                                            i23 = 5;
                                        } else if (z14) {
                                            if (i15 != 2) {
                                                z22 = true;
                                                if (i15 != 1) {
                                                    i28 = 8;
                                                    i29 = 5;
                                                }
                                                i24 = i28;
                                                z23 = z22;
                                                z24 = z23;
                                                i34 = 6;
                                                i23 = i29;
                                                z25 = z24;
                                            } else {
                                                z22 = true;
                                            }
                                            i28 = 5;
                                            i29 = 4;
                                            i24 = i28;
                                            z23 = z22;
                                            z24 = z23;
                                            i34 = 6;
                                            i23 = i29;
                                            z25 = z24;
                                        } else {
                                            z22 = true;
                                            if (i35 > 0) {
                                                z23 = true;
                                                z25 = true;
                                                z24 = true;
                                                i34 = 6;
                                                i23 = 5;
                                            } else if (i35 != 0 || i20 != 0) {
                                                z23 = true;
                                                z25 = true;
                                                z24 = true;
                                            } else if (z16) {
                                                i24 = (eVar5 == eVarG || eVar6 == eVarG) ? 5 : 4;
                                                z23 = true;
                                                z25 = true;
                                                z24 = true;
                                                i34 = 6;
                                                i23 = 4;
                                            } else {
                                                z23 = true;
                                                z25 = true;
                                                z24 = true;
                                                i34 = 6;
                                                i23 = 8;
                                            }
                                            i24 = 5;
                                        }
                                    } else {
                                        z22 = true;
                                        z23 = false;
                                        z25 = false;
                                        z24 = false;
                                    }
                                    i24 = 8;
                                }
                                if (z24 || iVarQ5 != iVarQ6 || eVar5 == eVarG) {
                                    z26 = z22;
                                } else {
                                    z24 = false;
                                    z26 = false;
                                }
                                if (z23) {
                                    i25 = 8;
                                    if (this.f50639f0 == 8) {
                                        i34 = 4;
                                    }
                                    boolean z28 = z22;
                                    int iC2 = dVar2.c();
                                    int iC3 = dVar5.c();
                                    int i36 = i34;
                                    eVar = eVar6;
                                    z27 = z28;
                                    i iVar6 = iVarQ6;
                                    iVar5 = iVarQ5;
                                    dVar6 = dVar;
                                    i iVar7 = iVar3;
                                    dVar6.c(iVarQ3, iVar5, iC2, f10, iVar6, iVar7, iC3, i36);
                                    iVarQ3 = iVarQ3;
                                    iVar4 = iVar6;
                                    iVar3 = iVar7;
                                } else {
                                    dVar6 = dVar;
                                    iVar4 = iVarQ6;
                                    z27 = z22;
                                    eVar = eVar6;
                                    iVar5 = iVarQ5;
                                    i25 = 8;
                                }
                                if (this.f50639f0 == i25) {
                                    return;
                                }
                                if (z24) {
                                    if (z10 || iVar5 == iVar4 || z20) {
                                        eVar2 = eVar5;
                                        eVar3 = eVar;
                                    } else {
                                        eVar2 = eVar5;
                                        if (eVar2 instanceof p240y.a) {
                                            eVar3 = eVar;
                                        } else {
                                            eVar3 = eVar;
                                            if (eVar3 instanceof p240y.a) {
                                            }
                                            dVar6.h(iVarQ3, iVar5, dVar2.c(), i27);
                                            dVar6.j(iVar3, iVar4, -dVar5.c(), i27);
                                            i24 = i27;
                                        }
                                        i27 = 6;
                                        dVar6.h(iVarQ3, iVar5, dVar2.c(), i27);
                                        dVar6.j(iVar3, iVar4, -dVar5.c(), i27);
                                        i24 = i27;
                                    }
                                    i27 = i24;
                                    dVar6.h(iVarQ3, iVar5, dVar2.c(), i27);
                                    dVar6.j(iVar3, iVar4, -dVar5.c(), i27);
                                    i24 = i27;
                                } else {
                                    eVar2 = eVar5;
                                    eVar3 = eVar;
                                }
                                if (z10 || !z17 || (eVar2 instanceof p240y.a) || (eVar3 instanceof p240y.a)) {
                                    iMin2 = i23;
                                    i26 = i24;
                                } else {
                                    iMin2 = 6;
                                    i26 = 6;
                                    z26 = z27;
                                }
                                if (z26) {
                                    if (z25 || (z16 && !z11)) {
                                        eVar4 = eVarG;
                                    } else {
                                        eVar4 = eVarG;
                                        if (eVar2 != eVar4 && eVar3 != eVar4) {
                                            i34 = iMin2;
                                        }
                                        if ((eVar2 instanceof h) || (eVar3 instanceof h)) {
                                            i34 = 5;
                                        }
                                        if ((eVar2 instanceof p240y.a) || (eVar3 instanceof p240y.a)) {
                                            i34 = 5;
                                        }
                                        iMin2 = Math.max(z16 ? 5 : i34, iMin2);
                                    }
                                    if (z10) {
                                        iMin2 = Math.min(i26, iMin2);
                                        if (z14 && !z16 && (eVar2 == eVar4 || eVar3 == eVar4)) {
                                            iMin2 = 4;
                                        }
                                    }
                                    dVar6.e(iVarQ3, iVar5, dVar2.c(), iMin2);
                                    dVar6.e(iVar3, iVar4, -dVar5.c(), iMin2);
                                } else {
                                    z21 = z21;
                                }
                                if (z10) {
                                    if (iVar == iVar5) {
                                        iC = dVar2.c();
                                    } else {
                                        iC = 0;
                                    }
                                    if (iVar5 != iVar) {
                                        dVar6.h(iVarQ3, iVar, iC, 5);
                                    }
                                }
                                if (z10 && z20 && i12 == 0 && i20 == 0) {
                                    if (z20 || i18 != 3) {
                                        dVar6.h(iVar3, iVarQ3, 0, 5);
                                    } else {
                                        dVar6.h(iVar3, iVarQ3, 0, 8);
                                    }
                                }
                            } else {
                                z22 = true;
                                z23 = true;
                                z24 = true;
                                z25 = false;
                            }
                            i23 = 4;
                            i24 = 5;
                            if (z24) {
                                z26 = z22;
                            } else {
                                z26 = z22;
                            }
                            if (z23) {
                                i25 = 8;
                                if (this.f50639f0 == 8) {
                                    i34 = 4;
                                }
                                boolean z29 = z22;
                                int iC4 = dVar2.c();
                                int iC5 = dVar5.c();
                                int i37 = i34;
                                eVar = eVar6;
                                z27 = z29;
                                i iVar8 = iVarQ6;
                                iVar5 = iVarQ5;
                                dVar6 = dVar;
                                i iVar9 = iVar3;
                                dVar6.c(iVarQ3, iVar5, iC4, f10, iVar8, iVar9, iC5, i37);
                                iVarQ3 = iVarQ3;
                                iVar4 = iVar8;
                                iVar3 = iVar9;
                            } else {
                                dVar6 = dVar;
                                iVar4 = iVarQ6;
                                z27 = z22;
                                eVar = eVar6;
                                iVar5 = iVarQ5;
                                i25 = 8;
                            }
                            if (this.f50639f0 == i25) {
                                return;
                            }
                            if (z24) {
                                if (z10) {
                                    eVar2 = eVar5;
                                    eVar3 = eVar;
                                    i27 = i24;
                                } else {
                                    eVar2 = eVar5;
                                    eVar3 = eVar;
                                    i27 = i24;
                                }
                                dVar6.h(iVarQ3, iVar5, dVar2.c(), i27);
                                dVar6.j(iVar3, iVar4, -dVar5.c(), i27);
                                i24 = i27;
                            } else {
                                eVar2 = eVar5;
                                eVar3 = eVar;
                            }
                            if (z10) {
                                iMin2 = i23;
                                i26 = i24;
                            } else {
                                iMin2 = i23;
                                i26 = i24;
                            }
                            if (z26) {
                                if (z25) {
                                    eVar4 = eVarG;
                                } else {
                                    eVar4 = eVarG;
                                }
                                if (z10) {
                                    iMin2 = Math.min(i26, iMin2);
                                    if (z14) {
                                        iMin2 = 4;
                                    }
                                }
                                dVar6.e(iVarQ3, iVar5, dVar2.c(), iMin2);
                                dVar6.e(iVar3, iVar4, -dVar5.c(), iMin2);
                            } else {
                                z21 = z21;
                            }
                            if (z10) {
                                if (iVar == iVar5) {
                                    iC = dVar2.c();
                                } else {
                                    iC = 0;
                                }
                                if (iVar5 != iVar) {
                                    dVar6.h(iVarQ3, iVar, iC, 5);
                                }
                            }
                            if (z10) {
                                if (z20) {
                                    dVar6.h(iVar3, iVarQ3, 0, 5);
                                } else {
                                    dVar6.h(iVar3, iVarQ3, 0, 5);
                                }
                            }
                        }
                        dVar5 = dVar3;
                        iVar4 = iVarQ6;
                        z21 = z21;
                    } else {
                        dVar5 = dVar3;
                        iVar4 = iVarQ6;
                        z21 = z21;
                    }
                    if (z10 || !z21) {
                        return;
                    }
                    int iC6 = dVar5.f50586d != null ? dVar5.c() : 0;
                    if (iVar4 != iVar2) {
                        dVar6.h(iVar2, iVar3, iC6, 5);
                        return;
                    }
                    return;
                }
                c11 = 2;
                c10 = 1;
            }
            if (i30 >= c11 && z10 && z21) {
                dVar6.h(iVarQ3, iVar, 0, 8);
                char c12 = (z9 || this.f50607F.f50586d == null) ? c10 : (char) 0;
                if (!z9 && (dVar4 = this.f50607F.f50586d) != null) {
                    e eVar7 = dVar4.f50584b;
                    if (eVar7.f50618Q != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        b[] bVarArr = eVar7.f50614M;
                        b bVar3 = bVarArr[0];
                        b bVar4 = b.MATCH_CONSTRAINT;
                        if (bVar3 == bVar4 && bVarArr[c10] == bVar4) {
                            c12 = c10;
                        } else {
                            c12 = 0;
                        }
                    } else {
                        c12 = 0;
                    }
                }
                if (c12 != 0) {
                    dVar6.h(iVar2, iVar3, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        i18 = i31;
        z19 = false;
        if (this.f50639f0 == 8) {
            iMin = 0;
            z19 = false;
        } else {
            iMin = i11;
        }
        if (!z18) {
            i19 = 8;
        } else if (zJ) {
            if (zJ) {
                i19 = 8;
            } else {
                i19 = 8;
            }
        } else if (zJ) {
            i19 = 8;
        } else {
            i19 = 8;
        }
        if (!z19) {
            if (z13) {
                dVar6.e(iVarQ4, iVarQ3, 0, 3);
                if (i12 > 0) {
                    dVar6.h(iVarQ4, iVarQ3, i12, 8);
                }
                if (i13 < Integer.MAX_VALUE) {
                    dVar6.j(iVarQ4, iVarQ3, i13, 8);
                }
            } else {
                dVar6.e(iVarQ4, iVarQ3, iMin, i19);
            }
            z21 = z12;
            i30 = i30 == true ? 1 : 0;
            iVarQ6 = iVarQ6;
            z20 = z19;
            i20 = i16;
            i22 = i17;
            iVar3 = iVarQ4;
        } else if (i30 == 2) {
            if (i16 == -2) {
                i20 = iMin;
            } else {
                i20 = i16;
            }
            if (i17 == -2) {
                i21 = iMin;
            } else {
                i21 = i17;
            }
            if (iMin > 0) {
                iMin = 0;
            }
            if (i20 > 0) {
                dVar6.h(iVarQ4, iVarQ3, i20, 8);
                iMin = Math.max(iMin, i20);
            }
            if (i21 > 0) {
                if (z10) {
                    dVar6.j(iVarQ4, iVarQ3, i21, 8);
                } else {
                    dVar6.j(iVarQ4, iVarQ3, i21, 8);
                }
                iMin = Math.min(iMin, i21);
            }
            if (i18 == 1) {
                if (z10) {
                    dVar6.e(iVarQ4, iVarQ3, iMin, 8);
                } else if (z15) {
                    dVar6.e(iVarQ4, iVarQ3, iMin, 5);
                    dVar6.j(iVarQ4, iVarQ3, iMin, 8);
                } else {
                    dVar6.e(iVarQ4, iVarQ3, iMin, 5);
                    dVar6.j(iVarQ4, iVarQ3, iMin, 8);
                }
                i22 = i21;
                iVar3 = iVarQ4;
                z20 = z19;
            } else if (i18 == 2) {
                bVarH = dVar2.h();
                bVar2 = d.b.TOP;
                if (bVarH != bVar2) {
                    iVarQ = dVar6.q(this.f50615N.m(bVar2));
                    iVarQ2 = dVar6.q(this.f50615N.m(d.b.BOTTOM));
                } else {
                    iVarQ = dVar6.q(this.f50615N.m(bVar2));
                    iVarQ2 = dVar6.q(this.f50615N.m(d.b.BOTTOM));
                }
                iVar3 = iVarQ4;
                dVar6.d(dVar6.r().k(iVar3, iVarQ3, iVarQ2, iVarQ, f11));
                i22 = i21;
                z20 = false;
            } else {
                int i38 = i21;
                iVar3 = iVarQ4;
                i30 = i30 == true ? 1 : 0;
                iVarQ6 = iVarQ6;
                i22 = i38;
                z20 = z19;
                i20 = i20;
                z21 = true;
            }
            z21 = z12;
        } else {
            if (i16 == -2) {
                i20 = iMin;
            } else {
                i20 = i16;
            }
            if (i17 == -2) {
                i21 = iMin;
            } else {
                i21 = i17;
            }
            if (iMin > 0) {
                iMin = 0;
            }
            if (i20 > 0) {
                dVar6.h(iVarQ4, iVarQ3, i20, 8);
                iMin = Math.max(iMin, i20);
            }
            if (i21 > 0) {
                if (z10) {
                    dVar6.j(iVarQ4, iVarQ3, i21, 8);
                } else {
                    dVar6.j(iVarQ4, iVarQ3, i21, 8);
                }
                iMin = Math.min(iMin, i21);
            }
            if (i18 == 1) {
                if (z10) {
                    dVar6.e(iVarQ4, iVarQ3, iMin, 8);
                } else if (z15) {
                    dVar6.e(iVarQ4, iVarQ3, iMin, 5);
                    dVar6.j(iVarQ4, iVarQ3, iMin, 8);
                } else {
                    dVar6.e(iVarQ4, iVarQ3, iMin, 5);
                    dVar6.j(iVarQ4, iVarQ3, iMin, 8);
                }
                i22 = i21;
                iVar3 = iVarQ4;
                z20 = z19;
            } else if (i18 == 2) {
                bVarH = dVar2.h();
                bVar2 = d.b.TOP;
                if (bVarH != bVar2) {
                    iVarQ = dVar6.q(this.f50615N.m(bVar2));
                    iVarQ2 = dVar6.q(this.f50615N.m(d.b.BOTTOM));
                } else {
                    iVarQ = dVar6.q(this.f50615N.m(bVar2));
                    iVarQ2 = dVar6.q(this.f50615N.m(d.b.BOTTOM));
                }
                iVar3 = iVarQ4;
                dVar6.d(dVar6.r().k(iVar3, iVarQ3, iVarQ2, iVarQ, f11));
                i22 = i21;
                z20 = false;
            } else {
                int i39 = i21;
                iVar3 = iVarQ4;
                i30 = i30 == true ? 1 : 0;
                iVarQ6 = iVarQ6;
                i22 = i39;
                z20 = z19;
                i20 = i20;
                z21 = true;
            }
            z21 = z12;
        }
        if (z18) {
            c10 = 1;
            c11 = 2;
        } else {
            if (z15) {
                if (zJ) {
                    if (zJ) {
                        if (zJ) {
                            dVar5 = dVar3;
                            iVar4 = iVarQ6;
                            z21 = z21;
                        } else {
                            dVar5 = dVar3;
                            iVar4 = iVarQ6;
                            z21 = z21;
                        }
                    } else if (zJ) {
                        dVar5 = dVar3;
                        iVar4 = iVarQ6;
                        z21 = z21;
                    } else {
                        dVar5 = dVar3;
                        iVar4 = iVarQ6;
                        z21 = z21;
                    }
                } else if (zJ) {
                    if (zJ) {
                        dVar5 = dVar3;
                        iVar4 = iVarQ6;
                        z21 = z21;
                    } else {
                        dVar5 = dVar3;
                        iVar4 = iVarQ6;
                        z21 = z21;
                    }
                } else if (zJ) {
                    dVar5 = dVar3;
                    iVar4 = iVarQ6;
                    z21 = z21;
                } else {
                    dVar5 = dVar3;
                    iVar4 = iVarQ6;
                    z21 = z21;
                }
                if (z10) {
                    return;
                } else {
                    return;
                }
            }
            c11 = 2;
            c10 = 1;
        }
        if (i30 >= c11) {
        }
    }

    public int A(int i10) {
        if (i10 == 0) {
            return P();
        }
        if (i10 == 1) {
            return v();
        }
        return 0;
    }

    public void A0(b bVar) {
        this.f50614M[1] = bVar;
    }

    public int B() {
        return this.f50671w[1];
    }

    public void B0(int i10, int i11, int i12, float f10) {
        this.f50652m = i10;
        this.f50662r = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f50664s = i12;
        this.f50666t = f10;
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f50652m = 2;
    }

    public int C() {
        return this.f50671w[0];
    }

    public void C0(float f10) {
        this.f50661q0[1] = f10;
    }

    public int D() {
        return this.f50629a0;
    }

    public void D0(int i10) {
        this.f50639f0 = i10;
    }

    public int E() {
        return this.f50627Z;
    }

    public void E0(int i10) {
        this.f50616O = i10;
        int i11 = this.f50627Z;
        if (i10 < i11) {
            this.f50616O = i11;
        }
    }

    public e F(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.f50606E).f50586d) != null && dVar2.f50586d == dVar) {
                return dVar2.f50584b;
            }
            return null;
        }
        d dVar3 = this.f50605D;
        d dVar4 = dVar3.f50586d;
        if (dVar4 == null || dVar4.f50586d != dVar3) {
            return null;
        }
        return dVar4.f50584b;
    }

    public void F0(int i10) {
        this.f50620S = i10;
    }

    public e G() {
        return this.f50615N;
    }

    public void G0(int i10) {
        this.f50621T = i10;
    }

    public e H(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.f50604C).f50586d) != null && dVar2.f50586d == dVar) {
                return dVar2.f50584b;
            }
            return null;
        }
        d dVar3 = this.f50603B;
        d dVar4 = dVar3.f50586d;
        if (dVar4 == null || dVar4.f50586d != dVar3) {
            return null;
        }
        return dVar4.f50584b;
    }

    public void H0(boolean z9, boolean z10, boolean z11, boolean z12) {
        if (this.f50668u == -1) {
            if (z11 && !z12) {
                this.f50668u = 0;
            } else if (!z11 && z12) {
                this.f50668u = 1;
                if (this.f50619R == -1) {
                    this.f50670v = 1.0f / this.f50670v;
                }
            }
        }
        if (this.f50668u == 0 && (!this.f50604C.j() || !this.f50606E.j())) {
            this.f50668u = 1;
        } else if (this.f50668u == 1 && (!this.f50603B.j() || !this.f50605D.j())) {
            this.f50668u = 0;
        }
        if (this.f50668u == -1 && (!this.f50604C.j() || !this.f50606E.j() || !this.f50603B.j() || !this.f50605D.j())) {
            if (this.f50604C.j() && this.f50606E.j()) {
                this.f50668u = 0;
            } else if (this.f50603B.j() && this.f50605D.j()) {
                this.f50670v = 1.0f / this.f50670v;
                this.f50668u = 1;
            }
        }
        if (this.f50668u == -1) {
            int i10 = this.f50656o;
            if (i10 > 0 && this.f50662r == 0) {
                this.f50668u = 0;
            } else {
                if (i10 != 0 || this.f50662r <= 0) {
                    return;
                }
                this.f50670v = 1.0f / this.f50670v;
                this.f50668u = 1;
            }
        }
    }

    public int I() {
        return Q() + this.f50616O;
    }

    public void I0(boolean z9, boolean z10) {
        int i10;
        int i11;
        boolean zK = z9 & this.f50636e.k();
        boolean zK2 = z10 & this.f50638f.k();
        j jVar = this.f50636e;
        int i12 = jVar.f50872h.f50836g;
        l lVar = this.f50638f;
        int i13 = lVar.f50872h.f50836g;
        int i14 = jVar.f50873i.f50836g;
        int i15 = lVar.f50873i.f50836g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (zK) {
            this.f50620S = i12;
        }
        if (zK2) {
            this.f50621T = i13;
        }
        if (this.f50639f0 == 8) {
            this.f50616O = 0;
            this.f50617P = 0;
            return;
        }
        if (zK) {
            if (this.f50614M[0] == b.FIXED && i17 < (i11 = this.f50616O)) {
                i17 = i11;
            }
            this.f50616O = i17;
            int i19 = this.f50627Z;
            if (i17 < i19) {
                this.f50616O = i19;
            }
        }
        if (zK2) {
            if (this.f50614M[1] == b.FIXED && i18 < (i10 = this.f50617P)) {
                i18 = i10;
            }
            this.f50617P = i18;
            int i20 = this.f50629a0;
            if (i18 < i20) {
                this.f50617P = i20;
            }
        }
    }

    public m J(int i10) {
        if (i10 == 0) {
            return this.f50636e;
        }
        if (i10 == 1) {
            return this.f50638f;
        }
        return null;
    }

    public void J0(d dVar) {
        int iX = dVar.x(this.f50603B);
        int iX2 = dVar.x(this.f50604C);
        int iX3 = dVar.x(this.f50605D);
        int iX4 = dVar.x(this.f50606E);
        j jVar = this.f50636e;
        f fVar = jVar.f50872h;
        if (fVar.f50839j) {
            f fVar2 = jVar.f50873i;
            if (fVar2.f50839j) {
                iX = fVar.f50836g;
                iX3 = fVar2.f50836g;
            }
        }
        l lVar = this.f50638f;
        f fVar3 = lVar.f50872h;
        if (fVar3.f50839j) {
            f fVar4 = lVar.f50873i;
            if (fVar4.f50839j) {
                iX2 = fVar3.f50836g;
                iX4 = fVar4.f50836g;
            }
        }
        int i10 = iX4 - iX2;
        if (iX3 - iX < 0 || i10 < 0 || iX == Integer.MIN_VALUE || iX == Integer.MAX_VALUE || iX2 == Integer.MIN_VALUE || iX2 == Integer.MAX_VALUE || iX3 == Integer.MIN_VALUE || iX3 == Integer.MAX_VALUE || iX4 == Integer.MIN_VALUE || iX4 == Integer.MAX_VALUE) {
            iX = 0;
            iX4 = 0;
            iX2 = 0;
            iX3 = 0;
        }
        f0(iX, iX2, iX3, iX4);
    }

    public float K() {
        return this.f50633c0;
    }

    public int L() {
        return this.f50655n0;
    }

    public b M() {
        return this.f50614M[1];
    }

    public int N() {
        int i10 = this.f50603B != null ? this.f50604C.f50587e : 0;
        return this.f50605D != null ? i10 + this.f50606E.f50587e : i10;
    }

    public int O() {
        return this.f50639f0;
    }

    public int P() {
        if (this.f50639f0 == 8) {
            return 0;
        }
        return this.f50616O;
    }

    public int Q() {
        e eVar = this.f50615N;
        return (eVar == null || !(eVar instanceof f)) ? this.f50620S : ((f) eVar).f50684C0 + this.f50620S;
    }

    public int R() {
        e eVar = this.f50615N;
        return (eVar == null || !(eVar instanceof f)) ? this.f50621T : ((f) eVar).f50685D0 + this.f50621T;
    }

    public boolean S() {
        return this.f50673y;
    }

    public void T(d.b bVar, e eVar, d.b bVar2, int i10, int i11) {
        m(bVar).b(eVar.m(bVar2), i10, i11, true);
    }

    public boolean V() {
        d dVar = this.f50603B;
        d dVar2 = dVar.f50586d;
        if (dVar2 != null && dVar2.f50586d == dVar) {
            return true;
        }
        d dVar3 = this.f50605D;
        d dVar4 = dVar3.f50586d;
        return dVar4 != null && dVar4.f50586d == dVar3;
    }

    public boolean W() {
        return this.f50674z;
    }

    public boolean X() {
        d dVar = this.f50604C;
        d dVar2 = dVar.f50586d;
        if (dVar2 != null && dVar2.f50586d == dVar) {
            return true;
        }
        d dVar3 = this.f50606E;
        d dVar4 = dVar3.f50586d;
        return dVar4 != null && dVar4.f50586d == dVar3;
    }

    public void Y() {
        this.f50603B.l();
        this.f50604C.l();
        this.f50605D.l();
        this.f50606E.l();
        this.f50607F.l();
        this.f50608G.l();
        this.f50609H.l();
        this.f50610I.l();
        this.f50615N = null;
        this.f50672x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f50616O = 0;
        this.f50617P = 0;
        this.f50618Q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f50619R = -1;
        this.f50620S = 0;
        this.f50621T = 0;
        this.f50624W = 0;
        this.f50625X = 0;
        this.f50626Y = 0;
        this.f50627Z = 0;
        this.f50629a0 = 0;
        float f10 = f50601v0;
        this.f50631b0 = f10;
        this.f50633c0 = f10;
        b[] bVarArr = this.f50614M;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f50635d0 = null;
        this.f50637e0 = 0;
        this.f50639f0 = 0;
        this.f50643h0 = null;
        this.f50645i0 = false;
        this.f50647j0 = false;
        this.f50653m0 = 0;
        this.f50655n0 = 0;
        this.f50657o0 = false;
        this.f50659p0 = false;
        float[] fArr = this.f50661q0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f50646j = -1;
        this.f50648k = -1;
        int[] iArr = this.f50671w;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f50650l = 0;
        this.f50652m = 0;
        this.f50660q = 1.0f;
        this.f50666t = 1.0f;
        this.f50658p = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f50664s = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f50656o = 0;
        this.f50662r = 0;
        this.f50644i = false;
        this.f50668u = -1;
        this.f50670v = 1.0f;
        this.f50649k0 = false;
        this.f50651l0 = false;
        boolean[] zArr = this.f50640g;
        zArr[0] = true;
        zArr[1] = true;
        this.f50602A = false;
        boolean[] zArr2 = this.f50613L;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void Z() {
        e eVarG = G();
        if (eVarG != null && (eVarG instanceof f) && ((f) G()).W0()) {
            return;
        }
        int size = this.f50612K.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f50612K.get(i10)).l();
        }
    }

    public void a0(p230x.c cVar) {
        this.f50603B.m(cVar);
        this.f50604C.m(cVar);
        this.f50605D.m(cVar);
        this.f50606E.m(cVar);
        this.f50607F.m(cVar);
        this.f50610I.m(cVar);
        this.f50608G.m(cVar);
        this.f50609H.m(cVar);
    }

    public void b0(int i10) {
        this.f50626Y = i10;
        this.f50673y = i10 > 0;
    }

    public void c0(Object obj) {
        this.f50635d0 = obj;
    }

    public void d0(String str) {
        this.f50641g0 = str;
    }

    boolean e() {
        return (this instanceof l) || (this instanceof h);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public void e0(String str) {
        float fAbs;
        int i10 = 0;
        if (str == null || str.length() == 0) {
            this.f50618Q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i11 = 0;
        int i12 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i11 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i12 = i11;
            i11 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i11);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i10;
                }
            } else {
                String strSubstring3 = str.substring(i11, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i10;
                } else {
                    float f10 = Float.parseFloat(strSubstring3);
                    float f11 = Float.parseFloat(strSubstring4);
                    if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f11 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        fAbs = i10;
                    } else {
                        fAbs = i12 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i10 = (fAbs > i10 ? 1 : (fAbs == i10 ? 0 : -1));
        if (i10 > 0) {
            this.f50618Q = fAbs;
            this.f50619R = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0231  */
    /* JADX WARN: Code duplicated, block: B:142:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x0246  */
    /* JADX WARN: Code duplicated, block: B:149:0x024c  */
    /* JADX WARN: Code duplicated, block: B:151:0x024f  */
    /* JADX WARN: Code duplicated, block: B:154:0x026c  */
    /* JADX WARN: Code duplicated, block: B:156:0x0274  */
    /* JADX WARN: Code duplicated, block: B:171:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:175:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:176:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:178:0x0332  */
    /* JADX WARN: Code duplicated, block: B:181:0x0342  */
    /* JADX WARN: Code duplicated, block: B:194:0x038a  */
    /* JADX WARN: Code duplicated, block: B:197:0x039a  */
    /* JADX WARN: Code duplicated, block: B:198:0x039c  */
    /* JADX WARN: Code duplicated, block: B:200:0x039f  */
    /* JADX WARN: Code duplicated, block: B:202:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:205:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:207:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:208:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:210:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:215:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:218:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:219:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:222:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:225:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:227:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:229:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:231:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:233:0x0404  */
    /* JADX WARN: Code duplicated, block: B:235:0x0408  */
    /* JADX WARN: Code duplicated, block: B:238:0x0457  */
    /* JADX WARN: Code duplicated, block: B:240:0x045e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0465  */
    /* JADX WARN: Code duplicated, block: B:243:0x0474  */
    /* JADX WARN: Code duplicated, block: B:244:0x0477  */
    /* JADX WARN: Code duplicated, block: B:247:0x048f  */
    /* JADX WARN: Code duplicated, block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public void f(d dVar) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        i iVar;
        i iVar2;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        b bVar;
        b bVar2;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        b bVar3;
        int i13;
        boolean z19;
        boolean z20;
        f fVar;
        i iVar3;
        i iVar4;
        i iVar5;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        d dVar2;
        int i19;
        int i20;
        boolean z21;
        e eVar;
        i iVarQ;
        Object obj;
        boolean z22;
        int i21;
        f fVar2;
        e eVar2;
        i iVarQ2;
        e eVar3;
        i iVarQ3;
        int i22;
        int i23;
        boolean zV;
        boolean zX;
        d dVar3 = dVar;
        i iVarQ4 = dVar3.q(this.f50603B);
        i iVarQ5 = dVar3.q(this.f50605D);
        i iVarQ6 = dVar3.q(this.f50604C);
        i iVarQ7 = dVar3.q(this.f50606E);
        i iVarQ8 = dVar3.q(this.f50607F);
        boolean z23 = d.f50446r;
        j jVar = this.f50636e;
        f fVar3 = jVar.f50872h;
        if (fVar3.f50839j && jVar.f50873i.f50839j) {
            l lVar = this.f50638f;
            if (lVar.f50872h.f50839j && lVar.f50873i.f50839j) {
                dVar3.f(iVarQ4, fVar3.f50836g);
                dVar3.f(iVarQ5, this.f50636e.f50873i.f50836g);
                dVar3.f(iVarQ6, this.f50638f.f50872h.f50836g);
                dVar3.f(iVarQ7, this.f50638f.f50873i.f50836g);
                dVar3.f(iVarQ8, this.f50638f.f50862k.f50836g);
                e eVar4 = this.f50615N;
                if (eVar4 != null) {
                    boolean z24 = eVar4 != null && eVar4.f50614M[0] == b.WRAP_CONTENT;
                    boolean z25 = eVar4 != null && eVar4.f50614M[1] == b.WRAP_CONTENT;
                    if (z24 && this.f50640g[0] && !V()) {
                        dVar3.h(dVar3.q(this.f50615N.f50605D), iVarQ5, 0, 8);
                    }
                    if (z25 && this.f50640g[1] && !X()) {
                        dVar3.h(dVar3.q(this.f50615N.f50606E), iVarQ7, 0, 8);
                        return;
                    }
                }
                return;
            }
        }
        e eVar5 = this.f50615N;
        if (eVar5 != null) {
            z10 = eVar5 != null && eVar5.f50614M[0] == b.WRAP_CONTENT;
            z9 = eVar5 != null && eVar5.f50614M[1] == b.WRAP_CONTENT;
            if (U(0)) {
                ((f) this.f50615N).N0(this, 0);
                zV = true;
            } else {
                zV = V();
            }
            if (U(1)) {
                ((f) this.f50615N).N0(this, 1);
                zX = true;
            } else {
                zX = X();
            }
            if (!zV && z10 && this.f50639f0 != 8 && this.f50603B.f50586d == null && this.f50605D.f50586d == null) {
                dVar3.h(dVar3.q(this.f50615N.f50605D), iVarQ5, 0, 1);
            }
            if (!zX && z9 && this.f50639f0 != 8 && this.f50604C.f50586d == null && this.f50606E.f50586d == null && this.f50607F == null) {
                dVar3.h(dVar3.q(this.f50615N.f50606E), iVarQ7, 0, 1);
            }
            z11 = zV;
            z12 = zX;
        } else {
            z9 = false;
            z10 = false;
            z11 = false;
            z12 = false;
        }
        int i24 = this.f50616O;
        int i25 = this.f50627Z;
        if (i24 >= i25) {
            i25 = i24;
        }
        int i26 = this.f50617P;
        int i27 = this.f50629a0;
        if (i26 >= i27) {
            i27 = i26;
        }
        b[] bVarArr = this.f50614M;
        b bVar4 = bVarArr[0];
        b bVar5 = b.MATCH_CONSTRAINT;
        boolean z26 = bVar4 != bVar5;
        b bVar6 = bVarArr[1];
        boolean z27 = bVar6 != bVar5;
        int i28 = this.f50619R;
        this.f50668u = i28;
        int i29 = i25;
        float f10 = this.f50618Q;
        this.f50670v = f10;
        int i30 = this.f50650l;
        int i31 = this.f50652m;
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i10 = i27;
            if (this.f50639f0 != 8) {
                int i32 = (bVar4 == bVar5 && i30 == 0) ? 3 : i30;
                int i33 = (bVar6 == bVar5 && i31 == 0) ? 3 : i31;
                if (bVar4 == bVar5 && bVar6 == bVar5 && i32 == 3) {
                    iVar = iVarQ5;
                    i23 = i33;
                    if (i23 == 3) {
                        H0(z10, z9, z26, z27);
                    }
                    i11 = i32;
                    iVar2 = iVarQ7;
                    i12 = i23;
                    z13 = true;
                    int[] iArr = this.f50654n;
                    iArr[0] = i11;
                    iArr[1] = i12;
                    this.f50644i = z13;
                    z14 = !z13 && ((i22 = this.f50668u) == 0 || i22 == -1);
                    bVar = this.f50614M[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2 || !(this instanceof f)) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (z15) {
                        i29 = 0;
                    }
                    z16 = !this.f50610I.j();
                    boolean[] zArr = this.f50613L;
                    z17 = zArr[0];
                    z18 = zArr[1];
                    if (this.f50646j != 2) {
                        j jVar2 = this.f50636e;
                        fVar2 = jVar2.f50872h;
                        if (fVar2.f50839j || !jVar2.f50873i.f50839j) {
                            i iVar6 = iVar;
                            eVar2 = this.f50615N;
                            if (eVar2 != null) {
                                iVarQ2 = dVar3.q(eVar2.f50605D);
                            } else {
                                iVarQ2 = null;
                            }
                            eVar3 = this.f50615N;
                            if (eVar3 != null) {
                                iVarQ3 = dVar3.q(eVar3.f50603B);
                            } else {
                                iVarQ3 = null;
                            }
                            i iVar7 = iVar2;
                            z19 = z9;
                            iVarQ4 = iVarQ4;
                            z13 = z13;
                            z20 = z10;
                            bVar3 = bVar2;
                            iVar2 = iVar7;
                            iVar = iVar6;
                            dVar3 = dVar;
                            i13 = i11;
                            h(dVar3, true, z20, z19, this.f50640g[0], iVarQ3, iVarQ2, this.f50614M[0], z15, this.f50603B, this.f50605D, this.f50620S, i29, this.f50627Z, this.f50671w[0], this.f50631b0, z14, z11, z12, z17, i13, i12, this.f50656o, this.f50658p, this.f50660q, z16);
                        } else {
                            dVar3.f(iVarQ4, fVar2.f50836g);
                            i iVar8 = iVar;
                            dVar3.f(iVar8, this.f50636e.f50873i.f50836g);
                            if (this.f50615N != null && z10 && this.f50640g[0] && !V()) {
                                dVar3.h(dVar3.q(this.f50615N.f50605D), iVar8, 0, 8);
                            }
                            iVar = iVar8;
                        }
                        l lVar2 = this.f50638f;
                        fVar = lVar2.f50872h;
                        if (fVar.f50839j || !lVar2.f50873i.f50839j) {
                            iVar3 = r21;
                            iVar4 = iVar2;
                            iVar5 = r23;
                            i14 = 0;
                            i15 = 1;
                            i16 = 8;
                            i17 = 1;
                        } else {
                            int i34 = fVar.f50836g;
                            iVar3 = iVarQ6;
                            dVar3.f(iVar3, i34);
                            iVar4 = iVar2;
                            dVar3.f(iVar4, this.f50638f.f50873i.f50836g);
                            iVar5 = iVarQ8;
                            dVar3.f(iVar5, this.f50638f.f50862k.f50836g);
                            e eVar6 = this.f50615N;
                            if (eVar6 == null || z12 || !z19) {
                                i14 = 0;
                                i15 = 1;
                            } else {
                                i15 = 1;
                                if (this.f50640g[1]) {
                                    i14 = 0;
                                    i16 = 8;
                                    dVar3.h(dVar3.q(eVar6.f50606E), iVar4, 0, 8);
                                } else {
                                    i14 = 0;
                                }
                                i17 = i14;
                            }
                            i16 = 8;
                            i17 = i14;
                        }
                        if (this.f50648k == 2) {
                            i18 = i14;
                        } else {
                            i18 = i17;
                        }
                        if (i18 == 0) {
                            if (this.f50614M[i15] == bVar3 || !(this instanceof f)) {
                                i19 = i14;
                            } else {
                                i19 = i15;
                            }
                            if (i19 != 0) {
                                i20 = i14;
                            } else {
                                i20 = i10;
                            }
                            if (z13 || !((i21 = this.f50668u) == i15 || i21 == -1)) {
                                z21 = i14;
                            } else {
                                z21 = i15;
                            }
                            eVar = this.f50615N;
                            if (eVar != null) {
                                iVarQ = dVar3.q(eVar.f50606E);
                            } else {
                                iVarQ = null;
                            }
                            e eVar7 = this.f50615N;
                            i iVarQ9 = eVar7 != null ? dVar3.q(eVar7.f50604C) : null;
                            if (this.f50626Y <= 0 || this.f50639f0 == i16) {
                                z22 = z16;
                                dVar3.e(iVar5, iVar3, n(), i16);
                                obj = this.f50607F.f50586d;
                                if (obj != null) {
                                    dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                                    if (z19) {
                                        dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                                    }
                                    z22 = i14;
                                } else if (this.f50639f0 == i16) {
                                    z22 = z16;
                                    dVar3.e(iVar5, iVar3, i14, i16);
                                    z22 = z16;
                                }
                            }
                            z22 = z16;
                            z22 = z16;
                            h(dVar, false, z19, z20, this.f50640g[i15], iVarQ9, iVarQ, this.f50614M[i15], i19, this.f50604C, this.f50606E, this.f50621T, i20, this.f50629a0, this.f50671w[i15], this.f50633c0, z21, z12, z11, z18, i12, i13, this.f50662r, this.f50664s, this.f50666t, z22);
                        }
                        if (!z13) {
                            dVar2 = dVar;
                        } else if (this.f50668u == 1) {
                            dVar.k(iVar4, iVar3, iVar, iVarQ4, this.f50670v, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVarQ4, iVar4, iVar3, this.f50670v, 8);
                            dVar2 = dVar;
                        }
                        if (this.f50610I.j()) {
                            dVar2.b(this, this.f50610I.g().e(), (float) Math.toRadians(this.f50672x + 90.0f), this.f50610I.c());
                        }
                    }
                    z19 = z9;
                    z20 = z10;
                    bVar3 = bVar2;
                    i13 = i11;
                    l lVar3 = this.f50638f;
                    fVar = lVar3.f50872h;
                    if (fVar.f50839j) {
                        iVar3 = r21;
                        iVar4 = iVar2;
                        iVar5 = r23;
                        i14 = 0;
                        i15 = 1;
                        i16 = 8;
                        i17 = 1;
                    } else {
                        iVar3 = r21;
                        iVar4 = iVar2;
                        iVar5 = r23;
                        i14 = 0;
                        i15 = 1;
                        i16 = 8;
                        i17 = 1;
                    }
                    if (this.f50648k == 2) {
                        i18 = i14;
                    } else {
                        i18 = i17;
                    }
                    if (i18 == 0) {
                        if (this.f50614M[i15] == bVar3) {
                            i19 = i14;
                        } else {
                            i19 = i14;
                        }
                        if (i19 != 0) {
                            i20 = i14;
                        } else {
                            i20 = i10;
                        }
                        if (z13) {
                            z21 = i14;
                        } else {
                            z21 = i14;
                        }
                        eVar = this.f50615N;
                        if (eVar != null) {
                            iVarQ = dVar3.q(eVar.f50606E);
                        } else {
                            iVarQ = null;
                        }
                        e eVar8 = this.f50615N;
                        if (eVar8 != null) {
                        }
                        if (this.f50626Y <= 0) {
                            z22 = z16;
                            dVar3.e(iVar5, iVar3, n(), i16);
                            obj = this.f50607F.f50586d;
                            if (obj != null) {
                                dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                                if (z19) {
                                    dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                                }
                                z22 = i14;
                            } else if (this.f50639f0 == i16) {
                                z22 = z16;
                                dVar3.e(iVar5, iVar3, i14, i16);
                                z22 = z16;
                            }
                        } else {
                            z22 = z16;
                            dVar3.e(iVar5, iVar3, n(), i16);
                            obj = this.f50607F.f50586d;
                            if (obj != null) {
                                dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                                if (z19) {
                                    dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                                }
                                z22 = i14;
                            } else if (this.f50639f0 == i16) {
                                z22 = z16;
                                dVar3.e(iVar5, iVar3, i14, i16);
                                z22 = z16;
                            }
                        }
                        z22 = z16;
                        z22 = z16;
                        h(dVar, false, z19, z20, this.f50640g[i15], iVarQ9, iVarQ, this.f50614M[i15], i19, this.f50604C, this.f50606E, this.f50621T, i20, this.f50629a0, this.f50671w[i15], this.f50633c0, z21, z12, z11, z18, i12, i13, this.f50662r, this.f50664s, this.f50666t, z22);
                    }
                    if (!z13) {
                        dVar2 = dVar;
                    } else if (this.f50668u == 1) {
                        dVar.k(iVar4, iVar3, iVar, iVarQ4, this.f50670v, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ4, iVar4, iVar3, this.f50670v, 8);
                        dVar2 = dVar;
                    }
                    if (this.f50610I.j()) {
                        dVar2.b(this, this.f50610I.g().e(), (float) Math.toRadians(this.f50672x + 90.0f), this.f50610I.c());
                    }
                }
                iVar = iVarQ5;
                i23 = i33;
                if (bVar4 == bVar5 && i32 == 3) {
                    this.f50668u = 0;
                    i29 = (int) (f10 * i26);
                    if (bVar6 != bVar5) {
                        i11 = 4;
                        iVar2 = iVarQ7;
                        i12 = i23;
                    } else {
                        i11 = i32;
                        iVar2 = iVarQ7;
                        i12 = i23;
                        z13 = true;
                    }
                    int[] iArr2 = this.f50654n;
                    iArr2[0] = i11;
                    iArr2[1] = i12;
                    this.f50644i = z13;
                    if (z13) {
                    }
                    bVar = this.f50614M[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        i29 = 0;
                    }
                    z16 = !this.f50610I.j();
                    boolean[] zArr2 = this.f50613L;
                    z17 = zArr2[0];
                    z18 = zArr2[1];
                    if (this.f50646j != 2) {
                        j jVar3 = this.f50636e;
                        fVar2 = jVar3.f50872h;
                        if (fVar2.f50839j) {
                        }
                        i iVar9 = iVar;
                        eVar2 = this.f50615N;
                        if (eVar2 != null) {
                            iVarQ2 = dVar3.q(eVar2.f50605D);
                        } else {
                            iVarQ2 = null;
                        }
                        eVar3 = this.f50615N;
                        if (eVar3 != null) {
                            iVarQ3 = dVar3.q(eVar3.f50603B);
                        } else {
                            iVarQ3 = null;
                        }
                        i iVar10 = iVar2;
                        z19 = z9;
                        iVarQ4 = iVarQ4;
                        z13 = z13;
                        z20 = z10;
                        bVar3 = bVar2;
                        iVar2 = iVar10;
                        iVar = iVar9;
                        dVar3 = dVar;
                        i13 = i11;
                        h(dVar3, true, z20, z19, this.f50640g[0], iVarQ3, iVarQ2, this.f50614M[0], z15, this.f50603B, this.f50605D, this.f50620S, i29, this.f50627Z, this.f50671w[0], this.f50631b0, z14, z11, z12, z17, i13, i12, this.f50656o, this.f50658p, this.f50660q, z16);
                        l lVar4 = this.f50638f;
                        fVar = lVar4.f50872h;
                        if (fVar.f50839j) {
                            iVar3 = r21;
                            iVar4 = iVar2;
                            iVar5 = r23;
                            i14 = 0;
                            i15 = 1;
                            i16 = 8;
                            i17 = 1;
                        } else {
                            iVar3 = r21;
                            iVar4 = iVar2;
                            iVar5 = r23;
                            i14 = 0;
                            i15 = 1;
                            i16 = 8;
                            i17 = 1;
                        }
                        if (this.f50648k == 2) {
                            i18 = i14;
                        } else {
                            i18 = i17;
                        }
                        if (i18 == 0) {
                            if (this.f50614M[i15] == bVar3) {
                                i19 = i14;
                            } else {
                                i19 = i14;
                            }
                            if (i19 != 0) {
                                i20 = i14;
                            } else {
                                i20 = i10;
                            }
                            if (z13) {
                                z21 = i14;
                            } else {
                                z21 = i14;
                            }
                            eVar = this.f50615N;
                            if (eVar != null) {
                                iVarQ = dVar3.q(eVar.f50606E);
                            } else {
                                iVarQ = null;
                            }
                            e eVar9 = this.f50615N;
                            if (eVar9 != null) {
                            }
                            if (this.f50626Y <= 0) {
                                z22 = z16;
                                dVar3.e(iVar5, iVar3, n(), i16);
                                obj = this.f50607F.f50586d;
                                if (obj != null) {
                                    dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                                    if (z19) {
                                        dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                                    }
                                    z22 = i14;
                                } else if (this.f50639f0 == i16) {
                                    z22 = z16;
                                    dVar3.e(iVar5, iVar3, i14, i16);
                                    z22 = z16;
                                }
                            } else {
                                z22 = z16;
                                dVar3.e(iVar5, iVar3, n(), i16);
                                obj = this.f50607F.f50586d;
                                if (obj != null) {
                                    dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                                    if (z19) {
                                        dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                                    }
                                    z22 = i14;
                                } else if (this.f50639f0 == i16) {
                                    z22 = z16;
                                    dVar3.e(iVar5, iVar3, i14, i16);
                                    z22 = z16;
                                }
                            }
                            z22 = z16;
                            z22 = z16;
                            h(dVar, false, z19, z20, this.f50640g[i15], iVarQ9, iVarQ, this.f50614M[i15], i19, this.f50604C, this.f50606E, this.f50621T, i20, this.f50629a0, this.f50671w[i15], this.f50633c0, z21, z12, z11, z18, i12, i13, this.f50662r, this.f50664s, this.f50666t, z22);
                        }
                        if (!z13) {
                            dVar2 = dVar;
                        } else if (this.f50668u == 1) {
                            dVar.k(iVar4, iVar3, iVar, iVarQ4, this.f50670v, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVarQ4, iVar4, iVar3, this.f50670v, 8);
                            dVar2 = dVar;
                        }
                        if (this.f50610I.j()) {
                            dVar2.b(this, this.f50610I.g().e(), (float) Math.toRadians(this.f50672x + 90.0f), this.f50610I.c());
                        }
                    }
                    z19 = z9;
                    z20 = z10;
                    bVar3 = bVar2;
                    i13 = i11;
                    l lVar5 = this.f50638f;
                    fVar = lVar5.f50872h;
                    if (fVar.f50839j) {
                        iVar3 = r21;
                        iVar4 = iVar2;
                        iVar5 = r23;
                        i14 = 0;
                        i15 = 1;
                        i16 = 8;
                        i17 = 1;
                    } else {
                        iVar3 = r21;
                        iVar4 = iVar2;
                        iVar5 = r23;
                        i14 = 0;
                        i15 = 1;
                        i16 = 8;
                        i17 = 1;
                    }
                    if (this.f50648k == 2) {
                        i18 = i14;
                    } else {
                        i18 = i17;
                    }
                    if (i18 == 0) {
                        if (this.f50614M[i15] == bVar3) {
                            i19 = i14;
                        } else {
                            i19 = i14;
                        }
                        if (i19 != 0) {
                            i20 = i14;
                        } else {
                            i20 = i10;
                        }
                        if (z13) {
                            z21 = i14;
                        } else {
                            z21 = i14;
                        }
                        eVar = this.f50615N;
                        if (eVar != null) {
                            iVarQ = dVar3.q(eVar.f50606E);
                        } else {
                            iVarQ = null;
                        }
                        e eVar10 = this.f50615N;
                        if (eVar10 != null) {
                        }
                        if (this.f50626Y <= 0) {
                            z22 = z16;
                            dVar3.e(iVar5, iVar3, n(), i16);
                            obj = this.f50607F.f50586d;
                            if (obj != null) {
                                dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                                if (z19) {
                                    dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                                }
                                z22 = i14;
                            } else if (this.f50639f0 == i16) {
                                z22 = z16;
                                dVar3.e(iVar5, iVar3, i14, i16);
                                z22 = z16;
                            }
                        } else {
                            z22 = z16;
                            dVar3.e(iVar5, iVar3, n(), i16);
                            obj = this.f50607F.f50586d;
                            if (obj != null) {
                                dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                                if (z19) {
                                    dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                                }
                                z22 = i14;
                            } else if (this.f50639f0 == i16) {
                                z22 = z16;
                                dVar3.e(iVar5, iVar3, i14, i16);
                                z22 = z16;
                            }
                        }
                        z22 = z16;
                        z22 = z16;
                        h(dVar, false, z19, z20, this.f50640g[i15], iVarQ9, iVarQ, this.f50614M[i15], i19, this.f50604C, this.f50606E, this.f50621T, i20, this.f50629a0, this.f50671w[i15], this.f50633c0, z21, z12, z11, z18, i12, i13, this.f50662r, this.f50664s, this.f50666t, z22);
                    }
                    if (!z13) {
                        dVar2 = dVar;
                    } else if (this.f50668u == 1) {
                        dVar.k(iVar4, iVar3, iVar, iVarQ4, this.f50670v, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ4, iVar4, iVar3, this.f50670v, 8);
                        dVar2 = dVar;
                    }
                    if (this.f50610I.j()) {
                        dVar2.b(this, this.f50610I.g().e(), (float) Math.toRadians(this.f50672x + 90.0f), this.f50610I.c());
                    }
                }
                if (bVar6 == bVar5 && i23 == 3) {
                    this.f50668u = 1;
                    if (i28 == -1) {
                        this.f50670v = 1.0f / f10;
                    }
                    int i35 = (int) (this.f50670v * i24);
                    if (bVar4 != bVar5) {
                        i12 = 4;
                        iVar2 = iVarQ7;
                        i10 = i35;
                        i11 = i32;
                    } else {
                        i10 = i35;
                    }
                }
                i11 = i32;
                iVar2 = iVarQ7;
                i12 = i23;
                z13 = true;
                int[] iArr3 = this.f50654n;
                iArr3[0] = i11;
                iArr3[1] = i12;
                this.f50644i = z13;
                if (z13) {
                }
                bVar = this.f50614M[0];
                bVar2 = b.WRAP_CONTENT;
                if (bVar == bVar2) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                    i29 = 0;
                }
                z16 = !this.f50610I.j();
                boolean[] zArr3 = this.f50613L;
                z17 = zArr3[0];
                z18 = zArr3[1];
                if (this.f50646j != 2) {
                    j jVar4 = this.f50636e;
                    fVar2 = jVar4.f50872h;
                    if (fVar2.f50839j) {
                    }
                    i iVar11 = iVar;
                    eVar2 = this.f50615N;
                    if (eVar2 != null) {
                        iVarQ2 = dVar3.q(eVar2.f50605D);
                    } else {
                        iVarQ2 = null;
                    }
                    eVar3 = this.f50615N;
                    if (eVar3 != null) {
                        iVarQ3 = dVar3.q(eVar3.f50603B);
                    } else {
                        iVarQ3 = null;
                    }
                    i iVar12 = iVar2;
                    z19 = z9;
                    iVarQ4 = iVarQ4;
                    z13 = z13;
                    z20 = z10;
                    bVar3 = bVar2;
                    iVar2 = iVar12;
                    iVar = iVar11;
                    dVar3 = dVar;
                    i13 = i11;
                    h(dVar3, true, z20, z19, this.f50640g[0], iVarQ3, iVarQ2, this.f50614M[0], z15, this.f50603B, this.f50605D, this.f50620S, i29, this.f50627Z, this.f50671w[0], this.f50631b0, z14, z11, z12, z17, i13, i12, this.f50656o, this.f50658p, this.f50660q, z16);
                    l lVar6 = this.f50638f;
                    fVar = lVar6.f50872h;
                    if (fVar.f50839j) {
                        iVar3 = r21;
                        iVar4 = iVar2;
                        iVar5 = r23;
                        i14 = 0;
                        i15 = 1;
                        i16 = 8;
                        i17 = 1;
                    } else {
                        iVar3 = r21;
                        iVar4 = iVar2;
                        iVar5 = r23;
                        i14 = 0;
                        i15 = 1;
                        i16 = 8;
                        i17 = 1;
                    }
                    if (this.f50648k == 2) {
                        i18 = i14;
                    } else {
                        i18 = i17;
                    }
                    if (i18 == 0) {
                        if (this.f50614M[i15] == bVar3) {
                            i19 = i14;
                        } else {
                            i19 = i14;
                        }
                        if (i19 != 0) {
                            i20 = i14;
                        } else {
                            i20 = i10;
                        }
                        if (z13) {
                            z21 = i14;
                        } else {
                            z21 = i14;
                        }
                        eVar = this.f50615N;
                        if (eVar != null) {
                            iVarQ = dVar3.q(eVar.f50606E);
                        } else {
                            iVarQ = null;
                        }
                        e eVar11 = this.f50615N;
                        if (eVar11 != null) {
                        }
                        if (this.f50626Y <= 0) {
                            z22 = z16;
                            dVar3.e(iVar5, iVar3, n(), i16);
                            obj = this.f50607F.f50586d;
                            if (obj != null) {
                                dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                                if (z19) {
                                    dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                                }
                                z22 = i14;
                            } else if (this.f50639f0 == i16) {
                                z22 = z16;
                                dVar3.e(iVar5, iVar3, i14, i16);
                                z22 = z16;
                            }
                        } else {
                            z22 = z16;
                            dVar3.e(iVar5, iVar3, n(), i16);
                            obj = this.f50607F.f50586d;
                            if (obj != null) {
                                dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                                if (z19) {
                                    dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                                }
                                z22 = i14;
                            } else if (this.f50639f0 == i16) {
                                z22 = z16;
                                dVar3.e(iVar5, iVar3, i14, i16);
                                z22 = z16;
                            }
                        }
                        z22 = z16;
                        z22 = z16;
                        h(dVar, false, z19, z20, this.f50640g[i15], iVarQ9, iVarQ, this.f50614M[i15], i19, this.f50604C, this.f50606E, this.f50621T, i20, this.f50629a0, this.f50671w[i15], this.f50633c0, z21, z12, z11, z18, i12, i13, this.f50662r, this.f50664s, this.f50666t, z22);
                    }
                    if (!z13) {
                        dVar2 = dVar;
                    } else if (this.f50668u == 1) {
                        dVar.k(iVar4, iVar3, iVar, iVarQ4, this.f50670v, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ4, iVar4, iVar3, this.f50670v, 8);
                        dVar2 = dVar;
                    }
                    if (this.f50610I.j()) {
                        dVar2.b(this, this.f50610I.g().e(), (float) Math.toRadians(this.f50672x + 90.0f), this.f50610I.c());
                    }
                }
                z19 = z9;
                z20 = z10;
                bVar3 = bVar2;
                i13 = i11;
                l lVar7 = this.f50638f;
                fVar = lVar7.f50872h;
                if (fVar.f50839j) {
                    iVar3 = r21;
                    iVar4 = iVar2;
                    iVar5 = r23;
                    i14 = 0;
                    i15 = 1;
                    i16 = 8;
                    i17 = 1;
                } else {
                    iVar3 = r21;
                    iVar4 = iVar2;
                    iVar5 = r23;
                    i14 = 0;
                    i15 = 1;
                    i16 = 8;
                    i17 = 1;
                }
                if (this.f50648k == 2) {
                    i18 = i14;
                } else {
                    i18 = i17;
                }
                if (i18 == 0) {
                    if (this.f50614M[i15] == bVar3) {
                        i19 = i14;
                    } else {
                        i19 = i14;
                    }
                    if (i19 != 0) {
                        i20 = i14;
                    } else {
                        i20 = i10;
                    }
                    if (z13) {
                        z21 = i14;
                    } else {
                        z21 = i14;
                    }
                    eVar = this.f50615N;
                    if (eVar != null) {
                        iVarQ = dVar3.q(eVar.f50606E);
                    } else {
                        iVarQ = null;
                    }
                    e eVar12 = this.f50615N;
                    if (eVar12 != null) {
                    }
                    if (this.f50626Y <= 0) {
                        z22 = z16;
                        dVar3.e(iVar5, iVar3, n(), i16);
                        obj = this.f50607F.f50586d;
                        if (obj != null) {
                            dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                            if (z19) {
                                dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                            }
                            z22 = i14;
                        } else if (this.f50639f0 == i16) {
                            z22 = z16;
                            dVar3.e(iVar5, iVar3, i14, i16);
                            z22 = z16;
                        }
                    } else {
                        z22 = z16;
                        dVar3.e(iVar5, iVar3, n(), i16);
                        obj = this.f50607F.f50586d;
                        if (obj != null) {
                            dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                            if (z19) {
                                dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                            }
                            z22 = i14;
                        } else if (this.f50639f0 == i16) {
                            z22 = z16;
                            dVar3.e(iVar5, iVar3, i14, i16);
                            z22 = z16;
                        }
                    }
                    z22 = z16;
                    z22 = z16;
                    h(dVar, false, z19, z20, this.f50640g[i15], iVarQ9, iVarQ, this.f50614M[i15], i19, this.f50604C, this.f50606E, this.f50621T, i20, this.f50629a0, this.f50671w[i15], this.f50633c0, z21, z12, z11, z18, i12, i13, this.f50662r, this.f50664s, this.f50666t, z22);
                }
                if (!z13) {
                    dVar2 = dVar;
                } else if (this.f50668u == 1) {
                    dVar.k(iVar4, iVar3, iVar, iVarQ4, this.f50670v, 8);
                    dVar2 = dVar;
                } else {
                    dVar.k(iVar, iVarQ4, iVar4, iVar3, this.f50670v, 8);
                    dVar2 = dVar;
                }
                if (this.f50610I.j()) {
                    dVar2.b(this, this.f50610I.g().e(), (float) Math.toRadians(this.f50672x + 90.0f), this.f50610I.c());
                }
            }
            z13 = false;
            int[] iArr4 = this.f50654n;
            iArr4[0] = i11;
            iArr4[1] = i12;
            this.f50644i = z13;
            if (z13) {
            }
            bVar = this.f50614M[0];
            bVar2 = b.WRAP_CONTENT;
            if (bVar == bVar2) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z15) {
                i29 = 0;
            }
            z16 = !this.f50610I.j();
            boolean[] zArr4 = this.f50613L;
            z17 = zArr4[0];
            z18 = zArr4[1];
            if (this.f50646j != 2) {
                j jVar5 = this.f50636e;
                fVar2 = jVar5.f50872h;
                if (fVar2.f50839j) {
                }
                i iVar13 = iVar;
                eVar2 = this.f50615N;
                if (eVar2 != null) {
                    iVarQ2 = dVar3.q(eVar2.f50605D);
                } else {
                    iVarQ2 = null;
                }
                eVar3 = this.f50615N;
                if (eVar3 != null) {
                    iVarQ3 = dVar3.q(eVar3.f50603B);
                } else {
                    iVarQ3 = null;
                }
                i iVar14 = iVar2;
                z19 = z9;
                iVarQ4 = iVarQ4;
                z13 = z13;
                z20 = z10;
                bVar3 = bVar2;
                iVar2 = iVar14;
                iVar = iVar13;
                dVar3 = dVar;
                i13 = i11;
                h(dVar3, true, z20, z19, this.f50640g[0], iVarQ3, iVarQ2, this.f50614M[0], z15, this.f50603B, this.f50605D, this.f50620S, i29, this.f50627Z, this.f50671w[0], this.f50631b0, z14, z11, z12, z17, i13, i12, this.f50656o, this.f50658p, this.f50660q, z16);
                l lVar8 = this.f50638f;
                fVar = lVar8.f50872h;
                if (fVar.f50839j) {
                    iVar3 = r21;
                    iVar4 = iVar2;
                    iVar5 = r23;
                    i14 = 0;
                    i15 = 1;
                    i16 = 8;
                    i17 = 1;
                } else {
                    iVar3 = r21;
                    iVar4 = iVar2;
                    iVar5 = r23;
                    i14 = 0;
                    i15 = 1;
                    i16 = 8;
                    i17 = 1;
                }
                if (this.f50648k == 2) {
                    i18 = i14;
                } else {
                    i18 = i17;
                }
                if (i18 == 0) {
                    if (this.f50614M[i15] == bVar3) {
                        i19 = i14;
                    } else {
                        i19 = i14;
                    }
                    if (i19 != 0) {
                        i20 = i14;
                    } else {
                        i20 = i10;
                    }
                    if (z13) {
                        z21 = i14;
                    } else {
                        z21 = i14;
                    }
                    eVar = this.f50615N;
                    if (eVar != null) {
                        iVarQ = dVar3.q(eVar.f50606E);
                    } else {
                        iVarQ = null;
                    }
                    e eVar13 = this.f50615N;
                    if (eVar13 != null) {
                    }
                    if (this.f50626Y <= 0) {
                        z22 = z16;
                        dVar3.e(iVar5, iVar3, n(), i16);
                        obj = this.f50607F.f50586d;
                        if (obj != null) {
                            dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                            if (z19) {
                                dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                            }
                            z22 = i14;
                        } else if (this.f50639f0 == i16) {
                            z22 = z16;
                            dVar3.e(iVar5, iVar3, i14, i16);
                            z22 = z16;
                        }
                    } else {
                        z22 = z16;
                        dVar3.e(iVar5, iVar3, n(), i16);
                        obj = this.f50607F.f50586d;
                        if (obj != null) {
                            dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                            if (z19) {
                                dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                            }
                            z22 = i14;
                        } else if (this.f50639f0 == i16) {
                            z22 = z16;
                            dVar3.e(iVar5, iVar3, i14, i16);
                            z22 = z16;
                        }
                    }
                    z22 = z16;
                    z22 = z16;
                    h(dVar, false, z19, z20, this.f50640g[i15], iVarQ9, iVarQ, this.f50614M[i15], i19, this.f50604C, this.f50606E, this.f50621T, i20, this.f50629a0, this.f50671w[i15], this.f50633c0, z21, z12, z11, z18, i12, i13, this.f50662r, this.f50664s, this.f50666t, z22);
                }
                if (!z13) {
                    dVar2 = dVar;
                } else if (this.f50668u == 1) {
                    dVar.k(iVar4, iVar3, iVar, iVarQ4, this.f50670v, 8);
                    dVar2 = dVar;
                } else {
                    dVar.k(iVar, iVarQ4, iVar4, iVar3, this.f50670v, 8);
                    dVar2 = dVar;
                }
                if (this.f50610I.j()) {
                    dVar2.b(this, this.f50610I.g().e(), (float) Math.toRadians(this.f50672x + 90.0f), this.f50610I.c());
                }
            }
            z19 = z9;
            z20 = z10;
            bVar3 = bVar2;
            i13 = i11;
            l lVar9 = this.f50638f;
            fVar = lVar9.f50872h;
            if (fVar.f50839j) {
                iVar3 = r21;
                iVar4 = iVar2;
                iVar5 = r23;
                i14 = 0;
                i15 = 1;
                i16 = 8;
                i17 = 1;
            } else {
                iVar3 = r21;
                iVar4 = iVar2;
                iVar5 = r23;
                i14 = 0;
                i15 = 1;
                i16 = 8;
                i17 = 1;
            }
            if (this.f50648k == 2) {
                i18 = i14;
            } else {
                i18 = i17;
            }
            if (i18 == 0) {
                if (this.f50614M[i15] == bVar3) {
                    i19 = i14;
                } else {
                    i19 = i14;
                }
                if (i19 != 0) {
                    i20 = i14;
                } else {
                    i20 = i10;
                }
                if (z13) {
                    z21 = i14;
                } else {
                    z21 = i14;
                }
                eVar = this.f50615N;
                if (eVar != null) {
                    iVarQ = dVar3.q(eVar.f50606E);
                } else {
                    iVarQ = null;
                }
                e eVar14 = this.f50615N;
                if (eVar14 != null) {
                }
                if (this.f50626Y <= 0) {
                    z22 = z16;
                    dVar3.e(iVar5, iVar3, n(), i16);
                    obj = this.f50607F.f50586d;
                    if (obj != null) {
                        dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                        if (z19) {
                            dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                        }
                        z22 = i14;
                    } else if (this.f50639f0 == i16) {
                        z22 = z16;
                        dVar3.e(iVar5, iVar3, i14, i16);
                        z22 = z16;
                    }
                } else {
                    z22 = z16;
                    dVar3.e(iVar5, iVar3, n(), i16);
                    obj = this.f50607F.f50586d;
                    if (obj != null) {
                        dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                        if (z19) {
                            dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                        }
                        z22 = i14;
                    } else if (this.f50639f0 == i16) {
                        z22 = z16;
                        dVar3.e(iVar5, iVar3, i14, i16);
                        z22 = z16;
                    }
                }
                z22 = z16;
                z22 = z16;
                h(dVar, false, z19, z20, this.f50640g[i15], iVarQ9, iVarQ, this.f50614M[i15], i19, this.f50604C, this.f50606E, this.f50621T, i20, this.f50629a0, this.f50671w[i15], this.f50633c0, z21, z12, z11, z18, i12, i13, this.f50662r, this.f50664s, this.f50666t, z22);
            }
            if (!z13) {
                dVar2 = dVar;
            } else if (this.f50668u == 1) {
                dVar.k(iVar4, iVar3, iVar, iVarQ4, this.f50670v, 8);
                dVar2 = dVar;
            } else {
                dVar.k(iVar, iVarQ4, iVar4, iVar3, this.f50670v, 8);
                dVar2 = dVar;
            }
            if (this.f50610I.j()) {
                dVar2.b(this, this.f50610I.g().e(), (float) Math.toRadians(this.f50672x + 90.0f), this.f50610I.c());
            }
        }
        i10 = i27;
        iVar = iVarQ5;
        iVar2 = iVarQ7;
        i11 = i30;
        i12 = i31;
        z13 = false;
        int[] iArr5 = this.f50654n;
        iArr5[0] = i11;
        iArr5[1] = i12;
        this.f50644i = z13;
        if (z13) {
        }
        bVar = this.f50614M[0];
        bVar2 = b.WRAP_CONTENT;
        if (bVar == bVar2) {
            z15 = false;
        } else {
            z15 = false;
        }
        if (z15) {
            i29 = 0;
        }
        z16 = !this.f50610I.j();
        boolean[] zArr5 = this.f50613L;
        z17 = zArr5[0];
        z18 = zArr5[1];
        if (this.f50646j != 2) {
            j jVar6 = this.f50636e;
            fVar2 = jVar6.f50872h;
            if (fVar2.f50839j) {
            }
            i iVar15 = iVar;
            eVar2 = this.f50615N;
            if (eVar2 != null) {
                iVarQ2 = dVar3.q(eVar2.f50605D);
            } else {
                iVarQ2 = null;
            }
            eVar3 = this.f50615N;
            if (eVar3 != null) {
                iVarQ3 = dVar3.q(eVar3.f50603B);
            } else {
                iVarQ3 = null;
            }
            i iVar16 = iVar2;
            z19 = z9;
            iVarQ4 = iVarQ4;
            z13 = z13;
            z20 = z10;
            bVar3 = bVar2;
            iVar2 = iVar16;
            iVar = iVar15;
            dVar3 = dVar;
            i13 = i11;
            h(dVar3, true, z20, z19, this.f50640g[0], iVarQ3, iVarQ2, this.f50614M[0], z15, this.f50603B, this.f50605D, this.f50620S, i29, this.f50627Z, this.f50671w[0], this.f50631b0, z14, z11, z12, z17, i13, i12, this.f50656o, this.f50658p, this.f50660q, z16);
            l lVar10 = this.f50638f;
            fVar = lVar10.f50872h;
            if (fVar.f50839j) {
                iVar3 = r21;
                iVar4 = iVar2;
                iVar5 = r23;
                i14 = 0;
                i15 = 1;
                i16 = 8;
                i17 = 1;
            } else {
                iVar3 = r21;
                iVar4 = iVar2;
                iVar5 = r23;
                i14 = 0;
                i15 = 1;
                i16 = 8;
                i17 = 1;
            }
            if (this.f50648k == 2) {
                i18 = i14;
            } else {
                i18 = i17;
            }
            if (i18 == 0) {
                if (this.f50614M[i15] == bVar3) {
                    i19 = i14;
                } else {
                    i19 = i14;
                }
                if (i19 != 0) {
                    i20 = i14;
                } else {
                    i20 = i10;
                }
                if (z13) {
                    z21 = i14;
                } else {
                    z21 = i14;
                }
                eVar = this.f50615N;
                if (eVar != null) {
                    iVarQ = dVar3.q(eVar.f50606E);
                } else {
                    iVarQ = null;
                }
                e eVar15 = this.f50615N;
                if (eVar15 != null) {
                }
                if (this.f50626Y <= 0) {
                    z22 = z16;
                    dVar3.e(iVar5, iVar3, n(), i16);
                    obj = this.f50607F.f50586d;
                    if (obj != null) {
                        dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                        if (z19) {
                            dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                        }
                        z22 = i14;
                    } else if (this.f50639f0 == i16) {
                        z22 = z16;
                        dVar3.e(iVar5, iVar3, i14, i16);
                        z22 = z16;
                    }
                } else {
                    z22 = z16;
                    dVar3.e(iVar5, iVar3, n(), i16);
                    obj = this.f50607F.f50586d;
                    if (obj != null) {
                        dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                        if (z19) {
                            dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                        }
                        z22 = i14;
                    } else if (this.f50639f0 == i16) {
                        z22 = z16;
                        dVar3.e(iVar5, iVar3, i14, i16);
                        z22 = z16;
                    }
                }
                z22 = z16;
                z22 = z16;
                h(dVar, false, z19, z20, this.f50640g[i15], iVarQ9, iVarQ, this.f50614M[i15], i19, this.f50604C, this.f50606E, this.f50621T, i20, this.f50629a0, this.f50671w[i15], this.f50633c0, z21, z12, z11, z18, i12, i13, this.f50662r, this.f50664s, this.f50666t, z22);
            }
            if (!z13) {
                dVar2 = dVar;
            } else if (this.f50668u == 1) {
                dVar.k(iVar4, iVar3, iVar, iVarQ4, this.f50670v, 8);
                dVar2 = dVar;
            } else {
                dVar.k(iVar, iVarQ4, iVar4, iVar3, this.f50670v, 8);
                dVar2 = dVar;
            }
            if (this.f50610I.j()) {
                dVar2.b(this, this.f50610I.g().e(), (float) Math.toRadians(this.f50672x + 90.0f), this.f50610I.c());
            }
        }
        z19 = z9;
        z20 = z10;
        bVar3 = bVar2;
        i13 = i11;
        l lVar11 = this.f50638f;
        fVar = lVar11.f50872h;
        if (fVar.f50839j) {
            iVar3 = r21;
            iVar4 = iVar2;
            iVar5 = r23;
            i14 = 0;
            i15 = 1;
            i16 = 8;
            i17 = 1;
        } else {
            iVar3 = r21;
            iVar4 = iVar2;
            iVar5 = r23;
            i14 = 0;
            i15 = 1;
            i16 = 8;
            i17 = 1;
        }
        if (this.f50648k == 2) {
            i18 = i14;
        } else {
            i18 = i17;
        }
        if (i18 == 0) {
            if (this.f50614M[i15] == bVar3) {
                i19 = i14;
            } else {
                i19 = i14;
            }
            if (i19 != 0) {
                i20 = i14;
            } else {
                i20 = i10;
            }
            if (z13) {
                z21 = i14;
            } else {
                z21 = i14;
            }
            eVar = this.f50615N;
            if (eVar != null) {
                iVarQ = dVar3.q(eVar.f50606E);
            } else {
                iVarQ = null;
            }
            e eVar16 = this.f50615N;
            if (eVar16 != null) {
            }
            if (this.f50626Y <= 0) {
                z22 = z16;
                dVar3.e(iVar5, iVar3, n(), i16);
                obj = this.f50607F.f50586d;
                if (obj != null) {
                    dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                    if (z19) {
                        dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                    }
                    z22 = i14;
                } else if (this.f50639f0 == i16) {
                    z22 = z16;
                    dVar3.e(iVar5, iVar3, i14, i16);
                    z22 = z16;
                }
            } else {
                z22 = z16;
                dVar3.e(iVar5, iVar3, n(), i16);
                obj = this.f50607F.f50586d;
                if (obj != null) {
                    dVar3.e(iVar5, dVar3.q(obj), i14, i16);
                    if (z19) {
                        dVar3.h(iVarQ, dVar3.q(this.f50606E), i14, 5);
                    }
                    z22 = i14;
                } else if (this.f50639f0 == i16) {
                    z22 = z16;
                    dVar3.e(iVar5, iVar3, i14, i16);
                    z22 = z16;
                }
            }
            z22 = z16;
            z22 = z16;
            h(dVar, false, z19, z20, this.f50640g[i15], iVarQ9, iVarQ, this.f50614M[i15], i19, this.f50604C, this.f50606E, this.f50621T, i20, this.f50629a0, this.f50671w[i15], this.f50633c0, z21, z12, z11, z18, i12, i13, this.f50662r, this.f50664s, this.f50666t, z22);
        }
        if (!z13) {
            dVar2 = dVar;
        } else if (this.f50668u == 1) {
            dVar.k(iVar4, iVar3, iVar, iVarQ4, this.f50670v, 8);
            dVar2 = dVar;
        } else {
            dVar.k(iVar, iVarQ4, iVar4, iVar3, this.f50670v, 8);
            dVar2 = dVar;
        }
        if (this.f50610I.j()) {
            dVar2.b(this, this.f50610I.g().e(), (float) Math.toRadians(this.f50672x + 90.0f), this.f50610I.c());
        }
    }

    public void f0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f50620S = i10;
        this.f50621T = i11;
        if (this.f50639f0 == 8) {
            this.f50616O = 0;
            this.f50617P = 0;
            return;
        }
        b[] bVarArr = this.f50614M;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f50616O)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f50617P)) {
            i17 = i14;
        }
        this.f50616O = i16;
        this.f50617P = i17;
        int i18 = this.f50629a0;
        if (i17 < i18) {
            this.f50617P = i18;
        }
        int i19 = this.f50627Z;
        if (i16 < i19) {
            this.f50616O = i19;
        }
    }

    public boolean g() {
        return this.f50639f0 != 8;
    }

    public void g0(boolean z9) {
        this.f50673y = z9;
    }

    public void h0(int i10) {
        this.f50617P = i10;
        int i11 = this.f50629a0;
        if (i10 < i11) {
            this.f50617P = i11;
        }
    }

    public void i(d.b bVar, e eVar, d.b bVar2, int i10) {
        d.b bVar3;
        d.b bVar4;
        boolean z9;
        d.b bVar5 = d.b.CENTER;
        if (bVar == bVar5) {
            if (bVar2 != bVar5) {
                d.b bVar6 = d.b.LEFT;
                if (bVar2 == bVar6 || bVar2 == d.b.RIGHT) {
                    i(bVar6, eVar, bVar2, 0);
                    i(d.b.RIGHT, eVar, bVar2, 0);
                    m(bVar5).a(eVar.m(bVar2), 0);
                    return;
                }
                d.b bVar7 = d.b.TOP;
                if (bVar2 == bVar7 || bVar2 == d.b.BOTTOM) {
                    i(bVar7, eVar, bVar2, 0);
                    i(d.b.BOTTOM, eVar, bVar2, 0);
                    m(bVar5).a(eVar.m(bVar2), 0);
                    return;
                }
                return;
            }
            d.b bVar8 = d.b.LEFT;
            d dVarM = m(bVar8);
            d.b bVar9 = d.b.RIGHT;
            d dVarM2 = m(bVar9);
            d.b bVar10 = d.b.TOP;
            d dVarM3 = m(bVar10);
            d.b bVar11 = d.b.BOTTOM;
            d dVarM4 = m(bVar11);
            boolean z10 = true;
            if ((dVarM == null || !dVarM.j()) && (dVarM2 == null || !dVarM2.j())) {
                i(bVar8, eVar, bVar8, 0);
                i(bVar9, eVar, bVar9, 0);
                z9 = true;
            } else {
                z9 = false;
            }
            if ((dVarM3 == null || !dVarM3.j()) && (dVarM4 == null || !dVarM4.j())) {
                i(bVar10, eVar, bVar10, 0);
                i(bVar11, eVar, bVar11, 0);
            } else {
                z10 = false;
            }
            if (z9 && z10) {
                m(bVar5).a(eVar.m(bVar5), 0);
                return;
            }
            if (z9) {
                d.b bVar12 = d.b.CENTER_X;
                m(bVar12).a(eVar.m(bVar12), 0);
                return;
            } else {
                if (z10) {
                    d.b bVar13 = d.b.CENTER_Y;
                    m(bVar13).a(eVar.m(bVar13), 0);
                    return;
                }
                return;
            }
        }
        d.b bVar14 = d.b.CENTER_X;
        if (bVar == bVar14 && (bVar2 == (bVar4 = d.b.LEFT) || bVar2 == d.b.RIGHT)) {
            d dVarM5 = m(bVar4);
            d dVarM6 = eVar.m(bVar2);
            d dVarM7 = m(d.b.RIGHT);
            dVarM5.a(dVarM6, 0);
            dVarM7.a(dVarM6, 0);
            m(bVar14).a(dVarM6, 0);
            return;
        }
        d.b bVar15 = d.b.CENTER_Y;
        if (bVar == bVar15 && (bVar2 == (bVar3 = d.b.TOP) || bVar2 == d.b.BOTTOM)) {
            d dVarM8 = eVar.m(bVar2);
            m(bVar3).a(dVarM8, 0);
            m(d.b.BOTTOM).a(dVarM8, 0);
            m(bVar15).a(dVarM8, 0);
            return;
        }
        if (bVar == bVar14 && bVar2 == bVar14) {
            d.b bVar16 = d.b.LEFT;
            m(bVar16).a(eVar.m(bVar16), 0);
            d.b bVar17 = d.b.RIGHT;
            m(bVar17).a(eVar.m(bVar17), 0);
            m(bVar14).a(eVar.m(bVar2), 0);
            return;
        }
        if (bVar == bVar15 && bVar2 == bVar15) {
            d.b bVar18 = d.b.TOP;
            m(bVar18).a(eVar.m(bVar18), 0);
            d.b bVar19 = d.b.BOTTOM;
            m(bVar19).a(eVar.m(bVar19), 0);
            m(bVar15).a(eVar.m(bVar2), 0);
            return;
        }
        d dVarM9 = m(bVar);
        d dVarM10 = eVar.m(bVar2);
        if (dVarM9.k(dVarM10)) {
            d.b bVar20 = d.b.BASELINE;
            if (bVar == bVar20) {
                d dVarM11 = m(d.b.TOP);
                d dVarM12 = m(d.b.BOTTOM);
                if (dVarM11 != null) {
                    dVarM11.l();
                }
                if (dVarM12 != null) {
                    dVarM12.l();
                }
                i10 = 0;
            } else if (bVar == d.b.TOP || bVar == d.b.BOTTOM) {
                d dVarM13 = m(bVar20);
                if (dVarM13 != null) {
                    dVarM13.l();
                }
                d dVarM14 = m(bVar5);
                if (dVarM14.g() != dVarM10) {
                    dVarM14.l();
                }
                d dVarD = m(bVar).d();
                d dVarM15 = m(bVar15);
                if (dVarM15.j()) {
                    dVarD.l();
                    dVarM15.l();
                }
            } else if (bVar == d.b.LEFT || bVar == d.b.RIGHT) {
                d dVarM16 = m(bVar5);
                if (dVarM16.g() != dVarM10) {
                    dVarM16.l();
                }
                d dVarD2 = m(bVar).d();
                d dVarM17 = m(bVar14);
                if (dVarM17.j()) {
                    dVarD2.l();
                    dVarM17.l();
                }
            }
            dVarM9.a(dVarM10, i10);
        }
    }

    public void i0(float f10) {
        this.f50631b0 = f10;
    }

    public void j(d dVar, d dVar2, int i10) {
        if (dVar.e() == this) {
            i(dVar.h(), dVar2.e(), dVar2.h(), i10);
        }
    }

    public void j0(int i10) {
        this.f50653m0 = i10;
    }

    public void k(e eVar, float f10, int i10) {
        d.b bVar = d.b.CENTER;
        T(bVar, eVar, bVar, i10, 0);
        this.f50672x = f10;
    }

    public void k0(int i10, int i11) {
        this.f50620S = i10;
        int i12 = i11 - i10;
        this.f50616O = i12;
        int i13 = this.f50627Z;
        if (i12 < i13) {
            this.f50616O = i13;
        }
    }

    public void l(d dVar) {
        dVar.q(this.f50603B);
        dVar.q(this.f50604C);
        dVar.q(this.f50605D);
        dVar.q(this.f50606E);
        if (this.f50626Y > 0) {
            dVar.q(this.f50607F);
        }
    }

    public void l0(b bVar) {
        this.f50614M[0] = bVar;
    }

    public d m(d.b bVar) {
        switch (a.f50675a[bVar.ordinal()]) {
            case 1:
                return this.f50603B;
            case 2:
                return this.f50604C;
            case 3:
                return this.f50605D;
            case 4:
                return this.f50606E;
            case 5:
                return this.f50607F;
            case 6:
                return this.f50610I;
            case 7:
                return this.f50608G;
            case 8:
                return this.f50609H;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void m0(int i10, int i11, int i12, float f10) {
        this.f50650l = i10;
        this.f50656o = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f50658p = i12;
        this.f50660q = f10;
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f50650l = 2;
    }

    public int n() {
        return this.f50626Y;
    }

    public void n0(float f10) {
        this.f50661q0[0] = f10;
    }

    public float o(int i10) {
        if (i10 == 0) {
            return this.f50631b0;
        }
        if (i10 == 1) {
            return this.f50633c0;
        }
        return -1.0f;
    }

    protected void o0(int i10, boolean z9) {
        this.f50613L[i10] = z9;
    }

    public int p() {
        return R() + this.f50617P;
    }

    public void p0(boolean z9) {
        this.f50674z = z9;
    }

    public Object q() {
        return this.f50635d0;
    }

    public void q0(boolean z9) {
        this.f50602A = z9;
    }

    public String r() {
        return this.f50641g0;
    }

    public void r0(int i10) {
        this.f50671w[1] = i10;
    }

    public b s(int i10) {
        if (i10 == 0) {
            return y();
        }
        if (i10 == 1) {
            return M();
        }
        return null;
    }

    public void s0(int i10) {
        this.f50671w[0] = i10;
    }

    public float t() {
        return this.f50618Q;
    }

    public void t0(int i10) {
        if (i10 < 0) {
            this.f50629a0 = 0;
        } else {
            this.f50629a0 = i10;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f50643h0 != null) {
            str = "type: " + this.f50643h0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f50641g0 != null) {
            str2 = "id: " + this.f50641g0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f50620S);
        sb.append(", ");
        sb.append(this.f50621T);
        sb.append(") - (");
        sb.append(this.f50616O);
        sb.append(" x ");
        sb.append(this.f50617P);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.f50619R;
    }

    public void u0(int i10) {
        if (i10 < 0) {
            this.f50627Z = 0;
        } else {
            this.f50627Z = i10;
        }
    }

    public int v() {
        if (this.f50639f0 == 8) {
            return 0;
        }
        return this.f50617P;
    }

    public void v0(int i10, int i11) {
        this.f50620S = i10;
        this.f50621T = i11;
    }

    public float w() {
        return this.f50631b0;
    }

    public void w0(e eVar) {
        this.f50615N = eVar;
    }

    public int x() {
        return this.f50653m0;
    }

    public void x0(float f10) {
        this.f50633c0 = f10;
    }

    public b y() {
        return this.f50614M[0];
    }

    public void y0(int i10) {
        this.f50655n0 = i10;
    }

    public int z() {
        d dVar = this.f50603B;
        int i10 = dVar != null ? dVar.f50587e : 0;
        d dVar2 = this.f50605D;
        return dVar2 != null ? i10 + dVar2.f50587e : i10;
    }

    public void z0(int i10, int i11) {
        this.f50621T = i10;
        int i12 = i11 - i10;
        this.f50617P = i12;
        int i13 = this.f50629a0;
        if (i12 < i13) {
            this.f50617P = i13;
        }
    }
}
