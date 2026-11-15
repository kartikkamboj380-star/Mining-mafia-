package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2389Se implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f23277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2597We f23278b;

    RunnableC2389Se(C2597We c2597We, View view) {
        this.f23277a = view;
        Objects.requireNonNull(c2597We);
        this.f23278b = c2597We;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23278b.b(this.f23277a);
    }
}
