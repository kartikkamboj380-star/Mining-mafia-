package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.Objects;
import org.json.JSONException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2085Mi extends T4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f20902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2189Oi f20903b;

    C2085Mi(C2189Oi c2189Oi, String str) {
        this.f20902a = str;
        Objects.requireNonNull(c2189Oi);
        this.f20903b = c2189Oi;
    }

    @Override // T4.b
    public final void a(String str) {
        int i10 = AbstractC0786o0.f2696b;
        L4.p.f("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            C2189Oi c2189Oi = this.f20903b;
            c2189Oi.i().h(c2189Oi.e(this.f20902a, str).toString(), null);
        } catch (JSONException e10) {
            L4.p.d("Error creating PACT Error Response JSON: ", e10);
        }
    }

    @Override // T4.b
    public final void b(T4.a aVar) {
        String strB = aVar.b();
        try {
            C2189Oi c2189Oi = this.f20903b;
            c2189Oi.i().h(c2189Oi.f(this.f20902a, strB).toString(), null);
        } catch (JSONException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Error creating PACT Signal Response JSON: ", e10);
        }
    }
}
