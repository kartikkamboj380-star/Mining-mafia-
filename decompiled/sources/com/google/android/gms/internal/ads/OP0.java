package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OP0 extends RP0 implements InterfaceC4073k9 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final String f21547h = "moov";

    public OP0(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073k9
    public final void a(SP0 sp0, ByteBuffer byteBuffer, long j10, InterfaceC3697h9 interfaceC3697h9) {
        sp0.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f22801b = sp0;
        this.f22803d = sp0.zzc();
        sp0.f(sp0.zzc() + j10);
        this.f22804e = sp0.zzc();
        this.f22800a = interfaceC3697h9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073k9
    public final String zza() {
        return this.f21547h;
    }
}
