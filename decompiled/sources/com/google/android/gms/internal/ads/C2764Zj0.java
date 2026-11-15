package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2764Zj0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f26281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f26282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f26283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3018bk0 f26284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f26285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2764Zj0(C3018bk0 c3018bk0, p169q8.b bVar) {
        super(bVar);
        this.f26284d = c3018bk0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26283c = obj;
        this.f26285e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f26284d.e(this);
    }
}
