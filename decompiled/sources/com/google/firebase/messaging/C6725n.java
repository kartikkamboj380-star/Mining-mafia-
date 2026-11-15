package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p176r5.AbstractC7096m;
import p176r5.InterfaceC7086c;

/* JADX INFO: renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6725n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f40310c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static r0 f40311d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f40312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f40313b = new p191t0.j();

    public C6725n(Context context) {
        this.f40312a = context;
    }

    public static /* synthetic */ Task a(Context context, Intent intent, boolean z9, Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? e(context, intent, z9).h(new p191t0.j(), new InterfaceC7086c() { // from class: com.google.firebase.messaging.l
            @Override // p176r5.InterfaceC7086c
            public final Object a(Task task2) {
                return Integer.valueOf(TTAdConstant.DEEPLINK_UNAVAILABLE_CODE);
            }
        }) : task;
    }

    public static /* synthetic */ Integer c(Task task) {
        return -1;
    }

    private static Task e(Context context, Intent intent, boolean z9) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        r0 r0VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z9) {
            return r0VarF.d(intent).h(new p191t0.j(), new InterfaceC7086c() { // from class: com.google.firebase.messaging.m
                @Override // p176r5.InterfaceC7086c
                public final Object a(Task task) {
                    return C6725n.c(task);
                }
            });
        }
        if (b0.b().e(context)) {
            m0.e(context, r0VarF, intent);
        } else {
            r0VarF.d(intent);
        }
        return AbstractC7096m.f(-1);
    }

    private static r0 f(Context context, String str) {
        r0 r0Var;
        synchronized (f40310c) {
            try {
                if (f40311d == null) {
                    f40311d = new r0(context, str);
                }
                r0Var = f40311d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r0Var;
    }

    public Task g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f40312a, intent);
    }

    public Task h(final Context context, final Intent intent) {
        boolean z9 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z10 = (intent.getFlags() & 268435456) != 0;
        return (!z9 || z10) ? AbstractC7096m.d(this.f40313b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(b0.b().g(context, intent));
            }
        }).j(this.f40313b, new InterfaceC7086c() { // from class: com.google.firebase.messaging.k
            @Override // p176r5.InterfaceC7086c
            public final Object a(Task task) {
                return C6725n.a(context, intent, z10, task);
            }
        }) : e(context, intent, z10);
    }
}
