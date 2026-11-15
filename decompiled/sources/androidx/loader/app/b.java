package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.r;
import androidx.lifecycle.z;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p190t.l;

/* JADX INFO: loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f10268c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f10269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f10270b;

    public static class a extends z implements o0.c.b {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f10271l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Bundle f10272m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final p141o0.c f10273n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private r f10274o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private C0163b f10275p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private p141o0.c f10276q;

        a(int i10, Bundle bundle, p141o0.c cVar, p141o0.c cVar2) {
            this.f10271l = i10;
            this.f10272m = bundle;
            this.f10273n = cVar;
            this.f10276q = cVar2;
            cVar.t(i10, this);
        }

        @Override // o0.c.b
        public void a(p141o0.c cVar, Object obj) {
            if (b.f10268c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(obj);
                return;
            }
            if (b.f10268c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(obj);
        }

        @Override // androidx.lifecycle.AbstractC1177x
        protected void j() {
            if (b.f10268c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f10273n.w();
        }

        @Override // androidx.lifecycle.AbstractC1177x
        protected void k() {
            if (b.f10268c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f10273n.x();
        }

        @Override // androidx.lifecycle.AbstractC1177x
        public void m(A a10) {
            super.m(a10);
            this.f10274o = null;
            this.f10275p = null;
        }

        @Override // androidx.lifecycle.z, androidx.lifecycle.AbstractC1177x
        public void n(Object obj) {
            super.n(obj);
            p141o0.c cVar = this.f10276q;
            if (cVar != null) {
                cVar.u();
                this.f10276q = null;
            }
        }

        p141o0.c o(boolean z9) {
            if (b.f10268c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f10273n.b();
            this.f10273n.a();
            C0163b c0163b = this.f10275p;
            if (c0163b != null) {
                m(c0163b);
                if (z9) {
                    c0163b.d();
                }
            }
            this.f10273n.z(this);
            if ((c0163b == null || c0163b.c()) && !z9) {
                return this.f10273n;
            }
            this.f10273n.u();
            return this.f10276q;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f10271l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f10272m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f10273n);
            this.f10273n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f10275p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f10275p);
                this.f10275p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        p141o0.c q() {
            return this.f10273n;
        }

        void r() {
            r rVar = this.f10274o;
            C0163b c0163b = this.f10275p;
            if (rVar == null || c0163b == null) {
                return;
            }
            super.m(c0163b);
            h(rVar, c0163b);
        }

        p141o0.c s(r rVar, androidx.loader.app.a.InterfaceC0162a interfaceC0162a) {
            C0163b c0163b = new C0163b(this.f10273n, interfaceC0162a);
            h(rVar, c0163b);
            A a10 = this.f10275p;
            if (a10 != null) {
                m(a10);
            }
            this.f10274o = rVar;
            this.f10275p = c0163b;
            return this.f10273n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f10271l);
            sb.append(" : ");
            Class<?> cls = this.f10273n.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0163b implements A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p141o0.c f10277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.loader.app.a.InterfaceC0162a f10278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f10279c = false;

        C0163b(p141o0.c cVar, androidx.loader.app.a.InterfaceC0162a interfaceC0162a) {
            this.f10277a = cVar;
            this.f10278b = interfaceC0162a;
        }

        @Override // androidx.lifecycle.A
        public void a(Object obj) {
            if (b.f10268c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f10277a + ": " + this.f10277a.d(obj));
            }
            this.f10279c = true;
            this.f10278b.c(this.f10277a, obj);
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f10279c);
        }

        boolean c() {
            return this.f10279c;
        }

        void d() {
            if (this.f10279c) {
                if (b.f10268c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f10277a);
                }
                this.f10278b.b(this.f10277a);
            }
        }

        public String toString() {
            return this.f10278b.toString();
        }
    }

    static class c extends T {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final U.c f10280d = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l f10281b = new l();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f10282c = false;

        static class a implements U.c {
            a() {
            }

            @Override // androidx.lifecycle.U.c
            public T c(Class cls) {
                return new c();
            }
        }

        c() {
        }

        static c g(V v10) {
            return (c) new U(v10, f10280d).b(c.class);
        }

        @Override // androidx.lifecycle.T
        protected void d() {
            super.d();
            int iL = this.f10281b.l();
            for (int i10 = 0; i10 < iL; i10++) {
                ((a) this.f10281b.m(i10)).o(true);
            }
            this.f10281b.c();
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f10281b.l() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f10281b.l(); i10++) {
                    a aVar = (a) this.f10281b.m(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f10281b.i(i10));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void f() {
            this.f10282c = false;
        }

        a h(int i10) {
            return (a) this.f10281b.f(i10);
        }

        boolean i() {
            return this.f10282c;
        }

        void j() {
            int iL = this.f10281b.l();
            for (int i10 = 0; i10 < iL; i10++) {
                ((a) this.f10281b.m(i10)).r();
            }
        }

        void k(int i10, a aVar) {
            this.f10281b.k(i10, aVar);
        }

        void l() {
            this.f10282c = true;
        }
    }

    b(r rVar, V v10) {
        this.f10269a = rVar;
        this.f10270b = c.g(v10);
    }

    private p141o0.c e(int i10, Bundle bundle, androidx.loader.app.a.InterfaceC0162a interfaceC0162a, p141o0.c cVar) {
        try {
            this.f10270b.l();
            p141o0.c cVarA = interfaceC0162a.a(i10, bundle);
            if (cVarA == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (cVarA.getClass().isMemberClass() && !Modifier.isStatic(cVarA.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + cVarA);
            }
            a aVar = new a(i10, bundle, cVarA, cVar);
            if (f10268c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f10270b.k(i10, aVar);
            this.f10270b.f();
            return aVar.s(this.f10269a, interfaceC0162a);
        } catch (Throwable th) {
            this.f10270b.f();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f10270b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public p141o0.c c(int i10, Bundle bundle, androidx.loader.app.a.InterfaceC0162a interfaceC0162a) {
        if (this.f10270b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVarH = this.f10270b.h(i10);
        if (f10268c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarH == null) {
            return e(i10, bundle, interfaceC0162a, null);
        }
        if (f10268c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarH);
        }
        return aVarH.s(this.f10269a, interfaceC0162a);
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f10270b.j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.f10269a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
