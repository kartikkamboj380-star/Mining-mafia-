package H2;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class p implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p f1174a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f1175b = false;

    protected p() {
    }

    public static synchronized p f() {
        try {
            if (f1174a == null) {
                f1174a = new p();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1174a;
    }

    @Override // H2.k
    public S1.d a(U2.b bVar, Object obj) {
        S1.d dVar;
        String name;
        U2.d dVarL = bVar.l();
        if (dVarL != null) {
            S1.d dVarA = dVarL.a();
            name = dVarL.getClass().getName();
            dVar = dVarA;
        } else {
            dVar = null;
            name = null;
        }
        C0577b c0577b = new C0577b(e(bVar.v()).toString(), bVar.r(), bVar.t(), bVar.h(), dVar, name);
        if (f1175b) {
            c0577b.d(null);
            return c0577b;
        }
        c0577b.d(obj);
        return c0577b;
    }

    @Override // H2.k
    public S1.d b(U2.b bVar, Uri uri, Object obj) {
        return new S1.i(e(uri).toString());
    }

    @Override // H2.k
    public S1.d c(U2.b bVar, Object obj) {
        return b(bVar, bVar.v(), obj);
    }

    @Override // H2.k
    public S1.d d(U2.b bVar, Object obj) {
        C0577b c0577b = new C0577b(e(bVar.v()).toString(), bVar.r(), bVar.t(), bVar.h(), null, null);
        if (f1175b) {
            c0577b.d(null);
            return c0577b;
        }
        c0577b.d(obj);
        return c0577b;
    }

    protected Uri e(Uri uri) {
        return uri;
    }
}
