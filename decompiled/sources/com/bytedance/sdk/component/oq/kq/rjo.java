package com.bytedance.sdk.component.oq.kq;

import com.unity3d.services.core.network.model.HttpRequest;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rjo {
    private static final char[] fou = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final int bob;
    private final String csi;
    private final String dgq;
    final String kq;
    private final String nn;
    final String oq;
    private final String rhi;
    private final List<String> rjo;
    private final List<String> syt;

    public static final class kq {
        String fou;
        String kq;
        final List<String> rhi;
        List<String> rjo;
        String syt;
        String oq = "";
        String bob = "";
        int csi = -1;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.oq.kq.rjo$kq$kq, reason: collision with other inner class name */
        enum EnumC0250kq {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public kq() {
            ArrayList arrayList = new ArrayList();
            this.rhi = arrayList;
            arrayList.add("");
        }

        private boolean csi(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean rhi(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public kq bob(String str) {
            if (str != null) {
                return kq(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public kq fou(String str) {
            this.rjo = str != null ? rjo.oq(rjo.kq(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public kq kq(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.kq = "http";
                return this;
            }
            if (!str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.kq = HttpRequest.DEFAULT_SCHEME;
            return this;
        }

        public kq oq(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strCsi = csi(str, 0, str.length());
            if (strCsi == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.fou = strCsi;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.kq);
            sb.append("://");
            if (!this.oq.isEmpty() || !this.bob.isEmpty()) {
                sb.append(this.oq);
                if (!this.bob.isEmpty()) {
                    sb.append(':');
                    sb.append(this.bob);
                }
                sb.append('@');
            }
            if (this.fou.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.fou);
                sb.append(']');
            } else {
                sb.append(this.fou);
            }
            int iKq = kq();
            if (iKq != rjo.kq(this.kq)) {
                sb.append(':');
                sb.append(iKq);
            }
            rjo.kq(sb, this.rhi);
            if (this.rjo != null) {
                sb.append('?');
                rjo.oq(sb, this.rjo);
            }
            if (this.syt != null) {
                sb.append('#');
                sb.append(this.syt);
            }
            return sb.toString();
        }

        private static String csi(String str, int i10, int i11) {
            return com.bytedance.sdk.component.oq.kq.oq.dgq.kq(rjo.kq(str, i10, i11, false));
        }

        private void bob() {
            List<String> list = this.rhi;
            if (list.remove(list.size() - 1).isEmpty() && !this.rhi.isEmpty()) {
                List<String> list2 = this.rhi;
                list2.set(list2.size() - 1, "");
            } else {
                this.rhi.add("");
            }
        }

        private static int fou(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == ':') {
                    return i10;
                }
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private static int rhi(String str, int i10, int i11) {
            try {
                int i12 = Integer.parseInt(rjo.kq(str, i10, i11, "", false, false, false, true, null));
                if (i12 <= 0 || i12 > 65535) {
                    return -1;
                }
                return i12;
            } catch (NumberFormatException unused) {
            }
        }

        public rjo oq() {
            if (this.kq != null) {
                if (this.fou != null) {
                    return new rjo(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int bob(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        int kq() {
            int i10 = this.csi;
            return i10 != -1 ? i10 : rjo.kq(this.kq);
        }

        private kq kq(String str, boolean z9) {
            int i10 = 0;
            while (true) {
                int iKq = com.bytedance.sdk.component.oq.kq.oq.dgq.kq(str, i10, str.length(), "/\\");
                kq(str, i10, iKq, iKq < str.length(), z9);
                i10 = iKq + 1;
                if (i10 > str.length()) {
                    return this;
                }
                str = str;
                z9 = z9;
            }
        }

        private static int oq(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public kq kq(String str, String str2) {
            if (str != null) {
                if (this.rjo == null) {
                    this.rjo = new ArrayList();
                }
                this.rjo.add(rjo.kq(str, " \"'<>#&=", true, false, true, true));
                this.rjo.add(str2 != null ? rjo.kq(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        EnumC0250kq kq(rjo rjoVar, String str) {
            int iKq;
            String str2;
            int i10;
            String str3;
            String str4 = str;
            int iKq2 = com.bytedance.sdk.component.oq.kq.oq.dgq.kq(str4, 0, str4.length());
            int iOq = com.bytedance.sdk.component.oq.kq.oq.dgq.oq(str4, iKq2, str4.length());
            if (oq(str4, iKq2, iOq) != -1) {
                if (str4.regionMatches(true, iKq2, "https:", 0, 6)) {
                    this.kq = HttpRequest.DEFAULT_SCHEME;
                    iKq2 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iKq2, "http:", 0, 5)) {
                        this.kq = "http";
                        iKq2 += 5;
                    } else {
                        return EnumC0250kq.UNSUPPORTED_SCHEME;
                    }
                }
            } else if (rjoVar != null) {
                this.kq = rjoVar.kq;
            } else {
                return EnumC0250kq.MISSING_SCHEME;
            }
            int iBob = bob(str4, iKq2, iOq);
            char c10 = '#';
            if (iBob < 2 && rjoVar != null && rjoVar.kq.equals(this.kq)) {
                this.oq = rjoVar.oq();
                this.bob = rjoVar.bob();
                this.fou = rjoVar.oq;
                this.csi = rjoVar.bob;
                this.rhi.clear();
                this.rhi.addAll(rjoVar.fou());
                if (iKq2 == iOq || str4.charAt(iKq2) == '#') {
                    fou(rjoVar.csi());
                }
                str2 = str4;
            } else {
                int i11 = iKq2 + iBob;
                boolean z9 = false;
                boolean z10 = false;
                while (true) {
                    iKq = com.bytedance.sdk.component.oq.kq.oq.dgq.kq(str4, i11, iOq, "@/\\?#");
                    byte bCharAt = iKq != iOq ? str4.charAt(iKq) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c10 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z9) {
                            int iKq3 = com.bytedance.sdk.component.oq.kq.oq.dgq.kq(str4, i11, iKq, ':');
                            String strKq = rjo.kq(str, i11, iKq3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z10) {
                                strKq = this.oq + "%40" + strKq;
                            }
                            this.oq = strKq;
                            if (iKq3 != iKq) {
                                i10 = iKq;
                                this.bob = rjo.kq(str, iKq3 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z9 = true;
                            } else {
                                i10 = iKq;
                            }
                            str3 = str;
                            z10 = true;
                        } else {
                            i10 = iKq;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.bob);
                            sb.append("%40");
                            str3 = str;
                            sb.append(rjo.kq(str3, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.bob = sb.toString();
                        }
                        i11 = i10 + 1;
                        str4 = str3;
                        c10 = '#';
                    }
                }
                str2 = str4;
                int i12 = i11;
                int iFou = fou(str2, i12, iKq);
                int i13 = iFou + 1;
                if (i13 < iKq) {
                    this.fou = csi(str2, i12, iFou);
                    int iRhi = rhi(str2, i13, iKq);
                    this.csi = iRhi;
                    if (iRhi == -1) {
                        return EnumC0250kq.INVALID_PORT;
                    }
                } else {
                    this.fou = csi(str2, i12, iFou);
                    this.csi = rjo.kq(this.kq);
                }
                if (this.fou == null) {
                    return EnumC0250kq.INVALID_HOST;
                }
                iKq2 = iKq;
            }
            int iKq4 = com.bytedance.sdk.component.oq.kq.oq.dgq.kq(str2, iKq2, iOq, "?#");
            kq(str2, iKq2, iKq4);
            if (iKq4 < iOq && str2.charAt(iKq4) == '?') {
                int iKq5 = com.bytedance.sdk.component.oq.kq.oq.dgq.kq(str2, iKq4, iOq, '#');
                this.rjo = rjo.oq(rjo.kq(str2, iKq4 + 1, iKq5, " \"'<>#", true, false, true, true, null));
                iKq4 = iKq5;
            }
            if (iKq4 < iOq && str2.charAt(iKq4) == '#') {
                this.syt = rjo.kq(str2, iKq4 + 1, iOq, "", true, false, false, false, null);
            }
            return EnumC0250kq.SUCCESS;
        }

        private void kq(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.rhi;
                list.set(list.size() - 1, "");
            } else {
                this.rhi.clear();
                this.rhi.add("");
                i10++;
            }
            int i12 = i10;
            while (i12 < i11) {
                int iKq = com.bytedance.sdk.component.oq.kq.oq.dgq.kq(str, i12, i11, "/\\");
                boolean z9 = iKq < i11;
                String str2 = str;
                kq(str2, i12, iKq, z9, true);
                if (z9) {
                    iKq++;
                }
                i12 = iKq;
                str = str2;
            }
        }

        private void kq(String str, int i10, int i11, boolean z9, boolean z10) {
            String strKq = rjo.kq(str, i10, i11, " \"<>^`{}|/\\?#", z10, false, false, true, null);
            if (csi(strKq)) {
                return;
            }
            if (rhi(strKq)) {
                bob();
                return;
            }
            List<String> list = this.rhi;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.rhi;
                list2.set(list2.size() - 1, strKq);
            } else {
                this.rhi.add(strKq);
            }
            if (z9) {
                this.rhi.add("");
            }
        }
    }

    rjo(kq kqVar) {
        this.kq = kqVar.kq;
        this.csi = kq(kqVar.oq, false);
        this.rhi = kq(kqVar.bob, false);
        this.oq = kqVar.fou;
        this.bob = kqVar.kq();
        this.rjo = kq(kqVar.rhi, false);
        List<String> list = kqVar.rjo;
        this.syt = list != null ? kq(list, true) : null;
        String str = kqVar.syt;
        this.dgq = str != null ? kq(str, false) : null;
        this.nn = kqVar.toString();
    }

    public String bob() {
        if (this.rhi.isEmpty()) {
            return "";
        }
        return this.nn.substring(this.nn.indexOf(58, this.kq.length() + 3) + 1, this.nn.indexOf(64));
    }

    public String csi() {
        if (this.syt == null) {
            return null;
        }
        int iIndexOf = this.nn.indexOf(63) + 1;
        String str = this.nn;
        return this.nn.substring(iIndexOf, com.bytedance.sdk.component.oq.kq.oq.dgq.kq(str, iIndexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof rjo) && ((rjo) obj).nn.equals(this.nn);
    }

    public List<String> fou() {
        int iIndexOf = this.nn.indexOf(47, this.kq.length() + 3);
        String str = this.nn;
        int iKq = com.bytedance.sdk.component.oq.kq.oq.dgq.kq(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iKq) {
            int i10 = iIndexOf + 1;
            int iKq2 = com.bytedance.sdk.component.oq.kq.oq.dgq.kq(this.nn, i10, iKq, '/');
            arrayList.add(this.nn.substring(i10, iKq2));
            iIndexOf = iKq2;
        }
        return arrayList;
    }

    public int hashCode() {
        return this.nn.hashCode();
    }

    public URL kq() {
        try {
            return new URL(this.nn);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String oq() {
        if (this.csi.isEmpty()) {
            return "";
        }
        int length = this.kq.length() + 3;
        String str = this.nn;
        return this.nn.substring(length, com.bytedance.sdk.component.oq.kq.oq.dgq.kq(str, length, str.length(), ":@"));
    }

    public String toString() {
        return this.nn;
    }

    public static int kq(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    public static rjo bob(String str) {
        kq kqVar = new kq();
        if (kqVar.kq((rjo) null, str) == kq.EnumC0250kq.SUCCESS) {
            return kqVar.oq();
        }
        return null;
    }

    static void kq(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb.append('/');
            sb.append(list.get(i10));
        }
    }

    static void oq(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static String kq(String str, boolean z9) {
        return kq(str, 0, str.length(), z9);
    }

    private List<String> kq(List<String> list, boolean z9) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? kq(str, z9) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static List<String> oq(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    static String kq(String str, int i10, int i11, boolean z9) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z9)) {
                com.bytedance.sdk.component.oq.kq.oq.kq kqVar = new com.bytedance.sdk.component.oq.kq.oq.kq();
                kqVar.kq(str, i10, i12);
                kq(kqVar, str, i12, i11, z9);
                return kqVar.bob();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    static void kq(com.bytedance.sdk.component.oq.kq.oq.kq kqVar, String str, int i10, int i11, boolean z9) {
        int i12;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iKq = com.bytedance.sdk.component.oq.kq.oq.dgq.kq(str.charAt(i10 + 1));
                int iKq2 = com.bytedance.sdk.component.oq.kq.oq.dgq.kq(str.charAt(i12));
                if (iKq != -1 && iKq2 != -1) {
                    kqVar.oq((iKq << 4) + iKq2);
                    i10 = i12;
                } else {
                    kqVar.kq(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z9) {
                kqVar.oq(32);
            } else {
                kqVar.kq(iCodePointAt);
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    static boolean kq(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.bytedance.sdk.component.oq.kq.oq.dgq.kq(str.charAt(i10 + 1)) != -1 && com.bytedance.sdk.component.oq.kq.oq.dgq.kq(str.charAt(i12)) != -1;
    }

    static String kq(String str, int i10, int i11, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z12) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z9 && (!z10 || kq(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z11)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.bytedance.sdk.component.oq.kq.oq.kq kqVar = new com.bytedance.sdk.component.oq.kq.oq.kq();
                kqVar.kq(str, i10, iCharCount);
                kq(kqVar, str, iCharCount, i11, str2, z9, z10, z11, z12, charset);
                return kqVar.bob();
            }
        }
        return str.substring(i10, i11);
    }

    static void kq(com.bytedance.sdk.component.oq.kq.oq.kq kqVar, String str, int i10, int i11, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) {
        com.bytedance.sdk.component.oq.kq.oq.kq kqVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z9 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z11) {
                    kqVar.kq(z9 ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z12) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z9 && (!z10 || kq(str, i10, i11)))))) {
                    kqVar.kq(iCodePointAt);
                } else {
                    if (kqVar2 == null) {
                        kqVar2 = new com.bytedance.sdk.component.oq.kq.oq.kq();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.oq.kq.oq.dgq.kq)) {
                        kqVar2.kq(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        kqVar2.kq(iCodePointAt);
                    }
                    while (!kqVar2.kq()) {
                        byte bOq = kqVar2.oq();
                        kqVar.oq(37);
                        char[] cArr = fou;
                        kqVar.oq((int) cArr[((bOq & 255) >> 4) & 15]);
                        kqVar.oq((int) cArr[bOq & 15]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    static String kq(String str, String str2, boolean z9, boolean z10, boolean z11, boolean z12) {
        return kq(str, 0, str.length(), str2, z9, z10, z11, z12, null);
    }
}
