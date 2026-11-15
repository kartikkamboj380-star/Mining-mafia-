package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1941Jn0 extends AbstractC1681En0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final DisplayMetrics f19992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f19993g;

    C1941Jn0(C1966Ka c1966Ka, InterfaceC2718Ym0 interfaceC2718Ym0, DisplayMetrics displayMetrics, View view, C5043rr0 c5043rr0) {
        super("QtFUhprc0s9rDonjH5m4IrigIFuqmp02TDnBB8cCDzOGBvtX+nN2RsZyZRWOgPcG", "ANcskOtBFoz5qdvK1HjqJ5/70uPKH1zreYbosxrVnAY=", c1966Ka, interfaceC2718Ym0, c5043rr0.a(124));
        this.f19992f = displayMetrics;
        this.f19993g = view;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1681En0
    protected final void a(Method method, C1966Ka c1966Ka) throws IllegalAccessException, InvocationTargetException {
        View view = this.f19993g;
        if (view == null) {
            return;
        }
        Object objInvoke = method.invoke("", this.f19992f, view);
        objInvoke.getClass();
        Long[] lArr = (Long[]) objInvoke;
        C4003jb c4003jbD0 = C4129kb.d0();
        c4003jbD0.B(lArr[2].longValue());
        c4003jbD0.C(lArr[1].longValue());
        c4003jbD0.D(lArr[0].longValue());
        c4003jbD0.A(lArr[3].longValue());
        c4003jbD0.E(lArr[4].longValue());
        c1966Ka.O((C4129kb) c4003jbD0.w());
    }
}
