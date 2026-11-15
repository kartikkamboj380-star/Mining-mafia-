package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5516vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.p f34142a;

    public C5516vc(final Context context, Executor executor) {
        this.f34142a = AbstractC5685wx0.d(new Callable(this) { // from class: com.google.android.gms.internal.ads.uc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Context context2 = context;
                try {
                    return AbstractC2084Mh0.a(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final com.google.common.util.concurrent.p a() {
        return this.f34142a;
    }
}
