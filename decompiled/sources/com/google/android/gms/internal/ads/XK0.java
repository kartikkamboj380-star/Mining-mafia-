package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class XK0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f25183a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f25191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f25193k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String[] f25195m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int[] f25196v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EnumC5607wK0 f25184b = EnumC5607wK0.LEGACY_STRICT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f25185c = new char[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25186d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25187e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25188f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25189g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f25190h = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25194l = 1;

    static {
        AbstractC5985zK0.f35691a = new WK0();
    }

    public XK0(Reader reader) {
        int[] iArr = new int[32];
        this.f25193k = iArr;
        iArr[0] = 6;
        this.f25195m = new String[32];
        this.f25196v = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f25183a = reader;
    }

    private final void I0() {
        char c10;
        do {
            if (this.f25186d >= this.f25187e && !W(1)) {
                return;
            }
            char[] cArr = this.f25185c;
            int i10 = this.f25186d;
            int i11 = i10 + 1;
            this.f25186d = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f25188f++;
                this.f25189g = i11;
                return;
            }
        } while (c10 != '\r');
    }

    private final boolean R(char c10) throws C2842aL0 {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        a0();
        return false;
    }

    private final C2842aL0 R0(String str) throws C2842aL0 {
        String strN = N();
        StringBuilder sb = new StringBuilder(str.length() + strN.length() + 79);
        sb.append(str);
        sb.append(strN);
        sb.append("\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        throw new C2842aL0(sb.toString());
    }

    private final String S(char c10) throws C2842aL0 {
        char[] cArr;
        int i10;
        StringBuilder sb = null;
        do {
            int i11 = this.f25186d;
            int i12 = this.f25187e;
            int i13 = i11;
            while (true) {
                cArr = this.f25185c;
                if (i11 < i12) {
                    int i14 = i11 + 1;
                    char c11 = cArr[i11];
                    EnumC5607wK0 enumC5607wK0 = this.f25184b;
                    EnumC5607wK0 enumC5607wK1 = EnumC5607wK0.STRICT;
                    if (enumC5607wK0 == enumC5607wK1 && c11 < ' ') {
                        throw R0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                    }
                    if (c11 == c10) {
                        int i15 = (i14 - i13) - 1;
                        this.f25186d = i14;
                        if (sb == null) {
                            return new String(cArr, i13, i15);
                        }
                        sb.append(cArr, i13, i15);
                        return sb.toString();
                    }
                    char c12 = '\n';
                    if (c11 == '\\') {
                        int i16 = i14 - i13;
                        int i17 = i16 - 1;
                        this.f25186d = i14;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i16 + i16, 16));
                        }
                        sb.append(cArr, i13, i17);
                        if (this.f25186d == this.f25187e && !W(1)) {
                            throw R0("Unterminated escape sequence");
                        }
                        int i18 = this.f25186d;
                        int i19 = i18 + 1;
                        this.f25186d = i19;
                        char c13 = cArr[i18];
                        if (c13 != '\n') {
                            if (c13 == '\"') {
                                c12 = c13;
                            } else {
                                if (c13 != '\'') {
                                    if (c13 != '/' && c13 != '\\') {
                                        if (c13 == 'b') {
                                            c12 = '\b';
                                        } else if (c13 == 'f') {
                                            c12 = '\f';
                                        } else if (c13 != 'n') {
                                            if (c13 == 'r') {
                                                c12 = '\r';
                                            } else if (c13 == 't') {
                                                c12 = '\t';
                                            } else {
                                                if (c13 != 'u') {
                                                    throw R0("Invalid escape sequence");
                                                }
                                                if (i18 + 5 > this.f25187e && !W(4)) {
                                                    throw R0("Unterminated escape sequence");
                                                }
                                                int i20 = this.f25186d;
                                                int i21 = i20 + 4;
                                                int i22 = 0;
                                                while (i20 < i21) {
                                                    int i23 = i22 << 4;
                                                    char c14 = cArr[i20];
                                                    if (c14 >= '0' && c14 <= '9') {
                                                        i10 = c14 - '0';
                                                    } else if (c14 >= 'a' && c14 <= 'f') {
                                                        i10 = c14 - 'W';
                                                    } else {
                                                        if (c14 < 'A' || c14 > 'F') {
                                                            throw R0("Malformed Unicode escape \\u".concat(new String(cArr, this.f25186d, 4)));
                                                        }
                                                        i10 = c14 - '7';
                                                    }
                                                    i22 = i23 + i10;
                                                    i20++;
                                                }
                                                this.f25186d += 4;
                                                c12 = (char) i22;
                                            }
                                        }
                                    }
                                }
                                c12 = c13;
                            }
                            sb.append(c12);
                            i13 = this.f25186d;
                            i12 = this.f25187e;
                            i11 = i13;
                        } else {
                            if (this.f25184b == enumC5607wK1) {
                                throw R0("Cannot escape a newline character in strict mode");
                            }
                            this.f25188f++;
                            this.f25189g = i19;
                        }
                        if (this.f25184b == enumC5607wK1) {
                            throw R0("Invalid escaped character \"'\" in strict mode");
                        }
                        c12 = c13;
                        sb.append(c12);
                        i13 = this.f25186d;
                        i12 = this.f25187e;
                        i11 = i13;
                    } else {
                        if (c11 == '\n') {
                            this.f25188f++;
                            this.f25189g = i14;
                        }
                        i11 = i14;
                    }
                }
            }
            int i24 = i11 - i13;
            if (sb == null) {
                sb = new StringBuilder(Math.max(i24 + i24, 16));
            }
            sb.append(cArr, i13, i24);
            this.f25186d = i11;
        } while (W(1));
        throw R0("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    private final String T() throws C2842aL0 {
        String string;
        int i10 = 0;
        StringBuilder sb = null;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f25186d + i11;
                if (i12 < this.f25187e) {
                    char c10 = this.f25185c[i12];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        a0();
                    }
                    i10 = i11;
                } else if (i11 >= 1024) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i11, 16));
                    }
                    sb.append(this.f25185c, this.f25186d, i11);
                    this.f25186d += i11;
                    if (!W(1)) {
                    }
                } else if (!W(i11 + 1)) {
                    i10 = i11;
                }
                if (sb == null) {
                    string = new String(this.f25185c, this.f25186d, i10);
                } else {
                    sb.append(this.f25185c, this.f25186d, i10);
                    string = sb.toString();
                }
                this.f25186d += i10;
                return string;
            }
        }
    }

    private final void V(int i10) throws C2842aL0 {
        int i11 = this.f25194l;
        if (i11 - 1 >= 1280) {
            String strN = N();
            StringBuilder sb = new StringBuilder(strN.length() + 26);
            sb.append("Nesting limit 1280 reached");
            sb.append(strN);
            throw new C2842aL0(sb.toString());
        }
        int[] iArr = this.f25193k;
        if (i11 == iArr.length) {
            int i12 = i11 + i11;
            this.f25193k = Arrays.copyOf(iArr, i12);
            this.f25196v = Arrays.copyOf(this.f25196v, i12);
            this.f25195m = (String[]) Arrays.copyOf(this.f25195m, i12);
        }
        int[] iArr2 = this.f25193k;
        int i13 = this.f25194l;
        this.f25194l = i13 + 1;
        iArr2[i13] = i10;
    }

    private final IllegalStateException V0(String str) throws IOException {
        int iQ = Q();
        String strA = YK0.a(Q());
        String strN = N();
        int length = str.length() + 18 + strA.length() + strN.length();
        String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iQ == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(length + 5 + strConcat.length());
        sb.append("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(strA);
        sb.append(strN);
        sb.append("\nSee ");
        sb.append(strConcat);
        return new IllegalStateException(sb.toString());
    }

    private final boolean W(int i10) throws IOException {
        int i11;
        int i12 = this.f25189g;
        int i13 = this.f25186d;
        this.f25189g = i12 - i13;
        char[] cArr = this.f25185c;
        int i14 = this.f25187e;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f25187e = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f25187e = 0;
        }
        this.f25186d = 0;
        do {
            Reader reader = this.f25183a;
            int i16 = this.f25187e;
            int i17 = reader.read(cArr, i16, 1024 - i16);
            if (i17 == -1) {
                return false;
            }
            i11 = this.f25187e + i17;
            this.f25187e = i11;
            if (this.f25188f == 0 && this.f25189g == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f25186d++;
                this.f25189g = 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private final int X(boolean z9) throws IOException {
        int i10 = this.f25186d;
        int i11 = this.f25187e;
        while (true) {
            if (i10 == i11) {
                this.f25186d = i10;
                if (!W(1)) {
                    if (z9) {
                        throw new EOFException("End of input".concat(N()));
                    }
                    return -1;
                }
                i10 = this.f25186d;
                i11 = this.f25187e;
            }
            char[] cArr = this.f25185c;
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f25188f++;
                this.f25189g = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f25186d = i12;
                    if (i12 == i11) {
                        this.f25186d = i10;
                        boolean zW = W(2);
                        this.f25186d++;
                        if (!zW) {
                            return 47;
                        }
                    }
                    a0();
                    int i13 = this.f25186d;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f25186d = i13 + 1;
                        while (true) {
                            if (this.f25186d + 2 > this.f25187e && !W(2)) {
                                throw R0("Unterminated comment");
                            }
                            int i14 = this.f25186d;
                            if (cArr[i14] != '\n') {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 2) {
                                        i10 = this.f25186d + 2;
                                        i11 = this.f25187e;
                                        break;
                                    }
                                    if (cArr[this.f25186d + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                    i15++;
                                }
                            } else {
                                this.f25188f++;
                                this.f25189g = i14 + 1;
                            }
                            this.f25186d++;
                        }
                    } else {
                        if (c11 != '/') {
                            return 47;
                        }
                        this.f25186d = i13 + 1;
                        I0();
                        i10 = this.f25186d;
                        i11 = this.f25187e;
                    }
                } else {
                    if (c10 != '#') {
                        this.f25186d = i12;
                        return c10;
                    }
                    this.f25186d = i12;
                    a0();
                    I0();
                    i10 = this.f25186d;
                    i11 = this.f25187e;
                }
            }
            i10 = i12;
        }
    }

    private final void a0() throws C2842aL0 {
        if (this.f25184b != EnumC5607wK0.LENIENT) {
            throw R0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    public final String G() throws IOException {
        String string;
        int iW = this.f25190h;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 10) {
            string = T();
        } else if (iW == 8) {
            string = S('\'');
        } else if (iW == 9) {
            string = S('\"');
        } else if (iW == 11) {
            string = null;
        } else if (iW == 15) {
            string = Long.toString(this.f25191i);
        } else {
            if (iW != 16) {
                throw V0("a string");
            }
            String str = new String(this.f25185c, this.f25186d, this.f25192j);
            this.f25186d += this.f25192j;
            string = str;
        }
        this.f25190h = 0;
        int[] iArr = this.f25196v;
        int i10 = this.f25194l - 1;
        iArr[i10] = iArr[i10] + 1;
        return string;
    }

    public final boolean J() throws IOException {
        int iW = this.f25190h;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 5) {
            this.f25190h = 0;
            int[] iArr = this.f25196v;
            int i10 = this.f25194l - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iW != 6) {
            throw V0("a boolean");
        }
        this.f25190h = 0;
        int[] iArr2 = this.f25196v;
        int i11 = this.f25194l - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final void M() throws IOException {
        int iW = this.f25190h;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 7) {
            throw V0("null");
        }
        this.f25190h = 0;
        int[] iArr = this.f25196v;
        int i10 = this.f25194l - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    final String N() {
        int i10 = this.f25188f + 1;
        int i11 = this.f25186d - this.f25189g;
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i12 = 0; i12 < this.f25194l; i12++) {
            int i13 = this.f25193k[i12];
            switch (i13) {
                case 1:
                case 2:
                    int i14 = this.f25196v[i12];
                    sb.append('[');
                    sb.append(i14);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f25195m[i12];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 21);
                    sb2.append("Unknown scope value: ");
                    sb2.append(i13);
                    throw new AssertionError(sb2.toString());
            }
        }
        int i15 = i11 + 1;
        String string = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i15).length() + 6 + string.length());
        sb3.append(" at line ");
        sb3.append(i10);
        sb3.append(" column ");
        sb3.append(i15);
        sb3.append(" path ");
        sb3.append(string);
        return sb3.toString();
    }

    public final int Q() throws IOException {
        int iW = this.f25190h;
        if (iW == 0) {
            iW = w();
        }
        switch (iW) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final void a(EnumC5607wK0 enumC5607wK0) {
        Objects.requireNonNull(enumC5607wK0);
        this.f25184b = enumC5607wK0;
    }

    public final void c() throws IOException {
        int iW = this.f25190h;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 3) {
            throw V0("BEGIN_ARRAY");
        }
        V(1);
        this.f25196v[this.f25194l - 1] = 0;
        this.f25190h = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f25190h = 0;
        this.f25193k[0] = 8;
        this.f25194l = 1;
        this.f25183a.close();
    }

    public final void h() throws IOException {
        int iW = this.f25190h;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 4) {
            throw V0("END_ARRAY");
        }
        int i10 = this.f25194l;
        this.f25194l = i10 - 1;
        int[] iArr = this.f25196v;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f25190h = 0;
    }

    public final void j() throws IOException {
        int iW = this.f25190h;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 1) {
            throw V0("BEGIN_OBJECT");
        }
        V(3);
        this.f25190h = 0;
    }

    public final void n() throws IOException {
        int iW = this.f25190h;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 2) {
            throw V0("END_OBJECT");
        }
        int i10 = this.f25194l;
        int i11 = i10 - 1;
        this.f25194l = i11;
        this.f25195m[i11] = null;
        int[] iArr = this.f25196v;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f25190h = 0;
    }

    public final String toString() {
        return XK0.class.getSimpleName().concat(N());
    }

    public final boolean v() throws IOException {
        int iW = this.f25190h;
        if (iW == 0) {
            iW = w();
        }
        return (iW == 2 || iW == 4 || iW == 17) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x018e  */
    /* JADX WARN: Code duplicated, block: B:115:0x019e  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:124:0x01bc A[PHI: r2 r6
      0x01bc: PHI (r2v41 int) = (r2v40 int), (r2v43 int) binds: [B:114:0x019c, B:123:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r6v15 int) = (r6v14 int), (r6v16 int) binds: [B:114:0x019c, B:123:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:166:0x0232  */
    /* JADX WARN: Code duplicated, block: B:167:0x0234  */
    /* JADX WARN: Code duplicated, block: B:169:0x023a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x023c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0241  */
    /* JADX WARN: Code duplicated, block: B:175:0x0247 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x025a A[DONT_INVERT, PHI: r8 r15
      0x025a: PHI (r8v20 int) = (r8v19 int), (r8v21 int) binds: [B:165:0x0230, B:171:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r15v15 int) = (r15v6 int), (r15v16 int) binds: [B:165:0x0230, B:171:0x023e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:183:0x025c  */
    /* JADX WARN: Code duplicated, block: B:195:0x027c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0282  */
    /* JADX WARN: Code duplicated, block: B:200:0x0287  */
    /* JADX WARN: Code duplicated, block: B:205:0x0296 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:206:0x0297  */
    /* JADX WARN: Code duplicated, block: B:208:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:212:0x02ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:217:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:228:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:244:0x030e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:245:0x0310  */
    /* JADX WARN: Code duplicated, block: B:247:0x0314  */
    /* JADX WARN: Code duplicated, block: B:249:0x0326  */
    /* JADX WARN: Code duplicated, block: B:250:0x0329  */
    /* JADX WARN: Code duplicated, block: B:252:0x032e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:254:0x0331  */
    /* JADX WARN: Code duplicated, block: B:256:0x0336  */
    /* JADX WARN: Code duplicated, block: B:258:0x033e  */
    /* JADX WARN: Code duplicated, block: B:267:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0247, code lost:
    
        if (r3 == 0) goto L179;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int w() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XK0.w():int");
    }

    public final String x() throws IOException {
        String strS;
        int iW = this.f25190h;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 14) {
            strS = T();
        } else if (iW == 12) {
            strS = S('\'');
        } else {
            if (iW != 13) {
                throw V0("a name");
            }
            strS = S('\"');
        }
        this.f25190h = 0;
        this.f25195m[this.f25194l - 1] = strS;
        return strS;
    }
}
