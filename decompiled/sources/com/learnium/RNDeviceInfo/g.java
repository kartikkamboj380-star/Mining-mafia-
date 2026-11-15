package com.learnium.RNDeviceInfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Class f41875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Class f41876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Class f41877h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f41878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f41879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f41880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f41881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f41882e;

    /* JADX INFO: Access modifiers changed from: private */
    class a implements InvocationHandler {

        /* JADX INFO: renamed from: com.learnium.RNDeviceInfo.g$a$a, reason: collision with other inner class name */
        class RunnableC0389a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f41884a;

            RunnableC0389a(int i10) {
                this.f41884a = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.d(this.f41884a);
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            try {
                Log.d("InstallReferrerState", "OK");
                String str = (String) g.f41877h.getMethod("getInstallReferrer", null).invoke(g.f41875f.getMethod("getInstallReferrer", null).invoke(g.this.f41879b, null), null);
                SharedPreferences.Editor editorEdit = g.this.f41878a.edit();
                editorEdit.putString("installReferrer", str);
                editorEdit.apply();
                g.f41875f.getMethod("endConnection", null).invoke(g.this.f41879b, null);
            } catch (Exception e10) {
                System.err.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e10.getMessage());
                e10.printStackTrace(System.err);
            }
        }

        public void c() {
            Log.d("RNInstallReferrerClient", "InstallReferrerService disconnected");
        }

        public void d(int i10) {
            if (i10 == 0) {
                g.this.f41881d.execute(new Runnable() { // from class: com.learnium.RNDeviceInfo.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41874a.b();
                    }
                });
            } else if (i10 == 1) {
                Log.d("InstallReferrerState", "SERVICE_UNAVAILABLE");
            } else {
                if (i10 != 2) {
                    return;
                }
                Log.d("InstallReferrerState", "FEATURE_NOT_SUPPORTED");
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            try {
                if (name.equals("onInstallReferrerSetupFinished") && objArr != null) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof Integer) {
                        g.this.f41882e.post(new RunnableC0389a(((Integer) obj2).intValue()));
                        return null;
                    }
                }
                if (!name.equals("onInstallReferrerServiceDisconnected")) {
                    return null;
                }
                g.this.f41882e.post(new b());
                return null;
            } catch (Exception e10) {
                throw new RuntimeException("unexpected invocation exception: " + e10.getMessage());
            }
        }

        private a() {
        }
    }

    static {
        try {
            f41875f = InstallReferrerClient.class;
            f41876g = InstallReferrerStateListener.class;
            f41877h = ReferrerDetails.class;
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    g(final Context context) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f41881d = executorServiceNewSingleThreadExecutor;
        this.f41882e = new Handler(Looper.getMainLooper());
        this.f41878a = context.getSharedPreferences("react-native-device-info", 0);
        if (f41875f == null || f41876g == null || f41877h == null) {
            return;
        }
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.learnium.RNDeviceInfo.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f41872a.h(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Context context) {
        try {
            Object objInvoke = f41875f.getMethod("newBuilder", Context.class).invoke(null, context);
            this.f41879b = objInvoke.getClass().getMethod("build", null).invoke(objInvoke, null);
            this.f41880c = Proxy.newProxyInstance(f41876g.getClassLoader(), new Class[]{f41876g}, new a());
            f41875f.getMethod("startConnection", f41876g).invoke(this.f41879b, this.f41880c);
        } catch (Exception e10) {
            System.err.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e10.getMessage());
            e10.printStackTrace(System.err);
        }
    }
}
