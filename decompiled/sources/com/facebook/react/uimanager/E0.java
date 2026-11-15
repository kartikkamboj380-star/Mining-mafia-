package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class E0 extends ReactContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f15324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(ReactApplicationContext reactApplicationContext, Context base, String str, int i10) {
        super(base);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        Intrinsics.checkNotNullParameter(base, "base");
        this.f15324a = reactApplicationContext;
        this.f15325b = str;
        this.f15326c = i10;
        initializeFromOther(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void addLifecycleEventListener(LifecycleEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f15324a.addLifecycleEventListener(listener);
    }

    public final ReactApplicationContext b() {
        return this.f15324a;
    }

    public final int c() {
        return this.f15326c;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
        this.f15324a.destroy();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        return this.f15324a.getCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Activity getCurrentActivity() {
        return this.f15324a.getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public UIManager getFabricUIManager() {
        return this.f15324a.getFabricUIManager();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CallInvokerHolder getJSCallInvokerHolder() {
        return this.f15324a.getJSCallInvokerHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptModule getJSModule(Class jsInterface) {
        Intrinsics.checkNotNullParameter(jsInterface, "jsInterface");
        JavaScriptModule jSModule = this.f15324a.getJSModule(jsInterface);
        Intrinsics.checkNotNullExpressionValue(jSModule, "getJSModule(...)");
        return jSModule;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.f15324a.getJavaScriptContextHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(Class nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        return this.f15324a.getNativeModule(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection getNativeModules() {
        return this.f15324a.getNativeModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public String getSourceURL() {
        return this.f15324a.getSourceURL();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception exc) {
        this.f15324a.handleException(exc);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveCatalystInstance() {
        return this.f15324a.hasActiveCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        return this.f15324a.hasActiveCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCatalystInstance() {
        return this.f15324a.hasCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCurrentActivity() {
        return this.f15324a.hasCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasNativeModule(Class nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        return this.f15324a.hasNativeModule(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.f15324a.hasReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean isBridgeless() {
        return this.f15324a.isBridgeless();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int i10, String str, Callback callback) {
        this.f15324a.registerSegment(i10, str, callback);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void removeLifecycleEventListener(LifecycleEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f15324a.removeLifecycleEventListener(listener);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return this.f15324a.getNativeModule(moduleName);
    }
}
