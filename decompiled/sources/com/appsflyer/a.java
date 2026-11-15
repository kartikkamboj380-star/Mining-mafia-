package com.appsflyer;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f13248a;

    public /* synthetic */ a(Function1 function1) {
        this.f13248a = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.getMediationNetwork(this.f13248a);
    }
}
