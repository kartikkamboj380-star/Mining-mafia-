package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1829Hj0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f19379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f19380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3018bk0 f19381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f19382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1829Hj0(C3018bk0 c3018bk0, p169q8.b bVar) {
        super(bVar);
        this.f19381c = c3018bk0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f19380b = obj;
        this.f19382d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f19381c.o(this);
    }
}
