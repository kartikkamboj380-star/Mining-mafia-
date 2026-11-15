package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class S4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C3790ht0 f23110d = C3790ht0.a(AbstractC1743Fs0.b(':'));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C3790ht0 f23111e = C3790ht0.a(AbstractC1743Fs0.b('*'));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23112a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23113b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23114c;

    public final void a() {
        this.f23112a.clear();
        this.f23113b = 0;
    }

    public final int b(J1 j10, C3933j2 c3933j2, List list) {
        byte b10;
        char c10;
        int i10 = this.f23113b;
        if (i10 == 0) {
            long jZzo = j10.zzo();
            c3933j2.f30283a = (jZzo == -1 || jZzo < 8) ? 0L : jZzo - 8;
            this.f23113b = 1;
            return 1;
        }
        int i11 = 2;
        if (i10 != 1) {
            short s10 = 2817;
            short s11 = 2816;
            short s12 = 2192;
            if (i10 != 2) {
                long jZzn = j10.zzn();
                int iZzo = (int) ((j10.zzo() - j10.zzn()) - ((long) this.f23114c));
                P10 p10 = new P10(iZzo);
                j10.I(p10.H(), 0, iZzo);
                int i12 = 0;
                while (true) {
                    List list2 = this.f23112a;
                    if (i12 >= list2.size()) {
                        c3933j2.f30283a = 0L;
                        return 1;
                    }
                    Q4 q10 = (Q4) list2.get(i12);
                    p10.G((int) (q10.f22283a - jZzn));
                    p10.J(4);
                    int iC = p10.c();
                    Charset charset = StandardCharsets.UTF_8;
                    switch (p10.k(iC, charset)) {
                        case "SlowMotion_Data":
                            b10 = 0;
                            break;
                        case "Super_SlowMotion_Edit_Data":
                            b10 = 3;
                            break;
                        case "Super_SlowMotion_Data":
                            b10 = 1;
                            break;
                        case "Super_SlowMotion_Deflickering_On":
                            b10 = 4;
                            break;
                        case "Super_SlowMotion_BGM":
                            b10 = 2;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 0) {
                        c10 = 2192;
                    } else if (b10 == 1) {
                        c10 = 2816;
                    } else if (b10 == 2) {
                        c10 = 2817;
                    } else if (b10 == 3) {
                        c10 = 2819;
                    } else {
                        if (b10 != 4) {
                            throw C2817a9.b("Invalid SEF name", null);
                        }
                        c10 = 2820;
                    }
                    int i13 = q10.f22284b - (iC + 8);
                    if (c10 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List listE = f23111e.e(p10.k(i13, charset));
                        for (int i14 = 0; i14 < listE.size(); i14++) {
                            List listE2 = f23110d.e((CharSequence) listE.get(i14));
                            if (listE2.size() != 3) {
                                throw C2817a9.b(null, null);
                            }
                            try {
                                arrayList.add(new M3(Long.parseLong((String) listE2.get(0)), Long.parseLong((String) listE2.get(1)), 1 << (Integer.parseInt((String) listE2.get(2)) - 1)));
                            } catch (NumberFormatException e10) {
                                throw C2817a9.b(null, e10);
                            }
                        }
                        list.add(new N3(arrayList));
                    } else if (c10 != 2816 && c10 != 2817 && c10 != 2819 && c10 != 2820) {
                        throw new IllegalStateException();
                    }
                    i12++;
                }
            } else {
                long jZzo2 = j10.zzo();
                int i15 = this.f23114c - 20;
                P10 p11 = new P10(i15);
                j10.I(p11.H(), 0, i15);
                int i16 = 0;
                while (i16 < i15 / 12) {
                    p11.J(i11);
                    short sV = p11.V();
                    if (sV == s12 || sV == s11 || sV == s10 || sV == 2819 || sV == 2820) {
                        this.f23112a.add(new Q4(sV, (jZzo2 - ((long) this.f23114c)) - ((long) p11.c()), p11.c()));
                    } else {
                        p11.J(8);
                    }
                    i16++;
                    i15 = i15;
                    i11 = 2;
                    s10 = 2817;
                    s11 = 2816;
                    s12 = 2192;
                }
                List list3 = this.f23112a;
                if (list3.isEmpty()) {
                    c3933j2.f30283a = 0L;
                } else {
                    this.f23113b = 3;
                    c3933j2.f30283a = ((Q4) list3.get(0)).f22283a;
                }
            }
        } else {
            P10 p12 = new P10(8);
            j10.I(p12.H(), 0, 8);
            this.f23114c = p12.c() + 8;
            if (p12.b() != 1397048916) {
                c3933j2.f30283a = 0L;
            } else {
                c3933j2.f30283a = j10.zzn() - ((long) (this.f23114c - 12));
                this.f23113b = 2;
            }
        }
        return 1;
    }
}
