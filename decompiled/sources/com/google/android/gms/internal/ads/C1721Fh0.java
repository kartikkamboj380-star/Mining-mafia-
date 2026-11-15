package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;
import p176r5.C7094k;
import p176r5.InterfaceC7086c;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1721Fh0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile int f18816e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f18817f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f18819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Task f18820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f18821d;

    public C1721Fh0(Context context, Executor executor, Task task, boolean z9) {
        this.f18818a = context;
        this.f18819b = executor;
        this.f18820c = task;
        this.f18821d = z9;
    }

    public static C1721Fh0 a(final Context context, Executor executor, boolean z9) {
        final C7094k c7094k = new C7094k();
        if (z9) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Bh0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i10 = C1721Fh0.f18817f;
                    c7094k.c(C1619Di0.b(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Dh0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i10 = C1721Fh0.f18817f;
                    c7094k.c(C1619Di0.c());
                }
            });
        }
        return new C1721Fh0(context, executor, c7094k.a(), z9);
    }

    static void g(int i10) {
        f18816e = i10;
    }

    private final Task h(final int i10, long j10, Exception exc, String str, Map map, String str2) {
        if (!this.f18821d) {
            return this.f18820c.h(this.f18819b, C1669Eh0.f18548a);
        }
        Context context = this.f18818a;
        final C4757pa c4757paD0 = C5260ta.d0();
        c4757paD0.A(context.getPackageName());
        c4757paD0.B(j10);
        c4757paD0.G(f18816e);
        if (exc != null) {
            int i11 = AbstractC4796pt0.f32500b;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            c4757paD0.C(stringWriter.toString());
            c4757paD0.D(exc.getClass().getName());
        }
        if (str2 != null) {
            c4757paD0.E(str2);
        }
        if (str != null) {
            c4757paD0.F(str);
        }
        return this.f18820c.h(this.f18819b, new InterfaceC7086c() { // from class: com.google.android.gms.internal.ads.Ch0
            @Override // p176r5.InterfaceC7086c
            public final /* synthetic */ Object a(Task task) {
                int i12 = C1721Fh0.f18817f;
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i13 = i10;
                C1567Ci0 c1567Ci0A = ((C1619Di0) task.getResult()).a(((C5260ta) c4757paD0.w()).i());
                c1567Ci0A.c(i13);
                c1567Ci0A.a();
                return Boolean.TRUE;
            }
        });
    }

    public Task b(int i10, long j10) {
        return h(i10, j10, null, null, null, null);
    }

    public Task c(int i10, long j10, Exception exc) {
        return h(i10, j10, exc, null, null, null);
    }

    public final Task d(int i10, long j10, String str, Map map) {
        return h(i10, j10, null, str, null, null);
    }

    public Task e(int i10, String str) {
        return h(i10, 0L, null, null, null, str);
    }

    public final Task f(int i10, long j10, String str) {
        return h(i10, j10, null, null, null, str);
    }
}
