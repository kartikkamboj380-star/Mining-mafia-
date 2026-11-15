package com.facebook.react;

import android.app.Application;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f14375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H f14376b;

    class a implements p044e3.i {
        a() {
        }

        @Override // p044e3.i
        public p044e3.h c(String str) {
            return null;
        }
    }

    static {
        p064g3.b.a("ReactNativeHost", p064g3.a.ERROR);
    }

    protected M(Application application) {
        this.f14375a = application;
    }

    protected H a() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        K kB = b();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return kB.b();
    }

    protected K b() {
        K kO = H.v().d(this.f14375a).m(i()).v(t()).h(f()).g(e()).s(q()).t(r()).l(h()).o(k());
        p();
        K kP = kO.r(null).n(j()).u(s()).i(LifecycleState.BEFORE_CREATE).q(o()).f(d()).p(m());
        Iterator it = l().iterator();
        while (it.hasNext()) {
            kP.a((N) it.next());
        }
        String strG = g();
        if (strG != null) {
            kP.j(strG);
            return kP;
        }
        kP.e((String) p004a3.a.c(c()));
        return kP;
    }

    protected String c() {
        return "index.android.bundle";
    }

    protected p194t3.b d() {
        return null;
    }

    protected p124m3.c e() {
        return null;
    }

    protected com.facebook.react.devsupport.S f() {
        return null;
    }

    protected String g() {
        return null;
    }

    protected JSExceptionHandler h() {
        return null;
    }

    protected abstract String i();

    protected JavaScriptExecutorFactory j() {
        return null;
    }

    public boolean k() {
        return false;
    }

    protected abstract List l();

    protected p124m3.h m() {
        return null;
    }

    public synchronized H n() {
        try {
            if (this.f14376b == null) {
                ReactMarker.logMarker(ReactMarkerConstants.INIT_REACT_RUNTIME_START);
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
                this.f14376b = a();
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f14376b;
    }

    protected abstract T.a o();

    protected p124m3.i p() {
        return null;
    }

    public boolean q() {
        return true;
    }

    public p044e3.i r() {
        return new a();
    }

    protected abstract UIManagerProvider s();

    public abstract boolean t();

    public synchronized boolean u() {
        return this.f14376b != null;
    }
}
