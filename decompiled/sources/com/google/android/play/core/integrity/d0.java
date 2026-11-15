package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class d0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39837a;

    /* synthetic */ d0(T5.h hVar) {
    }

    public final d0 a(Context context) {
        context.getClass();
        this.f39837a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.h0
    public final e0 b() {
        V5.n.a(this.f39837a, Context.class);
        return new e0(this.f39837a, null);
    }
}
