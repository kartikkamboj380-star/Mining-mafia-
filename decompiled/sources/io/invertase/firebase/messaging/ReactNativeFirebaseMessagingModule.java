package io.invertase.firebase.messaging;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.W;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p176r5.AbstractC7096m;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseMessagingModule extends ReactNativeFirebaseModule implements ActivityEventListener {
    private static final String TAG = "Messaging";
    ReadableMap initialNotification;
    private HashMap<String, Boolean> initialNotificationMap;

    ReactNativeFirebaseMessagingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
        this.initialNotification = null;
        this.initialNotificationMap = new HashMap<>();
        reactApplicationContext.addActivityEventListener(this);
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
            promise.resolve(Boolean.valueOf(FirebaseMessaging.t().E()));
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
            promise.resolve(Boolean.valueOf(FirebaseMessaging.t().q()));
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

    public static /* synthetic */ Object g(FirebaseMessaging firebaseMessaging) throws InterruptedException {
        AbstractC7096m.a(firebaseMessaging.p());
        return null;
    }

    public static /* synthetic */ void h(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ Object i(Boolean bool) {
        FirebaseMessaging.t().G(bool.booleanValue());
        return null;
    }

    public static /* synthetic */ void j(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ Object k(Boolean bool) {
        FirebaseMessaging.t().H(bool.booleanValue());
        return null;
    }

    public static /* synthetic */ void l(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(Integer.valueOf(((Boolean) task.getResult()).booleanValue() ? 1 : 0));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$hasPermission$10() {
        return Boolean.valueOf(androidx.core.app.r.i(getReactApplicationContext()).a());
    }

    public static /* synthetic */ Object m(ReadableMap readableMap) {
        FirebaseMessaging.t().F(u.e(readableMap));
        return null;
    }

    public static /* synthetic */ Object n(Boolean bool) {
        FirebaseMessaging.t().I(bool.booleanValue());
        return null;
    }

    public static /* synthetic */ void o(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ Object p() {
        FirebaseMessaging.t().E();
        return null;
    }

    private WritableMap popRemoteMessageMapFromMessagingStore(String str) {
        v vVarB = w.a().b();
        WritableMap writableMapB = vVarB.b(str);
        vVarB.a(str);
        return writableMapB;
    }

    public static /* synthetic */ void q(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(Boolean.valueOf(FirebaseMessaging.t().C()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ String r(FirebaseMessaging firebaseMessaging) {
        return (String) AbstractC7096m.a(firebaseMessaging.w());
    }

    @ReactMethod
    public void deleteToken(String str, String str2, final Promise promise) {
        final FirebaseMessaging firebaseMessaging = (FirebaseMessaging) p007a6.f.p(str).k(FirebaseMessaging.class);
        AbstractC7096m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.g(firebaseMessaging);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.f(promise, task);
            }
        });
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("isAutoInitEnabled", Boolean.valueOf(FirebaseMessaging.t().C()));
        map.put("isDeliveryMetricsExportToBigQueryEnabled", Boolean.valueOf(FirebaseMessaging.t().q()));
        map.put("isNotificationDelegationEnabled", Boolean.valueOf(FirebaseMessaging.t().E()));
        return map;
    }

    @ReactMethod
    public void getInitialNotification(Promise promise) {
        ReadableMap readableMap = this.initialNotification;
        if (readableMap != null) {
            promise.resolve(readableMap);
            this.initialNotification = null;
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            Intent intent = currentActivity.getIntent();
            if (intent != null && intent.getExtras() != null) {
                String string = intent.getExtras().getString("google.message_id");
                if (string == null) {
                    string = intent.getExtras().getString("message_id");
                }
                if (string != null && this.initialNotificationMap.get(string) == null) {
                    W w10 = (W) ReactNativeFirebaseMessagingReceiver.f45191a.get(string);
                    WritableMap writableMapPopRemoteMessageMapFromMessagingStore = w10 == null ? popRemoteMessageMapFromMessagingStore(string) : u.i(w10);
                    if (writableMapPopRemoteMessageMapFromMessagingStore != null) {
                        promise.resolve(writableMapPopRemoteMessageMapFromMessagingStore);
                        this.initialNotificationMap.put(string, Boolean.TRUE);
                        return;
                    }
                }
            }
        } else {
            Log.w(TAG, "Attempt to call getInitialNotification failed. The current activity is not ready, try calling the method later in the React lifecycle.");
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void getToken(String str, String str2, final Promise promise) {
        final FirebaseMessaging firebaseMessaging = (FirebaseMessaging) p007a6.f.p(str).k(FirebaseMessaging.class);
        AbstractC7096m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.r(firebaseMessaging);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.o
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.h(promise, task);
            }
        });
    }

    @ReactMethod
    public void hasPermission(final Promise promise) {
        AbstractC7096m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f45202a.lambda$hasPermission$10();
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.m
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.l(promise, task);
            }
        });
    }

    @ReactMethod
    public void isNotificationDelegationEnabled(final Promise promise) {
        AbstractC7096m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.p();
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.k
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.a(promise, task);
            }
        });
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        if (intent == null || intent.getExtras() == null) {
            return;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string != null) {
            W w10 = (W) ReactNativeFirebaseMessagingReceiver.f45191a.get(string);
            WritableMap writableMapPopRemoteMessageMapFromMessagingStore = w10 == null ? popRemoteMessageMapFromMessagingStore(string) : u.i(w10);
            if (writableMapPopRemoteMessageMapFromMessagingStore != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.merge(writableMapPopRemoteMessageMapFromMessagingStore);
                this.initialNotification = writableNativeMap;
                ReactNativeFirebaseMessagingReceiver.f45191a.remove(string);
                p089i8.g.i().o(u.f(writableMapPopRemoteMessageMapFromMessagingStore, Boolean.TRUE));
            }
        }
    }

    @ReactMethod
    public void sendMessage(final ReadableMap readableMap, final Promise promise) {
        AbstractC7096m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.m(readableMap);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.q
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.c(promise, task);
            }
        });
    }

    @ReactMethod
    public void setAutoInitEnabled(final Boolean bool, final Promise promise) {
        AbstractC7096m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.i(bool);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.j
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.q(promise, task);
            }
        });
    }

    @ReactMethod
    public void setDeliveryMetricsExportToBigQuery(final Boolean bool, final Promise promise) {
        AbstractC7096m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.k(bool);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.c
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.d(promise, task);
            }
        });
    }

    @ReactMethod
    public void setNotificationDelegationEnabled(final Boolean bool, final Promise promise) {
        AbstractC7096m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.n(bool);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.b(promise, task);
            }
        });
    }

    @ReactMethod
    public void subscribeToTopic(String str, final Promise promise) {
        FirebaseMessaging.t().N(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.o(promise, task);
            }
        });
    }

    @ReactMethod
    public void unsubscribeFromTopic(String str, final Promise promise) {
        FirebaseMessaging.t().Q(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.r
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.j(promise, task);
            }
        });
    }
}
