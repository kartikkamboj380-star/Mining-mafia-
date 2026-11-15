package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import p136n5.m;
import p136n5.n;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementReceiver extends p101k0.a implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f37361c;

    @Override // p136n5.m
    public void a(Context context, Intent intent) {
        p101k0.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f37361c == null) {
            this.f37361c = new n(this);
        }
        this.f37361c.a(context, intent);
    }
}
