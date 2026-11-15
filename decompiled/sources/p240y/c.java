package p240y;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f50561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f50562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f50563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f50564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e f50565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f50566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected e f50567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList f50568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f50569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f50570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f50571k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f50572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f50573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f50574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f50575o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f50576p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f50577q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f50578r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f50579s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f50580t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f50581u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f50582v;

    public c(e eVar, int i10, boolean z9) {
        this.f50561a = eVar;
        this.f50576p = i10;
        this.f50577q = z9;
    }

    private void b() {
        int i10 = this.f50576p * 2;
        e eVar = this.f50561a;
        this.f50575o = true;
        e eVar2 = eVar;
        boolean z9 = false;
        while (!z9) {
            this.f50569i++;
            e[] eVarArr = eVar.f50665s0;
            int i11 = this.f50576p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f50663r0[i11] = null;
            if (eVar.O() != 8) {
                this.f50572l++;
                e.b bVarS = eVar.s(this.f50576p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar) {
                    this.f50573m += eVar.A(this.f50576p);
                }
                int iC = this.f50573m + eVar.f50611J[i10].c();
                this.f50573m = iC;
                int i12 = i10 + 1;
                this.f50573m = iC + eVar.f50611J[i12].c();
                int iC2 = this.f50574n + eVar.f50611J[i10].c();
                this.f50574n = iC2;
                this.f50574n = iC2 + eVar.f50611J[i12].c();
                if (this.f50562b == null) {
                    this.f50562b = eVar;
                }
                this.f50564d = eVar;
                e.b[] bVarArr = eVar.f50614M;
                int i13 = this.f50576p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f50654n[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f50570j++;
                        float f10 = eVar.f50661q0[i13];
                        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            this.f50571k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                this.f50578r = true;
                            } else {
                                this.f50579s = true;
                            }
                            if (this.f50568h == null) {
                                this.f50568h = new ArrayList();
                            }
                            this.f50568h.add(eVar);
                        }
                        if (this.f50566f == null) {
                            this.f50566f = eVar;
                        }
                        e eVar4 = this.f50567g;
                        if (eVar4 != null) {
                            eVar4.f50663r0[this.f50576p] = eVar;
                        }
                        this.f50567g = eVar;
                    }
                    if (this.f50576p == 0) {
                        if (eVar.f50650l != 0 || eVar.f50656o != 0 || eVar.f50658p != 0) {
                            this.f50575o = false;
                        }
                    } else if (eVar.f50652m != 0 || eVar.f50662r != 0 || eVar.f50664s != 0) {
                        this.f50575o = false;
                    }
                    if (eVar.f50618Q != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.f50575o = false;
                        this.f50581u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f50665s0[this.f50576p] = eVar;
            }
            d dVar = eVar.f50611J[i10 + 1].f50586d;
            if (dVar != null) {
                e eVar5 = dVar.f50584b;
                d dVar2 = eVar5.f50611J[i10].f50586d;
                if (dVar2 != null && dVar2.f50584b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z9 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f50562b;
        if (eVar6 != null) {
            this.f50573m -= eVar6.f50611J[i10].c();
        }
        e eVar7 = this.f50564d;
        if (eVar7 != null) {
            this.f50573m -= eVar7.f50611J[i10 + 1].c();
        }
        this.f50563c = eVar;
        if (this.f50576p == 0 && this.f50577q) {
            this.f50565e = eVar;
        } else {
            this.f50565e = this.f50561a;
        }
        this.f50580t = this.f50579s && this.f50578r;
    }

    private static boolean c(e eVar, int i10) {
        if (eVar.O() == 8 || eVar.f50614M[i10] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = eVar.f50654n[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f50582v) {
            b();
        }
        this.f50582v = true;
    }
}
