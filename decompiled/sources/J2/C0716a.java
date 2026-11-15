package J2;

import android.util.Log;
import java.io.Closeable;

/* JADX INFO: renamed from: J2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0716a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2.a.c f2017a;

    /* JADX INFO: renamed from: J2.a$a, reason: collision with other inner class name */
    class C0032a implements c2.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ L2.a f2018a;

        C0032a(L2.a aVar) {
            this.f2018a = aVar;
        }

        @Override // c2.a.c
        public void a(p023c2.h hVar, Throwable th) {
            this.f2018a.a(hVar, th);
            Object objF = hVar.f();
            Z1.a.K("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(hVar)), objF != null ? objF.getClass().getName() : "<value is null>", C0716a.d(th));
        }

        @Override // c2.a.c
        public boolean b() {
            return this.f2018a.b();
        }
    }

    public C0716a(L2.a aVar) {
        this.f2017a = new C0032a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Throwable th) {
        return th == null ? "" : Log.getStackTraceString(th);
    }

    public p023c2.a b(Closeable closeable) {
        return p023c2.a.X(closeable, this.f2017a);
    }

    public p023c2.a c(Object obj, p023c2.g gVar) {
        return p023c2.a.I0(obj, gVar, this.f2017a);
    }
}
