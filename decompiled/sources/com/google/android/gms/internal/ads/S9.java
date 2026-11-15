package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class S9 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f23141a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ S9 f23140c = new S9(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ S9 f23139b = new S9(0);

    private /* synthetic */ S9(int i10) {
        this.f23141a = i10;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.f23141a != 0 ? C4001ja.a(null) : new V9();
    }
}
