package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class J8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f19766c = K8.f20109b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19767a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19768b = false;

    J8() {
    }

    public final synchronized void a(String str, long j10) {
        if (this.f19768b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f19767a.add(new I8(str, j10, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        this.f19768b = true;
        List<I8> list = this.f19767a;
        long j10 = list.size() == 0 ? 0L : ((I8) list.get(list.size() - 1)).f19489c - ((I8) list.get(0)).f19489c;
        if (j10 > 0) {
            long j11 = ((I8) list.get(0)).f19489c;
            K8.b("(%-4d ms) %s", Long.valueOf(j10), str);
            for (I8 i10 : list) {
                long j12 = i10.f19489c;
                K8.b("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(i10.f19488b), i10.f19487a);
                j11 = j12;
            }
        }
    }

    protected final void finalize() {
        if (this.f19768b) {
            return;
        }
        b("Request on the loose");
        K8.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
