package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static i f13198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f13199b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Printer> f13200c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Printer> f13201d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f13202e = false;

    static {
        new Printer() { // from class: com.apm.insight.runtime.i.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (str == null) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    i.a().a(str);
                } else if (str.charAt(0) == '<') {
                    i.a().b(str);
                }
                i.c();
            }
        };
    }

    private i() {
    }

    public static i a() {
        if (f13198a == null) {
            synchronized (i.class) {
                try {
                    if (f13198a == null) {
                        f13198a = new i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13198a;
    }

    static /* synthetic */ Printer c() {
        return null;
    }

    public final boolean b() {
        return this.f13199b != -1 && SystemClock.uptimeMillis() - this.f13199b > ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT;
    }

    final void b(String str) {
        this.f13199b = SystemClock.uptimeMillis();
        try {
            a(this.f13201d, str);
        } catch (Exception e10) {
            com.apm.insight.a.b((Throwable) e10);
        }
    }

    final void a(String str) {
        this.f13199b = -1L;
        try {
            a(this.f13200c, str);
        } catch (Exception e10) {
            com.apm.insight.a.a((Throwable) e10);
        }
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Printer printer = list.get(i10);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th) {
            com.apm.insight.a.a(th);
        }
    }
}
