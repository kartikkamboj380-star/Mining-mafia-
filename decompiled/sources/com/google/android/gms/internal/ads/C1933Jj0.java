package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1933Jj0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f19979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f19980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f19981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3018bk0 f19982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f19983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1933Jj0(C3018bk0 c3018bk0, p169q8.b bVar) {
        super(bVar);
        this.f19982d = c3018bk0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f19981c = obj;
        this.f19983e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f19982d.d(this);
    }
}
