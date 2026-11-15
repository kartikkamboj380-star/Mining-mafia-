package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NP0 implements InterfaceC4073k9 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final YP0 f21243h = YP0.b(NP0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f21244a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer f21247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f21248e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    SP0 f21250g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f21249f = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f21246c = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f21245b = true;

    protected NP0(String str) {
        this.f21244a = str;
    }

    private final synchronized void b() {
        try {
            if (this.f21246c) {
                return;
            }
            try {
                YP0 yp0 = f21243h;
                String str = this.f21244a;
                yp0.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.f21247d = this.f21250g.d(this.f21248e, this.f21249f);
                this.f21246c = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073k9
    public final void a(SP0 sp0, ByteBuffer byteBuffer, long j10, InterfaceC3697h9 interfaceC3697h9) {
        this.f21248e = sp0.zzc();
        byteBuffer.remaining();
        this.f21249f = j10;
        this.f21250g = sp0;
        sp0.f(sp0.zzc() + j10);
        this.f21246c = false;
        this.f21245b = false;
        d();
    }

    protected abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            YP0 yp0 = f21243h;
            String str = this.f21244a;
            yp0.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f21247d;
            if (byteBuffer != null) {
                this.f21245b = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f21247d = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073k9
    public final String zza() {
        return this.f21244a;
    }
}
