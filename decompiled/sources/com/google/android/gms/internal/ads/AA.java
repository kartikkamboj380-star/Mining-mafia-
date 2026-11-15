package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AA implements InterfaceC4831qA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BT f17264a;

    AA(BT bt) {
        this.f17264a = bt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4831qA
    public final void k(JSONObject jSONObject) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Ha)).booleanValue()) {
            this.f17264a.q(jSONObject);
        }
    }
}
