package p192t1;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p012b1.v;
import p082i1.d;

/* JADX INFO: renamed from: t1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C7123a implements A, ComponentCallbacks2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C0536a f49488d = new C0536a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f49489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f49490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49491c;

    /* JADX INFO: renamed from: t1.a$a, reason: collision with other inner class name */
    private static final class C0536a {
        public /* synthetic */ C0536a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0536a() {
        }
    }

    public ComponentCallbacks2C7123a(v vVar) {
        this.f49489a = new WeakReference(vVar);
    }

    @Override // p192t1.A
    public synchronized void a() {
        try {
            v vVar = (v) this.f49489a.get();
            if (vVar == null) {
                b();
            } else if (this.f49490b == null) {
                Context contextA = vVar.g().a();
                this.f49490b = contextA;
                contextA.registerComponentCallbacks(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            if (this.f49491c) {
                return;
            }
            this.f49491c = true;
            Context context = this.f49490b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            this.f49489a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onConfigurationChanged(Configuration configuration) {
        if (((v) this.f49489a.get()) == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public synchronized void onTrimMemory(int i10) {
        d dVarD;
        try {
            v vVar = (v) this.f49489a.get();
            if (vVar != null) {
                vVar.g().f();
                if (i10 >= 40) {
                    d dVarD2 = vVar.d();
                    if (dVarD2 != null) {
                        dVarD2.clear();
                    }
                } else if (i10 >= 10 && (dVarD = vVar.d()) != null) {
                    dVarD.d(dVarD.a() / ((long) 2));
                }
            } else {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
