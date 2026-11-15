package com.google.android.gms.ads;

import H4.C0612k1;

/* JADX INFO: loaded from: classes2.dex */
public class AdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C0612k1 f16809a;

    public static class Builder extends a {
        public AdRequest n() {
            return new AdRequest(this);
        }

        @Override // com.google.android.gms.ads.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Builder e() {
            return this;
        }
    }

    protected AdRequest(a aVar) {
        this.f16809a = new C0612k1(aVar.f16811a, null);
    }

    public final C0612k1 a() {
        return this.f16809a;
    }
}
