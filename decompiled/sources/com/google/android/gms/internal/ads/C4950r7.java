package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4950r7 implements InterfaceC3943j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4436n10 f32788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f32789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseIntArray f32790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5202t7 f32792e;

    public C4950r7(C5202t7 c5202t7, int i10) {
        Objects.requireNonNull(c5202t7);
        this.f32792e = c5202t7;
        this.f32788a = new C4436n10(new byte[5], 5);
        this.f32789b = new SparseArray();
        this.f32790c = new SparseIntArray();
        this.f32791d = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3943j7
    public final void a(L90 l90, L1 l10, C5706x7 c5706x7) {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:32:0x0102  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3943j7
    public final void b(P10 p10) {
        int i10;
        if (p10.R() != 2) {
            return;
        }
        C5202t7 c5202t7 = this.f32792e;
        L90 l90 = (L90) c5202t7.a().get(0);
        if ((p10.R() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            p10.J(1);
            int iS = p10.S();
            int i11 = 3;
            p10.J(3);
            C4436n10 c4436n10 = this.f32788a;
            p10.K(c4436n10, 2);
            c4436n10.h(3);
            int i12 = 13;
            c5202t7.o(c4436n10.j(13));
            p10.K(c4436n10, 2);
            int i13 = 4;
            c4436n10.h(4);
            int i14 = 12;
            p10.J(c4436n10.j(12));
            SparseArray sparseArray = this.f32789b;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.f32790c;
            sparseIntArray.clear();
            int iC = p10.C();
            while (iC > 0) {
                int i15 = 5;
                p10.K(c4436n10, 5);
                int iJ = c4436n10.j(8);
                c4436n10.h(i11);
                int iJ2 = c4436n10.j(i12);
                c4436n10.h(i13);
                int iJ3 = c4436n10.j(i14);
                int iF = p10.F();
                int i16 = iF + iJ3;
                String str = null;
                ArrayList arrayList = null;
                int i17 = -1;
                int iR = 0;
                while (p10.F() < i16) {
                    int iR2 = p10.R();
                    int iF2 = p10.F() + p10.R();
                    if (iF2 > i16) {
                        break;
                    }
                    if (iR2 == i15) {
                        long jY = p10.Y();
                        if (jY == 1094921523) {
                            c5202t7 = c5202t7;
                            i17 = 129;
                        } else if (jY == 1161904947) {
                            c5202t7 = c5202t7;
                            c4436n10 = c4436n10;
                            iC = iC;
                            i17 = 135;
                            iF2 = iF2;
                        } else if (jY == 1094921524) {
                            c5202t7 = c5202t7;
                            i17 = 172;
                        } else if (jY == 1212503619) {
                            i10 = 36;
                            i17 = i10;
                        }
                    } else if (iR2 == 106) {
                        c5202t7 = c5202t7;
                        i17 = 129;
                    } else if (iR2 == 122) {
                        c5202t7 = c5202t7;
                        c4436n10 = c4436n10;
                        iC = iC;
                        i17 = 135;
                        iF2 = iF2;
                    } else {
                        if (iR2 == 127) {
                            int iR3 = p10.R();
                            if (iR3 == 21) {
                                c5202t7 = c5202t7;
                                i17 = 172;
                            } else if (iR3 == 14) {
                                i10 = 136;
                            } else if (iR3 == 33) {
                                i10 = 139;
                            }
                        } else if (iR2 == 123) {
                            i10 = 138;
                        } else if (iR2 == 10) {
                            String strTrim = p10.k(3, StandardCharsets.UTF_8).trim();
                            iR = p10.R();
                            str = strTrim;
                        } else if (iR2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (p10.F() < iF2) {
                                int i18 = iF2;
                                String strTrim2 = p10.k(3, StandardCharsets.UTF_8).trim();
                                int iR4 = p10.R();
                                int i19 = iC;
                                byte[] bArr = new byte[4];
                                p10.L(bArr, 0, 4);
                                arrayList2.add(new C5328u7(strTrim2, iR4, bArr));
                                iC = i19;
                                iF2 = i18;
                                c4436n10 = c4436n10;
                                c5202t7 = c5202t7;
                            }
                            c5202t7 = c5202t7;
                            iF2 = iF2;
                            c4436n10 = c4436n10;
                            iC = iC;
                            arrayList = arrayList2;
                            i17 = 89;
                        } else {
                            c5202t7 = c5202t7;
                            iF2 = iF2;
                            c4436n10 = c4436n10;
                            iC = iC;
                            if (iR2 == 111) {
                                i17 = 257;
                            }
                        }
                        i17 = i10;
                    }
                    p10.J(iF2 - p10.F());
                    iC = iC;
                    c4436n10 = c4436n10;
                    c5202t7 = c5202t7;
                    i15 = 5;
                }
                C5202t7 c5202t8 = c5202t7;
                C4436n10 c4436n11 = c4436n10;
                int i20 = iC;
                p10.G(i16);
                C5454v7 c5454v7 = new C5454v7(i17, str, iR, arrayList, Arrays.copyOfRange(p10.H(), iF, i16));
                if (iJ == 6 || iJ == 5) {
                    iJ = c5454v7.f33992a;
                }
                iC = i20 - (iJ3 + 5);
                if (!c5202t8.i().get(iJ2)) {
                    InterfaceC5832y7 interfaceC5832y7A = c5202t8.c().a(iJ, c5454v7);
                    sparseIntArray.put(iJ2, iJ2);
                    sparseArray.put(iJ2, interfaceC5832y7A);
                }
                i13 = 4;
                c4436n10 = c4436n11;
                c5202t7 = c5202t8;
                i11 = 3;
                i12 = 13;
                i14 = 12;
            }
            C5202t7 c5202t9 = c5202t7;
            int size = sparseIntArray.size();
            for (int i21 = 0; i21 < size; i21++) {
                int iKeyAt = sparseIntArray.keyAt(i21);
                int iValueAt = sparseIntArray.valueAt(i21);
                c5202t9.i().put(iKeyAt, true);
                c5202t9.j().put(iValueAt, true);
                InterfaceC5832y7 interfaceC5832y7 = (InterfaceC5832y7) sparseArray.valueAt(i21);
                if (interfaceC5832y7 != null) {
                    interfaceC5832y7.a(l90, c5202t9.k(), new C5706x7(iS, iKeyAt, 8192));
                    c5202t9.h().put(iValueAt, interfaceC5832y7);
                }
            }
            c5202t9.h().remove(this.f32791d);
            c5202t9.m(0);
            if (c5202t9.l() == 0) {
                c5202t9.k().q();
                c5202t9.n(true);
            }
        }
    }
}
