package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* JADX INFO: loaded from: classes2.dex */
final class b extends zag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ListenerHolder f17155a;

    public b(ListenerHolder listenerHolder) {
        this.f17155a = listenerHolder;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zah
    public final void zab(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.f17155a.notifyListener(new a(this, moduleInstallStatusUpdate));
    }
}
