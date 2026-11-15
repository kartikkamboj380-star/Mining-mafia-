package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
final class d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f17091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f17092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ p040e.c f17093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ GoogleApiAvailability f17094d;

    d(GoogleApiAvailability googleApiAvailability, Activity activity, int i10, p040e.c cVar) {
        this.f17094d = googleApiAvailability;
        this.f17091a = activity;
        this.f17092b = i10;
        this.f17093c = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.f17094d.getErrorResolutionPendingIntent(this.f17091a, this.f17092b, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.f17093c.a(new e.g.a(errorResolutionPendingIntent.getIntentSender()).a());
    }
}
