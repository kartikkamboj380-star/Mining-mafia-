package com.google.android.gms.ads;

import H4.C0654z;
import L4.p;
import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.BinderC5162so;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            C0654z.b().j(this, new BinderC5162so()).J0(intent);
        } catch (RemoteException e10) {
            p.c("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }
}
