package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2452Tj0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f23600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f23601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3018bk0 f23602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f23603d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2452Tj0(C3018bk0 c3018bk0, p169q8.b bVar) {
        super(bVar);
        this.f23602c = c3018bk0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f23601b = obj;
        this.f23603d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f23602c.a(this);
    }
}
