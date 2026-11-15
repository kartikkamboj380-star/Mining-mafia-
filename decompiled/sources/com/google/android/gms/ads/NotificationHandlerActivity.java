package com.google.android.gms.ads;

import H4.C0654z;
import L4.p;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.BinderC5162so;
import com.google.android.gms.internal.ads.InterfaceC4033jq;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            InterfaceC4033jq interfaceC4033jqJ = C0654z.b().j(this, new BinderC5162so());
            if (interfaceC4033jqJ == null) {
                p.c("OfflineUtils is null");
            } else {
                interfaceC4033jqJ.J0(getIntent());
            }
        } catch (RemoteException e10) {
            p.c("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        finish();
    }
}
