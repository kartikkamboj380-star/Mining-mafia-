package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1431l extends AbstractRunnableC1436q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f17068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ zaaw f17069c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1431l(zaaw zaawVar, Map map) {
        super(zaawVar, null);
        this.f17069c = zaawVar;
        this.f17068b = map;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC1436q
    public final void a() {
        com.google.android.gms.common.internal.zal zalVar = new com.google.android.gms.common.internal.zal(this.f17069c.zad);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.f17068b.keySet()) {
            if (!client.requiresGooglePlayServices() || ((C1428i) this.f17068b.get(client)).f17064c) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        int i10 = 0;
        int iZab = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i10 < size) {
                iZab = zalVar.zab(this.f17069c.zac, (Api.Client) arrayList.get(i10));
                i10++;
                if (iZab != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i10 < size2) {
                iZab = zalVar.zab(this.f17069c.zac, (Api.Client) arrayList2.get(i10));
                i10++;
                if (iZab == 0) {
                    break;
                }
            }
        }
        if (iZab != 0) {
            ConnectionResult connectionResult = new ConnectionResult(iZab, null);
            zaaw zaawVar = this.f17069c;
            zaawVar.zaa.zal(new C1429j(this, zaawVar, connectionResult));
            return;
        }
        zaaw zaawVar2 = this.f17069c;
        if (zaawVar2.zam && zaawVar2.zak != null) {
            zaawVar2.zak.zab();
        }
        for (Api.Client client2 : this.f17068b.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (BaseGmsClient.ConnectionProgressReportCallbacks) this.f17068b.get(client2);
            if (!client2.requiresGooglePlayServices() || zalVar.zab(this.f17069c.zac, client2) == 0) {
                client2.connect(connectionProgressReportCallbacks);
            } else {
                zaaw zaawVar3 = this.f17069c;
                zaawVar3.zaa.zal(new C1430k(this, zaawVar3, connectionProgressReportCallbacks));
            }
        }
    }
}
