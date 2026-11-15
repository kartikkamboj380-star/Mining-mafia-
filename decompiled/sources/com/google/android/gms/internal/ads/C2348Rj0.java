package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2348Rj0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f22893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f22894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f22895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3018bk0 f22896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f22897e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2348Rj0(C3018bk0 c3018bk0, p169q8.b bVar) {
        super(bVar);
        this.f22896d = c3018bk0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f22895c = obj;
        this.f22897e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f22896d.f(this);
    }
}
