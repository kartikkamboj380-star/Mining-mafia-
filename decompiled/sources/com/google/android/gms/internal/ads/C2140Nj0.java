package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2140Nj0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f21328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f21329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f21330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3018bk0 f21331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f21332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f21333f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2140Nj0(C3018bk0 c3018bk0, p169q8.b bVar) {
        super(bVar);
        this.f21331d = c3018bk0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f21330c = obj;
        this.f21332e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f21331d.c(null, this);
    }
}
