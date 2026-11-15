package O2;

import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public class j implements Closeable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static boolean f4473v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p023c2.a f4474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y1.n f4475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private D2.c f4476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f4482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private I2.b f4483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorSpace f4484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f4485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f4486m;

    public j(p023c2.a aVar) {
        this.f4476c = D2.c.f456d;
        this.f4477d = -1;
        this.f4478e = 0;
        this.f4479f = -1;
        this.f4480g = -1;
        this.f4481h = 1;
        this.f4482i = -1;
        Y1.k.b(Boolean.valueOf(p023c2.a.V(aVar)));
        this.f4474a = aVar.clone();
        this.f4475b = null;
    }

    private void R0() {
        if (this.f4479f < 0 || this.f4480g < 0) {
            I0();
        }
    }

    private void T() {
        D2.c cVarD = D2.e.d(J());
        this.f4476c = cVarD;
        Pair pairG1 = D2.b.b(cVarD) ? g1() : V0().b();
        if (cVarD == D2.b.f440b && this.f4477d == -1) {
            if (pairG1 != null) {
                int iB = Z2.g.b(J());
                this.f4478e = iB;
                this.f4477d = Z2.g.a(iB);
                return;
            }
            return;
        }
        if (cVarD == D2.b.f450l && this.f4477d == -1) {
            int iA = Z2.e.a(J());
            this.f4478e = iA;
            this.f4477d = Z2.g.a(iA);
        } else if (this.f4477d == -1) {
            this.f4477d = 0;
        }
    }

    private Z2.f V0() throws Throwable {
        InputStream inputStreamJ;
        try {
            inputStreamJ = J();
            try {
                Z2.f fVarE = Z2.d.e(inputStreamJ);
                this.f4484k = fVarE.a();
                Pair pairB = fVarE.b();
                if (pairB != null) {
                    this.f4479f = ((Integer) pairB.a()).intValue();
                    this.f4480g = ((Integer) pairB.b()).intValue();
                }
                if (inputStreamJ != null) {
                    try {
                        inputStreamJ.close();
                    } catch (IOException unused) {
                    }
                }
                return fVarE;
            } catch (Throwable th) {
                th = th;
                if (inputStreamJ != null) {
                    try {
                        inputStreamJ.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamJ = null;
        }
    }

    public static boolean W(j jVar) {
        return jVar.f4477d >= 0 && jVar.f4479f >= 0 && jVar.f4480g >= 0;
    }

    public static boolean a0(j jVar) {
        return jVar != null && jVar.X();
    }

    public static j c(j jVar) {
        if (jVar != null) {
            return jVar.a();
        }
        return null;
    }

    private Pair g1() {
        InputStream inputStreamJ = J();
        if (inputStreamJ == null) {
            return null;
        }
        Pair pairF = Z2.j.f(inputStreamJ);
        if (pairF != null) {
            this.f4479f = ((Integer) pairF.a()).intValue();
            this.f4480g = ((Integer) pairF.b()).intValue();
        }
        return pairF;
    }

    public static void h(j jVar) {
        if (jVar != null) {
            jVar.close();
        }
    }

    public D2.c G() {
        R0();
        return this.f4476c;
    }

    public void I0() {
        if (!f4473v) {
            T();
        } else {
            if (this.f4486m) {
                return;
            }
            T();
            this.f4486m = true;
        }
    }

    public InputStream J() {
        Y1.n nVar = this.f4475b;
        if (nVar != null) {
            return (InputStream) nVar.get();
        }
        p023c2.a aVarW = p023c2.a.w(this.f4474a);
        if (aVarW == null) {
            return null;
        }
        try {
            return new p013b2.j((p013b2.h) aVarW.G());
        } finally {
            p023c2.a.x(aVarW);
        }
    }

    public InputStream M() {
        return (InputStream) Y1.k.g(J());
    }

    public int N() {
        return this.f4481h;
    }

    public int Q() {
        p023c2.a aVar = this.f4474a;
        return (aVar == null || aVar.G() == null) ? this.f4482i : ((p013b2.h) this.f4474a.G()).size();
    }

    public String R() {
        return this.f4485l;
    }

    protected boolean S() {
        return this.f4486m;
    }

    public boolean V(int i10) {
        D2.c cVar = this.f4476c;
        if ((cVar != D2.b.f440b && cVar != D2.b.f451m) || this.f4475b != null) {
            return true;
        }
        Y1.k.g(this.f4474a);
        p013b2.h hVar = (p013b2.h) this.f4474a.G();
        return i10 >= 2 && hVar.k(i10 + (-2)) == -1 && hVar.k(i10 - 1) == -39;
    }

    public synchronized boolean X() {
        return p023c2.a.V(this.f4474a) || this.f4475b != null;
    }

    public j a() {
        j jVar;
        Y1.n nVar = this.f4475b;
        if (nVar != null) {
            jVar = new j(nVar, this.f4482i);
        } else {
            p023c2.a aVarW = p023c2.a.w(this.f4474a);
            if (aVarW == null) {
                jVar = null;
            } else {
                try {
                    jVar = new j(aVarW);
                } catch (Throwable th) {
                    p023c2.a.x(aVarW);
                    throw th;
                }
            }
            p023c2.a.x(aVarW);
        }
        if (jVar != null) {
            jVar.j(this);
        }
        return jVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p023c2.a.x(this.f4474a);
    }

    public int getHeight() {
        R0();
        return this.f4480g;
    }

    public int getWidth() {
        R0();
        return this.f4479f;
    }

    public void j(j jVar) {
        this.f4476c = jVar.G();
        this.f4479f = jVar.getWidth();
        this.f4480g = jVar.getHeight();
        this.f4477d = jVar.y0();
        this.f4478e = jVar.n0();
        this.f4481h = jVar.N();
        this.f4482i = jVar.Q();
        this.f4483j = jVar.v();
        this.f4484k = jVar.w();
        this.f4486m = jVar.S();
    }

    public void l1(I2.b bVar) {
        this.f4483j = bVar;
    }

    public void m1(int i10) {
        this.f4478e = i10;
    }

    public p023c2.a n() {
        return p023c2.a.w(this.f4474a);
    }

    public int n0() {
        R0();
        return this.f4478e;
    }

    public void n1(int i10) {
        this.f4480g = i10;
    }

    public void o1(D2.c cVar) {
        this.f4476c = cVar;
    }

    public void p1(int i10) {
        this.f4477d = i10;
    }

    public void q1(int i10) {
        this.f4481h = i10;
    }

    public void r1(String str) {
        this.f4485l = str;
    }

    public void s1(int i10) {
        this.f4479f = i10;
    }

    public I2.b v() {
        return this.f4483j;
    }

    public ColorSpace w() {
        R0();
        return this.f4484k;
    }

    public String x(int i10) {
        p023c2.a aVarN = n();
        if (aVarN == null) {
            return "";
        }
        int iMin = Math.min(Q(), i10);
        byte[] bArr = new byte[iMin];
        try {
            p013b2.h hVar = (p013b2.h) aVarN.G();
            if (hVar == null) {
                aVarN.close();
                return "";
            }
            hVar.b(0, bArr, 0, iMin);
            aVarN.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i11 = 0; i11 < iMin; i11++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i11])));
            }
            return sb.toString();
        } catch (Throwable th) {
            aVarN.close();
            throw th;
        }
    }

    public int y0() {
        R0();
        return this.f4477d;
    }

    public j(Y1.n nVar) {
        this.f4476c = D2.c.f456d;
        this.f4477d = -1;
        this.f4478e = 0;
        this.f4479f = -1;
        this.f4480g = -1;
        this.f4481h = 1;
        this.f4482i = -1;
        Y1.k.g(nVar);
        this.f4474a = null;
        this.f4475b = nVar;
    }

    public j(Y1.n nVar, int i10) {
        this(nVar);
        this.f4482i = i10;
    }
}
