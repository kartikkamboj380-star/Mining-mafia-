package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class e extends com.google.android.gms.internal.base.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ GoogleApiAvailability f17096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f17096b = googleApiAvailability;
        this.f17095a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.f17096b;
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(this.f17095a);
        if (googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
            this.f17096b.showErrorNotification(this.f17095a, iIsGooglePlayServicesAvailable);
        }
    }
}
