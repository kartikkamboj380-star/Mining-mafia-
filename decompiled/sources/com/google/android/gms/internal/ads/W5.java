package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
final class W5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f24679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3062c6 f24681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f24682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f24683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f24684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final W5 f24685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap f24686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashMap f24687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f24688m;

    private W5(String str, String str2, long j10, long j11, C3062c6 c3062c6, String[] strArr, String str3, String str4, W5 w10) {
        this.f24676a = str;
        this.f24677b = str2;
        this.f24684i = str4;
        this.f24681f = c3062c6;
        this.f24682g = strArr;
        this.f24678c = str2 != null;
        this.f24679d = j10;
        this.f24680e = j11;
        str3.getClass();
        this.f24683h = str3;
        this.f24685j = w10;
        this.f24686k = new HashMap();
        this.f24687l = new HashMap();
    }

    public static W5 a(String str) {
        return new W5(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static W5 b(String str, long j10, long j11, C3062c6 c3062c6, String[] strArr, String str2, String str3, W5 w10) {
        return new W5(str, null, j10, j11, c3062c6, strArr, str2, str3, w10);
    }

    private final void i(TreeSet treeSet, boolean z9) {
        String str = this.f24676a;
        boolean zEquals = "p".equals(str);
        if (z9 || zEquals || ("div".equals(str) && this.f24684i != null)) {
            long j10 = this.f24679d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f24680e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f24688m != null) {
            for (int i10 = 0; i10 < this.f24688m.size(); i10++) {
                W5 w10 = (W5) this.f24688m.get(i10);
                boolean z10 = true;
                if (!z9 && !zEquals) {
                    z10 = false;
                }
                w10.i(treeSet, z10);
            }
        }
    }

    private final void j(long j10, String str, List list) {
        String str2;
        String str3 = this.f24683h;
        boolean zEquals = "".equals(str3);
        boolean zC = c(j10);
        if (true != zEquals) {
            str = str3;
        }
        if (zC && "div".equals(this.f24676a) && (str2 = this.f24684i) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < f(); i10++) {
            e(i10).j(j10, str, list);
        }
    }

    private final void k(long j10, boolean z9, String str, Map map) {
        HashMap map2 = this.f24686k;
        map2.clear();
        HashMap map3 = this.f24687l;
        map3.clear();
        String str2 = this.f24676a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f24683h;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.f24678c && z9) {
            SpannableStringBuilder spannableStringBuilderL = l(str4, map);
            String str5 = this.f24677b;
            str5.getClass();
            spannableStringBuilderL.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z9) {
            l(str4, map).append('\n');
            return;
        }
        if (c(j10)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceB = ((C3955jD) entry.getValue()).b();
                charSequenceB.getClass();
                map2.put(str6, Integer.valueOf(charSequenceB.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i10 = 0; i10 < f(); i10++) {
                e(i10).k(j10, z9 || zEquals, str4, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderL2 = l(str4, map);
                int length = spannableStringBuilderL2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderL2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderL2.charAt(length) != '\n') {
                    spannableStringBuilderL2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceB2 = ((C3955jD) entry2.getValue()).b();
                charSequenceB2.getClass();
                map3.put(str7, Integer.valueOf(charSequenceB2.length()));
            }
        }
    }

    private static SpannableStringBuilder l(String str, Map map) {
        if (!map.containsKey(str)) {
            C3955jD c3955jD = new C3955jD();
            c3955jD.a(new SpannableStringBuilder());
            map.put(str, c3955jD);
        }
        CharSequence charSequenceB = ((C3955jD) map.get(str)).b();
        charSequenceB.getClass();
        return (SpannableStringBuilder) charSequenceB;
    }

    private final void m(long j10, Map map, Map map2, String str, Map map3) {
        W5 w10;
        C3062c6 c3062c6A;
        int i10;
        boolean z9;
        int i11;
        Map map4 = map;
        if (c(j10)) {
            String str2 = this.f24683h;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it = this.f24687l.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str4 = (String) entry.getKey();
                HashMap map5 = this.f24686k;
                int iIntValue = map5.containsKey(str4) ? ((Integer) map5.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C3955jD c3955jD = (C3955jD) map3.get(str4);
                    c3955jD.getClass();
                    C2811a6 c2811a6 = (C2811a6) map2.get(str3);
                    c2811a6.getClass();
                    int i12 = c2811a6.f26424j;
                    C3062c6 c3062c6A2 = AbstractC2937b6.a(this.f24681f, this.f24682g, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c3955jD.b();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c3955jD.a(spannableStringBuilder);
                    }
                    if (c3062c6A2 != null) {
                        W5 w11 = this.f24685j;
                        if (c3062c6A2.o() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(c3062c6A2.o()), iIntValue, iIntValue2, 33);
                        }
                        if (c3062c6A2.p()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (c3062c6A2.r()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (c3062c6A2.z()) {
                            VG.a(spannableStringBuilder, new ForegroundColorSpan(c3062c6A2.x()), iIntValue, iIntValue2, 33);
                        }
                        if (c3062c6A2.C()) {
                            VG.a(spannableStringBuilder, new BackgroundColorSpan(c3062c6A2.A()), iIntValue, iIntValue2, 33);
                        }
                        if (c3062c6A2.v() != null) {
                            VG.a(spannableStringBuilder, new TypefaceSpan(c3062c6A2.v()), iIntValue, iIntValue2, 33);
                        }
                        if (c3062c6A2.e() != null) {
                            V5 v5E = c3062c6A2.e();
                            v5E.getClass();
                            int i13 = v5E.f24198a;
                            if (i13 == -1) {
                                i13 = (i12 == 2 || i12 == 1) ? 3 : 1;
                                i11 = 1;
                            } else {
                                i11 = v5E.f24199b;
                            }
                            int i14 = v5E.f24200c;
                            if (i14 == -2) {
                                i14 = 1;
                            }
                            VG.a(spannableStringBuilder, new C5600wH(i13, i11, i14), iIntValue, iIntValue2, 33);
                        }
                        int iJ = c3062c6A2.J();
                        if (iJ == 2) {
                            while (true) {
                                if (w11 == null) {
                                    w11 = null;
                                    break;
                                }
                                C3062c6 c3062c6A3 = AbstractC2937b6.a(w11.f24681f, w11.f24682g, map4);
                                if (c3062c6A3 != null && c3062c6A3.J() == 1) {
                                    break;
                                } else {
                                    w11 = w11.f24685j;
                                }
                            }
                            if (w11 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(w11);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        w10 = null;
                                        break;
                                    }
                                    W5 w12 = (W5) arrayDeque.pop();
                                    C3062c6 c3062c6A4 = AbstractC2937b6.a(w12.f24681f, w12.f24682g, map4);
                                    if (c3062c6A4 != null && c3062c6A4.J() == 3) {
                                        w10 = w12;
                                        break;
                                    }
                                    for (int iF = w12.f() - 1; iF >= 0; iF--) {
                                        arrayDeque.push(w12.e(iF));
                                    }
                                }
                                if (w10 != null) {
                                    if (w10.f() != 1 || w10.e(0).f24677b == null) {
                                        YU.b("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = w10.e(0).f24677b;
                                        String str6 = AbstractC4634ob0.f32117a;
                                        C3062c6 c3062c6A5 = AbstractC2937b6.a(w10.f24681f, w10.f24682g, map4);
                                        int iL = c3062c6A5 != null ? c3062c6A5.L() : -1;
                                        if (iL == -1 && (c3062c6A = AbstractC2937b6.a(w11.f24681f, w11.f24682g, map4)) != null) {
                                            iL = c3062c6A.L();
                                        }
                                        spannableStringBuilder.setSpan(new C5346uG(str5, iL), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iJ == 3 || iJ == 4) {
                            spannableStringBuilder.setSpan(new U5(), iIntValue, iIntValue2, 33);
                        }
                        if (c3062c6A2.c()) {
                            i10 = 33;
                            VG.a(spannableStringBuilder, new TF(), iIntValue, iIntValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        int i15 = c3062c6A2.i();
                        if (i15 != 1) {
                            if (i15 == 2) {
                                VG.a(spannableStringBuilder, new RelativeSizeSpan(c3062c6A2.j()), iIntValue, iIntValue2, i10);
                            } else if (i15 == 3) {
                                VG.b(spannableStringBuilder, c3062c6A2.j() / 100.0f, iIntValue, iIntValue2, i10);
                            }
                            z9 = true;
                        } else {
                            z9 = true;
                            VG.a(spannableStringBuilder, new AbsoluteSizeSpan((int) c3062c6A2.j(), true), iIntValue, iIntValue2, i10);
                        }
                        if ("p".equals(this.f24676a)) {
                            if (c3062c6A2.E() != Float.MAX_VALUE) {
                                c3955jD.p((c3062c6A2.E() * (-90.0f)) / 100.0f);
                            }
                            if (c3062c6A2.M() != null) {
                                c3955jD.d(c3062c6A2.M());
                            }
                            if (c3062c6A2.a() != null) {
                                c3955jD.e(c3062c6A2.a());
                            }
                        }
                        it = it;
                    }
                }
            }
            int i16 = 0;
            while (i16 < f()) {
                e(i16).m(j10, map4, map2, str3, map3);
                i16++;
                map4 = map;
            }
        }
    }

    public final boolean c(long j10) {
        long j11 = this.f24679d;
        if (j11 == -9223372036854775807L) {
            if (this.f24680e == -9223372036854775807L) {
                return true;
            }
            j11 = -9223372036854775807L;
        }
        if (j11 <= j10 && this.f24680e == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= this.f24680e) {
            return j11 <= j10 && j10 < this.f24680e;
        }
        return true;
    }

    public final void d(W5 w10) {
        if (this.f24688m == null) {
            this.f24688m = new ArrayList();
        }
        this.f24688m.add(w10);
    }

    public final W5 e(int i10) {
        List list = this.f24688m;
        if (list != null) {
            return (W5) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int f() {
        List list = this.f24688m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] g() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public final List h(long j10, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        String str = this.f24683h;
        j(j10, str, arrayList);
        TreeMap treeMap = new TreeMap();
        k(j10, false, str, treeMap);
        m(j10, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C2811a6 c2811a6 = (C2811a6) map2.get(pair.first);
                c2811a6.getClass();
                C3955jD c3955jD = new C3955jD();
                c3955jD.c(bitmapDecodeByteArray);
                c3955jD.i(c2811a6.f26416b);
                c3955jD.j(0);
                c3955jD.f(c2811a6.f26417c, 0);
                c3955jD.g(c2811a6.f26419e);
                c3955jD.m(c2811a6.f26420f);
                c3955jD.n(c2811a6.f26421g);
                c3955jD.o(c2811a6.f26424j);
                arrayList2.add(c3955jD.r());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C2811a6 c2811a7 = (C2811a6) map2.get(entry.getKey());
            c2811a7.getClass();
            C3955jD c3955jD2 = (C3955jD) entry.getValue();
            CharSequence charSequenceB = c3955jD2.b();
            charSequenceB.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceB;
            for (U5 u10 : (U5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), U5.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(u10), spannableStringBuilder.getSpanEnd(u10), (CharSequence) "");
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length()) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i15 = 0;
            while (i15 < spannableStringBuilder.length() - 1) {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i15) == '\n' && spannableStringBuilder.charAt(i16) == ' ') {
                    spannableStringBuilder.delete(i16, i15 + 2);
                }
                i15 = i16;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i17 = 0;
            while (i17 < spannableStringBuilder.length() - 1) {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i17) == ' ' && spannableStringBuilder.charAt(i18) == '\n') {
                    spannableStringBuilder.delete(i17, i18);
                }
                i17 = i18;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c3955jD2.f(c2811a7.f26417c, c2811a7.f26418d);
            c3955jD2.g(c2811a7.f26419e);
            c3955jD2.i(c2811a7.f26416b);
            c3955jD2.m(c2811a7.f26420f);
            c3955jD2.l(c2811a7.f26423i, c2811a7.f26422h);
            c3955jD2.o(c2811a7.f26424j);
            arrayList2.add(c3955jD2.r());
        }
        return arrayList2;
    }
}
