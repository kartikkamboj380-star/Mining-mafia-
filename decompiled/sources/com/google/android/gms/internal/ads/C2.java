package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C2 {
    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static C5948z2 b(P10 p10, boolean z9, boolean z10) throws C2817a9 {
        if (z9) {
            d(3, p10, false);
        }
        String strK = p10.k((int) p10.a(), StandardCharsets.UTF_8);
        int length = strK.length();
        long jA = p10.a();
        String[] strArr = new String[(int) jA];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jA; i10++) {
            String strK2 = p10.k((int) p10.a(), StandardCharsets.UTF_8);
            strArr[i10] = strK2;
            length2 = length2 + 4 + strK2.length();
        }
        if (z10 && (p10.R() & 1) == 0) {
            throw C2817a9.b("framing bit expected to be set", null);
        }
        return new C5948z2(strK, strArr, length2 + 1);
    }

    public static V6 c(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = AbstractC4634ob0.f32117a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                YU.c("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C4942r3.b(new P10(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e10) {
                    YU.d("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new P3(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new V6(arrayList);
    }

    public static boolean d(int i10, P10 p10, boolean z9) throws C2817a9 {
        if (p10.C() < 7) {
            if (z9) {
                return false;
            }
            int iC = p10.C();
            StringBuilder sb = new StringBuilder(String.valueOf(iC).length() + 18);
            sb.append("too short header: ");
            sb.append(iC);
            throw C2817a9.b(sb.toString(), null);
        }
        if (p10.R() != i10) {
            if (z9) {
                return false;
            }
            throw C2817a9.b("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        }
        if (p10.R() == 118 && p10.R() == 111 && p10.R() == 114 && p10.R() == 98 && p10.R() == 105 && p10.R() == 115) {
            return true;
        }
        if (z9) {
            return false;
        }
        throw C2817a9.b("expected characters 'vorbis'", null);
    }
}
