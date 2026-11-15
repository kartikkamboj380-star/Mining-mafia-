package c9;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import r9.C7105h;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f12242k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f12243l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f12248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f12249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f12250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f12251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f12252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f12253j;

    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0205a f12254i = new C0205a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12255a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f12258d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f12260f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f12261g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f12262h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f12256b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f12257c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f12259e = -1;

        /* JADX INFO: renamed from: c9.u$a$a, reason: collision with other inner class name */
        public static final class C0205a {
            public /* synthetic */ C0205a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String str, int i10, int i11) {
                try {
                    int i12 = Integer.parseInt(b.b(u.f12242k, str, i10, i11, "", false, false, false, false, null, 248, null));
                    if (1 > i12 || i12 >= 65536) {
                        return -1;
                    }
                    return i12;
                } catch (NumberFormatException unused) {
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 >= i11) {
                                break;
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (cCharAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((Intrinsics.e(cCharAt, 97) >= 0 && Intrinsics.e(cCharAt, 122) <= 0) || (Intrinsics.e(cCharAt, 65) >= 0 && Intrinsics.e(cCharAt, 90) <= 0)) {
                    while (true) {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i10);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
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

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i10, int i11) {
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

            private C0205a() {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f12260f = arrayList;
            arrayList.add("");
        }

        private final int b() {
            int i10 = this.f12259e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = u.f12242k;
            String str = this.f12255a;
            Intrinsics.c(str);
            return bVar.c(str);
        }

        private final boolean g(String str) {
            return Intrinsics.b(str, ".") || StringsKt.y(str, "%2e", true);
        }

        private final boolean h(String str) {
            return Intrinsics.b(str, "..") || StringsKt.y(str, "%2e.", true) || StringsKt.y(str, ".%2e", true) || StringsKt.y(str, "%2e%2e", true);
        }

        private final void k() {
            List list = this.f12260f;
            if (((String) list.remove(list.size() - 1)).length() != 0 || this.f12260f.isEmpty()) {
                this.f12260f.add("");
            } else {
                List list2 = this.f12260f;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void m(String str, int i10, int i11, boolean z9, boolean z10) {
            String strB = b.b(u.f12242k, str, i10, i11, " \"<>^`{}|/\\?#", z10, false, false, false, null, 240, null);
            if (g(strB)) {
                return;
            }
            if (h(strB)) {
                k();
                return;
            }
            List list = this.f12260f;
            if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                List list2 = this.f12260f;
                list2.set(list2.size() - 1, strB);
            } else {
                this.f12260f.add(strB);
            }
            if (z9) {
                this.f12260f.add("");
            }
        }

        private final void p(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f12260f.clear();
                this.f12260f.add("");
                i10++;
            } else {
                List list = this.f12260f;
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iQ = d9.e.q(str, "/\\", i12, i11);
                boolean z9 = iQ < i11;
                str = str;
                m(str, i12, iQ, z9, true);
                i12 = z9 ? iQ + 1 : iQ;
            }
        }

        public final u a() {
            ArrayList arrayList;
            String str = this.f12255a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = u.f12242k;
            String strH = b.h(bVar, this.f12256b, 0, 0, false, 7, null);
            String strH2 = b.h(bVar, this.f12257c, 0, 0, false, 7, null);
            String str2 = this.f12258d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            List list = this.f12260f;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.h(u.f12242k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f12261g;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? b.h(u.f12242k, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f12262h;
            return new u(str, strH, strH2, str2, iB, arrayList2, arrayList, str4 != null ? b.h(u.f12242k, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final a c(String str) {
            b bVar;
            String strB;
            this.f12261g = (str == null || (strB = b.b((bVar = u.f12242k), str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null)) == null) ? null : bVar.j(strB);
            return this;
        }

        public final a d(String str) {
            this.f12262h = str != null ? b.b(u.f12242k, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        public final List e() {
            return this.f12260f;
        }

        public final a f(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strE = d9.a.e(b.h(u.f12242k, host, 0, 0, false, 7, null));
            if (strE != null) {
                this.f12258d = strE;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final a i(u uVar, String str) {
            String str2;
            int iQ;
            int i10;
            boolean z9;
            int i11;
            int i12;
            int i13;
            char c10;
            int i14;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            int iA = d9.e.A(input, 0, 0, 3, null);
            int iC = d9.e.C(input, iA, 0, 2, null);
            C0205a c0205a = f12254i;
            int iG = c0205a.g(input, iA, iC);
            String str3 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z10 = true;
            int i15 = -1;
            if (iG != -1) {
                if (StringsKt.G(input, "https:", iA, true)) {
                    this.f12255a = HttpRequest.DEFAULT_SCHEME;
                    iA += 6;
                } else {
                    if (!StringsKt.G(input, "http:", iA, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iG);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f12255a = "http";
                    iA += 5;
                }
            } else {
                if (uVar == null) {
                    if (input.length() > 6) {
                        str2 = StringsKt.Z0(input, 6) + "...";
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f12255a = uVar.q();
            }
            int iH = c0205a.h(input, iA, iC);
            int i16 = 63;
            int i17 = 35;
            if (iH >= 2 || uVar == null || !Intrinsics.b(uVar.q(), this.f12255a)) {
                int i18 = iA + iH;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    iQ = d9.e.q(input, "@/\\?#", i18, iC);
                    int iCharAt = iQ != iC ? input.charAt(iQ) : i15;
                    if (iCharAt == i15 || iCharAt == i17 || iCharAt == 47 || iCharAt == 92 || iCharAt == i16) {
                        break;
                    }
                    if (iCharAt == 64) {
                        if (z11) {
                            z9 = z10;
                            i11 = i15;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f12257c);
                            sb2.append("%40");
                            input = str;
                            i12 = iQ;
                            sb2.append(b.b(u.f12242k, input, i18, iQ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f12257c = sb2.toString();
                        } else {
                            int iP = d9.e.p(input, ':', i18, iQ);
                            b bVar = u.f12242k;
                            i11 = i15;
                            z9 = z10;
                            String strB = b.b(bVar, input, i18, iP, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z12) {
                                strB = this.f12256b + "%40" + strB;
                            }
                            this.f12256b = strB;
                            if (iP != iQ) {
                                i13 = iQ;
                                this.f12257c = b.b(bVar, str, iP + 1, i13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = z9;
                            } else {
                                i13 = iQ;
                            }
                            input = str;
                            i12 = i13;
                            z12 = z9;
                        }
                        i18 = i12 + 1;
                        i15 = i11;
                        iC = iC;
                        str3 = str3;
                        z10 = z9;
                        i16 = 63;
                        i17 = 35;
                    }
                }
                i10 = iC;
                String str4 = str3;
                int i19 = i15;
                C0205a c0205a2 = f12254i;
                int iF = c0205a2.f(input, i18, iQ);
                int i20 = iF + 1;
                if (i20 < iQ) {
                    this.f12258d = d9.a.e(b.h(u.f12242k, input, i18, iF, false, 4, null));
                    int iE = c0205a2.e(input, i20, iQ);
                    this.f12259e = iE;
                    if (iE == i19) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i20, iQ);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, str4);
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    b bVar2 = u.f12242k;
                    this.f12258d = d9.a.e(b.h(bVar2, input, i18, iF, false, 4, null));
                    String str5 = this.f12255a;
                    Intrinsics.c(str5);
                    this.f12259e = bVar2.c(str5);
                }
                if (this.f12258d == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i18, iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, str4);
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iA = iQ;
            } else {
                this.f12256b = uVar.g();
                this.f12257c = uVar.c();
                this.f12258d = uVar.h();
                this.f12259e = uVar.m();
                this.f12260f.clear();
                this.f12260f.addAll(uVar.e());
                if (iA == iC || input.charAt(iA) == '#') {
                    c(uVar.f());
                }
                i10 = iC;
            }
            int i21 = i10;
            int iQ2 = d9.e.q(input, "?#", iA, i21);
            p(input, iA, iQ2);
            if (iQ2 >= i21 || input.charAt(iQ2) != '?') {
                c10 = '#';
                i14 = iQ2;
            } else {
                c10 = '#';
                int iP2 = d9.e.p(input, '#', iQ2, i21);
                b bVar3 = u.f12242k;
                this.f12261g = bVar3.j(b.b(bVar3, input, iQ2 + 1, iP2, " \"'<>#", true, false, true, false, null, 208, null));
                i14 = iP2;
            }
            if (i14 < i21 && input.charAt(i14) == c10) {
                this.f12262h = b.b(u.f12242k, input, i14 + 1, i21, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a j(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            this.f12257c = b.b(u.f12242k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final a l(int i10) {
            if (1 <= i10 && i10 < 65536) {
                this.f12259e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        public final a n(String str) {
            b bVar;
            String strB;
            this.f12261g = (str == null || (strB = b.b((bVar = u.f12242k), str, 0, 0, " \"'<>#", false, false, true, false, null, 219, null)) == null) ? null : bVar.j(strB);
            return this;
        }

        public final a o() {
            String str = this.f12258d;
            this.f12258d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f12260f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f12260f;
                list.set(i10, b.b(u.f12242k, (String) list.get(i10), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.f12261g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? b.b(u.f12242k, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f12262h;
            this.f12262h = str3 != null ? b.b(u.f12242k, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final a q(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.y(scheme, "http", true)) {
                this.f12255a = "http";
                return this;
            }
            if (StringsKt.y(scheme, HttpRequest.DEFAULT_SCHEME, true)) {
                this.f12255a = HttpRequest.DEFAULT_SCHEME;
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public final void r(String str) {
            this.f12262h = str;
        }

        public final void s(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f12257c = str;
        }

        public final void t(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f12256b = str;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0085  */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f12255a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.f12256b.length() > 0 || this.f12257c.length() > 0) {
                sb.append(this.f12256b);
                if (this.f12257c.length() > 0) {
                    sb.append(':');
                    sb.append(this.f12257c);
                }
                sb.append('@');
            }
            String str2 = this.f12258d;
            if (str2 != null) {
                Intrinsics.c(str2);
                if (StringsKt.O(str2, ':', false, 2, null)) {
                    sb.append('[');
                    sb.append(this.f12258d);
                    sb.append(']');
                } else {
                    sb.append(this.f12258d);
                }
            }
            if (this.f12259e != -1 || this.f12255a != null) {
                int iB = b();
                String str3 = this.f12255a;
                if (str3 != null) {
                    b bVar = u.f12242k;
                    Intrinsics.c(str3);
                    if (iB != bVar.c(str3)) {
                        sb.append(':');
                        sb.append(iB);
                    }
                } else {
                    sb.append(':');
                    sb.append(iB);
                }
            }
            b bVar2 = u.f12242k;
            bVar2.i(this.f12260f, sb);
            if (this.f12261g != null) {
                sb.append('?');
                List list = this.f12261g;
                Intrinsics.c(list);
                bVar2.k(list, sb);
            }
            if (this.f12262h != null) {
                sb.append('#');
                sb.append(this.f12262h);
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final void u(String str) {
            this.f12258d = str;
        }

        public final void v(int i10) {
            this.f12259e = i10;
        }

        public final void w(String str) {
            this.f12255a = str;
        }

        public final a x(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.f12256b = b.b(u.f12242k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i10, int i11, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 8) != 0) {
                z9 = false;
            }
            if ((i12 & 16) != 0) {
                z10 = false;
            }
            if ((i12 & 32) != 0) {
                z11 = false;
            }
            if ((i12 & 64) != 0) {
                z12 = false;
            }
            if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                charset = null;
            }
            return bVar.a(str, i10, i11, str2, z9, z10, z11, z12, charset);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && d9.e.I(str.charAt(i10 + 1)) != -1 && d9.e.I(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String h(b bVar, String str, int i10, int i11, boolean z9, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z9 = false;
            }
            return bVar.g(str, i10, i11, z9);
        }

        private final void l(C7105h c7105h, String str, int i10, int i11, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) throws EOFException {
            int iCharCount = i10;
            C7105h c7105h2 = null;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z9 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z11) {
                        c7105h.I(z9 ? "+" : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z12)) {
                            if (!StringsKt.O(str2, (char) iCodePointAt, false, 2, null) && (iCodePointAt != 37 || (z9 && (!z10 || e(str, iCharCount, i11))))) {
                                c7105h.D1(iCodePointAt);
                            }
                        }
                        if (c7105h2 == null) {
                            c7105h2 = new C7105h();
                        }
                        if (charset == null || Intrinsics.b(charset, StandardCharsets.UTF_8)) {
                            c7105h2.D1(iCodePointAt);
                        } else {
                            c7105h2.A1(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!c7105h2.x0()) {
                            byte b10 = c7105h2.readByte();
                            c7105h.writeByte(37);
                            c7105h.writeByte(u.f12243l[((b10 & 255) >> 4) & 15]);
                            c7105h.writeByte(u.f12243l[b10 & 15]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final void m(C7105h c7105h, String str, int i10, int i11, boolean z9) {
            int i12;
            while (i10 < i11) {
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int I9 = d9.e.I(str.charAt(i10 + 1));
                    int I10 = d9.e.I(str.charAt(i12));
                    if (I9 == -1 || I10 == -1) {
                        c7105h.D1(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        c7105h.writeByte((I9 << 4) + I10);
                        i10 = Character.charCount(iCodePointAt) + i12;
                    }
                } else if (iCodePointAt == 43 && z9) {
                    c7105h.writeByte(32);
                    i10++;
                } else {
                    c7105h.D1(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        public final String a(String str, int i10, int i11, String encodeSet, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) throws EOFException {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int iCharCount = i10;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z12) || StringsKt.O(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z9 || (z10 && !e(str, iCharCount, i11)))) || (iCodePointAt == 43 && z11)))) {
                    C7105h c7105h = new C7105h();
                    c7105h.C1(str, i10, iCharCount);
                    l(c7105h, str, iCharCount, i11, encodeSet, z9, z10, z11, z12, charset);
                    return c7105h.Y0();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final int c(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.b(scheme, "http")) {
                return 80;
            }
            return Intrinsics.b(scheme, HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
        }

        public final u d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new a().i(null, str).a();
        }

        public final u f(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i10, int i11, boolean z9) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            for (int i12 = i10; i12 < i11; i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z9)) {
                    C7105h c7105h = new C7105h();
                    c7105h.C1(str, i10, i12);
                    m(c7105h, str, i12, i11, z9);
                    return c7105h.Y0();
                }
            }
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void i(List list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append('/');
                out.append((String) list.get(i10));
            }
        }

        public final List j(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iY = StringsKt.Y(str2, '&', i10, false, 4, null);
                if (iY == -1) {
                    iY = str2.length();
                }
                int iY2 = StringsKt.Y(str2, '=', i10, false, 4, null);
                if (iY2 == -1 || iY2 > iY) {
                    String strSubstring = str2.substring(i10, iY);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iY2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iY2 + 1, iY);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = iY + 1;
                str = str2;
            }
            return arrayList;
        }

        public final void k(List list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            kotlin.ranges.a aVarM = kotlin.ranges.b.m(kotlin.ranges.b.n(0, list.size()), 2);
            int iA = aVarM.a();
            int iB = aVarM.b();
            int iE = aVarM.e();
            if ((iE <= 0 || iA > iB) && (iE >= 0 || iB > iA)) {
                return;
            }
            while (true) {
                String str = (String) list.get(iA);
                String str2 = (String) list.get(iA + 1);
                if (iA > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (iA == iB) {
                    return;
                } else {
                    iA += iE;
                }
            }
        }

        private b() {
        }
    }

    public u(String scheme, String username, String password, String host, int i10, List pathSegments, List list, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f12244a = scheme;
        this.f12245b = username;
        this.f12246c = password;
        this.f12247d = host;
        this.f12248e = i10;
        this.f12249f = pathSegments;
        this.f12250g = list;
        this.f12251h = str;
        this.f12252i = url;
        this.f12253j = Intrinsics.b(scheme, HttpRequest.DEFAULT_SCHEME);
    }

    public static final u l(String str) {
        return f12242k.f(str);
    }

    public final String b() {
        if (this.f12251h == null) {
            return null;
        }
        String strSubstring = this.f12252i.substring(StringsKt.Y(this.f12252i, '#', 0, false, 6, null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String c() {
        if (this.f12246c.length() == 0) {
            return "";
        }
        String strSubstring = this.f12252i.substring(StringsKt.Y(this.f12252i, ':', this.f12244a.length() + 3, false, 4, null) + 1, StringsKt.Y(this.f12252i, '@', 0, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String d() {
        int iY = StringsKt.Y(this.f12252i, '/', this.f12244a.length() + 3, false, 4, null);
        String str = this.f12252i;
        String strSubstring = this.f12252i.substring(iY, d9.e.q(str, "?#", iY, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List e() {
        int iY = StringsKt.Y(this.f12252i, '/', this.f12244a.length() + 3, false, 4, null);
        String str = this.f12252i;
        int iQ = d9.e.q(str, "?#", iY, str.length());
        ArrayList arrayList = new ArrayList();
        while (iY < iQ) {
            int i10 = iY + 1;
            int iP = d9.e.p(this.f12252i, '/', i10, iQ);
            String strSubstring = this.f12252i.substring(i10, iP);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iY = iP;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && Intrinsics.b(((u) obj).f12252i, this.f12252i);
    }

    public final String f() {
        if (this.f12250g == null) {
            return null;
        }
        int iY = StringsKt.Y(this.f12252i, '?', 0, false, 6, null) + 1;
        String str = this.f12252i;
        String strSubstring = this.f12252i.substring(iY, d9.e.p(str, '#', iY, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String g() {
        if (this.f12245b.length() == 0) {
            return "";
        }
        int length = this.f12244a.length() + 3;
        String str = this.f12252i;
        String strSubstring = this.f12252i.substring(length, d9.e.q(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String h() {
        return this.f12247d;
    }

    public int hashCode() {
        return this.f12252i.hashCode();
    }

    public final boolean i() {
        return this.f12253j;
    }

    public final a j() {
        a aVar = new a();
        aVar.w(this.f12244a);
        aVar.t(g());
        aVar.s(c());
        aVar.u(this.f12247d);
        aVar.v(this.f12248e != f12242k.c(this.f12244a) ? this.f12248e : -1);
        aVar.e().clear();
        aVar.e().addAll(e());
        aVar.c(f());
        aVar.r(b());
        return aVar;
    }

    public final a k(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new a().i(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int m() {
        return this.f12248e;
    }

    public final String n() {
        if (this.f12250g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f12242k.k(this.f12250g, sb);
        return sb.toString();
    }

    public final String o() {
        a aVarK = k("/...");
        Intrinsics.c(aVarK);
        return aVarK.x("").j("").a().toString();
    }

    public final u p(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        a aVarK = k(link);
        if (aVarK != null) {
            return aVarK.a();
        }
        return null;
    }

    public final String q() {
        return this.f12244a;
    }

    public final URI r() {
        String string = j().o().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL s() {
        try {
            return new URL(this.f12252i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f12252i;
    }
}
