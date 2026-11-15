package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5787xl0 implements InterfaceC6039zl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5863yM0 f35006a;

    public C5787xl0(InterfaceC5863yM0 interfaceC5863yM0) {
        this.f35006a = interfaceC5863yM0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6039zl0
    public final /* synthetic */ void a(Object obj, OutputStream outputStream) {
        ((InterfaceC5863yM0) obj).c(outputStream);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6039zl0
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        try {
            return (InterfaceC5863yM0) this.f35006a.h().a(inputStream, HL0.a());
        } catch (C3598gM0 e10) {
            throw new C5409ul0("Cannot read proto.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6039zl0
    public final /* synthetic */ Object zzc() {
        return this.f35006a;
    }
}
