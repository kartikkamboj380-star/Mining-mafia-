package com.facebook.react.views.debuggingoverlay;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f15878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15879c;

    public c(int i10, RectF rectangle, int i11) {
        Intrinsics.checkNotNullParameter(rectangle, "rectangle");
        this.f15877a = i10;
        this.f15878b = rectangle;
        this.f15879c = i11;
    }

    public final int a() {
        return this.f15879c;
    }

    public final int b() {
        return this.f15877a;
    }

    public final RectF c() {
        return this.f15878b;
    }
}
