package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4407mo implements InterfaceC3146cm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2575Vt f31574a;

    public C4407mo(C4659oo c4659oo, C2575Vt c2575Vt) {
        Objects.requireNonNull(c4659oo);
        this.f31574a = c2575Vt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3146cm
    public final void j(String str) {
        try {
            if (str == null) {
                this.f31574a.c(new C2251Pn());
            } else {
                this.f31574a.c(new C2251Pn(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3146cm
    public final void k(JSONObject jSONObject) {
        try {
            this.f31574a.b(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.f31574a.c(e10);
        }
    }
}
