package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;
import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2261Ps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Clock f22203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0790q0 f22204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2521Us f22205d;

    /* synthetic */ C2261Ps(byte[] bArr) {
    }

    public final C2261Ps a(Context context) {
        context.getClass();
        this.f22202a = context;
        return this;
    }

    public final C2261Ps b(Clock clock) {
        clock.getClass();
        this.f22203b = clock;
        return this;
    }

    public final C2261Ps c(InterfaceC0790q0 interfaceC0790q0) {
        this.f22204c = interfaceC0790q0;
        return this;
    }

    public final C2261Ps d(C2521Us c2521Us) {
        this.f22205d = c2521Us;
        return this;
    }

    public final AbstractC2573Vs e() {
        AbstractC4738pQ0.c(this.f22202a, Context.class);
        AbstractC4738pQ0.c(this.f22203b, Clock.class);
        AbstractC4738pQ0.c(this.f22204c, InterfaceC0790q0.class);
        AbstractC4738pQ0.c(this.f22205d, C2521Us.class);
        return new C2313Qs(this.f22202a, this.f22203b, this.f22204c, this.f22205d);
    }
}
