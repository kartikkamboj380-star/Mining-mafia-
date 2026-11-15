package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3652gn0 extends AbstractC1681En0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Activity f28736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f28737g;

    C3652gn0(C1966Ka c1966Ka, InterfaceC2718Ym0 interfaceC2718Ym0, View view, Activity activity, C5043rr0 c5043rr0) {
        super("bnVSgdPP2gLWa4hBN3KENgNw/HH5/Lu+gCRQEGIHMH/zN0uabg0EmprGntHqQpss", "4mb2wE47WPzlH8QFuj7X929jGLgzTiMr8Iu3TogjJ0U=", c1966Ka, interfaceC2718Ym0, c5043rr0.a(111));
        this.f28737g = view;
        this.f28736f = activity;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1681En0
    protected final void a(Method method, C1966Ka c1966Ka) {
        Object[] objArr = (Object[]) method.invoke("", this.f28737g, this.f28736f);
        objArr.getClass();
        synchronized (c1966Ka) {
            c1966Ka.X(((Long) objArr[0]).longValue());
            c1966Ka.Y(((Long) objArr[1]).longValue());
            c1966Ka.Z((String) objArr[2]);
        }
    }
}
