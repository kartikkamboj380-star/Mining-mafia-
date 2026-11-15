package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4142kh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f30858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5023rh0 f30859b;

    public C4142kh0(C5023rh0 c5023rh0) {
        this.f30859b = c5023rh0;
    }

    public final void a(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f30859b.a(new AsyncTaskC5401uh0(this, hashSet, jSONObject, j10));
    }

    public final void b(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f30859b.a(new AsyncTaskC5275th0(this, hashSet, jSONObject, j10));
    }

    public final void c() {
        this.f30859b.a(new AsyncTaskC5149sh0(this));
    }

    public final JSONObject d() {
        return this.f30858a;
    }

    public final void e(JSONObject jSONObject) {
        this.f30858a = jSONObject;
    }
}
