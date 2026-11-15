package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class M00 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static M00 f20710f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f20711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f20712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f20713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20715e;

    private M00(final Context context) {
        Executor executorA = ZI.a();
        this.f20711a = executorA;
        this.f20712b = new CopyOnWriteArrayList();
        this.f20713c = new Object();
        this.f20714d = 0;
        executorA.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hZ
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new C3929j00(this.f29016a, null), intentFilter);
            }
        });
    }

    public static synchronized M00 a(Context context) {
        try {
            if (f20710f == null) {
                f20710f = new M00(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f20710f;
    }

    private final void g() {
        CopyOnWriteArrayList<GY> copyOnWriteArrayList = this.f20712b;
        for (GY gy : copyOnWriteArrayList) {
            if (gy.a()) {
                copyOnWriteArrayList.remove(gy);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void e(int i10) {
        g();
        synchronized (this.f20713c) {
            try {
                if (this.f20715e && this.f20714d == i10) {
                    return;
                }
                this.f20715e = true;
                this.f20714d = i10;
                Iterator it = this.f20712b.iterator();
                while (it.hasNext()) {
                    ((GY) it.next()).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(EX ex, Executor executor) {
        boolean z9;
        g();
        GY gy = new GY(this, ex, executor);
        synchronized (this.f20713c) {
            this.f20712b.add(gy);
            z9 = this.f20715e;
        }
        if (z9) {
            gy.b();
        }
    }

    public final int c() {
        int i10;
        synchronized (this.f20713c) {
            i10 = this.f20714d;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    final /* synthetic */ void d(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i10 = 1;
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i10 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i10 = 4;
                                break;
                            case 13:
                                i10 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i10 = 6;
                                break;
                            case 18:
                                i10 = 2;
                                break;
                            case 20:
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i10 = 9;
                                }
                                break;
                        }
                    } else if (type == 1) {
                        i10 = 2;
                    } else if (type == 4 || type == 5) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i10 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i10 = 4;
                                break;
                            case 13:
                                i10 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i10 = 6;
                                break;
                            case 18:
                                i10 = 2;
                                break;
                            case 20:
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i10 = 9;
                                }
                                break;
                        }
                    } else if (type != 6) {
                        i10 = type != 9 ? 8 : 7;
                    } else {
                        i10 = 5;
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 31 || i10 != 5) {
            e(i10);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                throw null;
            }
            C3242dX c3242dX = new C3242dX(this);
            telephonyManager.registerTelephonyCallback(this.f20711a, c3242dX);
            telephonyManager.unregisterTelephonyCallback(c3242dX);
        } catch (RuntimeException unused2) {
            e(5);
        }
    }

    final /* synthetic */ Executor f() {
        return this.f20711a;
    }
}
