package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3021bm implements InterfaceC3146cm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2575Vt f26916a;

    C3021bm(C3272dm c3272dm, C2575Vt c2575Vt) {
        this.f26916a = c2575Vt;
        Objects.requireNonNull(c3272dm);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3146cm
    public final void j(String str) {
        this.f26916a.c(new C2251Pn(str));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3146cm
    public final void k(JSONObject jSONObject) {
        this.f26916a.b(jSONObject);
    }
}
