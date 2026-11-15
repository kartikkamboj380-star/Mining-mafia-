package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1600Cz implements InterfaceC3046bz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected C5558vx f18020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected C5558vx f18021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C5558vx f18022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C5558vx f18023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f18024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f18025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18026h;

    public AbstractC1600Cz() {
        ByteBuffer byteBuffer = InterfaceC3046bz.f26964a;
        this.f18024f = byteBuffer;
        this.f18025g = byteBuffer;
        C5558vx c5558vx = C5558vx.f34193e;
        this.f18022d = c5558vx;
        this.f18023e = c5558vx;
        this.f18020b = c5558vx;
        this.f18021c = c5558vx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f18025g;
        this.f18025g = InterfaceC3046bz.f26964a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final void d() {
        ByteBuffer byteBuffer = InterfaceC3046bz.f26964a;
        this.f18025g = byteBuffer;
        this.f18026h = false;
        this.f18024f = byteBuffer;
        C5558vx c5558vx = C5558vx.f34193e;
        this.f18022d = c5558vx;
        this.f18023e = c5558vx;
        this.f18020b = c5558vx;
        this.f18021c = c5558vx;
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final void e(C2739Yx c2739Yx) {
        this.f18025g = InterfaceC3046bz.f26964a;
        this.f18026h = false;
        this.f18020b = this.f18022d;
        this.f18021c = this.f18023e;
        k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final C5558vx f(C5558vx c5558vx) {
        this.f18022d = c5558vx;
        this.f18023e = i(c5558vx);
        return zzc() ? this.f18023e : C5558vx.f34193e;
    }

    protected final ByteBuffer g(int i10) {
        if (this.f18024f.capacity() < i10) {
            this.f18024f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f18024f.clear();
        }
        ByteBuffer byteBuffer = this.f18024f;
        this.f18025g = byteBuffer;
        return byteBuffer;
    }

    protected final boolean h() {
        return this.f18025g.hasRemaining();
    }

    protected abstract C5558vx i(C5558vx c5558vx);

    protected void j() {
    }

    protected void k() {
    }

    protected void l() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public boolean zzc() {
        return this.f18023e != C5558vx.f34193e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final void zze() {
        this.f18026h = true;
        j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public boolean zzg() {
        return this.f18026h && this.f18025g == InterfaceC3046bz.f26964a;
    }
}
