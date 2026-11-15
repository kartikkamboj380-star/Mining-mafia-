package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5665wn0 extends AbstractC1681En0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f34623f;

    C5665wn0(C1966Ka c1966Ka, InterfaceC2718Ym0 interfaceC2718Ym0, Context context, C5043rr0 c5043rr0) {
        super("10eHn0oEJc+Kv4xHAilDadQXUH+Qd7+H1wb3g/5791dKT43oKLnvfFcwz9lBLCYb", "DO5TusvTbmxbLfPhMKcHxON+YLmz+u+OpsMl13dRFcs=", c1966Ka, interfaceC2718Ym0, c5043rr0.a(119));
        this.f34623f = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1681En0
    protected final void a(Method method, C1966Ka c1966Ka) {
        Object[] objArr = (Object[]) method.invoke("", this.f34623f);
        objArr.getClass();
        synchronized (c1966Ka) {
            c1966Ka.r0(((Long) objArr[0]).longValue());
            c1966Ka.U(((Long) objArr[1]).longValue());
        }
    }
}
