package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class C9 implements InterfaceC5962z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17811a = (((((~1539942439) & 2070175971) | 1100945533) + ((1539942439 & (-1166483302)) | (-2145608135))) - 96382817) ^ (1143565421 % 981914693);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f17812b = new byte[(((((~991039875) & 475472926) | 1225689584) + ((991039875 & 357672014) | 1805818736)) - (-1256743880)) ^ (1671581032 % 1337434154)];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E9 f17813c;

    public C9(E9 e10) {
        this.f17813c = e10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5962z9
    public final byte a(M9 m10, int i10) {
        int i11 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i12 = 1761855727 % 1384724137;
        int i13 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i14 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i15 = 1694830070 % 1383960411;
        int i16 = i10 >>> i13;
        if (i16 != this.f17811a) {
            this.f17813c.a(i16, this.f17812b);
            this.f17811a = i16;
        }
        int i17 = i14 ^ i15;
        return (byte) (((m10.b(i10) ^ this.f17812b[i10 % (i11 ^ i12)]) << i17) >> i17);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5962z9
    public final M9 b(M9 m10, int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > m10.f20778a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i11 - i10];
        int i12 = 0;
        while (i10 < i11) {
            bArr[i12] = a(m10, i10);
            i10++;
            i12++;
        }
        return M9.e(bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5962z9
    public final /* bridge */ /* synthetic */ InterfaceC5962z9 zzc() {
        return new C9(this.f17813c);
    }
}
