package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
final class j extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f36177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f36178b;

    j(j jVar) {
        if (jVar != null) {
            this.f36177a = jVar.f36177a;
            this.f36178b = jVar.f36178b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f36177a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new k(this);
    }
}
