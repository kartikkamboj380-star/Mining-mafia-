package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4011jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2701Ye f30515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30517c;

    public C4011jf(int i10, int i11, int i12) {
        this.f30516b = i10;
        i11 = (i11 > 64 || i11 < 0) ? 64 : i11;
        if (i12 <= 0) {
            this.f30517c = 1;
        } else {
            this.f30517c = i12;
        }
        this.f30515a = new C3635gf(i11);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    public final String a(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new C3761hf(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((C2649Xe) arrayList2.get(i10)).e()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (String str : strArrSplit) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i11 = 1;
                        boolean z9 = false;
                        while (true) {
                            int i12 = i11 + 2;
                            if (i12 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i11) == '\'') {
                                if (sb.charAt(i11 - 1) != ' ') {
                                    int i13 = i11 + 1;
                                    if ((sb.charAt(i13) == 's' || sb.charAt(i13) == 'S') && (i12 == sb.length() || sb.charAt(i12) == ' ')) {
                                        sb.insert(i11, ' ');
                                        i11 = i12;
                                    } else {
                                        sb.setCharAt(i11, ' ');
                                    }
                                } else {
                                    sb.setCharAt(i11, ' ');
                                }
                                z9 = true;
                            }
                            i11++;
                        }
                        String string = z9 ? sb.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    }
                    String[] strArrB = AbstractC3132cf.b(str, true);
                    int length = strArrB.length;
                    int i14 = this.f30517c;
                    if (length >= i14) {
                        for (int i15 = 0; i15 < strArrB.length; i15++) {
                            String strConcat = "";
                            for (int i16 = 0; i16 < i14; i16++) {
                                int i17 = i15 + i16;
                                if (i17 >= strArrB.length) {
                                    break;
                                }
                                if (i16 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrB[i17]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= this.f30516b) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.f30516b) {
                            break loop0;
                        }
                    }
                }
            }
        }
        C2881af c2881af = new C2881af();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                c2881af.f26588b.write(this.f30515a.a((String) it.next()));
            } catch (IOException e10) {
                int i18 = AbstractC0786o0.f2696b;
                L4.p.d("Error while writing hash to byteStream", e10);
            }
        }
        return c2881af.toString();
    }
}
