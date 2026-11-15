package com.facebook.react.devsupport;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class t0 implements p124m3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSExceptionHandler f14790a = new DefaultJSExceptionHandler();

    @Override // p124m3.e
    public boolean A() {
        return false;
    }

    @Override // p124m3.e
    public void B() {
    }

    @Override // p124m3.e
    public void C(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // p124m3.e
    public void D() {
    }

    @Override // p124m3.e
    public View a(String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        return null;
    }

    @Override // p124m3.e
    public void b(boolean z9) {
    }

    @Override // p124m3.e
    public p044e3.h c(String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return null;
    }

    @Override // p124m3.e
    public void d(View view) {
    }

    @Override // p124m3.e
    public void e() {
    }

    @Override // p124m3.e
    public void f() {
    }

    @Override // p124m3.e
    public void g(String message, m3.e.a listener) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // p124m3.e
    public ReactContext getCurrentReactContext() {
        return null;
    }

    @Override // p124m3.e
    public Activity h() {
        return null;
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f14790a.handleException(e10);
    }

    @Override // p124m3.e
    public void i(boolean z9) {
    }

    @Override // p124m3.e
    public String j() {
        return null;
    }

    @Override // p124m3.e
    public String k() {
        return null;
    }

    @Override // p124m3.e
    public void l() {
    }

    @Override // p124m3.e
    public boolean m() {
        return false;
    }

    @Override // p124m3.e
    public void n() {
    }

    @Override // p124m3.e
    public Pair o(Pair errorInfo) {
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        return errorInfo;
    }

    @Override // p124m3.e
    public void p(boolean z9) {
    }

    @Override // p124m3.e
    public p124m3.f q() {
        return null;
    }

    @Override // p124m3.e
    public String r() {
        return null;
    }

    @Override // p124m3.e
    public p124m3.i s() {
        return null;
    }

    @Override // p124m3.e
    public void t() {
    }

    @Override // p124m3.e
    public p124m3.j[] u() {
        return null;
    }

    @Override // p124m3.e
    public void v(p124m3.g callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.a(false);
    }

    @Override // p124m3.e
    public void w(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // p124m3.e
    public void x() {
    }

    @Override // p124m3.e
    public void y(String optionName, p124m3.d optionHandler) {
        Intrinsics.checkNotNullParameter(optionName, "optionName");
        Intrinsics.checkNotNullParameter(optionHandler, "optionHandler");
    }

    @Override // p124m3.e
    public E3.a z() {
        return null;
    }
}
