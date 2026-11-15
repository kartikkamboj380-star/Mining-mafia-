package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ic0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3882ic0 implements InterfaceC3082cG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f29475a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f29476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1796Gt f29477c;

    public C3882ic0(Context context, C1796Gt c1796Gt) {
        this.f29476b = context;
        this.f29477c = c1796Gt;
    }

    public final synchronized void a(HashSet hashSet) {
        HashSet hashSet2 = this.f29475a;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    public final Bundle b() {
        return this.f29477c.n(this.f29476b, this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3082cG
    public final synchronized void w(H4.Z0 z9) {
        if (z9.f1252a != 3) {
            this.f29477c.b(this.f29475a);
        }
    }
}
