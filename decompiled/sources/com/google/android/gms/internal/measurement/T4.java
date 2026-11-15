package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class T4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile T4 f36494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final T4 f36495c = new T4(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f36496a = Collections.EMPTY_MAP;

    T4(boolean z9) {
    }

    public static T4 a() {
        T4 t10 = f36494b;
        if (t10 != null) {
            return t10;
        }
        synchronized (T4.class) {
            try {
                T4 t11 = f36494b;
                if (t11 != null) {
                    return t11;
                }
                int i10 = N5.f36424d;
                T4 t4A = AbstractC6160a5.a(T4.class);
                f36494b = t4A;
                return t4A;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC6196e5 b(F5 f10, int i10) {
        p070h.w.a(this.f36496a.get(new S4(f10, i10)));
        return null;
    }
}
