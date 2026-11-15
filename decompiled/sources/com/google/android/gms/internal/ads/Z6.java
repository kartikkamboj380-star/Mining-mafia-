package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes2.dex */
abstract class Z6 {
    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    public static boolean a(C4436n10 c4436n10, X6 x10) throws C2817a9 {
        long jK;
        c4436n10.e();
        int iF = f(c4436n10, 3, 8, 8);
        x10.f25145a = iF;
        if (iF == -1) {
            return false;
        }
        AbstractC2418Ss0.a(Math.max(Math.max(2, 8), 32) <= 63);
        Math.addExact(Math.addExact(3L, 255L), 4294967296L);
        if (c4436n10.c() < 2) {
            jK = -1;
        } else {
            jK = c4436n10.k(2);
            if (jK == 3) {
                if (c4436n10.c() < 8) {
                    jK = -1;
                } else {
                    long jK2 = c4436n10.k(8);
                    long j10 = jK2 + 3;
                    if (jK2 != 255) {
                        jK = j10;
                    } else if (c4436n10.c() < 32) {
                        jK = -1;
                    } else {
                        jK = j10 + c4436n10.k(32);
                    }
                }
            }
        }
        x10.f25146b = jK;
        if (jK == -1) {
            return false;
        }
        if (jK > 16) {
            StringBuilder sb = new StringBuilder(String.valueOf(jK).length() + 49);
            sb.append("Contains sub-stream with an invalid packet label ");
            sb.append(jK);
            throw C2817a9.c(sb.toString());
        }
        if (jK == 0) {
            int i10 = x10.f25145a;
            if (i10 == 1) {
                throw C2817a9.b("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i10 == 2) {
                throw C2817a9.b("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i10 == 17) {
                throw C2817a9.b("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iF2 = f(c4436n10, 11, 24, 24);
        x10.f25147c = iF2;
        return iF2 != -1;
    }

    public static Y6 b(C4436n10 c4436n10) throws C2817a9 {
        int iJ;
        int i10;
        char c10;
        int i11;
        int i12;
        int iJ2;
        char c11;
        int iJ3 = c4436n10.j(8);
        int i13 = 5;
        int iJ4 = c4436n10.j(5);
        if (iJ4 != 31) {
            switch (iJ4) {
                case 0:
                    iJ = 96000;
                    break;
                case 1:
                    iJ = 88200;
                    break;
                case 2:
                    iJ = 64000;
                    break;
                case 3:
                    iJ = 48000;
                    break;
                case 4:
                    iJ = 44100;
                    break;
                case 5:
                    iJ = 32000;
                    break;
                case 6:
                    iJ = 24000;
                    break;
                case 7:
                    iJ = 22050;
                    break;
                case 8:
                    iJ = 16000;
                    break;
                case 9:
                    iJ = 12000;
                    break;
                case 10:
                    iJ = 11025;
                    break;
                case 11:
                    iJ = 8000;
                    break;
                case 12:
                    iJ = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(iJ4).length() + 32);
                    sb.append("Unsupported sampling rate index ");
                    sb.append(iJ4);
                    throw C2817a9.c(sb.toString());
                case 15:
                    iJ = 57600;
                    break;
                case 16:
                    iJ = 51200;
                    break;
                case 17:
                    iJ = 40000;
                    break;
                case 18:
                    iJ = 38400;
                    break;
                case 19:
                    iJ = 34150;
                    break;
                case 20:
                    iJ = 28800;
                    break;
                case 21:
                    iJ = 25600;
                    break;
                case 22:
                    iJ = 20000;
                    break;
                case 23:
                    iJ = 19200;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    iJ = 17075;
                    break;
                case 25:
                    iJ = 14400;
                    break;
                case 26:
                    iJ = 12800;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    iJ = 9600;
                    break;
            }
        } else {
            iJ = c4436n10.j(24);
        }
        int iJ5 = c4436n10.j(3);
        int i14 = 1;
        if (iJ5 == 0) {
            i10 = 768;
        } else if (iJ5 == 1) {
            i10 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else if (iJ5 == 2 || iJ5 == 3) {
            i10 = 2048;
        } else {
            if (iJ5 != 4) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iJ5).length() + 36);
                sb2.append("Unsupported coreSbrFrameLengthIndex ");
                sb2.append(iJ5);
                throw C2817a9.c(sb2.toString());
            }
            i10 = CodedOutputStream.DEFAULT_BUFFER_SIZE;
        }
        if (iJ5 == 0 || iJ5 == 1) {
            c10 = 0;
        } else if (iJ5 == 2) {
            c10 = 2;
        } else if (iJ5 == 3) {
            c10 = 3;
        } else {
            if (iJ5 != 4) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(iJ5).length() + 36);
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(iJ5);
                throw C2817a9.c(sb3.toString());
            }
            c10 = 1;
        }
        c4436n10.h(2);
        c(c4436n10);
        int iJ6 = c4436n10.j(5);
        int i15 = 0;
        int iF = 0;
        while (true) {
            int i16 = 16;
            if (i15 < iJ6 + 1) {
                int iJ7 = c4436n10.j(3);
                iF += f(c4436n10, 5, 8, 16) + 1;
                if ((iJ7 == 0 || iJ7 == 2) && c4436n10.i()) {
                    c(c4436n10);
                }
                i15++;
            } else {
                int iF2 = f(c4436n10, 4, 8, 16) + 1;
                c4436n10.g();
                int i17 = 0;
                while (true) {
                    double d10 = 2.0d;
                    if (i17 >= iF2) {
                        int i18 = iJ3;
                        byte[] bArr = null;
                        if (c4436n10.i()) {
                            int iF3 = f(c4436n10, 2, 4, 8) + 1;
                            for (int i19 = 0; i19 < iF3; i19++) {
                                int iF4 = f(c4436n10, 4, 8, 16);
                                int iF5 = f(c4436n10, 4, 8, 16);
                                if (iF4 == 7) {
                                    int iJ8 = c4436n10.j(4) + 1;
                                    c4436n10.h(4);
                                    byte[] bArr2 = new byte[iJ8];
                                    for (int i20 = 0; i20 < iJ8; i20++) {
                                        bArr2[i20] = (byte) c4436n10.j(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    c4436n10.h(iF5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iJ) {
                            case 14700:
                            case 16000:
                                d10 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d10 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d10 = 1.0d;
                                break;
                            default:
                                StringBuilder sb4 = new StringBuilder(String.valueOf(iJ).length() + 26);
                                sb4.append("Unsupported sampling rate ");
                                sb4.append(iJ);
                                throw C2817a9.c(sb4.toString());
                        }
                        return new Y6(i18, (int) (((double) iJ) * d10), (int) (((double) i10) * d10), bArr3, null);
                    }
                    int iJ9 = c4436n10.j(2);
                    if (iJ9 == 0) {
                        i11 = iJ3;
                        i12 = i14;
                        d(c4436n10);
                        if (c10 > 0) {
                            e(c4436n10);
                        }
                    } else if (iJ9 == i14) {
                        i12 = i14;
                        if (d(c4436n10)) {
                            c4436n10.g();
                        }
                        if (c10 > 0) {
                            e(c4436n10);
                            iJ2 = c4436n10.j(2);
                            c11 = c10;
                        } else {
                            iJ2 = 0;
                            c11 = 0;
                        }
                        if (iJ2 > 0) {
                            c4436n10.h(6);
                            int iJ10 = c4436n10.j(2);
                            c4436n10.h(4);
                            if (c4436n10.i()) {
                                c4436n10.h(i13);
                            }
                            if (iJ2 == 2 || iJ2 == 3) {
                                c4436n10.h(6);
                            }
                            if (iJ10 == 2) {
                                c4436n10.g();
                            }
                        }
                        i11 = iJ3;
                        int iFloor = ((int) Math.floor(Math.log(iF - 1) / Math.log(2.0d))) + 1;
                        int iJ11 = c4436n10.j(2);
                        if (iJ11 > 0 && c4436n10.i()) {
                            c4436n10.h(iFloor);
                        }
                        if (c4436n10.i()) {
                            c4436n10.h(iFloor);
                        }
                        if (c11 == 0 && iJ11 == 0) {
                            c4436n10.g();
                        }
                    } else if (iJ9 != 3) {
                        i11 = iJ3;
                        i12 = i14;
                    } else {
                        f(c4436n10, 4, 8, i16);
                        int iF6 = f(c4436n10, 4, 8, i16);
                        i12 = i14;
                        if (c4436n10.i()) {
                            f(c4436n10, 8, i16, 0);
                        }
                        c4436n10.g();
                        if (iF6 > 0) {
                            c4436n10.h(iF6 * 8);
                        }
                        i11 = iJ3;
                    }
                    i17++;
                    iJ3 = i11;
                    i14 = i12;
                    i13 = 5;
                    i16 = 16;
                }
            }
        }
    }

    private static void c(C4436n10 c4436n10) {
        int iJ;
        int iJ2 = c4436n10.j(2);
        if (iJ2 == 0) {
            c4436n10.h(6);
            return;
        }
        int iF = f(c4436n10, 5, 8, 16) + 1;
        if (iJ2 == 1) {
            c4436n10.h(iF * 7);
            return;
        }
        if (iJ2 == 2) {
            boolean zI = c4436n10.i();
            int i10 = true != zI ? 5 : 1;
            int i11 = true == zI ? 7 : 5;
            int i12 = true == zI ? 8 : 6;
            int i13 = 0;
            while (i13 < iF) {
                if (c4436n10.i()) {
                    c4436n10.h(7);
                    iJ = 0;
                } else {
                    if (c4436n10.j(2) == 3 && c4436n10.j(i11) * i10 != 0) {
                        c4436n10.g();
                    }
                    iJ = c4436n10.j(i12) * i10;
                    if (iJ != 0 && iJ != 180) {
                        c4436n10.g();
                    }
                    c4436n10.g();
                }
                if (iJ != 0 && iJ != 180 && c4436n10.i()) {
                    i13++;
                }
                i13++;
            }
        }
    }

    private static boolean d(C4436n10 c4436n10) {
        c4436n10.h(3);
        boolean zI = c4436n10.i();
        if (zI) {
            c4436n10.h(13);
        }
        return zI;
    }

    private static void e(C4436n10 c4436n10) {
        c4436n10.h(3);
        c4436n10.h(8);
        boolean zI = c4436n10.i();
        boolean zI2 = c4436n10.i();
        if (zI) {
            c4436n10.h(5);
        }
        if (zI2) {
            c4436n10.h(6);
        }
    }

    private static int f(C4436n10 c4436n10, int i10, int i11, int i12) {
        AbstractC2418Ss0.a(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        Math.addExact(Math.addExact(i13, i14), 1 << i12);
        if (c4436n10.c() < i10) {
            return -1;
        }
        int iJ = c4436n10.j(i10);
        if (iJ != i13) {
            return iJ;
        }
        if (c4436n10.c() < i11) {
            return -1;
        }
        int iJ2 = c4436n10.j(i11);
        int i15 = iJ + iJ2;
        if (iJ2 != i14) {
            return i15;
        }
        if (c4436n10.c() < i12) {
            return -1;
        }
        return i15 + c4436n10.j(i12);
    }
}
