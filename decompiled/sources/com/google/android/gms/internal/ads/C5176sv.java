package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5176sv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f33266a;

    public final long a(ByteBuffer byteBuffer) {
        C4451n9 c4451n9;
        C4325m9 c4325m9;
        long j10 = this.f33266a;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new C3823i9(new C4169kv(byteBufferDuplicate), C5680wv.f34671c).c().iterator();
            while (true) {
                c4451n9 = null;
                if (!it.hasNext()) {
                    c4325m9 = null;
                    break;
                }
                InterfaceC4073k9 interfaceC4073k9 = (InterfaceC4073k9) it.next();
                if (interfaceC4073k9 instanceof C4325m9) {
                    c4325m9 = (C4325m9) interfaceC4073k9;
                    break;
                }
            }
            for (InterfaceC4073k9 interfaceC4073k10 : c4325m9.c()) {
                if (interfaceC4073k10 instanceof C4451n9) {
                    c4451n9 = (C4451n9) interfaceC4073k10;
                    break;
                }
            }
            long jH = (c4451n9.h() * 1000) / c4451n9.g();
            this.f33266a = jH;
            return jH;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
