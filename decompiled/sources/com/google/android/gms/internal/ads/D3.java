package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A3 f18063a = B3.f17465a;

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0112 A[SYNTHETIC] */
    public static final V6 a(byte[] bArr, int i10, A3 a10, C4313m3 c4313m3) {
        boolean z9;
        C3 c10;
        int i11;
        boolean zB;
        int iC;
        E3 e3C;
        ArrayList arrayList = new ArrayList();
        P10 p10 = new P10(bArr, i10);
        boolean z10 = false;
        if (p10.C() < 10) {
            YU.c("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iW = p10.W();
            if (iW == 4801587) {
                int iR = p10.R();
                p10.J(1);
                int iR2 = p10.R();
                int iG = p10.g();
                if (iR != 2) {
                    if (iR == 3) {
                        if ((iR2 & 64) != 0) {
                            int iB = p10.b();
                            p10.J(iB);
                            iG -= iB + 4;
                        }
                    } else if (iR == 4) {
                        if ((iR2 & 64) != 0) {
                            int iG2 = p10.g();
                            p10.J(iG2 - 4);
                            iG -= iG2;
                        }
                        if ((iR2 & 16) != 0) {
                            iG -= 10;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(iR).length() + 46);
                        sb.append("Skipped ID3 tag with unsupported majorVersion=");
                        sb.append(iR);
                        YU.c("Id3Decoder", sb.toString());
                    }
                    if (iR < 4) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    c10 = new C3(iR, z9, iG);
                } else if ((iR2 & 64) != 0) {
                    YU.c("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iR < 4 || (iR2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    c10 = new C3(iR, z9, iG);
                }
                if (c10 == null) {
                    return null;
                }
                int iF = p10.F();
                i11 = c10.a() == 2 ? 6 : 10;
                zB = c10.b();
                iC = c10.c();
                if (zB) {
                    iC = e(p10, c10.c());
                }
                p10.E(iF + iC);
                if (!b(p10, c10.a(), i11, false)) {
                    if (c10.a() == 4 || !b(p10, 4, i11, true)) {
                        int iA = c10.a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iA).length() + 45);
                        sb2.append("Failed to validate ID3 tag with majorVersion=");
                        sb2.append(iA);
                        YU.c("Id3Decoder", sb2.toString());
                        return null;
                    }
                    z10 = true;
                }
                while (p10.C() >= i11) {
                    e3C = c(c10.a(), p10, z10, i11, a10);
                    if (e3C != null) {
                        arrayList.add(e3C);
                    }
                }
                return new V6(arrayList);
            }
            YU.c("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iW))));
        }
        c10 = null;
        if (c10 == null) {
            return null;
        }
        int iF2 = p10.F();
        if (c10.a() == 2) {
        }
        zB = c10.b();
        iC = c10.c();
        if (zB) {
            iC = e(p10, c10.c());
        }
        p10.E(iF2 + iC);
        if (!b(p10, c10.a(), i11, false)) {
            if (c10.a() == 4) {
            }
            int iA2 = c10.a();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iA2).length() + 45);
            sb3.append("Failed to validate ID3 tag with majorVersion=");
            sb3.append(iA2);
            YU.c("Id3Decoder", sb3.toString());
            return null;
        }
        while (p10.C() >= i11) {
            e3C = c(c10.a(), p10, z10, i11, a10);
            if (e3C != null) {
                arrayList.add(e3C);
            }
        }
        return new V6(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    private static boolean b(P10 p10, int i10, int i11, boolean z9) {
        boolean z10;
        int iW;
        long jW;
        int iS;
        int i12;
        int iF = p10.F();
        while (true) {
            try {
                z10 = true;
                z10 = true;
                int i13 = 1;
                int i14 = 1;
                if (p10.C() >= i11) {
                    if (i10 >= 3) {
                        iW = p10.b();
                        jW = p10.Y();
                        iS = p10.S();
                    } else {
                        iW = p10.W();
                        jW = p10.W();
                        iS = 0;
                    }
                    if (iW != 0 || jW != 0 || iS != 0) {
                        if (i10 != 4 || z9) {
                            if (i10 == 4) {
                                if ((iS & 64) != 0) {
                                    i13 = 0;
                                }
                                int i15 = i13;
                                i14 = iS & 1;
                                i12 = i15;
                            } else if (i10 == 3) {
                                if ((iS & 32) != 0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if ((iS & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                                    i14 = 0;
                                }
                            } else {
                                i12 = 0;
                                i14 = 0;
                            }
                            if (i14 != 0) {
                                i12 += 4;
                            }
                            if (jW >= i12 && p10.C() >= jW) {
                                p10.J((int) jW);
                            }
                        } else if ((8421504 & jW) == 0) {
                            long j10 = ((jW >> 16) & 255) << 14;
                            jW = ((jW >> 24) << 21) | j10 | (jW & 255) | (((jW >> 8) & 255) << 7);
                            if (i10 == 4) {
                                if ((iS & 64) != 0) {
                                    i13 = 0;
                                }
                                int i16 = i13;
                                i14 = iS & 1;
                                i12 = i16;
                            } else if (i10 == 3) {
                                if ((iS & 32) != 0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if ((iS & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                                    i14 = 0;
                                }
                            } else {
                                i12 = 0;
                                i14 = 0;
                            }
                            if (i14 != 0) {
                                i12 += 4;
                            }
                            if (jW >= i12) {
                                p10.J((int) jW);
                            }
                        }
                        z10 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (Throwable th) {
                p10.G(iF);
                throw th;
            }
        }
        p10.G(iF);
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0278  */
    /* JADX WARN: Code duplicated, block: B:148:0x027c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0283  */
    /* JADX WARN: Code duplicated, block: B:153:0x0287  */
    /* JADX WARN: Code duplicated, block: B:155:0x028d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x02a7 A[Catch: all -> 0x013e, Exception -> 0x0262, OutOfMemoryError -> 0x0267, TRY_LEAVE, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a7, B:162:0x02ae, B:174:0x02ef, B:170:0x02cf, B:172:0x02e9, B:187:0x032b, B:194:0x036e, B:197:0x03a3, B:200:0x03b4, B:201:0x03bc, B:203:0x03c2, B:205:0x03c9, B:206:0x03cd, B:214:0x03ee, B:218:0x0419, B:220:0x0424, B:221:0x045a, B:222:0x0467, B:224:0x046d, B:226:0x0474, B:227:0x0478, B:231:0x048e, B:239:0x04a1, B:241:0x04cb, B:242:0x04da, B:243:0x04e5), top: B:256:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:164:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02cf A[Catch: all -> 0x013e, Exception -> 0x02c9, OutOfMemoryError -> 0x02cc, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a7, B:162:0x02ae, B:174:0x02ef, B:170:0x02cf, B:172:0x02e9, B:187:0x032b, B:194:0x036e, B:197:0x03a3, B:200:0x03b4, B:201:0x03bc, B:203:0x03c2, B:205:0x03c9, B:206:0x03cd, B:214:0x03ee, B:218:0x0419, B:220:0x0424, B:221:0x045a, B:222:0x0467, B:224:0x046d, B:226:0x0474, B:227:0x0478, B:231:0x048e, B:239:0x04a1, B:241:0x04cb, B:242:0x04da, B:243:0x04e5), top: B:256:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:172:0x02e9 A[Catch: all -> 0x013e, Exception -> 0x02c9, OutOfMemoryError -> 0x02cc, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a7, B:162:0x02ae, B:174:0x02ef, B:170:0x02cf, B:172:0x02e9, B:187:0x032b, B:194:0x036e, B:197:0x03a3, B:200:0x03b4, B:201:0x03bc, B:203:0x03c2, B:205:0x03c9, B:206:0x03cd, B:214:0x03ee, B:218:0x0419, B:220:0x0424, B:221:0x045a, B:222:0x0467, B:224:0x046d, B:226:0x0474, B:227:0x0478, B:231:0x048e, B:239:0x04a1, B:241:0x04cb, B:242:0x04da, B:243:0x04e5), top: B:256:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:173:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:178:0x031b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0362 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x0364  */
    /* JADX WARN: Code duplicated, block: B:208:0x03e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:232:0x0493 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x0495  */
    /* JADX WARN: Code duplicated, block: B:250:0x0506  */
    private static E3 c(int i10, P10 p10, boolean z9, int i11, A3 a10) {
        int iH;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        E3 e10;
        int i14;
        E3 c5446v3;
        E3 h10;
        E3 c5824y3;
        byte[] bArr;
        int i15;
        String strA;
        String strConcat;
        int iR = p10.R();
        int iR2 = p10.R();
        int iR3 = p10.R();
        int iR4 = i10 >= 3 ? p10.R() : 0;
        if (i10 == 4) {
            iH = p10.h();
            if (!z9) {
                iH = ((iH >> 24) << 21) | (iH & 255) | (((iH >> 8) & 255) << 7) | (((iH >> 16) & 255) << 14);
            }
        } else {
            iH = i10 == 3 ? p10.h() : p10.W();
        }
        int iS = i10 >= 3 ? p10.S() : 0;
        if (iR == 0 && iR2 == 0 && iR3 == 0 && iR4 == 0 && iH == 0 && iS == 0) {
            p10.G(p10.D());
            return null;
        }
        int iF = p10.F() + iH;
        String str = "Id3Decoder";
        if (iF > p10.D()) {
            YU.c("Id3Decoder", "Frame size exceeds remaining tag data");
            p10.G(p10.D());
            return null;
        }
        if (a10 != null) {
            p10.G(iF);
            return null;
        }
        if (i10 == 3) {
            int i16 = iS & 64;
            i12 = (iS & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 1 : 0;
            iR = 0;
            z11 = i16 != 0;
            z10 = (iS & 32) != 0;
            i13 = i12;
        } else if (i10 == 4) {
            boolean z12 = (iS & 64) != 0;
            int i17 = (iS & 8) != 0 ? 1 : 0;
            z11 = (iS & 4) != 0;
            iR = (iS & 2) != 0 ? 1 : 0;
            i13 = iS & 1;
            int i18 = i17;
            z10 = z12;
            i12 = i18;
        } else {
            i12 = 0;
            i13 = 0;
            z10 = false;
            z11 = false;
            iR = 0;
        }
        if (i12 != 0 || z11) {
            YU.c("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            p10.G(iF);
            return null;
        }
        if (z10) {
            p10.J(1);
            iH--;
        }
        if (i13 != 0) {
            p10.J(4);
            iH -= 4;
        }
        if (iR != 0) {
            iH = e(p10, iH);
        }
        try {
            try {
                if (iR == 84 && iR2 == 88 && iR3 == 88 && (i10 == 2 || iR4 == 88)) {
                    if (iH <= 0) {
                        iR = iR;
                        str = "Id3Decoder";
                        c5824y3 = null;
                    } else {
                        int iR5 = p10.R();
                        int i19 = iH - 1;
                        byte[] bArr2 = new byte[i19];
                        p10.L(bArr2, 0, i19);
                        int iH2 = h(bArr2, 0, iR5);
                        c5824y3 = new J3("TXXX", new String(bArr2, 0, iH2, f(iR5)), d(bArr2, iR5, iH2 + j(iR5)));
                        str = "Id3Decoder";
                    }
                } else if (iR == 84) {
                    String strG = g(i10, 84, iR2, iR3, iR4);
                    if (iH <= 0) {
                        iR = iR;
                        str = "Id3Decoder";
                        c5824y3 = null;
                    } else {
                        int iR6 = p10.R();
                        int i20 = iH - 1;
                        byte[] bArr3 = new byte[i20];
                        p10.L(bArr3, 0, i20);
                        c5824y3 = new J3(strG, null, d(bArr3, iR6, 0));
                        str = "Id3Decoder";
                    }
                } else {
                    if (iR == 87) {
                        if (iR2 != 88 || iR3 != 88 || (i10 != 2 && iR4 != 88)) {
                            i14 = 87;
                        }
                        if (iH <= 0) {
                            iR = iR;
                            str = "Id3Decoder";
                            c5824y3 = null;
                        } else {
                            int iR7 = p10.R();
                            int i21 = iH - 1;
                            byte[] bArr4 = new byte[i21];
                            p10.L(bArr4, 0, i21);
                            int iH3 = h(bArr4, 0, iR7);
                            String str2 = new String(bArr4, 0, iH3, f(iR7));
                            int iJ = iH3 + j(iR7);
                            c5824y3 = new K3("WXXX", str2, l(bArr4, iJ, i(bArr4, iJ), StandardCharsets.ISO_8859_1));
                            str = "Id3Decoder";
                        }
                    } else {
                        i14 = iR;
                    }
                    if (i14 == 87) {
                        String strG2 = g(i10, 87, iR2, iR3, iR4);
                        byte[] bArr5 = new byte[iH];
                        p10.L(bArr5, 0, iH);
                        c5824y3 = new K3(strG2, null, new String(bArr5, 0, i(bArr5, 0), StandardCharsets.ISO_8859_1));
                    } else {
                        if (i14 == 80) {
                            if (iR2 == 82 && iR3 == 73 && iR4 == 86) {
                                byte[] bArr6 = new byte[iH];
                                p10.L(bArr6, 0, iH);
                                int i22 = i(bArr6, 0);
                                c5824y3 = new I3(new String(bArr6, 0, i22, StandardCharsets.ISO_8859_1), k(bArr6, i22 + 1, iH));
                            } else {
                                i14 = 80;
                            }
                        }
                        try {
                            if (i14 != 71) {
                                try {
                                    if (i10 != 2) {
                                        if (i14 != 65 && iR2 == 80 && iR3 == 73 && iR4 == 67) {
                                            int iR8 = p10.R();
                                            Charset charsetF = f(iR8);
                                            int i23 = iH - 1;
                                            bArr = new byte[i23];
                                            p10.L(bArr, 0, i23);
                                            if (i10 == 2) {
                                                iR = iR;
                                                strConcat = "image/".concat(String.valueOf(AbstractC1483As0.a(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                                if (ClipboardModule.MIMETYPE_JPG.equals(strConcat)) {
                                                    strConcat = ClipboardModule.MIMETYPE_JPEG;
                                                }
                                                i15 = 2;
                                            } else {
                                                iR = iR;
                                                i15 = i(bArr, 0);
                                                strA = AbstractC1483As0.a(new String(bArr, 0, i15, StandardCharsets.ISO_8859_1));
                                                if (strA.indexOf(47) == -1) {
                                                    strConcat = "image/".concat(strA);
                                                } else {
                                                    strConcat = strA;
                                                }
                                            }
                                            int i24 = bArr[i15 + 1] & 255;
                                            int i25 = i15 + 2;
                                            int iH4 = h(bArr, i25, iR8);
                                            c5446v3 = new C5320u3(strConcat, new String(bArr, i25, iH4 - i25, charsetF), i24, k(bArr, iH4 + j(iR8), i23));
                                        } else {
                                            iR = iR;
                                            if (i14 == 67) {
                                                if (i14 != 67) {
                                                    if (i14 != 67) {
                                                        if (i14 != 77) {
                                                        }
                                                        String strG3 = g(i10, i14, iR2, iR3, iR4);
                                                        byte[] bArr7 = new byte[iH];
                                                        p10.L(bArr7, 0, iH);
                                                        c5446v3 = new C5446v3(strG3, bArr7);
                                                    } else {
                                                        if (i14 != 77) {
                                                        }
                                                        String strG4 = g(i10, i14, iR2, iR3, iR4);
                                                        byte[] bArr8 = new byte[iH];
                                                        p10.L(bArr8, 0, iH);
                                                        c5446v3 = new C5446v3(strG4, bArr8);
                                                    }
                                                } else if (i14 != 67) {
                                                    if (i14 != 77) {
                                                    }
                                                    String strG5 = g(i10, i14, iR2, iR3, iR4);
                                                    byte[] bArr9 = new byte[iH];
                                                    p10.L(bArr9, 0, iH);
                                                    c5446v3 = new C5446v3(strG5, bArr9);
                                                } else {
                                                    if (i14 != 77) {
                                                    }
                                                    String strG6 = g(i10, i14, iR2, iR3, iR4);
                                                    byte[] bArr10 = new byte[iH];
                                                    p10.L(bArr10, 0, iH);
                                                    c5446v3 = new C5446v3(strG6, bArr10);
                                                }
                                                c5824y3 = h10;
                                            } else {
                                                if (i14 != 67) {
                                                    if (i14 != 67) {
                                                        if (i14 != 77) {
                                                        }
                                                        String strG7 = g(i10, i14, iR2, iR3, iR4);
                                                        byte[] bArr11 = new byte[iH];
                                                        p10.L(bArr11, 0, iH);
                                                        c5446v3 = new C5446v3(strG7, bArr11);
                                                    } else {
                                                        if (i14 != 77) {
                                                        }
                                                        String strG8 = g(i10, i14, iR2, iR3, iR4);
                                                        byte[] bArr12 = new byte[iH];
                                                        p10.L(bArr12, 0, iH);
                                                        c5446v3 = new C5446v3(strG8, bArr12);
                                                    }
                                                } else if (i14 != 67) {
                                                    if (i14 != 77) {
                                                    }
                                                    String strG9 = g(i10, i14, iR2, iR3, iR4);
                                                    byte[] bArr13 = new byte[iH];
                                                    p10.L(bArr13, 0, iH);
                                                    c5446v3 = new C5446v3(strG9, bArr13);
                                                } else {
                                                    if (i14 != 77) {
                                                    }
                                                    String strG10 = g(i10, i14, iR2, iR3, iR4);
                                                    byte[] bArr14 = new byte[iH];
                                                    p10.L(bArr14, 0, iH);
                                                    c5446v3 = new C5446v3(strG10, bArr14);
                                                }
                                                c5824y3 = h10;
                                            }
                                        }
                                        c5824y3 = c5446v3;
                                    } else if (i14 != 80 && iR2 == 73 && iR3 == 67) {
                                        int iR9 = p10.R();
                                        Charset charsetF2 = f(iR9);
                                        int i26 = iH - 1;
                                        bArr = new byte[i26];
                                        p10.L(bArr, 0, i26);
                                        if (i10 == 2) {
                                            iR = iR;
                                            strConcat = "image/".concat(String.valueOf(AbstractC1483As0.a(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                            if (ClipboardModule.MIMETYPE_JPG.equals(strConcat)) {
                                                strConcat = ClipboardModule.MIMETYPE_JPEG;
                                            }
                                            i15 = 2;
                                        } else {
                                            iR = iR;
                                            i15 = i(bArr, 0);
                                            strA = AbstractC1483As0.a(new String(bArr, 0, i15, StandardCharsets.ISO_8859_1));
                                            if (strA.indexOf(47) == -1) {
                                                strConcat = "image/".concat(strA);
                                            } else {
                                                strConcat = strA;
                                            }
                                        }
                                        int i27 = bArr[i15 + 1] & 255;
                                        int i28 = i15 + 2;
                                        int iH5 = h(bArr, i28, iR9);
                                        c5446v3 = new C5320u3(strConcat, new String(bArr, i28, iH5 - i28, charsetF2), i27, k(bArr, iH5 + j(iR9), i26));
                                        c5824y3 = c5446v3;
                                    } else {
                                        iR = iR;
                                        if (i14 == 67 || iR2 != 79 || iR3 != 77 || (iR4 != 77 && i10 != 2)) {
                                            if (i14 != 67 && iR2 == 72 && iR3 == 65 && iR4 == 80) {
                                                int iF2 = p10.F();
                                                int i29 = i(p10.H(), iF2);
                                                String str3 = new String(p10.H(), iF2, i29 - iF2, StandardCharsets.ISO_8859_1);
                                                p10.G(i29 + 1);
                                                int iB = p10.b();
                                                int iB2 = p10.b();
                                                long jY = p10.Y();
                                                if (jY == 4294967295L) {
                                                    jY = -1;
                                                }
                                                long j10 = jY;
                                                long jY2 = p10.Y();
                                                if (jY2 == 4294967295L) {
                                                    jY2 = -1;
                                                }
                                                long j11 = jY2;
                                                ArrayList arrayList = new ArrayList();
                                                int i30 = iF2 + iH;
                                                while (p10.F() < i30) {
                                                    E3 e3C = c(i10, p10, z9, i11, null);
                                                    if (e3C != null) {
                                                        arrayList.add(e3C);
                                                    }
                                                }
                                                h10 = new C5572w3(str3, iB, iB2, j10, j11, (E3[]) arrayList.toArray(new E3[0]));
                                            } else if (i14 != 67 && iR2 == 84 && iR3 == 79 && iR4 == 67) {
                                                int iF3 = p10.F();
                                                int i31 = i(p10.H(), iF3);
                                                String str4 = new String(p10.H(), iF3, i31 - iF3, StandardCharsets.ISO_8859_1);
                                                p10.G(i31 + 1);
                                                int iR10 = p10.R();
                                                boolean z13 = (iR10 & 2) != 0;
                                                int i32 = iR10 & 1;
                                                int iR11 = p10.R();
                                                String[] strArr = new String[iR11];
                                                int i33 = 0;
                                                while (i33 < iR11) {
                                                    int iF4 = p10.F();
                                                    int i34 = iF3;
                                                    int i35 = i(p10.H(), iF4);
                                                    String[] strArr2 = strArr;
                                                    strArr2[i33] = new String(p10.H(), iF4, i35 - iF4, StandardCharsets.ISO_8859_1);
                                                    p10.G(i35 + 1);
                                                    i33++;
                                                    iF3 = i34;
                                                    iR11 = iR11;
                                                    str4 = str4;
                                                    strArr = strArr2;
                                                }
                                                int i36 = iF3;
                                                String str5 = str4;
                                                String[] strArr3 = strArr;
                                                ArrayList arrayList2 = new ArrayList();
                                                int i37 = i36 + iH;
                                                while (p10.F() < i37) {
                                                    E3 e3C2 = c(i10, p10, z9, i11, null);
                                                    if (e3C2 != null) {
                                                        arrayList2.add(e3C2);
                                                    }
                                                }
                                                h10 = new C5698x3(str5, z13, 1 == i32, strArr3, (E3[]) arrayList2.toArray(new E3[0]));
                                            } else if (i14 != 77 && iR2 == 76 && iR3 == 76 && iR4 == 84) {
                                                int iS2 = p10.S();
                                                int iW = p10.W();
                                                int iW2 = p10.W();
                                                int iR12 = p10.R();
                                                int iR13 = p10.R();
                                                C4436n10 c4436n10 = new C4436n10();
                                                c4436n10.a(p10);
                                                int i38 = ((iH - 10) * 8) / (iR12 + iR13);
                                                int[] iArr = new int[i38];
                                                int[] iArr2 = new int[i38];
                                                for (int i39 = 0; i39 < i38; i39++) {
                                                    int iJ2 = c4436n10.j(iR12);
                                                    int iJ3 = c4436n10.j(iR13);
                                                    iArr[i39] = iJ2;
                                                    iArr2[i39] = iJ3;
                                                }
                                                h10 = new H3(iS2, iW, iW2, iArr, iArr2);
                                            } else {
                                                String strG11 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr15 = new byte[iH];
                                                p10.L(bArr15, 0, iH);
                                                c5446v3 = new C5446v3(strG11, bArr15);
                                                c5824y3 = c5446v3;
                                            }
                                            c5824y3 = h10;
                                        } else if (iH < 4) {
                                            c5824y3 = null;
                                        } else {
                                            int iR14 = p10.R();
                                            Charset charsetF3 = f(iR14);
                                            byte[] bArr16 = new byte[3];
                                            p10.L(bArr16, 0, 3);
                                            String str6 = new String(bArr16, 0, 3);
                                            int i40 = iH - 4;
                                            byte[] bArr17 = new byte[i40];
                                            p10.L(bArr17, 0, i40);
                                            int iH6 = h(bArr17, 0, iR14);
                                            String str7 = new String(bArr17, 0, iH6, charsetF3);
                                            int iJ4 = iH6 + j(iR14);
                                            c5824y3 = new C5824y3(str6, str7, l(bArr17, iJ4, h(bArr17, iJ4, iR14), charsetF3));
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    p10.G(iF);
                                    e10 = null;
                                } catch (OutOfMemoryError e12) {
                                    e = e12;
                                    p10.G(iF);
                                    e10 = null;
                                }
                                if (e10 == null) {
                                    String strG12 = g(i10, iR, iR2, iR3, iR4);
                                    StringBuilder sb = new StringBuilder(String.valueOf(strG12).length() + 39 + String.valueOf(iH).length());
                                    sb.append("Failed to decode frame: id=");
                                    sb.append(strG12);
                                    sb.append(", frameSize=");
                                    sb.append(iH);
                                    YU.d(str, sb.toString(), e);
                                }
                                return e10;
                            }
                            if (iR2 != 69 || iR3 != 79) {
                                i14 = 71;
                                if (i10 != 2) {
                                    if (i14 != 80) {
                                    }
                                    iR = iR;
                                    if (i14 == 67) {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strG13 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr18 = new byte[iH];
                                                p10.L(bArr18, 0, iH);
                                                c5446v3 = new C5446v3(strG13, bArr18);
                                                c5824y3 = c5446v3;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strG14 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr19 = new byte[iH];
                                                p10.L(bArr19, 0, iH);
                                                c5446v3 = new C5446v3(strG14, bArr19);
                                                c5824y3 = c5446v3;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strG15 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr110 = new byte[iH];
                                            p10.L(bArr110, 0, iH);
                                            c5446v3 = new C5446v3(strG15, bArr110);
                                            c5824y3 = c5446v3;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strG16 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr111 = new byte[iH];
                                            p10.L(bArr111, 0, iH);
                                            c5446v3 = new C5446v3(strG16, bArr111);
                                            c5824y3 = c5446v3;
                                        }
                                        c5824y3 = h10;
                                    } else {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strG17 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr112 = new byte[iH];
                                                p10.L(bArr112, 0, iH);
                                                c5446v3 = new C5446v3(strG17, bArr112);
                                                c5824y3 = c5446v3;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strG18 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr113 = new byte[iH];
                                                p10.L(bArr113, 0, iH);
                                                c5446v3 = new C5446v3(strG18, bArr113);
                                                c5824y3 = c5446v3;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strG19 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr114 = new byte[iH];
                                            p10.L(bArr114, 0, iH);
                                            c5446v3 = new C5446v3(strG19, bArr114);
                                            c5824y3 = c5446v3;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strG110 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr115 = new byte[iH];
                                            p10.L(bArr115, 0, iH);
                                            c5446v3 = new C5446v3(strG110, bArr115);
                                            c5824y3 = c5446v3;
                                        }
                                        c5824y3 = h10;
                                    }
                                } else {
                                    if (i14 != 65) {
                                    }
                                    iR = iR;
                                    if (i14 == 67) {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strG111 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr116 = new byte[iH];
                                                p10.L(bArr116, 0, iH);
                                                c5446v3 = new C5446v3(strG111, bArr116);
                                                c5824y3 = c5446v3;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strG112 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr117 = new byte[iH];
                                                p10.L(bArr117, 0, iH);
                                                c5446v3 = new C5446v3(strG112, bArr117);
                                                c5824y3 = c5446v3;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strG113 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr118 = new byte[iH];
                                            p10.L(bArr118, 0, iH);
                                            c5446v3 = new C5446v3(strG113, bArr118);
                                            c5824y3 = c5446v3;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strG114 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr119 = new byte[iH];
                                            p10.L(bArr119, 0, iH);
                                            c5446v3 = new C5446v3(strG114, bArr119);
                                            c5824y3 = c5446v3;
                                        }
                                        c5824y3 = h10;
                                    } else {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strG115 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr1110 = new byte[iH];
                                                p10.L(bArr1110, 0, iH);
                                                c5446v3 = new C5446v3(strG115, bArr1110);
                                                c5824y3 = c5446v3;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strG116 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr1111 = new byte[iH];
                                                p10.L(bArr1111, 0, iH);
                                                c5446v3 = new C5446v3(strG116, bArr1111);
                                                c5824y3 = c5446v3;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strG117 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr1112 = new byte[iH];
                                            p10.L(bArr1112, 0, iH);
                                            c5446v3 = new C5446v3(strG117, bArr1112);
                                            c5824y3 = c5446v3;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strG118 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr1113 = new byte[iH];
                                            p10.L(bArr1113, 0, iH);
                                            c5446v3 = new C5446v3(strG118, bArr1113);
                                            c5824y3 = c5446v3;
                                        }
                                        c5824y3 = h10;
                                    }
                                }
                                if (e10 == null) {
                                    String strG119 = g(i10, iR, iR2, iR3, iR4);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(strG119).length() + 39 + String.valueOf(iH).length());
                                    sb2.append("Failed to decode frame: id=");
                                    sb2.append(strG119);
                                    sb2.append(", frameSize=");
                                    sb2.append(iH);
                                    YU.d(str, sb2.toString(), e);
                                }
                                return e10;
                            }
                            if (iR4 != 66 && i10 != 2) {
                                i14 = 71;
                                if (i10 != 2) {
                                    if (i14 != 80) {
                                    }
                                    iR = iR;
                                    if (i14 == 67) {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strG1110 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr1114 = new byte[iH];
                                                p10.L(bArr1114, 0, iH);
                                                c5446v3 = new C5446v3(strG1110, bArr1114);
                                                c5824y3 = c5446v3;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strG1111 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr1115 = new byte[iH];
                                                p10.L(bArr1115, 0, iH);
                                                c5446v3 = new C5446v3(strG1111, bArr1115);
                                                c5824y3 = c5446v3;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strG1112 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr1116 = new byte[iH];
                                            p10.L(bArr1116, 0, iH);
                                            c5446v3 = new C5446v3(strG1112, bArr1116);
                                            c5824y3 = c5446v3;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strG1113 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr1117 = new byte[iH];
                                            p10.L(bArr1117, 0, iH);
                                            c5446v3 = new C5446v3(strG1113, bArr1117);
                                            c5824y3 = c5446v3;
                                        }
                                        c5824y3 = h10;
                                    } else {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strG1114 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr1118 = new byte[iH];
                                                p10.L(bArr1118, 0, iH);
                                                c5446v3 = new C5446v3(strG1114, bArr1118);
                                                c5824y3 = c5446v3;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strG1115 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr1119 = new byte[iH];
                                                p10.L(bArr1119, 0, iH);
                                                c5446v3 = new C5446v3(strG1115, bArr1119);
                                                c5824y3 = c5446v3;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strG1116 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr11110 = new byte[iH];
                                            p10.L(bArr11110, 0, iH);
                                            c5446v3 = new C5446v3(strG1116, bArr11110);
                                            c5824y3 = c5446v3;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strG1117 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr11111 = new byte[iH];
                                            p10.L(bArr11111, 0, iH);
                                            c5446v3 = new C5446v3(strG1117, bArr11111);
                                            c5824y3 = c5446v3;
                                        }
                                        c5824y3 = h10;
                                    }
                                } else {
                                    if (i14 != 65) {
                                    }
                                    iR = iR;
                                    if (i14 == 67) {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strG1118 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr11112 = new byte[iH];
                                                p10.L(bArr11112, 0, iH);
                                                c5446v3 = new C5446v3(strG1118, bArr11112);
                                                c5824y3 = c5446v3;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strG1119 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr11113 = new byte[iH];
                                                p10.L(bArr11113, 0, iH);
                                                c5446v3 = new C5446v3(strG1119, bArr11113);
                                                c5824y3 = c5446v3;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strG11110 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr11114 = new byte[iH];
                                            p10.L(bArr11114, 0, iH);
                                            c5446v3 = new C5446v3(strG11110, bArr11114);
                                            c5824y3 = c5446v3;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strG11111 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr11115 = new byte[iH];
                                            p10.L(bArr11115, 0, iH);
                                            c5446v3 = new C5446v3(strG11111, bArr11115);
                                            c5824y3 = c5446v3;
                                        }
                                        c5824y3 = h10;
                                    } else {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strG11112 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr11116 = new byte[iH];
                                                p10.L(bArr11116, 0, iH);
                                                c5446v3 = new C5446v3(strG11112, bArr11116);
                                                c5824y3 = c5446v3;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strG11113 = g(i10, i14, iR2, iR3, iR4);
                                                byte[] bArr11117 = new byte[iH];
                                                p10.L(bArr11117, 0, iH);
                                                c5446v3 = new C5446v3(strG11113, bArr11117);
                                                c5824y3 = c5446v3;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strG11114 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr11118 = new byte[iH];
                                            p10.L(bArr11118, 0, iH);
                                            c5446v3 = new C5446v3(strG11114, bArr11118);
                                            c5824y3 = c5446v3;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strG11115 = g(i10, i14, iR2, iR3, iR4);
                                            byte[] bArr11119 = new byte[iH];
                                            p10.L(bArr11119, 0, iH);
                                            c5446v3 = new C5446v3(strG11115, bArr11119);
                                            c5824y3 = c5446v3;
                                        }
                                        c5824y3 = h10;
                                    }
                                }
                                if (e10 == null) {
                                    String strG1120 = g(i10, iR, iR2, iR3, iR4);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(strG1120).length() + 39 + String.valueOf(iH).length());
                                    sb3.append("Failed to decode frame: id=");
                                    sb3.append(strG1120);
                                    sb3.append(", frameSize=");
                                    sb3.append(iH);
                                    YU.d(str, sb3.toString(), e);
                                }
                                return e10;
                            }
                            try {
                                int iR15 = p10.R();
                                Charset charsetF4 = f(iR15);
                                int i41 = iH - 1;
                                byte[] bArr20 = new byte[i41];
                                p10.L(bArr20, 0, i41);
                                int i42 = i(bArr20, 0);
                                str = "Id3Decoder";
                                String strH = A8.h(new String(bArr20, 0, i42, StandardCharsets.ISO_8859_1));
                                int i43 = i42 + 1;
                                int iH7 = h(bArr20, i43, iR15);
                                String strL = l(bArr20, i43, iH7, charsetF4);
                                int iJ5 = iH7 + j(iR15);
                                int iH8 = h(bArr20, iJ5, iR15);
                                iR = iR;
                                c5824y3 = new C5950z3(strH, strL, l(bArr20, iJ5, iH8, charsetF4), k(bArr20, iH8 + j(iR15), i41));
                            } catch (Exception e13) {
                                e = e13;
                                str = "Id3Decoder";
                                iR = iR;
                                p10.G(iF);
                                e10 = null;
                            } catch (OutOfMemoryError e14) {
                                e = e14;
                                str = "Id3Decoder";
                                iR = iR;
                                p10.G(iF);
                                e10 = null;
                            }
                        } catch (Exception e15) {
                            e = e15;
                        } catch (OutOfMemoryError e16) {
                            e = e16;
                        }
                    }
                    str = "Id3Decoder";
                }
                p10.G(iF);
                e10 = c5824y3;
                e = null;
            } catch (Throwable th) {
                p10.G(iF);
                throw th;
            }
        } catch (Exception e17) {
            e = e17;
            iR = iR;
            str = "Id3Decoder";
            p10.G(iF);
            e10 = null;
            if (e10 == null) {
                String strG1121 = g(i10, iR, iR2, iR3, iR4);
                StringBuilder sb4 = new StringBuilder(String.valueOf(strG1121).length() + 39 + String.valueOf(iH).length());
                sb4.append("Failed to decode frame: id=");
                sb4.append(strG1121);
                sb4.append(", frameSize=");
                sb4.append(iH);
                YU.d(str, sb4.toString(), e);
            }
            return e10;
        } catch (OutOfMemoryError e18) {
            e = e18;
            iR = iR;
            str = "Id3Decoder";
            p10.G(iF);
            e10 = null;
            if (e10 == null) {
                String strG1122 = g(i10, iR, iR2, iR3, iR4);
                StringBuilder sb5 = new StringBuilder(String.valueOf(strG1122).length() + 39 + String.valueOf(iH).length());
                sb5.append("Failed to decode frame: id=");
                sb5.append(strG1122);
                sb5.append(", frameSize=");
                sb5.append(iH);
                YU.d(str, sb5.toString(), e);
            }
            return e10;
        }
        if (e10 == null) {
            String strG1123 = g(i10, iR, iR2, iR3, iR4);
            StringBuilder sb6 = new StringBuilder(String.valueOf(strG1123).length() + 39 + String.valueOf(iH).length());
            sb6.append("Failed to decode frame: id=");
            sb6.append(strG1123);
            sb6.append(", frameSize=");
            sb6.append(iH);
            YU.d(str, sb6.toString(), e);
        }
        return e10;
    }

    private static AbstractC5931yu0 d(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return AbstractC5931yu0.m("");
        }
        int i12 = AbstractC5931yu0.f35482c;
        C5553vu0 c5553vu0 = new C5553vu0();
        int iH = h(bArr, i11, i10);
        while (i11 < iH) {
            c5553vu0.g(new String(bArr, i11, iH - i11, f(i10)));
            i11 = j(i10) + iH;
            iH = h(bArr, i11, i10);
        }
        AbstractC5931yu0 abstractC5931yu0J = c5553vu0.j();
        return abstractC5931yu0J.isEmpty() ? AbstractC5931yu0.m("") : abstractC5931yu0J;
    }

    private static int e(P10 p10, int i10) {
        byte[] bArrH = p10.H();
        int iF = p10.F();
        int i11 = iF;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iF + i10) {
                return i10;
            }
            if ((bArrH[i11] & 255) == 255 && bArrH[i12] == 0) {
                System.arraycopy(bArrH, i11 + 2, bArrH, i12, (i10 - (i11 - iF)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    private static Charset f(int i10) {
        if (i10 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i10 != 2) {
            return i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    private static String g(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int h(byte[] bArr, int i10, int i11) {
        int i12 = i(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return i12;
        }
        while (true) {
            int length = bArr.length;
            if (i12 >= length - 1) {
                return length;
            }
            int i13 = i12 + 1;
            if ((i12 - i10) % 2 == 0 && bArr[i13] == 0) {
                return i12;
            }
            i12 = i(bArr, i13);
        }
    }

    private static int i(byte[] bArr, int i10) {
        while (true) {
            int length = bArr.length;
            if (i10 >= length) {
                return length;
            }
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
    }

    private static int j(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static byte[] k(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? AbstractC4634ob0.f32118b : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static String l(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }
}
