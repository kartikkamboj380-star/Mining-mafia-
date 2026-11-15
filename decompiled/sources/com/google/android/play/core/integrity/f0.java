package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class f0 implements InterfaceC6705t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39846a;

    /* synthetic */ f0(T5.j jVar) {
    }

    public final f0 a(Context context) {
        context.getClass();
        this.f39846a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC6705t
    public final InterfaceC6706u b() {
        V5.n.a(this.f39846a, Context.class);
        return new g0(this.f39846a, null);
    }
}
