package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6401e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile C6401e0 f37205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C6401e0 f37206c = new C6401e0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f37207a = Collections.EMPTY_MAP;

    C6401e0(boolean z9) {
    }

    public static C6401e0 a() {
        C6401e0 c6401e0 = f37205b;
        if (c6401e0 != null) {
            return c6401e0;
        }
        synchronized (C6401e0.class) {
            try {
                C6401e0 c6401e1 = f37205b;
                if (c6401e1 != null) {
                    return c6401e1;
                }
                C6401e0 c6401e0A = AbstractC6429l0.a(C6401e0.class);
                f37205b = c6401e0A;
                return c6401e0A;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC6441o0 b(V0 v10, int i10) {
        p070h.w.a(this.f37207a.get(new C6397d0(v10, i10)));
        return null;
    }
}
