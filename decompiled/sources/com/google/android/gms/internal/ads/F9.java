package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class F9 implements InterfaceC2871aa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ F9 f18684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ F9 f18685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ F9 f18686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ F9 f18687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ F9 f18688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ F9 f18689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ F9 f18690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ F9 f18691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ F9 f18692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ F9 f18693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ F9 f18694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ F9 f18695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ F9 f18696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ F9 f18697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ F9 f18698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ F9 f18699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ F9 f18700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ F9 f18701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ F9 f18702t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ F9 f18703u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ F9 f18704v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f18705a;

    static {
        int i10 = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i11 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i12 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i13 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i14 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i15 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i16 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        f18704v = new F9((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        f18703u = new F9((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        f18702t = new F9((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        f18701s = new F9(i16);
        f18700r = new F9(i13);
        f18699q = new F9(i14);
        F9 f10 = new F9(i15);
        int i17 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i18 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i19 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i20 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i21 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i22 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i23 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i24 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i25 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        f18698p = f10;
        f18697o = new F9(i12);
        f18696n = new F9(i17);
        f18695m = new F9(i18);
        f18694l = new F9(i19);
        f18693k = new F9(i11);
        f18692j = new F9(i20);
        f18691i = new F9(i21);
        f18690h = new F9(i22);
        f18689g = new F9(i10);
        f18688f = new F9(i23);
        f18687e = new F9(i24);
        f18686d = new F9(i25);
        f18685c = new F9(1);
        f18684b = new F9(0);
    }

    private /* synthetic */ F9(int i10) {
        this.f18705a = i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:98:0x01e4 A[Catch: Y9 -> 0x0061, V9 | X9 -> 0x00f2, ClassNotFoundException -> 0x01f4, ga -> 0x01f8, TryCatch #3 {V9 | X9 -> 0x00f2, blocks: (B:5:0x0036, B:9:0x0052, B:11:0x005a, B:16:0x0068, B:18:0x0071, B:32:0x00e3, B:19:0x007a, B:20:0x007f, B:21:0x0080, B:24:0x00a8, B:25:0x00ad, B:29:0x00b6, B:31:0x00be, B:35:0x00eb, B:36:0x00f0, B:37:0x00f1, B:42:0x0101, B:43:0x0111, B:45:0x0117, B:47:0x0125, B:48:0x0127, B:50:0x012c, B:51:0x0133, B:53:0x014b, B:54:0x014e, B:61:0x016d, B:66:0x018b, B:99:0x01e8, B:70:0x0196, B:74:0x01a1, B:81:0x01b5, B:85:0x01c0, B:89:0x01cb, B:93:0x01d6, B:97:0x01e1, B:98:0x01e4, B:105:0x0200, B:109:0x0217, B:119:0x0255, B:119:0x0255, B:125:0x027f, B:135:0x02b1, B:137:0x02c7, B:138:0x02c9, B:140:0x02ce, B:144:0x02df, B:146:0x02f7, B:147:0x02fa, B:151:0x034b, B:170:0x042e, B:172:0x0458, B:174:0x045f, B:177:0x0469, B:179:0x046f, B:183:0x048d, B:185:0x0493, B:186:0x04a8, B:189:0x04b3, B:208:0x0503, B:214:0x0531, B:218:0x0554, B:222:0x05a0, B:226:0x05bd, B:239:0x0608, B:243:0x062e, B:247:0x0651), top: B:252:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        EnumC4954r9 enumC4954r9;
        long j10;
        Z9 z9;
        C4001ja c4001jaA;
        EnumC4954r9 enumC4954r10;
        EnumC4954r9 enumC4954r11;
        int i10 = this.f18705a;
        long j11 = 1;
        Class<?> cls = Void.TYPE;
        long j12 = 0;
        int i11 = 0;
        try {
            try {
                try {
                    try {
                        switch (i10) {
                            case 0:
                                Z9 z10 = ((C3373ea) obj).f27809b;
                                z10.b(C4001ja.b(z10.c().m() + z10.c().m()));
                                return Optional.empty();
                            case 1:
                                Z9 z11 = ((C3373ea) obj).f27809b;
                                z11.b(C4001ja.c(z11.c().q() + z11.c().q()));
                                return Optional.empty();
                            case 2:
                                Z9 z12 = ((C3373ea) obj).f27809b;
                                z12.b(C4001ja.d(z12.c().n().d(z12.c().n())));
                                return Optional.empty();
                            case 3:
                                C3373ea c3373ea = (C3373ea) obj;
                                try {
                                    long jE = c3373ea.f27811d.e();
                                    for (long j13 = 0; j13 < jE; j13++) {
                                        c3373ea.f27809b.b(C4001ja.a(null));
                                    }
                                    return Optional.empty();
                                } catch (Y9 unused) {
                                    enumC4954r9 = EnumC4954r9.f32823b;
                                    return Optional.of(enumC4954r9);
                                }
                            case 4:
                                Z9 z13 = ((C3373ea) obj).f27809b;
                                z13.b(C4001ja.b(z13.c().m() & z13.c().m()));
                                return Optional.empty();
                            case 5:
                                long[] jArr = {916768482, 1259538933, 805446160, -15648283, -1266372608, 883303887, 6538657, 384868448, 102194872};
                                long j14 = jArr[0];
                                long j15 = jArr[1];
                                long j16 = jArr[2];
                                long j17 = jArr[3];
                                long j18 = jArr[4];
                                long j19 = jArr[5];
                                long j20 = jArr[6];
                                long j21 = jArr[7];
                                long j22 = j20 + (((((~j14) & j15) | j16) + (j18 | (j14 & j17))) - j19);
                                long j23 = j21 % 102194872;
                                Z9 z14 = ((C3373ea) obj).f27809b;
                                z14.b(C4001ja.b(z14.c().m() ^ (j22 ^ j23)));
                                return Optional.empty();
                            case 6:
                                Z9 z15 = ((C3373ea) obj).f27809b;
                                z15.b(C4001ja.b(z15.c().m() | z15.c().m()));
                                return Optional.empty();
                            case 7:
                                Z9 z16 = ((C3373ea) obj).f27809b;
                                z16.b(C4001ja.b(z16.c().m() ^ z16.c().m()));
                                return Optional.empty();
                            case 8:
                                C3373ea c3373ea2 = (C3373ea) obj;
                                try {
                                    Z9 z17 = c3373ea2.f27809b;
                                    long jM = z17.c().m();
                                    W9 w10 = c3373ea2.f27810c;
                                    R9 r10 = c3373ea2.f27811d;
                                    w10.a(r10.b(), 0L, z17.f26124b);
                                    r10.a(jM);
                                    return Optional.empty();
                                } catch (P9 | Q9 unused2) {
                                    enumC4954r9 = EnumC4954r9.f32805J;
                                    return Optional.of(enumC4954r9);
                                } catch (U9 unused3) {
                                    enumC4954r9 = EnumC4954r9.f32815T;
                                    return Optional.of(enumC4954r9);
                                }
                            case 9:
                                C3373ea c3373ea3 = (C3373ea) obj;
                                try {
                                    Z9 z18 = c3373ea3.f27809b;
                                    long jM2 = z18.c().m();
                                    List listO = z18.c().o();
                                    int size = listO.size();
                                    Object objH = z18.c().h();
                                    Object objL = z18.c().l();
                                    if (objL instanceof Method) {
                                        Method method = (Method) objL;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (objH instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) objH).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                List listO2 = ((C4001ja) listO.get(0)).o();
                                                if (listO2.size() == length) {
                                                    int i12 = 0;
                                                    while (i12 < listO2.size()) {
                                                        objArr2[i12] = ((C4001ja) listO2.get(i12)).i(parameterTypes2[i12]);
                                                        i12++;
                                                        j12 = j12;
                                                    }
                                                    j10 = j12;
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                j10 = 0;
                                                while (i11 < size) {
                                                    objArr[i11] = ((C4001ja) listO.get(i11)).i(parameterTypes[i11]);
                                                    i11++;
                                                }
                                            }
                                            try {
                                                Object objInvoke = method.invoke(objH, objArr);
                                                if (method.getReturnType() == Void.class || method.getReturnType() == cls) {
                                                    z9 = c3373ea3.f27809b;
                                                    c4001jaA = C4001ja.a(0);
                                                } else if (jM2 != j10) {
                                                    z9 = c3373ea3.f27809b;
                                                    c4001jaA = C4001ja.g(objInvoke);
                                                } else {
                                                    z9 = c3373ea3.f27809b;
                                                    c4001jaA = C4001ja.a(objInvoke);
                                                }
                                                z9.b(c4001jaA);
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                enumC4954r9 = EnumC4954r9.f32804I;
                                                return Optional.of(enumC4954r9);
                                            }
                                        }
                                    }
                                    return Optional.of(EnumC4954r9.f32803H);
                                } catch (C3625ga unused5) {
                                    enumC4954r9 = EnumC4954r9.f32803H;
                                }
                                break;
                            case 10:
                                int i13 = ((((~2084546560) & 73475461) | 438076064) + ((2084546560 & 611428101) | 2023412224)) - (-1830321789);
                                int i14 = 1073781763 % 1003463633;
                                int i15 = ((((~461273879) & 107429921) | 378966045) + ((461273879 & 283197472) | 1937909388)) - 2133058944;
                                int i16 = 1917305981 % 575705360;
                                C3373ea c3373ea4 = (C3373ea) obj;
                                Z9 z19 = c3373ea4.f27809b;
                                int intExact = Math.toIntExact(z19.c().m());
                                M9 m9N = z19.c().n();
                                M9 m9N2 = z19.c().n();
                                if (m9N.f20778a.length != (i13 ^ i14)) {
                                    return Optional.of(EnumC4954r9.f32821Z);
                                }
                                int[] iArr = new int[i15 ^ i16];
                                ByteBuffer.wrap(m9N.a()).asIntBuffer().get(iArr);
                                E9 e10 = new E9(intExact, iArr);
                                int i17 = ((((~1183912267) & 781500673) | 1683555012) + ((1183912267 & 180666625) | 541077750)) - (-1949988574);
                                int i18 = 1527793660 % 245277883;
                                int i19 = ((((~95266356) & 568641509) | 183483904) + ((95266356 & 553669093) | 504469010)) - 874379764;
                                int i20 = 2026478004 % 1659239833;
                                byte[] bArrA = m9N2.a();
                                int i21 = (((((~1787189168) & 1360184381) | 611517270) + ((1787189168 & 1426637867) | 612056018)) - 1771476931) ^ (1821115873 % 1010014811);
                                byte[] bArr = new byte[i21];
                                int i22 = 0;
                                while (i22 < bArrA.length) {
                                    if (i22 % i21 == 0) {
                                        e10.a(i22 >>> (i17 ^ i18), bArr);
                                    } else if (i22 == 0) {
                                        i22 = 0;
                                        e10.a(i22 >>> (i17 ^ i18), bArr);
                                    }
                                    int i23 = i19 ^ i20;
                                    bArrA[i22] = (byte) (((bArrA[i22] ^ bArr[i22 % i21]) << i23) >> i23);
                                    i22++;
                                }
                                c3373ea4.f27809b.b(C4001ja.d(M9.e(bArrA)));
                                return Optional.empty();
                            case 11:
                                Z9 z20 = ((C3373ea) obj).f27809b;
                                double dQ = z20.c().q();
                                double dQ2 = z20.c().q();
                                if (dQ == 0.0d) {
                                    enumC4954r10 = EnumC4954r9.f32819X;
                                    return Optional.of(enumC4954r10);
                                }
                                z20.b(C4001ja.c(dQ2 / dQ));
                                return Optional.empty();
                            case 12:
                                Z9 z21 = ((C3373ea) obj).f27809b;
                                long jM3 = z21.c().m();
                                long jM4 = z21.c().m();
                                if (jM3 == 0) {
                                    enumC4954r10 = EnumC4954r9.f32819X;
                                    return Optional.of(enumC4954r10);
                                }
                                z21.b(C4001ja.b(jM4 / jM3));
                                return Optional.empty();
                            case 13:
                                try {
                                    ((C3373ea) obj).f27809b.c();
                                    return Optional.empty();
                                } catch (X9 unused6) {
                                    enumC4954r9 = EnumC4954r9.f32814S;
                                    return Optional.of(enumC4954r9);
                                }
                            case 14:
                                C3373ea c3373ea5 = (C3373ea) obj;
                                long jM5 = c3373ea5.f27809b.c().m();
                                Z9 z22 = c3373ea5.f27809b;
                                z22.b(C4001ja.j(z22.d(jM5)));
                                return Optional.empty();
                            case 15:
                                C3373ea c3373ea6 = (C3373ea) obj;
                                long jM6 = c3373ea6.f27810c.b().f23450b + c3373ea6.f27809b.c().m();
                                Z9 z23 = c3373ea6.f27809b;
                                z23.b(C4001ja.j(z23.d(-jM6)));
                                return Optional.empty();
                            case 16:
                                C3373ea c3373ea7 = (C3373ea) obj;
                                long jE2 = c3373ea7.f27810c.b().f23450b + c3373ea7.f27811d.e();
                                Z9 z24 = c3373ea7.f27809b;
                                z24.b(C4001ja.j(z24.d(-jE2)));
                                return Optional.empty();
                            case 17:
                                try {
                                    Z9 z25 = ((C3373ea) obj).f27809b;
                                    if (new C3499fa(true).compare(z25.c(), z25.c()) != 0) {
                                        j11 = 0;
                                    }
                                    z25.b(C4001ja.b(j11));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    enumC4954r9 = EnumC4954r9.f32828e;
                                    return Optional.of(enumC4954r9);
                                }
                            case 18:
                                try {
                                    Z9 z26 = ((C3373ea) obj).f27809b;
                                    String strC = z26.c().n().c();
                                    switch (strC.hashCode()) {
                                        case -1325958191:
                                            if (strC.equals("double")) {
                                                cls = Double.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 104431:
                                            if (strC.equals("int")) {
                                                cls = Integer.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 3039496:
                                            if (strC.equals("byte")) {
                                                cls = Byte.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 3052374:
                                            if (strC.equals("char")) {
                                                cls = Character.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 3327612:
                                            if (strC.equals("long")) {
                                                cls = Long.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 3625364:
                                            if (!strC.equals("void")) {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 64711720:
                                            if (strC.equals("boolean")) {
                                                cls = Boolean.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 97526364:
                                            if (strC.equals("float")) {
                                                cls = Float.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 109413500:
                                            if (strC.equals("short")) {
                                                cls = Short.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        default:
                                            cls = Class.forName(strC);
                                            break;
                                    }
                                    z26.b(C4001ja.a(cls));
                                    return Optional.empty();
                                } catch (C3625ga unused8) {
                                    enumC4954r9 = EnumC4954r9.f32836m;
                                    return Optional.of(enumC4954r9);
                                } catch (ClassNotFoundException unused9) {
                                    enumC4954r9 = EnumC4954r9.f32837v;
                                    return Optional.of(enumC4954r9);
                                }
                            case 19:
                                try {
                                    Z9 z27 = ((C3373ea) obj).f27809b;
                                    List listO3 = z27.c().o();
                                    Class<?>[] clsArr = new Class[listO3.size()];
                                    while (i11 < listO3.size()) {
                                        Object objL2 = ((C4001ja) listO3.get(i11)).l();
                                        if (!(objL2 instanceof Class)) {
                                            enumC4954r11 = EnumC4954r9.f32838w;
                                            return Optional.of(enumC4954r11);
                                        }
                                        clsArr[i11] = (Class) objL2;
                                        i11++;
                                    }
                                    String strC2 = z27.c().n().c();
                                    Object objL3 = z27.c().l();
                                    if (objL3 instanceof Class) {
                                        z27.b(C4001ja.a(((Class) objL3).getMethod(strC2, clsArr)));
                                        return Optional.empty();
                                    }
                                    enumC4954r11 = EnumC4954r9.f32838w;
                                    return Optional.of(enumC4954r11);
                                } catch (C3625ga unused10) {
                                    enumC4954r9 = EnumC4954r9.f32838w;
                                    return Optional.of(enumC4954r9);
                                } catch (NoSuchMethodException unused11) {
                                    enumC4954r9 = EnumC4954r9.f32802G;
                                    return Optional.of(enumC4954r9);
                                } catch (SecurityException unused12) {
                                    enumC4954r9 = EnumC4954r9.f32816U;
                                    return Optional.of(enumC4954r9);
                                }
                            default:
                                int i24 = ((((~306851320) & 2040670728) | 1372152390) + ((306851320 & (-1473639347)) | (-2036492681))) - 244167092;
                                int i25 = 1764892438 % 764851988;
                                Z9 z28 = ((C3373ea) obj).f27809b;
                                long jM7 = z28.c().m();
                                C4001ja c4001jaC = z28.c();
                                C4001ja c4001jaC2 = z28.c();
                                int i26 = c4001jaC2.f30492g;
                                int i27 = (i24 ^ i25) + i26;
                                if (i26 == 0) {
                                    throw null;
                                }
                                if (i27 == 3) {
                                    M9 m9N3 = c4001jaC2.n();
                                    int i28 = ((((~284327308) & 44384696) | 1708231444) + ((284327308 & 1647591593) | 1951966997)) - (-1088446899);
                                    int i29 = 2085308422 % 531900034;
                                    if (jM7 < 0) {
                                        jM7 += (long) m9N3.f20778a.length;
                                    }
                                    if (c4001jaC.f30492g != (i28 ^ i29)) {
                                        throw new C3625ga();
                                    }
                                    if (jM7 >= 0 && jM7 < m9N3.f20778a.length) {
                                        char cCharAt = m9N3.c().charAt((int) jM7);
                                        StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length());
                                        sb.append(cCharAt);
                                        c4001jaC = C4001ja.d(M9.f(sb.toString()));
                                    }
                                } else {
                                    if (i27 != 4) {
                                        throw new C3625ga();
                                    }
                                    List listO4 = c4001jaC2.o();
                                    if (jM7 < 0) {
                                        jM7 += (long) listO4.size();
                                    }
                                    if (jM7 >= 0 && jM7 < listO4.size()) {
                                        c4001jaC = (C4001ja) listO4.get((int) jM7);
                                    }
                                }
                                z28.b(c4001jaC);
                                return Optional.empty();
                        }
                    } catch (X9 unused13) {
                        enumC4954r9 = EnumC4954r9.f32830g;
                    }
                } catch (V9 | X9 unused14) {
                    enumC4954r9 = EnumC4954r9.f32811P;
                }
            } catch (O9 | Q9 | C3625ga unused15) {
                enumC4954r9 = EnumC4954r9.f32812Q;
            }
        } catch (Y9 e11) {
            throw new AssertionError(K9.a("CEiv6BFfPnitUE+D"), e11);
        }
    }
}
