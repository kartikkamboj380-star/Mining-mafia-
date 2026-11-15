package com.facebook.react;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class ReactActivity extends p070h.b implements D3.a, D3.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f14384j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.activity.v f14386i = new a(true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC1396v f14385h = W();

    class a extends androidx.activity.v {
        a(boolean z9) {
            super(z9);
        }

        @Override // androidx.activity.v
        public void d() {
            j(false);
            ReactActivity.this.onBackPressed();
            j(true);
        }
    }

    protected ReactActivity() {
    }

    protected abstract AbstractC1396v W();

    @Override // D3.a
    public void a() {
        this.f14386i.j(false);
        super.onBackPressed();
    }

    @Override // D3.f
    public void e(String[] strArr, int i10, D3.g gVar) {
        this.f14385h.D(strArr, i10, gVar);
    }

    @Override // androidx.fragment.app.AbstractActivityC1148t, androidx.activity.j, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f14385h.p(i10, i11, intent);
    }

    @Override // androidx.activity.j, android.app.Activity
    public void onBackPressed() {
        if (this.f14385h.q()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // p070h.b, androidx.activity.j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f14385h.r(configuration);
    }

    @Override // androidx.fragment.app.AbstractActivityC1148t, androidx.activity.j, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14385h.s(bundle);
        if (W3.a.a(this)) {
            getOnBackPressedDispatcher().i(this, this.f14386i);
        }
    }

    @Override // p070h.b, androidx.fragment.app.AbstractActivityC1148t, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f14385h.t();
    }

    @Override // p070h.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.f14385h.u(i10, keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        return this.f14385h.v(i10, keyEvent) || super.onKeyLongPress(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return this.f14385h.w(i10, keyEvent) || super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.activity.j, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.f14385h.x(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1148t, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f14385h.y();
    }

    @Override // androidx.fragment.app.AbstractActivityC1148t, androidx.activity.j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        this.f14385h.z(i10, strArr, iArr);
    }

    @Override // androidx.fragment.app.AbstractActivityC1148t, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f14385h.A();
    }

    @Override // androidx.activity.j, android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.f14385h.B();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        this.f14385h.C(z9);
    }
}
