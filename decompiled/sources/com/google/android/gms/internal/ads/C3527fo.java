package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3527fo implements InterfaceC3146cm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1784Gn f28476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2575Vt f28477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3653go f28478c;

    public C3527fo(C3653go c3653go, C1784Gn c1784Gn, C2575Vt c2575Vt) {
        Objects.requireNonNull(c3653go);
        this.f28478c = c3653go;
        this.f28476a = c1784Gn;
        this.f28477b = c2575Vt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3146cm
    public final void j(String str) {
        try {
            if (str == null) {
                this.f28477b.c(new C2251Pn());
            } else {
                this.f28477b.c(new C2251Pn(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            this.f28476a.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3146cm
    public final void k(JSONObject jSONObject) {
        try {
            try {
                this.f28477b.b(this.f28478c.b().k(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e10) {
                this.f28477b.c(e10);
            }
        } finally {
            this.f28476a.g();
        }
    }
}
