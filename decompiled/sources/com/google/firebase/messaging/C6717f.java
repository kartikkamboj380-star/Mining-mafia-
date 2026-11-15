package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p176r5.AbstractC7096m;

/* JADX INFO: renamed from: com.google.firebase.messaging.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6717f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f40254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f40255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N f40256c;

    public C6717f(Context context, N n10, ExecutorService executorService) {
        this.f40254a = executorService;
        this.f40255b = context;
        this.f40256c = n10;
    }

    private boolean b() {
        if (((KeyguardManager) this.f40255b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f40255b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    if (runningAppProcessInfo.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void c(AbstractC6715d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f40255b.getSystemService("notification")).notify(aVar.f40240b, aVar.f40241c, aVar.f40239a.d());
    }

    private J d() {
        J j10 = J.j(this.f40256c.p("gcm.n.image"));
        if (j10 != null) {
            j10.v(this.f40254a);
        }
        return j10;
    }

    private void e(androidx.core.app.n.e eVar, J j10) {
        if (j10 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) AbstractC7096m.b(j10.n(), 5L, TimeUnit.SECONDS);
            eVar.y(bitmap);
            eVar.N(new androidx.core.app.n.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            j10.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            j10.close();
        }
    }

    boolean a() {
        if (this.f40256c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        J jD = d();
        AbstractC6715d.a aVarE = AbstractC6715d.e(this.f40255b, this.f40256c);
        e(aVarE.f40239a, jD);
        c(aVarE);
        return true;
    }
}
