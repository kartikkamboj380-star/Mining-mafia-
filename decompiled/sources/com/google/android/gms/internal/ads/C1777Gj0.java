package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1777Gj0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f19119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f19120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f19121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3018bk0 f19122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f19123e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1777Gj0(C3018bk0 c3018bk0, p169q8.b bVar) {
        super(bVar);
        this.f19122d = c3018bk0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f19121c = obj;
        this.f19123e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f19122d.p(0L, this);
    }
}
