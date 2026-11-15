package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3873iY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p171r0.a f29434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f29435b;

    C3873iY(Context context) {
        this.f29435b = context;
    }

    public final com.google.common.util.concurrent.p a() {
        try {
            p171r0.a aVarA = p171r0.a.a(this.f29435b);
            this.f29434a = aVarA;
            return aVarA == null ? AbstractC5685wx0.c(new IllegalStateException("MeasurementManagerFutures is null")) : aVarA.b();
        } catch (Exception e10) {
            return AbstractC5685wx0.c(e10);
        }
    }

    public final com.google.common.util.concurrent.p b(Uri uri, InputEvent inputEvent) {
        try {
            p171r0.a aVar = this.f29434a;
            Objects.requireNonNull(aVar);
            return aVar.c(uri, inputEvent);
        } catch (Exception e10) {
            return AbstractC5685wx0.c(e10);
        }
    }
}
