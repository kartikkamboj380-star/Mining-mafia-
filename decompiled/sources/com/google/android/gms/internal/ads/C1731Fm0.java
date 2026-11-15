package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1731Fm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MessageDigest f18835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5043rr0 f18836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f18837c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18838d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SecureRandom f18839e;

    public C1731Fm0(C5043rr0 c5043rr0) {
        this.f18836b = c5043rr0;
    }

    public final void a() {
        if (c()) {
            return;
        }
        b(new SecureRandom());
    }

    final synchronized void b(SecureRandom secureRandom) {
        C4792pr0 c4792pr0A = this.f18836b.a(202);
        try {
            try {
                try {
                    c4792pr0A.a();
                    this.f18839e = secureRandom;
                    this.f18835a = MessageDigest.getInstance("MD5");
                    this.f18838d = true;
                } catch (Throwable th) {
                    c4792pr0A.b(th);
                    throw th;
                }
            } catch (NoSuchAlgorithmException e10) {
                c4792pr0A.b(e10);
            }
            c4792pr0A.c();
        } catch (Throwable th2) {
            c4792pr0A.c();
            throw th2;
        }
    }

    public final synchronized boolean c() {
        return this.f18838d;
    }

    final byte[] d(byte[] bArr, String str, boolean z9) {
        int length = bArr.length;
        int i10 = true != z9 ? 255 : 239;
        AbstractC2418Ss0.a(length <= i10);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i10 + 1).put((byte) length);
        if (length < i10) {
            int i11 = i10 - length;
            byte[] bArr2 = new byte[i11];
            this.f18839e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i11);
            System.arraycopy(bArr2, 0, bArr, length, i11);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z9) {
            bArrArray = ByteBuffer.allocate(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER).put(e(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        InterfaceC1887Im0[] interfaceC1887Im0Arr = new C2562Vm0().f24404K2;
        int length2 = interfaceC1887Im0Arr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            interfaceC1887Im0Arr[i12].a(bArrArray, bArr3);
        }
        if (!AbstractC4040jt0.c(str)) {
            new C1835Hm0(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).a(bArr3);
        }
        return bArr3;
    }

    public final byte[] e(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.f18837c) {
            this.f18835a.reset();
            this.f18835a.update(bArr);
            bArrDigest = this.f18835a.digest();
        }
        return bArrDigest;
    }

    public final C1500Bb f(byte[] bArr, String str) {
        C1500Bb c1500BbD0 = C1552Cb.d0();
        byte[] bArrE = e(bArr);
        AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
        c1500BbD0.B(AbstractC5231tL0.w(bArrE, 0, bArrE.length));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            int length = bArr.length;
            if (i10 >= ((length - 1) / 255) + 1) {
                break;
            }
            int i11 = i10 * 255;
            int i12 = i11 + 255;
            if (length > i12) {
                length = i12;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i11, length));
            i10++;
        }
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            c1500BbD0.A(AbstractC5231tL0.w(d((byte[]) obj, str, false), 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER));
        }
        return c1500BbD0;
    }

    public final String g(int i10, String str) {
        C1966Ka c1966KaG1 = C4255lb.g1();
        c1966KaG1.A0(i10);
        return Base64.encodeToString(d(((C4255lb) c1966KaG1.w()).i(), str, true), 11);
    }
}
