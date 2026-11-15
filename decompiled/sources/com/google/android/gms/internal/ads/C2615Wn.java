package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C2615Wn implements InterfaceC2407Sn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C2615Wn f24866a = new C2615Wn();

    private /* synthetic */ C2615Wn() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2407Sn
    public final /* synthetic */ Object k(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
    }
}
