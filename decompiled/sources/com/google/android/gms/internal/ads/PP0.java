package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PP0 extends NP0 implements InterfaceC4073k9 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22102i;

    protected PP0(String str) {
        super("mvhd");
    }

    public final int e() {
        if (!this.f21245b) {
            d();
        }
        return this.f22102i;
    }

    protected final long f(ByteBuffer byteBuffer) {
        this.f22102i = AbstractC3947j9.c(byteBuffer.get());
        AbstractC3947j9.b(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
