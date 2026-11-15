package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class G9 implements InterfaceC2871aa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ G9 f18952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ G9 f18953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ G9 f18954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ G9 f18955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ G9 f18956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ G9 f18957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ G9 f18958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ G9 f18959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ G9 f18960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ G9 f18961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ G9 f18962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ G9 f18963m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ G9 f18964n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ G9 f18965o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ G9 f18966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ G9 f18967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ G9 f18968r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ G9 f18969s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ G9 f18970t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ G9 f18971u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ G9 f18972v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f18973a;

    static {
        int i10 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i11 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i12 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i13 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i14 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i15 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i16 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        f18972v = new G9((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        f18971u = new G9((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        f18970t = new G9((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        f18969s = new G9(i16);
        f18968r = new G9(i13);
        f18967q = new G9(i14);
        G9 g10 = new G9(i15);
        int i17 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i18 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i19 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i20 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i21 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i22 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i23 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i24 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i25 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        f18966p = g10;
        f18965o = new G9(i12);
        f18964n = new G9(i17);
        f18963m = new G9(i18);
        f18962l = new G9(i19);
        f18961k = new G9(i11);
        f18960j = new G9(i20);
        f18959i = new G9(i21);
        f18958h = new G9(i22);
        f18957g = new G9(i10);
        f18956f = new G9(i23);
        f18955e = new G9(i24);
        f18954d = new G9(i25);
        f18953c = new G9(1);
        f18952b = new G9(0);
    }

    private /* synthetic */ G9(int i10) {
        this.f18973a = i10;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        EnumC4954r9 enumC4954r9;
        long j10 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.f18973a) {
                                            case 0:
                                                C3373ea c3373ea = (C3373ea) obj;
                                                Z9 z9 = c3373ea.f27809b;
                                                long jM = z9.c().m();
                                                if (z9.c().m() != 0) {
                                                    c3373ea.f27811d.a(jM);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    Z9 z10 = ((C3373ea) obj).f27809b;
                                                    long jM2 = z10.c().m();
                                                    C4001ja c4001jaC = z10.c();
                                                    C4001ja c4001jaC2 = z10.c();
                                                    List listO = c4001jaC2.o();
                                                    if (jM2 < 0) {
                                                        jM2 += (long) (listO.size() + 1);
                                                    }
                                                    if (jM2 < 0 || jM2 >= listO.size() + 1) {
                                                        throw new C3751ha();
                                                    }
                                                    listO.add((int) jM2, c4001jaC);
                                                    z10.b(c4001jaC2);
                                                    return Optional.empty();
                                                } catch (C3751ha unused) {
                                                    enumC4954r9 = EnumC4954r9.f32822a0;
                                                }
                                                break;
                                            case 2:
                                                C3373ea c3373ea2 = (C3373ea) obj;
                                                Z9 z11 = c3373ea2.f27809b;
                                                long jM3 = z11.c().m();
                                                if (z11.c().m() == 0) {
                                                    c3373ea2.f27811d.a(jM3);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                Z9 z12 = ((C3373ea) obj).f27809b;
                                                z12.b(C4001ja.b(z12.c().o().size()));
                                                return Optional.empty();
                                            case 4:
                                                Z9 z13 = ((C3373ea) obj).f27809b;
                                                z13.b(C4001ja.b(z13.c().n().f20778a.length));
                                                return Optional.empty();
                                            case 5:
                                                Z9 z14 = ((C3373ea) obj).f27809b;
                                                z14.b(C4001ja.c(Math.log(z14.c().q())));
                                                return Optional.empty();
                                            case 6:
                                                Z9 z15 = ((C3373ea) obj).f27809b;
                                                long jM4 = z15.c().m();
                                                long jM5 = z15.c().m();
                                                if (jM4 == 0 || jM5 == 0) {
                                                    j10 = 0;
                                                }
                                                z15.b(C4001ja.b(j10));
                                                return Optional.empty();
                                            case 7:
                                                Z9 z16 = ((C3373ea) obj).f27809b;
                                                if (z16.c().m() != 0) {
                                                    j10 = 0;
                                                }
                                                z16.b(C4001ja.b(j10));
                                                return Optional.empty();
                                            case 8:
                                                Z9 z17 = ((C3373ea) obj).f27809b;
                                                long jM6 = z17.c().m();
                                                long jM7 = z17.c().m();
                                                if (jM6 == 0 && jM7 == 0) {
                                                    j10 = 0;
                                                }
                                                z17.b(C4001ja.b(j10));
                                                return Optional.empty();
                                            case 9:
                                                C3373ea c3373ea3 = (C3373ea) obj;
                                                Z9 z18 = c3373ea3.f27809b;
                                                try {
                                                    int iCompare = new C3499fa(false).compare(z18.c(), z18.c());
                                                    Z9 z19 = c3373ea3.f27809b;
                                                    if (iCompare >= 0) {
                                                        j10 = 0;
                                                    }
                                                    z19.b(C4001ja.b(j10));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(EnumC4954r9.f32828e);
                                                }
                                            case 10:
                                                int[] iArr = {1944216249, 348137722, 926438168, 13122018, 1882968836, -1273372307, 246144337, 1723705710, 1677157265};
                                                int i10 = iArr[0];
                                                int i11 = iArr[1];
                                                int i12 = iArr[2];
                                                int i13 = iArr[3];
                                                int i14 = iArr[4];
                                                int i15 = iArr[5];
                                                int i16 = iArr[6];
                                                int i17 = iArr[7];
                                                int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
                                                int i19 = i17 % 1677157265;
                                                C3373ea c3373ea4 = (C3373ea) obj;
                                                try {
                                                    Z9 z20 = c3373ea4.f27809b;
                                                    long jM8 = z20.c().m();
                                                    C5710x9 c5710x9 = c3373ea4.f27808a;
                                                    Z9 z21 = new Z9(i19 ^ i18);
                                                    for (int i20 = 0; i20 < z20.f26124b; i20++) {
                                                        try {
                                                            z21.b(C4001ja.j((C4001ja) z20.f26123a.get(i20)));
                                                        } catch (Y9 e10) {
                                                            throw new AssertionError(K9.a("CEiv6BFfPnitUE+D"), e10);
                                                        }
                                                    }
                                                    R9 r10 = c3373ea4.f27811d;
                                                    new C3373ea(c5710x9, z21, new R9(r10.f22737b, r10.f22736a, r10.f22738c.zzc(), r10.f22739d)).f27811d.a(jM8);
                                                    z20.b(C4001ja.a(new I9()));
                                                    return Optional.empty();
                                                } catch (P9 | Q9 unused3) {
                                                    enumC4954r9 = EnumC4954r9.f32807L;
                                                }
                                                break;
                                            case 11:
                                                try {
                                                    Z9 z22 = ((C3373ea) obj).f27809b;
                                                    z22.b(C4001ja.a(z22.c().i((Class) z22.c().l())));
                                                    return Optional.empty();
                                                } catch (C3625ga unused4) {
                                                    enumC4954r9 = EnumC4954r9.f32803H;
                                                }
                                                break;
                                            case 12:
                                                Z9 z23 = ((C3373ea) obj).f27809b;
                                                long jM9 = z23.c().m();
                                                long jM10 = z23.c().m();
                                                if (jM9 == 0) {
                                                    return Optional.of(EnumC4954r9.f32819X);
                                                }
                                                z23.b(C4001ja.b(jM10 % jM9));
                                                return Optional.empty();
                                            case 13:
                                                Z9 z24 = ((C3373ea) obj).f27809b;
                                                z24.b(C4001ja.c(z24.c().q() * z24.c().q()));
                                                return Optional.empty();
                                            case 14:
                                                Z9 z25 = ((C3373ea) obj).f27809b;
                                                z25.b(C4001ja.b(z25.c().m() * z25.c().m()));
                                                return Optional.empty();
                                            case 15:
                                                Z9 z26 = ((C3373ea) obj).f27809b;
                                                long jM11 = z26.c().m();
                                                ArrayList arrayList = new ArrayList();
                                                for (long j11 = 0; j11 < jM11; j11++) {
                                                    arrayList.add(z26.c());
                                                }
                                                Collections.reverse(arrayList);
                                                z26.b(C4001ja.e(arrayList));
                                                return Optional.empty();
                                            case 16:
                                                Z9 z27 = ((C3373ea) obj).f27809b;
                                                z27.b(C4001ja.c(Math.pow(z27.c().q(), z27.c().q())));
                                                return Optional.empty();
                                            case 17:
                                                ((C3373ea) obj).f27809b.b(C4001ja.a(null));
                                                return Optional.empty();
                                            case 18:
                                                C3373ea c3373ea5 = (C3373ea) obj;
                                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(c3373ea5.f27811d.f((((((~1201162069L) & 403189074) | 1043752718) + ((1201162069 & 95979632) | 900760100)) - 1766798336) ^ (507611410 % 329370448)).a());
                                                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                                c3373ea5.f27809b.b(C4001ja.c(Double.longBitsToDouble(byteBufferWrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                C3373ea c3373ea6 = (C3373ea) obj;
                                                c3373ea6.f27809b.b(C4001ja.b(c3373ea6.f27811d.e()));
                                                return Optional.empty();
                                            default:
                                                long j12 = ((((~346030096L) & 203234088) | 575197286) + ((346030096 & 2352425736L) | 2745332883L)) - 1505840317;
                                                long j13 = 1246101662 % 372004513;
                                                long j14 = ((((~1810821955L) & 1747262537) | 563863662) + ((1810821955 & 1295301633) | 94020008)) - 1690999106;
                                                long j15 = 1675644664 % 749217043;
                                                C3373ea c3373ea7 = (C3373ea) obj;
                                                R9 r11 = c3373ea7.f27811d;
                                                long jE = r11.e();
                                                if (jE >= 0 && jE <= (j12 ^ j13)) {
                                                    if (((j14 ^ j15) & jE) != 0) {
                                                        return Optional.of(EnumC4954r9.f32829f);
                                                    }
                                                    c3373ea7.f27809b.b(C4001ja.d(r11.f(jE)));
                                                    return Optional.empty();
                                                }
                                                return Optional.of(EnumC4954r9.f32813R);
                                        }
                                    } catch (Q9 unused5) {
                                        enumC4954r9 = EnumC4954r9.f32813R;
                                    }
                                } catch (X9 unused6) {
                                    enumC4954r9 = EnumC4954r9.f32811P;
                                }
                            } catch (O9 unused7) {
                                enumC4954r9 = EnumC4954r9.f32817V;
                            }
                        } catch (C3625ga unused8) {
                            enumC4954r9 = EnumC4954r9.f32812Q;
                        }
                    } catch (P9 e11) {
                        e = e11;
                        throw new AssertionError(K9.a("CEiv6BFfPnitUE+D"), e);
                    }
                } catch (Y9 unused9) {
                    enumC4954r9 = EnumC4954r9.f32823b;
                }
            } catch (P9 | Q9 unused10) {
                enumC4954r9 = EnumC4954r9.f32833j;
            }
        } catch (Y9 e12) {
            e = e12;
            throw new AssertionError(K9.a("CEiv6BFfPnitUE+D"), e);
        }
        return Optional.of(enumC4954r9);
    }
}
