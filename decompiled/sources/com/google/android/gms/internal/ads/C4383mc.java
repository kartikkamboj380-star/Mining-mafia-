package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4383mc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConditionVariable f31544c = new ConditionVariable();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static volatile C1619Di0 f31545d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile Random f31546e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2645Xc f31547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected volatile Boolean f31548b;

    public C4383mc(C2645Xc c2645Xc) {
        this.f31547a = c2645Xc;
        c2645Xc.d().execute(new RunnableC4257lc(this));
    }

    public static final int d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (f31546e == null) {
                synchronized (C4383mc.class) {
                    try {
                        if (f31546e == null) {
                            f31546e = new Random();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f31546e.nextInt();
        }
    }

    public final void a(int i10, int i11, long j10, String str, Exception exc) {
        try {
            f31544c.block();
            if (!this.f31548b.booleanValue() || f31545d == null) {
                return;
            }
            C4757pa c4757paD0 = C5260ta.d0();
            c4757paD0.A(this.f31547a.f25323a.getPackageName());
            c4757paD0.B(j10);
            if (str != null) {
                c4757paD0.E(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                c4757paD0.C(stringWriter.toString());
                c4757paD0.D(exc.getClass().getName());
            }
            C1567Ci0 c1567Ci0A = f31545d.a(((C5260ta) c4757paD0.w()).i());
            c1567Ci0A.c(i10);
            if (i11 != -1) {
                c1567Ci0A.b(i11);
            }
            c1567Ci0A.a();
        } catch (Exception unused) {
        }
    }

    final /* synthetic */ C2645Xc b() {
        return this.f31547a;
    }
}
