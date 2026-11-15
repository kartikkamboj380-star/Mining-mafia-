package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p176r5.AbstractC7096m;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes3.dex */
class j0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f40284i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f40285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M f40286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H f40287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f40288d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f40290f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h0 f40292h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f40289e = new p190t.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f40291g = false;

    private j0(FirebaseMessaging firebaseMessaging, M m10, h0 h0Var, H h10, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f40288d = firebaseMessaging;
        this.f40286b = m10;
        this.f40292h = h0Var;
        this.f40287c = h10;
        this.f40285a = context;
        this.f40290f = scheduledExecutorService;
    }

    public static /* synthetic */ j0 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, M m10, H h10) {
        return new j0(firebaseMessaging, m10, h0.b(context, scheduledExecutorService), h10, context, scheduledExecutorService);
    }

    private void b(g0 g0Var, C7094k c7094k) {
        ArrayDeque arrayDeque;
        synchronized (this.f40289e) {
            try {
                String strE = g0Var.e();
                if (this.f40289e.containsKey(strE)) {
                    arrayDeque = (ArrayDeque) this.f40289e.get(strE);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f40289e.put(strE, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(c7094k);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void c(Task task) throws IOException {
        try {
            AbstractC7096m.b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    private void d(String str) throws IOException {
        c(this.f40287c.m(this.f40288d.o(), str));
    }

    private void e(String str) throws IOException {
        c(this.f40287c.n(this.f40288d.o(), str));
    }

    static Task f(final FirebaseMessaging firebaseMessaging, final M m10, final H h10, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return AbstractC7096m.d(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j0.a(context, scheduledExecutorService, firebaseMessaging, m10, h10);
            }
        });
    }

    static boolean h() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private void j(g0 g0Var) {
        synchronized (this.f40289e) {
            try {
                String strE = g0Var.e();
                if (this.f40289e.containsKey(strE)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f40289e.get(strE);
                    C7094k c7094k = (C7094k) arrayDeque.poll();
                    if (c7094k != null) {
                        c7094k.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f40289e.remove(strE);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o() {
        if (i()) {
            return;
        }
        s(0L);
    }

    boolean g() {
        return this.f40292h.c() != null;
    }

    synchronized boolean i() {
        return this.f40291g;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    boolean k(g0 g0Var) throws IOException {
        byte b10;
        try {
            String strB = g0Var.b();
            int iHashCode = strB.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strB.equals("U")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (strB.equals("S")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                d(g0Var.c());
                if (h()) {
                    Log.d("FirebaseMessaging", "Subscribe to topic: " + g0Var.c() + " succeeded.");
                }
            } else if (b10 == 1) {
                e(g0Var.c());
                if (h()) {
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + g0Var.c() + " succeeded.");
                }
            } else if (h()) {
                Log.d("FirebaseMessaging", "Unknown topic operation" + g0Var + ".");
            }
            return true;
        } catch (IOException e10) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    void l(Runnable runnable, long j10) {
        this.f40290f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    Task m(g0 g0Var) {
        this.f40292h.a(g0Var);
        C7094k c7094k = new C7094k();
        b(g0Var, c7094k);
        return c7094k.a();
    }

    synchronized void n(boolean z9) {
        this.f40291g = z9;
    }

    void p() {
        if (g()) {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task q(String str) {
        Task taskM = m(g0.f(str));
        p();
        return taskM;
    }

    boolean r() {
        while (true) {
            synchronized (this) {
                try {
                    g0 g0VarC = this.f40292h.c();
                    if (g0VarC == null) {
                        if (h()) {
                            Log.d("FirebaseMessaging", "topic sync succeeded");
                        }
                        return true;
                    }
                    if (!k(g0VarC)) {
                        return false;
                    }
                    this.f40292h.e(g0VarC);
                    j(g0VarC);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    void s(long j10) {
        l(new k0(this, this.f40285a, this.f40286b, Math.min(Math.max(30L, 2 * j10), f40284i)), j10);
        n(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task t(String str) {
        Task taskM = m(g0.g(str));
        p();
        return taskM;
    }
}
