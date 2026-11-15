package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class k0 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f40296f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Boolean f40297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Boolean f40298h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f40299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M f40300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f40301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j0 f40302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f40303e;

    class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k0 f40304a;

        public a(k0 k0Var) {
            this.f40304a = k0Var;
        }

        public void a() {
            if (k0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            k0.this.f40299a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                k0 k0Var = this.f40304a;
                if (k0Var == null) {
                    return;
                }
                if (k0Var.i()) {
                    if (k0.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f40304a.f40302d.l(this.f40304a, 0L);
                    context.unregisterReceiver(this);
                    this.f40304a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    k0(j0 j0Var, Context context, M m10, long j10) {
        this.f40302d = j0Var;
        this.f40299a = context;
        this.f40303e = j10;
        this.f40300b = m10;
        this.f40301c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f40296f) {
            try {
                Boolean bool = f40298h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f40298h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z9 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z9 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z9;
    }

    private static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f40296f) {
            try {
                Boolean bool = f40297g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f40297g = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f40299a.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (h(this.f40299a)) {
            this.f40301c.acquire(AbstractC6716e.f40248a);
        }
        try {
            try {
                try {
                    this.f40302d.n(true);
                    if (!this.f40300b.g()) {
                        this.f40302d.n(false);
                        if (h(this.f40299a)) {
                            try {
                                this.f40301c.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!f(this.f40299a) || i()) {
                        if (this.f40302d.r()) {
                            this.f40302d.n(false);
                        } else {
                            this.f40302d.s(this.f40303e);
                        }
                        if (h(this.f40299a)) {
                            this.f40301c.release();
                            return;
                        }
                        return;
                    }
                    new a(this).a();
                    if (h(this.f40299a)) {
                        try {
                            this.f40301c.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (Throwable th) {
                    if (h(this.f40299a)) {
                        try {
                            this.f40301c.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                this.f40302d.n(false);
                if (h(this.f40299a)) {
                    this.f40301c.release();
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
