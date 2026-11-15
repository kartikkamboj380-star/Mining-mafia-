package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.facebook.react.bridge.Callback;
import com.facebook.react.common.LifecycleState;
import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.react.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1396v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f15864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private D3.g f15866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Callback f15867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C1410x f15868e;

    /* JADX INFO: renamed from: com.facebook.react.v$a */
    class a extends C1410x {
        a(Activity activity, M m10, String str, Bundle bundle, boolean z9) {
            super(activity, m10, str, bundle, z9);
        }

        @Override // com.facebook.react.C1410x
        protected X a() {
            X xD = AbstractC1396v.this.d();
            return xD == null ? super.a() : xD;
        }
    }

    public AbstractC1396v(ReactActivity reactActivity, String str) {
        this.f15864a = reactActivity;
        this.f15865b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        Window window;
        String strG = g();
        Bundle bundleC = c();
        Activity activity = this.f15864a;
        if (activity != null && (window = activity.getWindow()) != null) {
            if (com.facebook.react.views.view.q.d()) {
                com.facebook.react.views.view.q.c(window);
            }
            if (Build.VERSION.SDK_INT >= 26 && l()) {
                window.setColorMode(1);
            }
        }
        if (p204u3.i.a()) {
            this.f15868e = new C1410x(h(), i(), strG, bundleC);
        } else {
            this.f15868e = new a(h(), j(), strG, bundleC, k());
        }
        if (strG != null) {
            o(strG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(int i10, String[] strArr, int[] iArr, Object[] objArr) {
        D3.g gVar = this.f15866c;
        if (gVar == null || !gVar.onRequestPermissionsResult(i10, strArr, iArr)) {
            return;
        }
        this.f15866c = null;
    }

    public void A() {
        C1410x c1410x = this.f15868e;
        Objects.requireNonNull(c1410x);
        c1410x.k();
        Callback callback = this.f15867d;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.f15867d = null;
        }
    }

    public void B() {
        C1410x c1410x = this.f15868e;
        Objects.requireNonNull(c1410x);
        c1410x.o();
    }

    public void C(boolean z9) {
        C1410x c1410x = this.f15868e;
        Objects.requireNonNull(c1410x);
        c1410x.p(z9);
    }

    public void D(String[] strArr, int i10, D3.g gVar) {
        this.f15866c = gVar;
        h().requestPermissions(strArr, i10);
    }

    protected Bundle c() {
        return f();
    }

    protected X d() {
        return null;
    }

    protected Context e() {
        return (Context) p004a3.a.c(this.f15864a);
    }

    protected Bundle f() {
        return null;
    }

    public String g() {
        return this.f15865b;
    }

    protected Activity h() {
        return (Activity) e();
    }

    public ReactHost i() {
        return ((ReactApplication) h().getApplication()).getReactHost();
    }

    protected M j() {
        return ((ReactApplication) h().getApplication()).getReactNativeHost();
    }

    protected abstract boolean k();

    protected boolean l() {
        return false;
    }

    protected void o(String str) {
        C1410x c1410x = this.f15868e;
        Objects.requireNonNull(c1410x);
        Objects.requireNonNull(str);
        c1410x.e(str);
        h().setContentView(this.f15868e.d());
    }

    public void p(int i10, int i11, Intent intent) {
        C1410x c1410x = this.f15868e;
        Objects.requireNonNull(c1410x);
        c1410x.f(i10, i11, intent, true);
    }

    public boolean q() {
        C1410x c1410x = this.f15868e;
        Objects.requireNonNull(c1410x);
        return c1410x.g();
    }

    public void r(Configuration configuration) {
        C1410x c1410x = this.f15868e;
        Objects.requireNonNull(c1410x);
        c1410x.h(configuration);
    }

    public void s(Bundle bundle) {
        p065g4.a.o(0L, "ReactActivityDelegate.onCreate::init", new Runnable() { // from class: com.facebook.react.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f15304a.m();
            }
        });
    }

    public void t() {
        C1410x c1410x = this.f15868e;
        Objects.requireNonNull(c1410x);
        c1410x.i();
    }

    public boolean u(int i10, KeyEvent keyEvent) {
        C1410x c1410x = this.f15868e;
        Objects.requireNonNull(c1410x);
        return c1410x.l(i10, keyEvent);
    }

    public boolean v(int i10, KeyEvent keyEvent) {
        C1410x c1410x = this.f15868e;
        Objects.requireNonNull(c1410x);
        return c1410x.m(i10);
    }

    public boolean w(int i10, KeyEvent keyEvent) {
        C1410x c1410x = this.f15868e;
        Objects.requireNonNull(c1410x);
        return c1410x.q(i10, keyEvent);
    }

    public boolean x(Intent intent) {
        C1410x c1410x = this.f15868e;
        Objects.requireNonNull(c1410x);
        Objects.requireNonNull(intent);
        return c1410x.n(intent);
    }

    public void y() {
        C1410x c1410x = this.f15868e;
        Objects.requireNonNull(c1410x);
        c1410x.j();
    }

    public void z(final int i10, final String[] strArr, final int[] iArr) {
        LifecycleState lifecycleStateG;
        Callback callback = new Callback() { // from class: com.facebook.react.u
            @Override // com.facebook.react.bridge.Callback
            public final void invoke(Object[] objArr) {
                this.f15305a.n(i10, strArr, iArr, objArr);
            }
        };
        if (k()) {
            ReactHost reactHostI = i();
            lifecycleStateG = reactHostI != null ? reactHostI.getLifecycleState() : LifecycleState.BEFORE_CREATE;
        } else {
            M mJ = j();
            lifecycleStateG = !mJ.u() ? LifecycleState.BEFORE_CREATE : mJ.n().G();
        }
        if (lifecycleStateG == LifecycleState.RESUMED) {
            callback.invoke(new Object[0]);
        } else {
            this.f15867d = callback;
        }
    }
}
