package com.google.firebase.perf.config;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final R6.a f40373d = R6.a.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a f40374e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RemoteConfigManager f40375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private X6.f f40376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x f40377c;

    public a(RemoteConfigManager remoteConfigManager, X6.f fVar, x xVar) {
        this.f40375a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f40376b = fVar == null ? new X6.f() : fVar;
        this.f40377c = xVar == null ? x.f() : xVar;
    }

    private boolean H(long j10) {
        return j10 >= 0;
    }

    private boolean I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(O6.a.f4558b)) {
                return true;
            }
        }
        return false;
    }

    private boolean J(long j10) {
        return j10 >= 0;
    }

    private boolean L(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    private boolean M(long j10) {
        return j10 > 0;
    }

    private boolean N(long j10) {
        return j10 > 0;
    }

    private X6.g b(v vVar) {
        return this.f40377c.c(vVar.a());
    }

    private X6.g c(v vVar) {
        return this.f40377c.d(vVar.a());
    }

    private X6.g d(v vVar) {
        return this.f40377c.g(vVar.a());
    }

    private X6.g e(v vVar) {
        return this.f40377c.h(vVar.a());
    }

    public static synchronized a g() {
        try {
            if (f40374e == null) {
                f40374e = new a(null, null, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40374e;
    }

    private boolean k() {
        l lVarE = l.e();
        X6.g gVarB = b(lVarE);
        X6.g gVarU = u(lVarE);
        if (!gVarU.d()) {
            return gVarB.d() ? ((Boolean) gVarB.c()).booleanValue() : lVarE.d().booleanValue();
        }
        if (this.f40375a.isLastFetchFailed()) {
            return false;
        }
        Boolean bool = (Boolean) gVarU.c();
        if (gVarB == null || !gVarB.d() || gVarB.c() != bool) {
            this.f40377c.m(lVarE.a(), bool.booleanValue());
        }
        return bool.booleanValue();
    }

    private boolean l() {
        k kVarE = k.e();
        X6.g gVarE = e(kVarE);
        X6.g gVarX = x(kVarE);
        if (!gVarX.d()) {
            return gVarE.d() ? I((String) gVarE.c()) : I(kVarE.d());
        }
        String str = (String) gVarX.c();
        if (gVarE == null || !gVarE.d() || !((String) gVarE.c()).equals(str)) {
            this.f40377c.l(kVarE.a(), str);
        }
        return I(str);
    }

    private X6.g n(v vVar) {
        return this.f40376b.b(vVar.b());
    }

    private X6.g o(v vVar) {
        return this.f40376b.c(vVar.b());
    }

    private X6.g p(v vVar) {
        return this.f40376b.e(vVar.b());
    }

    private X6.g u(v vVar) {
        return this.f40375a.getBoolean(vVar.c());
    }

    private X6.g v(v vVar) {
        return this.f40375a.getDouble(vVar.c());
    }

    private X6.g w(v vVar) {
        return this.f40375a.getLong(vVar.c());
    }

    private X6.g x(v vVar) {
        return this.f40375a.getString(vVar.c());
    }

    public long A() {
        o oVarE = o.e();
        X6.g gVarP = p(oVarE);
        if (gVarP.d() && M(((Long) gVarP.c()).longValue())) {
            return ((Long) gVarP.c()).longValue();
        }
        X6.g gVarW = w(oVarE);
        if (gVarW.d() && M(((Long) gVarW.c()).longValue())) {
            this.f40377c.k(oVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        X6.g gVarD = d(oVarE);
        return (gVarD.d() && M(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : oVarE.d().longValue();
    }

    public long B() {
        p pVarE = p.e();
        X6.g gVarP = p(pVarE);
        if (gVarP.d() && J(((Long) gVarP.c()).longValue())) {
            return ((Long) gVarP.c()).longValue();
        }
        X6.g gVarW = w(pVarE);
        if (gVarW.d() && J(((Long) gVarW.c()).longValue())) {
            this.f40377c.k(pVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        X6.g gVarD = d(pVarE);
        return (gVarD.d() && J(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : pVarE.d().longValue();
    }

    public long C() {
        q qVarF = q.f();
        X6.g gVarP = p(qVarF);
        if (gVarP.d() && J(((Long) gVarP.c()).longValue())) {
            return ((Long) gVarP.c()).longValue();
        }
        X6.g gVarW = w(qVarF);
        if (gVarW.d() && J(((Long) gVarW.c()).longValue())) {
            this.f40377c.k(qVarF.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        X6.g gVarD = d(qVarF);
        if (gVarD.d() && J(((Long) gVarD.c()).longValue())) {
            return ((Long) gVarD.c()).longValue();
        }
        return this.f40375a.isLastFetchFailed() ? qVarF.e().longValue() : qVarF.d().longValue();
    }

    public double D() {
        r rVarF = r.f();
        X6.g gVarO = o(rVarF);
        if (gVarO.d()) {
            double dDoubleValue = ((Double) gVarO.c()).doubleValue() / 100.0d;
            if (L(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        X6.g gVarV = v(rVarF);
        if (gVarV.d() && L(((Double) gVarV.c()).doubleValue())) {
            this.f40377c.j(rVarF.a(), ((Double) gVarV.c()).doubleValue());
            return ((Double) gVarV.c()).doubleValue();
        }
        X6.g gVarC = c(rVarF);
        if (gVarC.d() && L(((Double) gVarC.c()).doubleValue())) {
            return ((Double) gVarC.c()).doubleValue();
        }
        return this.f40375a.isLastFetchFailed() ? rVarF.e().doubleValue() : rVarF.d().doubleValue();
    }

    public long E() {
        s sVarE = s.e();
        X6.g gVarW = w(sVarE);
        if (gVarW.d() && H(((Long) gVarW.c()).longValue())) {
            this.f40377c.k(sVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        X6.g gVarD = d(sVarE);
        return (gVarD.d() && H(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : sVarE.d().longValue();
    }

    public long F() {
        t tVarE = t.e();
        X6.g gVarW = w(tVarE);
        if (gVarW.d() && H(((Long) gVarW.c()).longValue())) {
            this.f40377c.k(tVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        X6.g gVarD = d(tVarE);
        return (gVarD.d() && H(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : tVarE.d().longValue();
    }

    public double G() {
        u uVarF = u.f();
        X6.g gVarV = v(uVarF);
        if (gVarV.d() && L(((Double) gVarV.c()).doubleValue())) {
            this.f40377c.j(uVarF.a(), ((Double) gVarV.c()).doubleValue());
            return ((Double) gVarV.c()).doubleValue();
        }
        X6.g gVarC = c(uVarF);
        if (gVarC.d() && L(((Double) gVarC.c()).doubleValue())) {
            return ((Double) gVarC.c()).doubleValue();
        }
        return this.f40375a.isLastFetchFailed() ? uVarF.e().doubleValue() : uVarF.d().doubleValue();
    }

    public boolean K() {
        Boolean boolJ = j();
        return (boolJ == null || boolJ.booleanValue()) && m();
    }

    public void O(Context context) {
        f40373d.i(X6.o.b(context));
        this.f40377c.i(context);
    }

    public void P(Boolean bool) {
        String strA;
        if (i().booleanValue() || (strA = c.d().a()) == null) {
            return;
        }
        if (bool != null) {
            this.f40377c.m(strA, Boolean.TRUE.equals(bool));
        } else {
            this.f40377c.b(strA);
        }
    }

    public void Q(X6.f fVar) {
        this.f40376b = fVar;
    }

    public String a() {
        String strF;
        f fVarE = f.e();
        if (O6.a.f4557a.booleanValue()) {
            return fVarE.d();
        }
        String strC = fVarE.c();
        long jLongValue = strC != null ? ((Long) this.f40375a.getRemoteConfigValueOrDefault(strC, -1L)).longValue() : -1L;
        String strA = fVarE.a();
        if (!f.g(jLongValue) || (strF = f.f(jLongValue)) == null) {
            X6.g gVarE = e(fVarE);
            return gVarE.d() ? (String) gVarE.c() : fVarE.d();
        }
        this.f40377c.l(strA, strF);
        return strF;
    }

    public double f() {
        e eVarE = e.e();
        X6.g gVarO = o(eVarE);
        if (gVarO.d()) {
            double dDoubleValue = ((Double) gVarO.c()).doubleValue() / 100.0d;
            if (L(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        X6.g gVarV = v(eVarE);
        if (gVarV.d() && L(((Double) gVarV.c()).doubleValue())) {
            this.f40377c.j(eVarE.a(), ((Double) gVarV.c()).doubleValue());
            return ((Double) gVarV.c()).doubleValue();
        }
        X6.g gVarC = c(eVarE);
        return (gVarC.d() && L(((Double) gVarC.c()).doubleValue())) ? ((Double) gVarC.c()).doubleValue() : eVarE.d().doubleValue();
    }

    public boolean h() {
        d dVarE = d.e();
        X6.g gVarN = n(dVarE);
        return gVarN.d() ? ((Boolean) gVarN.c()).booleanValue() : dVarE.d().booleanValue();
    }

    public Boolean i() {
        b bVarE = b.e();
        X6.g gVarN = n(bVarE);
        return gVarN.d() ? (Boolean) gVarN.c() : bVarE.d();
    }

    public Boolean j() {
        if (i().booleanValue()) {
            return Boolean.FALSE;
        }
        c cVarD = c.d();
        X6.g gVarB = b(cVarD);
        if (gVarB.d()) {
            return (Boolean) gVarB.c();
        }
        X6.g gVarN = n(cVarD);
        if (gVarN.d()) {
            return (Boolean) gVarN.c();
        }
        return null;
    }

    public boolean m() {
        return k() && !l();
    }

    public long q() {
        g gVarE = g.e();
        X6.g gVarW = w(gVarE);
        if (gVarW.d() && H(((Long) gVarW.c()).longValue())) {
            this.f40377c.k(gVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        X6.g gVarD = d(gVarE);
        return (gVarD.d() && H(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : gVarE.d().longValue();
    }

    public long r() {
        h hVarE = h.e();
        X6.g gVarW = w(hVarE);
        if (gVarW.d() && H(((Long) gVarW.c()).longValue())) {
            this.f40377c.k(hVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        X6.g gVarD = d(hVarE);
        return (gVarD.d() && H(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : hVarE.d().longValue();
    }

    public double s() {
        i iVarF = i.f();
        X6.g gVarV = v(iVarF);
        if (gVarV.d() && L(((Double) gVarV.c()).doubleValue())) {
            this.f40377c.j(iVarF.a(), ((Double) gVarV.c()).doubleValue());
            return ((Double) gVarV.c()).doubleValue();
        }
        X6.g gVarC = c(iVarF);
        if (gVarC.d() && L(((Double) gVarC.c()).doubleValue())) {
            return ((Double) gVarC.c()).doubleValue();
        }
        return this.f40375a.isLastFetchFailed() ? iVarF.e().doubleValue() : iVarF.d().doubleValue();
    }

    public long t() {
        j jVarE = j.e();
        X6.g gVarW = w(jVarE);
        if (gVarW.d() && N(((Long) gVarW.c()).longValue())) {
            this.f40377c.k(jVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        X6.g gVarD = d(jVarE);
        return (gVarD.d() && N(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : jVarE.d().longValue();
    }

    public long y() {
        m mVarE = m.e();
        X6.g gVarP = p(mVarE);
        if (gVarP.d() && J(((Long) gVarP.c()).longValue())) {
            return ((Long) gVarP.c()).longValue();
        }
        X6.g gVarW = w(mVarE);
        if (gVarW.d() && J(((Long) gVarW.c()).longValue())) {
            this.f40377c.k(mVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        X6.g gVarD = d(mVarE);
        return (gVarD.d() && J(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : mVarE.d().longValue();
    }

    public long z() {
        n nVarF = n.f();
        X6.g gVarP = p(nVarF);
        if (gVarP.d() && J(((Long) gVarP.c()).longValue())) {
            return ((Long) gVarP.c()).longValue();
        }
        X6.g gVarW = w(nVarF);
        if (gVarW.d() && J(((Long) gVarW.c()).longValue())) {
            this.f40377c.k(nVarF.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        X6.g gVarD = d(nVarF);
        if (gVarD.d() && J(((Long) gVarD.c()).longValue())) {
            return ((Long) gVarD.c()).longValue();
        }
        return this.f40375a.isLastFetchFailed() ? nVarF.e().longValue() : nVarF.d().longValue();
    }
}
