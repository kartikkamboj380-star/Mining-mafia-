package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class N implements InterfaceC6127u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f35948a = new p190t.a();

    static N a(Context context, String str, Runnable runnable) {
        if (AbstractC6104m.b()) {
            throw null;
        }
        synchronized (N.class) {
            p070h.w.a(f35948a.get(null));
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                throw null;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
    }

    static synchronized void b() {
        Map map = f35948a;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            p070h.w.a(it.next());
            throw null;
        }
        map.clear();
    }
}
