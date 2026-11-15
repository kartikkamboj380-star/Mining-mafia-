package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f40307a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f40308b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static p166q5.a f40309c;

    private static void b(Context context) {
        if (f40309c == null) {
            p166q5.a aVar = new p166q5.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f40309c = aVar;
            aVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f40308b) {
            try {
                if (f40309c != null && d(intent)) {
                    f(intent, false);
                    f40309c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    static void e(Context context, r0 r0Var, final Intent intent) {
        synchronized (f40308b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                if (!zD) {
                    f40309c.a(f40307a);
                }
                r0Var.d(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.l0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        m0.c(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void f(Intent intent, boolean z9) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z9);
    }

    static ComponentName g(Context context, Intent intent) {
        synchronized (f40308b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zD) {
                    f40309c.a(f40307a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
