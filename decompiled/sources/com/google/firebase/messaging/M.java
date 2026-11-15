package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f40161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f40162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f40163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40165e = 0;

    M(Context context) {
        this.f40161a = context;
    }

    static String c(p007a6.f fVar) {
        String strF = fVar.r().f();
        if (strF != null) {
            return strF;
        }
        String strC = fVar.r().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f40161a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo packageInfoF = f(this.f40161a.getPackageName());
        if (packageInfoF != null) {
            this.f40162b = Integer.toString(packageInfoF.versionCode);
            this.f40163c = packageInfoF.versionName;
        }
    }

    synchronized String a() {
        try {
            if (this.f40162b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f40162b;
    }

    synchronized String b() {
        try {
            if (this.f40163c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f40163c;
    }

    synchronized int d() {
        PackageInfo packageInfoF;
        try {
            if (this.f40164d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
                this.f40164d = packageInfoF.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f40164d;
    }

    synchronized int e() {
        int i10 = this.f40165e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f40161a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f40165e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f40165e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.isAtLeastO()) {
            this.f40165e = 2;
        } else {
            this.f40165e = 1;
        }
        return this.f40165e;
    }

    boolean g() {
        return e() != 0;
    }
}
