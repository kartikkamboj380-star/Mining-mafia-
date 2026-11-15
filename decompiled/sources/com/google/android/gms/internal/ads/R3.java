package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
final class R3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f22687a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f22688b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2807a4 f22689c = new C2807a4();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private S3 f22690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f22693g;

    private final long d(J1 j10, int i10) {
        byte[] bArr = this.f22687a;
        j10.I(bArr, 0, i10);
        long j11 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j11 = (j11 << 8) | ((long) (bArr[i11] & 255));
        }
        return j11;
    }

    public final void a(S3 s10) {
        this.f22690d = s10;
    }

    public final void b() {
        this.f22691e = 0;
        this.f22688b.clear();
        this.f22689c.a();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a9 A[LOOP:0: B:3:0x0005->B:37:0x00a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e A[LOOP:2: B:61:0x0136->B:64:0x013e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x014b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0172  */
    /* JADX WARN: Code duplicated, block: B:74:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0140 A[SYNTHETIC] */
    public final boolean c(J1 j10) throws C2817a9 {
        int i10;
        Y3 y9;
        long j11;
        long j12;
        int i11;
        byte[] bArr;
        String str;
        int i12;
        long j13;
        int i13;
        long jD;
        double dLongBitsToDouble;
        int iD;
        int iE;
        this.f22690d.getClass();
        while (true) {
            ArrayDeque arrayDeque = this.f22688b;
            Q3 q10 = (Q3) arrayDeque.peek();
            if (q10 != null && j10.zzn() >= q10.b()) {
                ((T3) this.f22690d).f23375a.i(((Q3) arrayDeque.pop()).a());
                return true;
            }
            int i14 = this.f22691e;
            if (i14 != 0) {
                if (i14 == 1) {
                }
                S3 s10 = this.f22690d;
                i10 = this.f22692f;
                y9 = ((T3) s10).f23375a;
                switch (i10) {
                    case 131:
                    case 136:
                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 238:
                    case 240:
                    case 241:
                    case 247:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21938:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        j11 = this.f22693g;
                        if (j11 <= 8) {
                            y9.j(i10, d(j10, (int) j11));
                            this.f22691e = 0;
                            return true;
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(j11).length() + 22);
                        sb.append("Invalid integer size: ");
                        sb.append(j11);
                        throw C2817a9.b(sb.toString(), null);
                    case 134:
                    case 17026:
                    case 21358:
                    case 2274716:
                        j12 = this.f22693g;
                        if (j12 <= 2147483647L) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j12).length() + 21);
                            sb2.append("String element size: ");
                            sb2.append(j12);
                            throw C2817a9.b(sb2.toString(), null);
                        }
                        i11 = (int) j12;
                        if (i11 == 0) {
                            str = "";
                        } else {
                            bArr = new byte[i11];
                            j10.I(bArr, 0, i11);
                            while (i11 > 0) {
                                i12 = i11 - 1;
                                if (bArr[i12] == 0) {
                                    i11 = i12;
                                } else {
                                    str = new String(bArr, 0, i11);
                                }
                            }
                            str = new String(bArr, 0, i11);
                        }
                        y9.l(i10, str);
                        this.f22691e = 0;
                        return true;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        long jZzn = j10.zzn();
                        arrayDeque.push(new Q3(i10, this.f22693g + jZzn, null));
                        ((T3) this.f22690d).f23375a.h(this.f22692f, jZzn, this.f22693g);
                        this.f22691e = 0;
                        return true;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        y9.m(i10, (int) this.f22693g, j10);
                        this.f22691e = 0;
                        return true;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        j13 = this.f22693g;
                        if (j13 == 4 && j13 != 8) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j13).length() + 20);
                            sb3.append("Invalid float size: ");
                            sb3.append(j13);
                            throw C2817a9.b(sb3.toString(), null);
                        }
                        i13 = (int) j13;
                        jD = d(j10, i13);
                        if (i13 == 4) {
                            dLongBitsToDouble = Float.intBitsToFloat((int) jD);
                        } else {
                            dLongBitsToDouble = Double.longBitsToDouble(jD);
                        }
                        y9.k(i10, dLongBitsToDouble);
                        this.f22691e = 0;
                        return true;
                    default:
                        j10.n((int) this.f22693g);
                        this.f22691e = 0;
                        break;
                }
            } else {
                long jB = this.f22689c.b(j10, true, false, 4);
                if (jB == -2) {
                    j10.zzl();
                    while (true) {
                        byte[] bArr2 = this.f22687a;
                        j10.J(bArr2, 0, 4);
                        iD = C2807a4.d(bArr2[0]);
                        if (iD != -1 && iD <= 4) {
                            iE = (int) C2807a4.e(bArr2, iD, false);
                            Y3 y10 = ((T3) this.f22690d).f23375a;
                            if (iE != 357149030 && iE != 524531317 && iE != 475249515) {
                                if (iE == 374648427) {
                                    iE = 374648427;
                                }
                            }
                        }
                        j10.n(1);
                    }
                    j10.n(iD);
                    jB = iE;
                }
                if (jB == -1) {
                    return false;
                }
                this.f22692f = (int) jB;
                this.f22691e = 1;
            }
            this.f22693g = this.f22689c.b(j10, false, true, 8);
            this.f22691e = 2;
            S3 s11 = this.f22690d;
            i10 = this.f22692f;
            y9 = ((T3) s11).f23375a;
            switch (i10) {
                case 131:
                case 136:
                case ModuleDescriptor.MODULE_VERSION /* 155 */:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 240:
                case 241:
                case 247:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    j11 = this.f22693g;
                    if (j11 <= 8) {
                        y9.j(i10, d(j10, (int) j11));
                        this.f22691e = 0;
                        return true;
                    }
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j11).length() + 22);
                    sb4.append("Invalid integer size: ");
                    sb4.append(j11);
                    throw C2817a9.b(sb4.toString(), null);
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    j12 = this.f22693g;
                    if (j12 <= 2147483647L) {
                        StringBuilder sb5 = new StringBuilder(String.valueOf(j12).length() + 21);
                        sb5.append("String element size: ");
                        sb5.append(j12);
                        throw C2817a9.b(sb5.toString(), null);
                    }
                    i11 = (int) j12;
                    if (i11 == 0) {
                        str = "";
                    } else {
                        bArr = new byte[i11];
                        j10.I(bArr, 0, i11);
                        while (i11 > 0) {
                            i12 = i11 - 1;
                            if (bArr[i12] == 0) {
                                i11 = i12;
                            } else {
                                str = new String(bArr, 0, i11);
                            }
                        }
                        str = new String(bArr, 0, i11);
                    }
                    y9.l(i10, str);
                    this.f22691e = 0;
                    return true;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    long jZzn2 = j10.zzn();
                    arrayDeque.push(new Q3(i10, this.f22693g + jZzn2, null));
                    ((T3) this.f22690d).f23375a.h(this.f22692f, jZzn2, this.f22693g);
                    this.f22691e = 0;
                    return true;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    y9.m(i10, (int) this.f22693g, j10);
                    this.f22691e = 0;
                    return true;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    j13 = this.f22693g;
                    if (j13 == 4) {
                        break;
                    }
                    i13 = (int) j13;
                    jD = d(j10, i13);
                    if (i13 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jD);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jD);
                    }
                    y9.k(i10, dLongBitsToDouble);
                    this.f22691e = 0;
                    return true;
                default:
                    j10.n((int) this.f22693g);
                    this.f22691e = 0;
                    break;
            }
        }
    }
}
