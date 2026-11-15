package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3675gz implements JS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2325Qy f28768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4529nm f28770c;

    /* synthetic */ C3675gz(C2325Qy c2325Qy, byte[] bArr) {
        this.f28768a = c2325Qy;
    }

    @Override // com.google.android.gms.internal.ads.JS
    public final /* bridge */ /* synthetic */ JS a(InterfaceC4529nm interfaceC4529nm) {
        interfaceC4529nm.getClass();
        this.f28770c = interfaceC4529nm;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.JS
    public final /* bridge */ /* synthetic */ JS e(Context context) {
        context.getClass();
        this.f28769b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.JS
    public final KS zza() {
        AbstractC4738pQ0.c(this.f28769b, Context.class);
        AbstractC4738pQ0.c(this.f28770c, InterfaceC4529nm.class);
        return new C3801hz(this.f28768a, this.f28769b, this.f28770c);
    }
}
