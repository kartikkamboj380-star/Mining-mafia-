package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ej0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1673Ej0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f18550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f18551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f18552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3018bk0 f18553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f18554e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1673Ej0(C3018bk0 c3018bk0, p169q8.b bVar) {
        super(bVar);
        this.f18553d = c3018bk0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f18552c = obj;
        this.f18554e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f18553d.n(null, this);
    }
}
