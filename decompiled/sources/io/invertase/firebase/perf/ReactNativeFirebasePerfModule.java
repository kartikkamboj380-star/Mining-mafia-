package io.invertase.firebase.perf;

import android.app.Activity;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebasePerfModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Perf";
    private final q module;

    ReactNativeFirebasePerfModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new q(reactApplicationContext, SERVICE_NAME);
    }

    public static /* synthetic */ void a(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void b(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void c(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void d(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void e(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void f(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void g(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.module.k();
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        this.module.c();
    }

    @ReactMethod
    public void setPerformanceCollectionEnabled(Boolean bool, final Promise promise) {
        this.module.l(bool).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.perf.d
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebasePerfModule.a(promise, task);
            }
        });
    }

    @ReactMethod
    public void startHttpMetric(int i10, String str, String str2, final Promise promise) {
        this.module.m(i10, str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.perf.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebasePerfModule.f(promise, task);
            }
        });
    }

    @ReactMethod
    public void startScreenTrace(int i10, String str, final Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
        } else {
            this.module.n(currentActivity, i10, str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.perf.g
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebasePerfModule.c(promise, task);
                }
            });
        }
    }

    @ReactMethod
    public void startTrace(int i10, String str, final Promise promise) {
        this.module.o(i10, str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.perf.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebasePerfModule.e(promise, task);
            }
        });
    }

    @ReactMethod
    public void stopHttpMetric(int i10, ReadableMap readableMap, final Promise promise) {
        this.module.p(i10, Arguments.toBundle(readableMap), Arguments.toBundle(readableMap.getMap("attributes"))).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.perf.c
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebasePerfModule.g(promise, task);
            }
        });
    }

    @ReactMethod
    public void stopScreenTrace(int i10, final Promise promise) {
        this.module.q(i10).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.perf.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebasePerfModule.b(promise, task);
            }
        });
    }

    @ReactMethod
    public void stopTrace(int i10, ReadableMap readableMap, final Promise promise) {
        this.module.r(i10, Arguments.toBundle(readableMap.getMap("metrics")), Arguments.toBundle(readableMap.getMap("attributes"))).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.perf.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebasePerfModule.d(promise, task);
            }
        });
    }
}
