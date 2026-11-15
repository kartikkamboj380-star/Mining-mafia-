package com.facebook.react.views.scroll;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends com.facebook.react.views.view.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f15999a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15999a = com.facebook.react.modules.i18nmanager.a.f14969a.a().i(context);
    }

    @Override // com.facebook.react.views.view.i, com.facebook.react.uimanager.InterfaceC1364j0
    public boolean getRemoveClippedSubviews() {
        return super.getRemoveClippedSubviews();
    }

    @Override // com.facebook.react.views.view.i, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        if (this.f15999a) {
            setLeft(0);
            setTop(i11);
            setRight(i12 - i10);
            setBottom(i13);
        }
    }

    @Override // com.facebook.react.views.view.i
    public void setRemoveClippedSubviews(boolean z9) {
        if (this.f15999a) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z9);
        }
    }
}
