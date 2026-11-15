package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3093cL0 implements InterfaceC5863yM0 {
    protected transient int zzq = 0;

    protected static void n(Iterable iterable, List list) {
        AbstractC2968bL0.m(iterable, list);
    }

    private String o(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + String.valueOf(str).length() + 44);
        sb.append("Serializing ");
        sb.append(name);
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public AbstractC5231tL0 a() {
        try {
            int iE = e();
            AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
            byte[] bArr = new byte[iE];
            int i10 = CL0.f17856c;
            C5987zL0 c5987zL0 = new C5987zL0(bArr, 0, iE);
            d(c5987zL0);
            return AbstractC4728pL0.a(c5987zL0, bArr);
        } catch (IOException e10) {
            throw new RuntimeException(o("ByteString"), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5863yM0
    public void c(OutputStream outputStream) {
        BL0 bl0 = new BL0(outputStream, CL0.B(e()));
        d(bl0);
        bl0.A();
    }

    public byte[] i() {
        try {
            int iE = e();
            byte[] bArr = new byte[iE];
            int i10 = CL0.f17856c;
            C5987zL0 c5987zL0 = new C5987zL0(bArr, 0, iE);
            d(c5987zL0);
            c5987zL0.e();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(o("byte array"), e10);
        }
    }

    abstract int j();

    abstract void k(int i10);

    abstract int l(PM0 pm0);

    ZM0 m() {
        return new ZM0(this);
    }
}
