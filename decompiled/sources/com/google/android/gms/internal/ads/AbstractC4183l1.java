package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4183l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f31153a = {2002, 2000, 1920, 1601, 1600, BackupConstant.SCENE_RENDER_FAIL, 1000, 960, 800, 800, 480, CommonGatewayClient.CODE_400, CommonGatewayClient.CODE_400, 2048};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f31154b = 0;

    /* JADX WARN: Code duplicated, block: B:147:0x020c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0212  */
    /* JADX WARN: Code duplicated, block: B:156:0x0226  */
    /* JADX WARN: Code duplicated, block: B:158:0x023a A[LOOP:2: B:157:0x0238->B:158:0x023a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:160:0x0249  */
    /* JADX WARN: Code duplicated, block: B:163:0x0252  */
    /* JADX WARN: Code duplicated, block: B:165:0x025c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0261  */
    /* JADX WARN: Code duplicated, block: B:170:0x026c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0272  */
    /* JADX WARN: Code duplicated, block: B:179:0x029e  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:183:0x02af  */
    /* JADX WARN: Code duplicated, block: B:184:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:185:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:186:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:187:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:188:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:189:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:190:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:191:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:192:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:193:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:195:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:205:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:208:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:209:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:210:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:212:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:214:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:217:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:219:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:221:0x0300  */
    /* JADX WARN: Code duplicated, block: B:223:0x0303  */
    /* JADX WARN: Code duplicated, block: B:225:0x0306  */
    /* JADX WARN: Code duplicated, block: B:227:0x0309  */
    /* JADX WARN: Code duplicated, block: B:229:0x0330  */
    /* JADX WARN: Code duplicated, block: B:230:0x0332  */
    /* JADX WARN: Code duplicated, block: B:231:0x0335  */
    /* JADX WARN: Code duplicated, block: B:232:0x0337  */
    /* JADX WARN: Code duplicated, block: B:233:0x0339  */
    /* JADX WARN: Code duplicated, block: B:235:0x033d  */
    /* JADX WARN: Code duplicated, block: B:237:0x0382  */
    public static JY0 a(P10 p10, String str, String str2, IV0 iv0) throws C2817a9 {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z9;
        int i19;
        boolean zI;
        int iJ;
        int iJ2;
        int iJ3;
        int i20;
        boolean z10;
        int i21;
        int i22;
        int i23;
        int i24;
        int iC;
        int iJ4;
        int i25;
        C4436n10 c4436n10 = new C4436n10();
        c4436n10.a(p10);
        int iC2 = c4436n10.c();
        int iJ5 = c4436n10.j(3);
        if (iJ5 > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iJ5).length() + 30);
            sb.append("Unsupported AC-4 DSI version: ");
            sb.append(iJ5);
            throw C2817a9.c(sb.toString());
        }
        int iJ6 = c4436n10.j(7);
        int i26 = true != c4436n10.i() ? 44100 : 48000;
        c4436n10.h(4);
        int iJ7 = c4436n10.j(9);
        if (iJ6 > 1) {
            if (iJ5 == 0) {
                throw C2817a9.c("Invalid AC-4 DSI version: 0");
            }
            if (c4436n10.i()) {
                c4436n10.h(16);
                if (c4436n10.i()) {
                    c4436n10.h(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                }
            }
        }
        if (iJ5 == 1) {
            if (!g(c4436n10)) {
                throw C2817a9.c("Invalid AC-4 DSI bitrate.");
            }
            c4436n10.m();
        }
        C3931j1 c3931j1 = new C3931j1(null);
        int i27 = 0;
        while (true) {
            if (i27 < iJ7) {
                if (iJ5 == 0) {
                    zI = c4436n10.i();
                    iJ = c4436n10.j(5);
                    iJ2 = c4436n10.j(5);
                    iJ3 = 0;
                    i20 = 0;
                    z10 = false;
                } else {
                    int iJ8 = c4436n10.j(8);
                    iJ3 = c4436n10.j(8);
                    if (iJ3 == 255) {
                        iJ3 = c4436n10.j(16) + 255;
                    }
                    if (iJ8 > 2) {
                        c4436n10.h(iJ3 * 8);
                        i27++;
                    } else {
                        int iC3 = (iC2 - c4436n10.c()) / 8;
                        iJ = c4436n10.j(5);
                        iJ2 = iJ8;
                        z10 = iJ == 31;
                        i20 = iC3;
                        zI = false;
                    }
                }
                c3931j1.f30280f = iJ2;
                if (zI || z10 || iJ != 6) {
                    c3931j1.f30281g = c4436n10.j(3);
                    if (c4436n10.i()) {
                        c4436n10.h(5);
                    }
                    c4436n10.h(2);
                    if (iJ5 == 1) {
                        if (iJ2 != 1) {
                            if (iJ2 == 2) {
                                iJ2 = 2;
                                c4436n10.h(2);
                            }
                            if (iJ2 <= 0) {
                                i10 = 8;
                                i11 = 5;
                            } else {
                                if (!c4436n10.i() && !g(c4436n10)) {
                                    throw C2817a9.c("Can't parse bitrate DSI.");
                                }
                                if (c4436n10.i()) {
                                    c4436n10.m();
                                    c4436n10.o(c4436n10.j(16));
                                    i11 = 5;
                                    iJ4 = c4436n10.j(5);
                                    for (i25 = 0; i25 < iJ4; i25++) {
                                        c4436n10.h(3);
                                        c4436n10.h(8);
                                    }
                                    i10 = 8;
                                } else {
                                    i10 = 8;
                                    i11 = 5;
                                }
                            }
                            c4436n10.m();
                            if (iJ5 == 1) {
                                iC = ((i21 - c4436n10.c()) / i10) - i20;
                                if (iJ3 < iC) {
                                    throw C2817a9.c("pres_bytes is smaller than presentation bytes read.");
                                }
                                c4436n10.o(iJ3 - iC);
                            }
                            if (c3931j1.f30275a) {
                                i13 = -1;
                                if (c3931j1.f30276b == -1) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(i27).length() + 45);
                                    sb2.append("Can't determine channel mode of presentation ");
                                    sb2.append(i27);
                                    throw C2817a9.c(sb2.toString());
                                }
                            }
                            if (c3931j1.f30275a) {
                                i18 = c3931j1.f30276b;
                                z9 = c3931j1.f30278d;
                                i19 = c3931j1.f30279e;
                                switch (i18) {
                                    case 0:
                                        i13 = 1;
                                        break;
                                    case 1:
                                        i13 = 2;
                                        break;
                                    case 2:
                                        i13 = 3;
                                        break;
                                    case 3:
                                        i13 = i11;
                                        break;
                                    case 4:
                                        i13 = 6;
                                        break;
                                    case 5:
                                    case 7:
                                    case 9:
                                        i13 = i12;
                                        break;
                                    case 6:
                                    case 8:
                                    case 10:
                                        i13 = i10;
                                        break;
                                    case 11:
                                        i13 = 11;
                                        break;
                                    case 12:
                                        i13 = 12;
                                        break;
                                    case 13:
                                        i13 = 13;
                                        break;
                                    case 14:
                                        i13 = 14;
                                        break;
                                    case 15:
                                        i13 = 24;
                                        break;
                                }
                                if (i18 != 11 || i18 == 12 || i18 == 13 || i18 == 14) {
                                    if (!z9) {
                                        i13 -= 2;
                                    }
                                    i17 = i13;
                                    if (i19 == 0) {
                                        i17 -= 4;
                                    } else if (i19 == 1) {
                                        i17 -= 2;
                                    }
                                } else {
                                    i17 = i13;
                                }
                            } else {
                                i14 = c3931j1.f30277c;
                                if (i14 > 0) {
                                    i17 = i14 + 1;
                                    if (c3931j1.f30281g == 4 && i17 == 17) {
                                        i17 = 21;
                                    }
                                } else {
                                    i15 = c3931j1.f30281g;
                                    if (i15 != 0) {
                                        i16 = 2;
                                    } else if (i15 != 1) {
                                        i16 = 2;
                                        if (i15 != 2) {
                                            i17 = i10;
                                        } else if (i15 != 3) {
                                            i17 = 10;
                                        } else if (i15 != 4) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(i15).length() + 33);
                                            sb3.append("AC-4 level ");
                                            sb3.append(i15);
                                            sb3.append(" has not been defined.");
                                            YU.c("Ac4Util", sb3.toString());
                                        } else {
                                            i17 = 12;
                                        }
                                    } else {
                                        i17 = 6;
                                    }
                                    i17 = i16;
                                }
                            }
                            if (i17 > 0) {
                                throw C2817a9.c("Cannot determine channel count of presentation.");
                            }
                            Object[] objArr = {Integer.valueOf(iJ6), Integer.valueOf(c3931j1.f30280f), Integer.valueOf(c3931j1.f30281g)};
                            String str3 = AbstractC4634ob0.f32117a;
                            String str4 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                            C5507vX0 c5507vX0 = new C5507vX0();
                            c5507vX0.A(str);
                            c5507vX0.l0("audio/ac4");
                            c5507vX0.e(i17);
                            c5507vX0.f(i26);
                            c5507vX0.p0(iv0);
                            c5507vX0.d0(str2);
                            c5507vX0.i0(str4);
                            return c5507vX0.m();
                        }
                        c4436n10.h(2);
                    }
                    c4436n10.h(5);
                    c4436n10.h(10);
                    if (iJ5 == 1) {
                        if (iJ2 > 0) {
                            c3931j1.f30275a = c4436n10.i();
                        }
                        if (c3931j1.f30275a) {
                            if (iJ2 != 1) {
                                i22 = 2;
                                if (iJ2 == 2) {
                                    i24 = 2;
                                } else {
                                    i21 = iC2;
                                    i24 = iJ2;
                                }
                                c4436n10.h(24);
                                i23 = 1;
                            } else {
                                i24 = 1;
                            }
                            i21 = iC2;
                            int iJ9 = c4436n10.j(5);
                            if (iJ9 >= 0 && iJ9 <= 15) {
                                c3931j1.f30276b = iJ9;
                            }
                            if (iJ9 < 11 || iJ9 > 14) {
                                i22 = 2;
                            } else {
                                c3931j1.f30278d = c4436n10.i();
                                i22 = 2;
                                c3931j1.f30279e = c4436n10.j(2);
                            }
                            c4436n10.h(24);
                            i23 = 1;
                        } else {
                            i21 = iC2;
                            i22 = 2;
                            i23 = 1;
                            i24 = iJ2;
                        }
                        if (iJ2 == i23 || iJ2 == i22) {
                            if (c4436n10.i() && c4436n10.i()) {
                                c4436n10.h(i22);
                            }
                            if (c4436n10.i()) {
                                c4436n10.g();
                                int i28 = 8;
                                int iJ10 = c4436n10.j(8);
                                int i29 = 0;
                                while (i29 < iJ10) {
                                    c4436n10.h(i28);
                                    i29++;
                                    i28 = 8;
                                }
                            }
                        }
                        iJ2 = i24;
                    } else {
                        i21 = iC2;
                    }
                    if (!zI && !z10) {
                        c4436n10.g();
                        if (iJ == 0 || iJ == 1 || iJ == 2) {
                            if (iJ2 == 0) {
                                for (int i30 = 0; i30 < 2; i30++) {
                                    d(c4436n10, c3931j1);
                                }
                                iJ2 = 0;
                            } else {
                                for (int i31 = 0; i31 < 2; i31++) {
                                    e(c4436n10, c3931j1);
                                }
                            }
                        } else if (iJ == 3 || iJ == 4) {
                            if (iJ2 == 0) {
                                for (int i32 = 0; i32 < 3; i32++) {
                                    d(c4436n10, c3931j1);
                                }
                                iJ2 = 0;
                            } else {
                                for (int i33 = 0; i33 < 3; i33++) {
                                    e(c4436n10, c3931j1);
                                }
                            }
                        } else if (iJ != 5) {
                            int iJ11 = c4436n10.j(7);
                            for (int i34 = 0; i34 < iJ11; i34++) {
                                c4436n10.h(8);
                            }
                        } else if (iJ2 == 0) {
                            d(c4436n10, c3931j1);
                            iJ2 = 0;
                        } else {
                            int iJ12 = c4436n10.j(3);
                            for (int i35 = 0; i35 < iJ12 + 2; i35++) {
                                e(c4436n10, c3931j1);
                            }
                        }
                    } else if (iJ2 == 0) {
                        d(c4436n10, c3931j1);
                        iJ2 = 0;
                    } else {
                        e(c4436n10, c3931j1);
                    }
                    c4436n10.g();
                    if (!c4436n10.i()) {
                        i12 = 7;
                    }
                    if (iJ2 <= 0) {
                        i10 = 8;
                        i11 = 5;
                    } else {
                        if (!c4436n10.i()) {
                        }
                        if (c4436n10.i()) {
                            c4436n10.m();
                            c4436n10.o(c4436n10.j(16));
                            i11 = 5;
                            iJ4 = c4436n10.j(5);
                            while (i25 < iJ4) {
                                c4436n10.h(3);
                                c4436n10.h(8);
                            }
                            i10 = 8;
                        } else {
                            i10 = 8;
                            i11 = 5;
                        }
                    }
                    c4436n10.m();
                    if (iJ5 == 1) {
                        iC = ((i21 - c4436n10.c()) / i10) - i20;
                        if (iJ3 < iC) {
                            throw C2817a9.c("pres_bytes is smaller than presentation bytes read.");
                        }
                        c4436n10.o(iJ3 - iC);
                    }
                    if (c3931j1.f30275a) {
                        i13 = -1;
                        if (c3931j1.f30276b == -1) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(i27).length() + 45);
                            sb4.append("Can't determine channel mode of presentation ");
                            sb4.append(i27);
                            throw C2817a9.c(sb4.toString());
                        }
                    }
                    if (c3931j1.f30275a) {
                        i18 = c3931j1.f30276b;
                        z9 = c3931j1.f30278d;
                        i19 = c3931j1.f30279e;
                        switch (i18) {
                            case 0:
                                i13 = 1;
                                break;
                            case 1:
                                i13 = 2;
                                break;
                            case 2:
                                i13 = 3;
                                break;
                            case 3:
                                i13 = i11;
                                break;
                            case 4:
                                i13 = 6;
                                break;
                            case 5:
                            case 7:
                            case 9:
                                i13 = i12;
                                break;
                            case 6:
                            case 8:
                            case 10:
                                i13 = i10;
                                break;
                            case 11:
                                i13 = 11;
                                break;
                            case 12:
                                i13 = 12;
                                break;
                            case 13:
                                i13 = 13;
                                break;
                            case 14:
                                i13 = 14;
                                break;
                            case 15:
                                i13 = 24;
                                break;
                        }
                        if (i18 != 11) {
                            if (!z9) {
                                i13 -= 2;
                            }
                            i17 = i13;
                            if (i19 == 0) {
                                i17 -= 4;
                            } else if (i19 == 1) {
                                i17 -= 2;
                            }
                        } else {
                            if (!z9) {
                                i13 -= 2;
                            }
                            i17 = i13;
                            if (i19 == 0) {
                                i17 -= 4;
                            } else if (i19 == 1) {
                                i17 -= 2;
                            }
                        }
                    } else {
                        i14 = c3931j1.f30277c;
                        if (i14 > 0) {
                            i17 = i14 + 1;
                            if (c3931j1.f30281g == 4) {
                                i17 = 21;
                            }
                        } else {
                            i15 = c3931j1.f30281g;
                            if (i15 != 0) {
                                i16 = 2;
                            } else if (i15 != 1) {
                                i16 = 2;
                                if (i15 != 2) {
                                    i17 = i10;
                                } else if (i15 != 3) {
                                    i17 = 10;
                                } else if (i15 != 4) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 33);
                                    sb5.append("AC-4 level ");
                                    sb5.append(i15);
                                    sb5.append(" has not been defined.");
                                    YU.c("Ac4Util", sb5.toString());
                                } else {
                                    i17 = 12;
                                }
                            } else {
                                i17 = 6;
                            }
                            i17 = i16;
                        }
                    }
                    if (i17 > 0) {
                        throw C2817a9.c("Cannot determine channel count of presentation.");
                    }
                    Object[] objArr2 = {Integer.valueOf(iJ6), Integer.valueOf(c3931j1.f30280f), Integer.valueOf(c3931j1.f30281g)};
                    String str5 = AbstractC4634ob0.f32117a;
                    String str6 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr2);
                    C5507vX0 c5507vX1 = new C5507vX0();
                    c5507vX1.A(str);
                    c5507vX1.l0("audio/ac4");
                    c5507vX1.e(i17);
                    c5507vX1.f(i26);
                    c5507vX1.p0(iv0);
                    c5507vX1.d0(str2);
                    c5507vX1.i0(str6);
                    return c5507vX1.m();
                }
                i21 = iC2;
                i12 = 7;
                int iJ13 = c4436n10.j(7);
                for (int i36 = 0; i36 < iJ13; i36++) {
                    c4436n10.h(15);
                }
                if (iJ2 <= 0) {
                    i10 = 8;
                    i11 = 5;
                } else {
                    if (!c4436n10.i()) {
                    }
                    if (c4436n10.i()) {
                        c4436n10.m();
                        c4436n10.o(c4436n10.j(16));
                        i11 = 5;
                        iJ4 = c4436n10.j(5);
                        while (i25 < iJ4) {
                            c4436n10.h(3);
                            c4436n10.h(8);
                        }
                        i10 = 8;
                    } else {
                        i10 = 8;
                        i11 = 5;
                    }
                }
                c4436n10.m();
                if (iJ5 == 1) {
                    iC = ((i21 - c4436n10.c()) / i10) - i20;
                    if (iJ3 < iC) {
                        throw C2817a9.c("pres_bytes is smaller than presentation bytes read.");
                    }
                    c4436n10.o(iJ3 - iC);
                }
                if (c3931j1.f30275a) {
                    i13 = -1;
                    if (c3931j1.f30276b == -1) {
                        StringBuilder sb6 = new StringBuilder(String.valueOf(i27).length() + 45);
                        sb6.append("Can't determine channel mode of presentation ");
                        sb6.append(i27);
                        throw C2817a9.c(sb6.toString());
                    }
                }
                if (c3931j1.f30275a) {
                    i18 = c3931j1.f30276b;
                    z9 = c3931j1.f30278d;
                    i19 = c3931j1.f30279e;
                    switch (i18) {
                        case 0:
                            i13 = 1;
                            break;
                        case 1:
                            i13 = 2;
                            break;
                        case 2:
                            i13 = 3;
                            break;
                        case 3:
                            i13 = i11;
                            break;
                        case 4:
                            i13 = 6;
                            break;
                        case 5:
                        case 7:
                        case 9:
                            i13 = i12;
                            break;
                        case 6:
                        case 8:
                        case 10:
                            i13 = i10;
                            break;
                        case 11:
                            i13 = 11;
                            break;
                        case 12:
                            i13 = 12;
                            break;
                        case 13:
                            i13 = 13;
                            break;
                        case 14:
                            i13 = 14;
                            break;
                        case 15:
                            i13 = 24;
                            break;
                    }
                    if (i18 != 11) {
                        if (!z9) {
                            i13 -= 2;
                        }
                        i17 = i13;
                        if (i19 == 0) {
                            i17 -= 4;
                        } else if (i19 == 1) {
                            i17 -= 2;
                        }
                    } else {
                        if (!z9) {
                            i13 -= 2;
                        }
                        i17 = i13;
                        if (i19 == 0) {
                            i17 -= 4;
                        } else if (i19 == 1) {
                            i17 -= 2;
                        }
                    }
                } else {
                    i14 = c3931j1.f30277c;
                    if (i14 > 0) {
                        i17 = i14 + 1;
                        if (c3931j1.f30281g == 4) {
                            i17 = 21;
                        }
                    } else {
                        i15 = c3931j1.f30281g;
                        if (i15 != 0) {
                            i16 = 2;
                        } else if (i15 != 1) {
                            i16 = 2;
                            if (i15 != 2) {
                                i17 = i10;
                            } else if (i15 != 3) {
                                i17 = 10;
                            } else if (i15 != 4) {
                                StringBuilder sb7 = new StringBuilder(String.valueOf(i15).length() + 33);
                                sb7.append("AC-4 level ");
                                sb7.append(i15);
                                sb7.append(" has not been defined.");
                                YU.c("Ac4Util", sb7.toString());
                            } else {
                                i17 = 12;
                            }
                        } else {
                            i17 = 6;
                        }
                        i17 = i16;
                    }
                }
                if (i17 > 0) {
                    throw C2817a9.c("Cannot determine channel count of presentation.");
                }
                Object[] objArr3 = {Integer.valueOf(iJ6), Integer.valueOf(c3931j1.f30280f), Integer.valueOf(c3931j1.f30281g)};
                String str7 = AbstractC4634ob0.f32117a;
                String str8 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr3);
                C5507vX0 c5507vX2 = new C5507vX0();
                c5507vX2.A(str);
                c5507vX2.l0("audio/ac4");
                c5507vX2.e(i17);
                c5507vX2.f(i26);
                c5507vX2.p0(iv0);
                c5507vX2.d0(str2);
                c5507vX2.i0(str8);
                return c5507vX2.m();
            }
            i10 = 8;
            i11 = 5;
            i12 = 7;
            i13 = -1;
            if (c3931j1.f30275a) {
                i18 = c3931j1.f30276b;
                z9 = c3931j1.f30278d;
                i19 = c3931j1.f30279e;
                switch (i18) {
                    case 0:
                        i13 = 1;
                        break;
                    case 1:
                        i13 = 2;
                        break;
                    case 2:
                        i13 = 3;
                        break;
                    case 3:
                        i13 = i11;
                        break;
                    case 4:
                        i13 = 6;
                        break;
                    case 5:
                    case 7:
                    case 9:
                        i13 = i12;
                        break;
                    case 6:
                    case 8:
                    case 10:
                        i13 = i10;
                        break;
                    case 11:
                        i13 = 11;
                        break;
                    case 12:
                        i13 = 12;
                        break;
                    case 13:
                        i13 = 13;
                        break;
                    case 14:
                        i13 = 14;
                        break;
                    case 15:
                        i13 = 24;
                        break;
                }
                if (i18 != 11) {
                    if (!z9) {
                        i13 -= 2;
                    }
                    i17 = i13;
                    if (i19 == 0) {
                        i17 -= 4;
                    } else if (i19 == 1) {
                        i17 -= 2;
                    }
                } else {
                    if (!z9) {
                        i13 -= 2;
                    }
                    i17 = i13;
                    if (i19 == 0) {
                        i17 -= 4;
                    } else if (i19 == 1) {
                        i17 -= 2;
                    }
                }
            } else {
                i14 = c3931j1.f30277c;
                if (i14 > 0) {
                    i17 = i14 + 1;
                    if (c3931j1.f30281g == 4) {
                        i17 = 21;
                    }
                } else {
                    i15 = c3931j1.f30281g;
                    if (i15 != 0) {
                        i16 = 2;
                    } else if (i15 != 1) {
                        i16 = 2;
                        if (i15 != 2) {
                            i17 = i10;
                        } else if (i15 != 3) {
                            i17 = 10;
                        } else if (i15 != 4) {
                            StringBuilder sb8 = new StringBuilder(String.valueOf(i15).length() + 33);
                            sb8.append("AC-4 level ");
                            sb8.append(i15);
                            sb8.append(" has not been defined.");
                            YU.c("Ac4Util", sb8.toString());
                        } else {
                            i17 = 12;
                        }
                    } else {
                        i17 = 6;
                    }
                    i17 = i16;
                }
            }
            if (i17 > 0) {
                throw C2817a9.c("Cannot determine channel count of presentation.");
            }
            Object[] objArr4 = {Integer.valueOf(iJ6), Integer.valueOf(c3931j1.f30280f), Integer.valueOf(c3931j1.f30281g)};
            String str9 = AbstractC4634ob0.f32117a;
            String str10 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr4);
            C5507vX0 c5507vX3 = new C5507vX0();
            c5507vX3.A(str);
            c5507vX3.l0("audio/ac4");
            c5507vX3.e(i17);
            c5507vX3.f(i26);
            c5507vX3.p0(iv0);
            c5507vX3.d0(str2);
            c5507vX3.i0(str10);
            return c5507vX3.m();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    public static C4057k1 b(C4436n10 c4436n10) {
        int i10;
        int iJ;
        int iJ2 = c4436n10.j(16);
        int iJ3 = c4436n10.j(16);
        if (iJ3 == 65535) {
            iJ3 = c4436n10.j(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i11 = iJ3 + i10;
        if (iJ2 == 44097) {
            i11 += 2;
        }
        int i12 = i11;
        int iJ4 = c4436n10.j(2);
        int i13 = 0;
        if (iJ4 == 3) {
            int i14 = 0;
            while (true) {
                iJ = i14 + c4436n10.j(2);
                if (!c4436n10.i()) {
                    break;
                }
                i14 = (iJ + 1) << 2;
            }
            iJ4 = iJ + 3;
        }
        int i15 = iJ4;
        int iJ5 = c4436n10.j(10);
        if (c4436n10.i() && c4436n10.j(3) > 0) {
            c4436n10.h(2);
        }
        int i16 = 48000;
        if (true != c4436n10.i()) {
            i16 = 44100;
        }
        int iJ6 = c4436n10.j(4);
        if (i16 == 44100 && iJ6 == 13) {
            i13 = f31153a[13];
        } else if (i16 == 48000 && iJ6 < 14) {
            i13 = f31153a[iJ6];
            int i17 = iJ5 % 5;
            if (i17 == 1) {
                if (iJ6 != 3 || iJ6 == 8) {
                    i13++;
                }
            } else if (i17 != 2) {
                if (i17 != 3) {
                    if (i17 == 4 && (iJ6 == 3 || iJ6 == 8 || iJ6 == 11)) {
                        i13++;
                    }
                } else if (iJ6 != 3) {
                    i13++;
                } else {
                    i13++;
                }
            } else if (iJ6 == 8 || iJ6 == 11) {
                i13++;
            }
        }
        return new C4057k1(i15, 2, i16, i12, i13, null);
    }

    public static void c(int i10, P10 p10) {
        p10.z(7);
        byte[] bArrH = p10.H();
        bArrH[0] = -84;
        bArrH[1] = 64;
        bArrH[2] = -1;
        bArrH[3] = -1;
        bArrH[4] = (byte) ((i10 >> 16) & 255);
        bArrH[5] = (byte) ((i10 >> 8) & 255);
        bArrH[6] = (byte) (i10 & 255);
    }

    private static void d(C4436n10 c4436n10, C3931j1 c3931j1) throws C2817a9 {
        int iJ = c4436n10.j(5);
        c4436n10.h(2);
        if (c4436n10.i()) {
            c4436n10.h(5);
        }
        if (iJ >= 7 && iJ <= 10) {
            c4436n10.g();
        }
        if (c4436n10.i()) {
            int iJ2 = c4436n10.j(3);
            if (c3931j1.f30276b == -1 && iJ >= 0 && iJ <= 15 && (iJ2 == 0 || iJ2 == 1)) {
                c3931j1.f30276b = iJ;
            }
            if (c4436n10.i()) {
                f(c4436n10);
            }
        }
    }

    private static void e(C4436n10 c4436n10, C3931j1 c3931j1) throws C2817a9 {
        c4436n10.h(2);
        boolean zI = c4436n10.i();
        int iJ = c4436n10.j(8);
        for (int i10 = 0; i10 < iJ; i10++) {
            c4436n10.h(2);
            if (c4436n10.i()) {
                c4436n10.h(5);
            }
            if (zI) {
                c4436n10.h(24);
            } else {
                if (c4436n10.i()) {
                    if (!c4436n10.i()) {
                        c4436n10.h(4);
                    }
                    c3931j1.f30277c = c4436n10.j(6) + 1;
                }
                c4436n10.h(4);
            }
        }
        if (c4436n10.i()) {
            c4436n10.h(3);
            if (c4436n10.i()) {
                f(c4436n10);
            }
        }
    }

    private static void f(C4436n10 c4436n10) throws C2817a9 {
        int iJ = c4436n10.j(6);
        if (iJ < 2 || iJ > 42) {
            throw C2817a9.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iJ)));
        }
        c4436n10.h(iJ * 8);
    }

    private static boolean g(C4436n10 c4436n10) {
        if (c4436n10.c() < 66) {
            return false;
        }
        c4436n10.h(66);
        return true;
    }
}
