package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.Set;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
public final class zal {
    private int zad;
    private final p190t.a zab = new p190t.a();
    private final C7094k zac = new C7094k();
    private boolean zae = false;
    private final p190t.a zaa = new p190t.a();

    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.zad = this.zaa.keySet().size();
    }

    public final Task zaa() {
        return this.zac.a();
    }

    public final Set zab() {
        return this.zaa.keySet();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.c(this.zab);
            } else {
                this.zac.b(new AvailabilityException(this.zaa));
            }
        }
    }
}
