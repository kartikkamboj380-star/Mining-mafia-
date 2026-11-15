package M;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final n f3417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f3418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f3419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a f3420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final a f3421h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f3424c;

    /* JADX INFO: renamed from: M.a$a, reason: collision with other inner class name */
    public static final class C0054a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f3425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n f3427c;

        public C0054a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z9) {
            return z9 ? a.f3421h : a.f3420g;
        }

        private void c(boolean z9) {
            this.f3425a = z9;
            this.f3427c = a.f3417d;
            this.f3426b = 2;
        }

        public a a() {
            return (this.f3426b == 2 && this.f3427c == a.f3417d) ? b(this.f3425a) : new a(this.f3425a, this.f3426b, this.f3427c);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f3428f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f3429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f3430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f3432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private char f3433e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f3428f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z9) {
            this.f3429a = charSequence;
            this.f3430b = z9;
            this.f3431c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f3428f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char cCharAt;
            int i10 = this.f3432d;
            do {
                int i11 = this.f3432d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3429a;
                int i12 = i11 - 1;
                this.f3432d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f3433e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f3432d = i10;
            this.f3433e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i10 = this.f3432d;
                if (i10 >= this.f3431c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f3429a;
                this.f3432d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f3433e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i10 = this.f3432d;
            while (true) {
                int i11 = this.f3432d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3429a;
                int i12 = i11 - 1;
                this.f3432d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f3433e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f3432d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f3429a;
                        int i14 = i13 - 1;
                        this.f3432d = i14;
                        cCharAt = charSequence2.charAt(i14);
                        this.f3433e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f3432d = i10;
            this.f3433e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i10 = this.f3432d;
            while (true) {
                int i11 = this.f3432d;
                if (i11 >= this.f3431c) {
                    this.f3432d = i10;
                    this.f3433e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f3429a;
                this.f3432d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f3433e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f3432d;
                        if (i12 >= this.f3431c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f3429a;
                        this.f3432d = i12 + 1;
                        cCharAt = charSequence2.charAt(i12);
                        this.f3433e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f3429a.charAt(this.f3432d - 1);
            this.f3433e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f3429a, this.f3432d);
                this.f3432d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f3432d--;
            byte bC = c(this.f3433e);
            if (!this.f3430b) {
                return bC;
            }
            char c10 = this.f3433e;
            if (c10 == '>') {
                return h();
            }
            return c10 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f3429a.charAt(this.f3432d);
            this.f3433e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f3429a, this.f3432d);
                this.f3432d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f3432d++;
            byte bC = c(this.f3433e);
            if (!this.f3430b) {
                return bC;
            }
            char c10 = this.f3433e;
            if (c10 == '<') {
                return i();
            }
            return c10 == '&' ? g() : bC;
        }

        int d() {
            this.f3432d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f3432d < this.f3431c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f3432d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                    default:
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f3432d = this.f3431c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f3432d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        n nVar = o.f3445c;
        f3417d = nVar;
        f3418e = Character.toString((char) 8206);
        f3419f = Character.toString((char) 8207);
        f3420g = new a(false, 2, nVar);
        f3421h = new a(true, 2, nVar);
    }

    a(boolean z9, int i10, n nVar) {
        this.f3422a = z9;
        this.f3423b = i10;
        this.f3424c = nVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0054a().a();
    }

    static boolean e(Locale locale) {
        return p.a(locale) == 1;
    }

    private String f(CharSequence charSequence, n nVar) {
        boolean zIsRtl = nVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f3422a && (zIsRtl || b(charSequence) == 1)) {
            return f3418e;
        }
        if (this.f3422a) {
            return (!zIsRtl || b(charSequence) == -1) ? f3419f : "";
        }
        return "";
    }

    private String g(CharSequence charSequence, n nVar) {
        boolean zIsRtl = nVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f3422a && (zIsRtl || a(charSequence) == 1)) {
            return f3418e;
        }
        if (this.f3422a) {
            return (!zIsRtl || a(charSequence) == -1) ? f3419f : "";
        }
        return "";
    }

    public boolean d() {
        return (this.f3423b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f3424c, true);
    }

    public CharSequence i(CharSequence charSequence, n nVar, boolean z9) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = nVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z9) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zIsRtl ? o.f3444b : o.f3443a));
        }
        if (zIsRtl != this.f3422a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z9) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zIsRtl ? o.f3444b : o.f3443a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f3424c, true);
    }

    public String k(String str, n nVar, boolean z9) {
        if (str == null) {
            return null;
        }
        return i(str, nVar, z9).toString();
    }
}
