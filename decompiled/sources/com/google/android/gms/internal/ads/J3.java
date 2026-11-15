package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class J3 extends E3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5931yu0 f19736c;

    public J3(String str, String str2, List list) {
        super(str);
        AbstractC2418Ss0.a(!list.isEmpty());
        this.f19735b = str2;
        AbstractC5931yu0 abstractC5931yu0U = AbstractC5931yu0.u(list);
        this.f19736c = abstractC5931yu0U;
    }

    private static List b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326u6
    public final void a(C5072s5 c5072s5) {
        byte b10;
        switch (this.f18363a) {
            case "TAL":
                b10 = 6;
                break;
            case "TCM":
                b10 = 16;
                break;
            case "TDA":
                b10 = 12;
                break;
            case "TP1":
                b10 = 2;
                break;
            case "TP2":
                b10 = 4;
                break;
            case "TP3":
                b10 = 18;
                break;
            case "TRK":
                b10 = 8;
                break;
            case "TT2":
                b10 = 0;
                break;
            case "TXT":
                b10 = 20;
                break;
            case "TYE":
                b10 = 10;
                break;
            case "TALB":
                b10 = 7;
                break;
            case "TCOM":
                b10 = 17;
                break;
            case "TCON":
                b10 = 22;
                break;
            case "TDAT":
                b10 = 13;
                break;
            case "TDRC":
                b10 = 14;
                break;
            case "TDRL":
                b10 = 15;
                break;
            case "TEXT":
                b10 = 21;
                break;
            case "TIT2":
                b10 = 1;
                break;
            case "TPE1":
                b10 = 3;
                break;
            case "TPE2":
                b10 = 5;
                break;
            case "TPE3":
                b10 = 19;
                break;
            case "TRCK":
                b10 = 9;
                break;
            case "TYER":
                b10 = 11;
                break;
            default:
                b10 = -1;
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 1:
                    c5072s5.x((CharSequence) this.f19736c.get(0));
                    break;
                case 2:
                case 3:
                    c5072s5.y((CharSequence) this.f19736c.get(0));
                    break;
                case 4:
                case 5:
                    c5072s5.A((CharSequence) this.f19736c.get(0));
                    break;
                case 6:
                case 7:
                    c5072s5.z((CharSequence) this.f19736c.get(0));
                    break;
                case 8:
                case 9:
                    String str = (String) this.f19736c.get(0);
                    String str2 = AbstractC4634ob0.f32117a;
                    String[] strArrSplit = str.split("/", -1);
                    int i10 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    c5072s5.D(Integer.valueOf(i10));
                    c5072s5.E(numValueOf);
                    break;
                case 10:
                case 11:
                    c5072s5.F(Integer.valueOf(Integer.parseInt((String) this.f19736c.get(0))));
                    break;
                case 12:
                case 13:
                    String str3 = (String) this.f19736c.get(0);
                    int i11 = Integer.parseInt(str3.substring(2, 4));
                    int i12 = Integer.parseInt(str3.substring(0, 2));
                    c5072s5.G(Integer.valueOf(i11));
                    c5072s5.H(Integer.valueOf(i12));
                    break;
                case 14:
                    List listB = b((String) this.f19736c.get(0));
                    int size = listB.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c5072s5.H((Integer) listB.get(2));
                            }
                        }
                        c5072s5.G((Integer) listB.get(1));
                    }
                    c5072s5.F((Integer) listB.get(0));
                    break;
                case 15:
                    List listB2 = b((String) this.f19736c.get(0));
                    int size2 = listB2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c5072s5.K((Integer) listB2.get(2));
                            }
                        }
                        c5072s5.J((Integer) listB2.get(1));
                    }
                    c5072s5.I((Integer) listB2.get(0));
                    break;
                case 16:
                case 17:
                    c5072s5.M((CharSequence) this.f19736c.get(0));
                    break;
                case 18:
                case 19:
                    c5072s5.N((CharSequence) this.f19736c.get(0));
                    break;
                case 20:
                case 21:
                    c5072s5.L((CharSequence) this.f19736c.get(0));
                    break;
                case 22:
                    AbstractC5931yu0 abstractC5931yu0 = this.f19736c;
                    Integer numH = AbstractC5305tw0.h((String) abstractC5931yu0.get(0), 10);
                    if (numH != null) {
                        String strA = F3.a(numH.intValue());
                        if (strA != null) {
                            c5072s5.Q(strA);
                        }
                    } else {
                        c5072s5.Q((CharSequence) abstractC5931yu0.get(0));
                    }
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J3.class == obj.getClass()) {
            J3 j10 = (J3) obj;
            if (Objects.equals(this.f18363a, j10.f18363a) && Objects.equals(this.f19735b, j10.f19735b) && this.f19736c.equals(j10.f19736c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f18363a.hashCode() + 527;
        String str = this.f19735b;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f19736c.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.E3
    public final String toString() {
        String strValueOf = String.valueOf(this.f19736c);
        String str = this.f18363a;
        int length = String.valueOf(str).length();
        String str2 = this.f19735b;
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + strValueOf.length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": values=");
        sb.append(strValueOf);
        return sb.toString();
    }
}
