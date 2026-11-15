package com.google.firebase.installations;

import p007a6.l;

/* JADX INFO: loaded from: classes3.dex */
public class d extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f40111a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f40111a = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f40111a = aVar;
    }
}
