package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class KB implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20119a;

    private KB(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f20119a = interfaceC4864qQ0;
    }

    public static KB a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new KB(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((GD) this.f20119a).a().f28445z);
        } catch (JSONException unused) {
            return null;
        }
    }
}
