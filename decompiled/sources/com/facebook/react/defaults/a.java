package com.facebook.react.defaults;

import com.facebook.react.AbstractC1396v;
import com.facebook.react.ReactActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class a extends AbstractC1396v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14570f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReactActivity activity, String mainComponentName, boolean z9) {
        super(activity, mainComponentName);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mainComponentName, "mainComponentName");
        this.f14570f = z9;
    }

    @Override // com.facebook.react.AbstractC1396v
    protected boolean k() {
        return this.f14570f;
    }
}
