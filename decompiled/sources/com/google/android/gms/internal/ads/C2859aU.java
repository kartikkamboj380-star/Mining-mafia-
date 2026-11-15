package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2859aU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdRequest f26526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.ads.nativead.c f26527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private B4.x f26528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private B4.f f26529d = B4.f.f226i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f26530e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f26531f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f26532g = false;

    public C2859aU() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        this.f26526a = ((AdRequest.Builder) new AdRequest.Builder().d(AdMobAdapter.class, bundle)).n();
    }

    public final String a() {
        return this.f26530e;
    }

    public final String b() {
        return this.f26531f;
    }

    public final AdRequest c() {
        return this.f26526a;
    }

    public final B4.f d() {
        return this.f26529d;
    }

    public final com.google.android.gms.ads.nativead.c e() {
        return this.f26527b;
    }

    public final B4.x f() {
        return this.f26528c;
    }

    public final boolean g() {
        return this.f26532g;
    }

    public final void h(String str) {
        this.f26530e = str;
    }

    public final void i(String str) {
        this.f26531f = str;
    }

    public final void j(AdRequest adRequest) {
        this.f26526a = adRequest;
    }

    public final void k(B4.f fVar) {
        this.f26529d = fVar;
    }

    public final void l(com.google.android.gms.ads.nativead.c cVar) {
        this.f26527b = cVar;
    }

    public final void m(B4.x xVar) {
        this.f26528c = xVar;
    }

    public final void n(boolean z9) {
        this.f26532g = z9;
    }
}
