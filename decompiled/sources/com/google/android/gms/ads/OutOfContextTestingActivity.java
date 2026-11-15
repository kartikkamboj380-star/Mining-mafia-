package com.google.android.gms.ads;

import B4.q;
import B4.r;
import H4.C0654z;
import H4.V0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.BinderC5162so;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        V0 v0H = C0654z.b().h(this, new BinderC5162so());
        if (v0H == null) {
            finish();
            return;
        }
        setContentView(r.f251a);
        LinearLayout linearLayout = (LinearLayout) findViewById(q.f250a);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            v0H.M2(stringExtra, com.google.android.gms.dynamic.b.N0(this), com.google.android.gms.dynamic.b.N0(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
