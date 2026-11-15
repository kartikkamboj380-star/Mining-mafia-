package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2529Uw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC5931yu0 f24131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f24132b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f24133c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24134d;

    public C2529Uw(AbstractC5931yu0 abstractC5931yu0) {
        this.f24131a = abstractC5931yu0;
        C5558vx c5558vx = C5558vx.f34193e;
        this.f24134d = false;
    }

    private final void i(ByteBuffer byteBuffer) {
        boolean z9;
        do {
            z9 = false;
            for (int i10 = 0; i10 <= j(); i10++) {
                if (!this.f24133c[i10].hasRemaining()) {
                    List list = this.f24132b;
                    InterfaceC3046bz interfaceC3046bz = (InterfaceC3046bz) list.get(i10);
                    if (!interfaceC3046bz.zzg()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f24133c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC3046bz.f26964a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC3046bz.c(byteBuffer2);
                        this.f24133c[i10] = interfaceC3046bz.b();
                        boolean z10 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.f24133c[i10].hasRemaining()) {
                            z10 = false;
                        }
                        z9 |= z10;
                    } else if (!this.f24133c[i10].hasRemaining() && i10 < j()) {
                        ((InterfaceC3046bz) list.get(i10 + 1)).zze();
                    }
                }
            }
        } while (z9);
    }

    private final int j() {
        return this.f24133c.length - 1;
    }

    public final C5558vx a(C5558vx c5558vx) throws C1494Ay {
        C5558vx c5558vx2 = C5558vx.f34193e;
        if (c5558vx.equals(c5558vx2)) {
            throw new C1494Ay("Unhandled input format:", c5558vx);
        }
        int i10 = 0;
        while (true) {
            AbstractC5931yu0 abstractC5931yu0 = this.f24131a;
            if (i10 >= abstractC5931yu0.size()) {
                return c5558vx;
            }
            InterfaceC3046bz interfaceC3046bz = (InterfaceC3046bz) abstractC5931yu0.get(i10);
            C5558vx c5558vxF = interfaceC3046bz.f(c5558vx);
            if (interfaceC3046bz.zzc()) {
                AbstractC2418Ss0.i(!c5558vxF.equals(c5558vx2));
                c5558vx = c5558vxF;
            }
            i10++;
        }
    }

    public final void b(C2739Yx c2739Yx) {
        List list = this.f24132b;
        list.clear();
        this.f24134d = false;
        long jA = c2739Yx.f25792a;
        int i10 = 0;
        while (true) {
            AbstractC5931yu0 abstractC5931yu0 = this.f24131a;
            if (i10 >= abstractC5931yu0.size()) {
                break;
            }
            InterfaceC3046bz interfaceC3046bz = (InterfaceC3046bz) abstractC5931yu0.get(i10);
            interfaceC3046bz.e(new C2739Yx(jA));
            if (interfaceC3046bz.zzc()) {
                jA = interfaceC3046bz.a(jA);
                AbstractC2418Ss0.i(jA >= 0);
                list.add(interfaceC3046bz);
            }
            i10++;
        }
        this.f24133c = new ByteBuffer[list.size()];
        for (int i11 = 0; i11 <= j(); i11++) {
            this.f24133c[i11] = ((InterfaceC3046bz) list.get(i11)).b();
        }
    }

    public final boolean c() {
        return !this.f24132b.isEmpty();
    }

    public final void d(ByteBuffer byteBuffer) {
        if (!c() || this.f24134d) {
            return;
        }
        i(byteBuffer);
    }

    public final ByteBuffer e() {
        if (!c()) {
            return InterfaceC3046bz.f26964a;
        }
        ByteBuffer byteBuffer = this.f24133c[j()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        i(InterfaceC3046bz.f26964a);
        return this.f24133c[j()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2529Uw)) {
            return false;
        }
        AbstractC5931yu0 abstractC5931yu0 = this.f24131a;
        int size = abstractC5931yu0.size();
        AbstractC5931yu0 abstractC5931yu1 = ((C2529Uw) obj).f24131a;
        if (size != abstractC5931yu1.size()) {
            return false;
        }
        for (int i10 = 0; i10 < abstractC5931yu0.size(); i10++) {
            if (abstractC5931yu0.get(i10) != abstractC5931yu1.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        if (!c() || this.f24134d) {
            return;
        }
        this.f24134d = true;
        ((InterfaceC3046bz) this.f24132b.get(0)).zze();
    }

    public final boolean g() {
        return this.f24134d && ((InterfaceC3046bz) this.f24132b.get(j())).zzg() && !this.f24133c[j()].hasRemaining();
    }

    public final void h() {
        int i10 = 0;
        while (true) {
            AbstractC5931yu0 abstractC5931yu0 = this.f24131a;
            if (i10 >= abstractC5931yu0.size()) {
                this.f24133c = new ByteBuffer[0];
                C5558vx c5558vx = C5558vx.f34193e;
                this.f24134d = false;
                return;
            } else {
                InterfaceC3046bz interfaceC3046bz = (InterfaceC3046bz) abstractC5931yu0.get(i10);
                interfaceC3046bz.e(C2739Yx.f25791b);
                interfaceC3046bz.d();
                i10++;
            }
        }
    }

    public final int hashCode() {
        return this.f24131a.hashCode();
    }
}
