package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5068s3 implements InterfaceC5326u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33075b;

    public AbstractC5068s3(String str, String str2) {
        this.f33074a = AbstractC1483As0.b(str);
        this.f33075b = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5326u6
    public final void a(C5072s5 c5072s5) {
        switch (this.f33074a) {
            case "TITLE":
                c5072s5.x(this.f33075b);
                break;
            case "ARTIST":
                c5072s5.y(this.f33075b);
                break;
            case "ALBUM":
                c5072s5.z(this.f33075b);
                break;
            case "ALBUMARTIST":
                c5072s5.A(this.f33075b);
                break;
            case "TRACKNUMBER":
                Integer numH = AbstractC5305tw0.h(this.f33075b, 10);
                if (numH != null) {
                    c5072s5.D(numH);
                    break;
                }
                break;
            case "TOTALTRACKS":
                Integer numH2 = AbstractC5305tw0.h(this.f33075b, 10);
                if (numH2 != null) {
                    c5072s5.E(numH2);
                    break;
                }
                break;
            case "DISCNUMBER":
                Integer numH3 = AbstractC5305tw0.h(this.f33075b, 10);
                if (numH3 != null) {
                    c5072s5.O(numH3);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numH4 = AbstractC5305tw0.h(this.f33075b, 10);
                if (numH4 != null) {
                    c5072s5.P(numH4);
                    break;
                }
                break;
            case "GENRE":
                c5072s5.Q(this.f33075b);
                break;
            case "DESCRIPTION":
                c5072s5.B(this.f33075b);
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC5068s3 abstractC5068s3 = (AbstractC5068s3) obj;
            if (this.f33074a.equals(abstractC5068s3.f33074a) && this.f33075b.equals(abstractC5068s3.f33075b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f33074a.hashCode() + 527) * 31) + this.f33075b.hashCode();
    }

    public final String toString() {
        String str = this.f33074a;
        int length = String.valueOf(str).length();
        String str2 = this.f33075b;
        StringBuilder sb = new StringBuilder(length + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }
}
