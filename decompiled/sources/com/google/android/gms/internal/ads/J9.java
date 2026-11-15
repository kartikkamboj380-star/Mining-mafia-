package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class J9 implements InterfaceC2871aa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ J9 f19771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ J9 f19772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ J9 f19773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ J9 f19774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ J9 f19775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ J9 f19776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ J9 f19777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ J9 f19778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ J9 f19779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ J9 f19780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ J9 f19781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ J9 f19782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ J9 f19783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ J9 f19784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ J9 f19785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ J9 f19786q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f19787a;

    static {
        int i10 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i11 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i12 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i13 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i14 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i15 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i16 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i17 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i18 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i19 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i20 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i21 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        f19786q = new J9((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        f19785p = new J9((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        f19784o = new J9(i21);
        f19783n = new J9(i12);
        f19782m = new J9(i13);
        f19781l = new J9(i14);
        f19780k = new J9(i11);
        f19779j = new J9(i15);
        f19778i = new J9(i16);
        f19777h = new J9(i17);
        f19776g = new J9(i10);
        f19775f = new J9(i18);
        f19774e = new J9(i19);
        f19773d = new J9(i20);
        f19772c = new J9(1);
        f19771b = new J9(0);
    }

    private /* synthetic */ J9(int i10) {
        this.f19787a = i10;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        EnumC4954r9 enumC4954r9;
        C4001ja c4001jaC;
        int i10 = ((((~603123090) & 1079339320) | 204100681) + ((603123090 & 1131784560) | 52466888)) - 1316176740;
        int i11 = 1216803069 % 33252481;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.f19787a) {
                                case 0:
                                    return ((C3373ea) obj).a();
                                case 1:
                                    try {
                                        Z9 z9 = ((C3373ea) obj).f27809b;
                                        long jM = z9.c().m();
                                        C4001ja c4001jaC2 = z9.c();
                                        List listO = c4001jaC2.o();
                                        if (jM < 0) {
                                            jM += (long) listO.size();
                                        }
                                        if (jM < 0 || jM >= listO.size()) {
                                            throw new C3751ha();
                                        }
                                        listO.remove((int) jM);
                                        z9.b(c4001jaC2);
                                        return Optional.empty();
                                    } catch (C3751ha unused) {
                                        enumC4954r9 = EnumC4954r9.f32822a0;
                                    }
                                    break;
                                case 2:
                                    C3373ea c3373ea = (C3373ea) obj;
                                    Z9 z10 = c3373ea.f27809b;
                                    C4001ja c4001jaC3 = z10.c();
                                    M9 m9N = z10.c().n();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    c4001jaC3.k(byteArrayOutputStream);
                                    c3373ea.f27809b.b(C4001ja.d(m9N.d(M9.e(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    C3373ea c3373ea2 = (C3373ea) obj;
                                    Z9 z11 = c3373ea2.f27809b;
                                    C4001ja c4001jaC4 = z11.c();
                                    M9 m9N2 = z11.c().n();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    I9.b(c4001jaC4.m(), new C3877ia(byteArrayOutputStream2, i10 ^ i11), false);
                                    c3373ea2.f27809b.b(C4001ja.d(m9N2.d(M9.e(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    C3373ea c3373ea3 = (C3373ea) obj;
                                    c3373ea3.f27809b.e(-(c3373ea3.f27810c.b().f23450b + c3373ea3.f27811d.e()), c3373ea3.f27809b.c());
                                    return Optional.empty();
                                case 5:
                                    Z9 z12 = ((C3373ea) obj).f27809b;
                                    z12.b(C4001ja.b(z12.c().m() << ((int) z12.c().m())));
                                    return Optional.empty();
                                case 6:
                                    Z9 z13 = ((C3373ea) obj).f27809b;
                                    z13.b(C4001ja.b(z13.c().m() >>> ((int) z13.c().m())));
                                    return Optional.empty();
                                case 7:
                                    Z9 z14 = ((C3373ea) obj).f27809b;
                                    z14.b(C4001ja.c(z14.c().q() - z14.c().q()));
                                    return Optional.empty();
                                case 8:
                                    Z9 z15 = ((C3373ea) obj).f27809b;
                                    z15.b(C4001ja.b(z15.c().m() - z15.c().m()));
                                    return Optional.empty();
                                case 9:
                                    C3373ea c3373ea4 = (C3373ea) obj;
                                    Z9 z16 = c3373ea4.f27809b;
                                    long jM2 = z16.c().m();
                                    C4001ja c4001jaC5 = z16.c();
                                    Z9 z17 = c3373ea4.f27809b;
                                    C4001ja c4001jaD = z17.d(jM2);
                                    z17.e(jM2, c4001jaC5);
                                    z17.b(c4001jaD);
                                    return Optional.empty();
                                case 10:
                                    C3373ea c3373ea5 = (C3373ea) obj;
                                    Z9 z18 = c3373ea5.f27809b;
                                    long jM3 = c3373ea5.f27810c.b().f23450b + z18.c().m();
                                    C4001ja c4001jaC6 = z18.c();
                                    Z9 z19 = c3373ea5.f27809b;
                                    long j10 = -jM3;
                                    C4001ja c4001jaD2 = z19.d(j10);
                                    z19.e(j10, c4001jaC6);
                                    z19.b(c4001jaD2);
                                    return Optional.empty();
                                case 11:
                                    C3373ea c3373ea6 = (C3373ea) obj;
                                    long jE = c3373ea6.f27810c.b().f23450b + c3373ea6.f27811d.e();
                                    C4001ja c4001jaC7 = c3373ea6.f27809b.c();
                                    Z9 z20 = c3373ea6.f27809b;
                                    long j11 = -jE;
                                    C4001ja c4001jaD3 = z20.d(j11);
                                    z20.e(j11, c4001jaC7);
                                    z20.b(c4001jaD3);
                                    return Optional.empty();
                                case 12:
                                    C3373ea c3373ea7 = (C3373ea) obj;
                                    long jM4 = c3373ea7.f27809b.c().m();
                                    try {
                                        Z9 z21 = c3373ea7.f27809b;
                                        int i12 = ((((~1349029729) & 1683806466) | 298308136) + ((1349029729 & (-199751405)) | (-1830723495))) - 438321650;
                                        int i13 = 1478326644 % 593443203;
                                        if (jM4 == 0) {
                                            c4001jaC = z21.c();
                                        } else {
                                            int iA = z21.a(jM4);
                                            z21.f26124b += i12 ^ i13;
                                            c4001jaC = (C4001ja) z21.f26123a.remove(iA);
                                        }
                                        z21.b(c4001jaC);
                                        return Optional.empty();
                                    } catch (X9 unused2) {
                                        enumC4954r9 = EnumC4954r9.f32831h;
                                    }
                                    break;
                                case 13:
                                    C3373ea c3373ea8 = (C3373ea) obj;
                                    try {
                                        Z9 z22 = c3373ea8.f27809b;
                                        long jM5 = z22.c().m();
                                        long jM6 = z22.c().m();
                                        W9 w10 = c3373ea8.f27810c;
                                        R9 r10 = c3373ea8.f27811d;
                                        w10.a(r10.b(), jM6, w10.b().f23450b);
                                        r10.a(jM5);
                                        return Optional.empty();
                                    } catch (P9 | Q9 unused3) {
                                        enumC4954r9 = EnumC4954r9.f32805J;
                                    } catch (U9 unused4) {
                                        enumC4954r9 = EnumC4954r9.f32815T;
                                    } catch (V9 unused5) {
                                        enumC4954r9 = EnumC4954r9.f32810O;
                                    }
                                    break;
                                case 14:
                                    C3373ea c3373ea9 = (C3373ea) obj;
                                    try {
                                        c3373ea9.f27809b.b(C4001ja.g(c3373ea9.f27809b.c().l()));
                                        return Optional.empty();
                                    } catch (C3625ga unused6) {
                                        enumC4954r9 = EnumC4954r9.f32803H;
                                    }
                                    break;
                                default:
                                    try {
                                        Z9 z23 = ((C3373ea) obj).f27809b;
                                        Iterator it = z23.c().o().iterator();
                                        while (it.hasNext()) {
                                            z23.b((C4001ja) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (Y9 unused7) {
                                        enumC4954r9 = EnumC4954r9.f32823b;
                                    }
                                    break;
                            }
                        } catch (Y9 e10) {
                            e = e10;
                            throw new AssertionError(K9.a("CEiv6BFfPnitUE+D"), e);
                        }
                    } catch (X9 unused8) {
                        enumC4954r9 = EnumC4954r9.f32832i;
                    }
                } catch (V9 | X9 unused9) {
                    enumC4954r9 = EnumC4954r9.f32811P;
                }
            } catch (O9 | Q9 | C3625ga unused10) {
                enumC4954r9 = EnumC4954r9.f32812Q;
            }
        } catch (C3625ga unused11) {
            enumC4954r9 = EnumC4954r9.f32835l;
        } catch (IOException e11) {
            e = e11;
            throw new AssertionError(K9.a("CEiv6BFfPnitUE+D"), e);
        }
        return Optional.of(enumC4954r9);
    }
}
