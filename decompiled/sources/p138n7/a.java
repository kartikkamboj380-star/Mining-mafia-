package p138n7;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.gson.p;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import p108k7.H;
import p108k7.y;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int[] f46982G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f46983a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f46992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f46993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f46994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f46995m;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String[] f46997w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p f46984b = p.LEGACY_STRICT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46985c = 255;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char[] f46986d = new char[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46987e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f46988f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f46989g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f46990h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f46991i = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f46996v = 1;

    /* JADX INFO: renamed from: n7.a$a, reason: collision with other inner class name */
    class C0481a extends y {
        C0481a() {
        }

        @Override // p108k7.y
        public void a(a aVar) throws IOException {
            int iV = aVar.f46991i;
            if (iV == 0) {
                iV = aVar.v();
            }
            if (iV == 13) {
                aVar.f46991i = 9;
            } else if (iV == 12) {
                aVar.f46991i = 8;
            } else {
                if (iV != 14) {
                    throw aVar.z1("a name");
                }
                aVar.f46991i = 10;
            }
        }
    }

    static {
        y.f45680a = new C0481a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f46995m = iArr;
        iArr[0] = 6;
        this.f46997w = new String[32];
        this.f46982G = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f46983a = reader;
    }

    private boolean G(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f46986d;
        int i13 = this.f46990h;
        int i14 = this.f46987e;
        this.f46990h = i13 - i14;
        int i15 = this.f46988f;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f46988f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f46988f = 0;
        }
        this.f46987e = 0;
        do {
            Reader reader = this.f46983a;
            int i17 = this.f46988f;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f46988f + i18;
            this.f46988f = i11;
            if (this.f46989g == 0 && (i12 = this.f46990h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f46987e++;
                this.f46990h = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private String J(boolean z9) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f46996v;
            if (i10 >= i11) {
                return sb.toString();
            }
            int i12 = this.f46995m[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f46982G[i10];
                    if (z9 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb.append('[');
                    sb.append(i13);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f46997w[i10];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i12);
            }
            i10++;
        }
    }

    private int R0(boolean z9) throws IOException {
        char[] cArr = this.f46986d;
        int i10 = this.f46987e;
        int i11 = this.f46988f;
        while (true) {
            if (i10 == i11) {
                this.f46987e = i10;
                if (!G(1)) {
                    if (!z9) {
                        return -1;
                    }
                    throw new EOFException("End of input" + T());
                }
                i10 = this.f46987e;
                i11 = this.f46988f;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f46989g++;
                this.f46990h = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f46987e = i12;
                    if (i12 == i11) {
                        this.f46987e = i10;
                        boolean zG = G(2);
                        this.f46987e++;
                        if (!zG) {
                        }
                        return c10;
                    }
                    j();
                    int i13 = this.f46987e;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f46987e = i13 + 1;
                        if (!u1("*/")) {
                            throw y1("Unterminated comment");
                        }
                        i10 = this.f46987e + 2;
                        i11 = this.f46988f;
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f46987e = i13 + 1;
                        v1();
                        i10 = this.f46987e;
                        i11 = this.f46988f;
                    }
                } else {
                    if (c10 != '#') {
                        this.f46987e = i12;
                        return c10;
                    }
                    this.f46987e = i12;
                    j();
                    v1();
                    i10 = this.f46987e;
                    i11 = this.f46988f;
                }
            }
            i10 = i12;
        }
    }

    private boolean S(char c10) throws d {
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
        j();
        return false;
    }

    private String g1(char c10) throws d {
        int i10;
        char[] cArr = this.f46986d;
        StringBuilder sb = null;
        do {
            int i11 = this.f46987e;
            int i12 = this.f46988f;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c11 = cArr[i11];
                        if (this.f46984b == p.STRICT && c11 < ' ') {
                            throw y1("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        }
                        if (c11 == c10) {
                            this.f46987e = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb.append(cArr, i10, i15);
                            return sb.toString();
                        }
                        if (c11 == '\\') {
                            this.f46987e = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb.append(cArr, i10, i17);
                            sb.append(r1());
                            i11 = this.f46987e;
                            i12 = this.f46988f;
                        } else {
                            if (c11 == '\n') {
                                this.f46989g++;
                                this.f46990h = i14;
                            }
                            i11 = i14;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i11 - i10) * 2, 16));
            }
            sb.append(cArr, i10, i11 - i10);
            this.f46987e = i11;
        } while (G(1));
        throw y1("Unterminated string");
    }

    private void j() throws d {
        if (this.f46984b != p.LENIENT) {
            throw y1("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String m1() throws d {
        String string;
        StringBuilder sb = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f46987e;
                if (i12 + i11 < this.f46988f) {
                    char c10 = this.f46986d[i12 + i11];
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
                        j();
                    }
                    i10 = i11;
                } else if (i11 >= this.f46986d.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i11, 16));
                    }
                    sb.append(this.f46986d, this.f46987e, i11);
                    this.f46987e += i11;
                    if (!G(1)) {
                    }
                } else if (!G(i11 + 1)) {
                    i10 = i11;
                }
                if (sb == null) {
                    string = new String(this.f46986d, this.f46987e, i10);
                } else {
                    sb.append(this.f46986d, this.f46987e, i10);
                    string = sb.toString();
                }
                this.f46987e += i10;
                return string;
            }
        }
    }

    private void n() throws IOException {
        R0(true);
        int i10 = this.f46987e;
        this.f46987e = i10 - 1;
        if (i10 + 4 <= this.f46988f || G(5)) {
            int i11 = this.f46987e;
            char[] cArr = this.f46986d;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                this.f46987e = i11 + 5;
            }
        }
    }

    private int o1() {
        String str;
        String str2;
        int i10;
        char c10 = this.f46986d[this.f46987e];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        boolean z9 = this.f46984b != p.STRICT;
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f46987e + i11 >= this.f46988f && !G(i11 + 1)) {
                return 0;
            }
            char c11 = this.f46986d[this.f46987e + i11];
            if (c11 != str.charAt(i11) && (!z9 || c11 != str2.charAt(i11))) {
                return 0;
            }
        }
        if ((this.f46987e + length < this.f46988f || G(length + 1)) && S(this.f46986d[this.f46987e + length])) {
            return 0;
        }
        this.f46987e += length;
        this.f46991i = i10;
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
    private int p1() {
        char c10;
        int i10;
        char[] cArr = this.f46986d;
        int i11 = this.f46987e;
        int i12 = this.f46988f;
        int i13 = 0;
        int i14 = 0;
        char c11 = 0;
        boolean z9 = false;
        int i15 = 1;
        long j10 = 0;
        while (true) {
            char c12 = 2;
            if (i11 + i14 != i12) {
                c10 = cArr[i11 + i14];
                i10 = i13;
                if (c10 != '+') {
                    if (c10 != 'E' || c10 == 'e') {
                        if (c11 == 2 && c11 != 4) {
                            return i10;
                        }
                        c11 = 5;
                    } else if (c10 == '-') {
                        c12 = 6;
                        if (c11 == 0) {
                            c11 = 1;
                            z9 = true;
                        } else if (c11 != 5) {
                            return i10;
                        }
                    } else if (c10 != '.') {
                        if (c10 < '0' || c10 > '9') {
                            if (!S(c10)) {
                                break;
                            }
                            return i10;
                        }
                        if (c11 == 1 || c11 == 0) {
                            j10 = -(c10 - '0');
                        } else if (c11 == 2) {
                            if (j10 == 0) {
                                return i10;
                            }
                            long j11 = (10 * j10) - ((long) (c10 - '0'));
                            i15 &= (j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10)) ? 1 : i10;
                            j10 = j11;
                        } else if (c11 == 3) {
                            c11 = 4;
                        } else if (c11 == 5 || c11 == 6) {
                            c11 = 7;
                        }
                    } else {
                        if (c11 != 2) {
                            return i10;
                        }
                        c11 = 3;
                    }
                    i14++;
                    i13 = i10;
                } else {
                    c12 = 6;
                    if (c11 != 5) {
                        return i10;
                    }
                }
                c11 = c12;
                i14++;
                i13 = i10;
            } else {
                if (i14 == cArr.length) {
                    return i13;
                }
                if (!G(i14 + 1)) {
                    i10 = i13;
                    break;
                }
                i11 = this.f46987e;
                i12 = this.f46988f;
                c10 = cArr[i11 + i14];
                i10 = i13;
                if (c10 != '+') {
                    if (c10 != 'E') {
                        if (c11 == 2) {
                        }
                        c11 = 5;
                    } else {
                        if (c11 == 2) {
                        }
                        c11 = 5;
                    }
                    i14++;
                    i13 = i10;
                } else {
                    c12 = 6;
                    if (c11 != 5) {
                        return i10;
                    }
                }
                c11 = c12;
                i14++;
                i13 = i10;
            }
        }
        if (c11 == 2 && i15 != 0 && ((j10 != Long.MIN_VALUE || z9) && (j10 != 0 || !z9))) {
            if (!z9) {
                j10 = -j10;
            }
            this.f46992j = j10;
            this.f46987e += i14;
            this.f46991i = 15;
            return 15;
        }
        if (c11 != 2 && c11 != 4 && c11 != 7) {
            return i10;
        }
        this.f46993k = i14;
        this.f46991i = 16;
        return 16;
    }

    private void q1(int i10) throws d {
        int i11 = this.f46996v;
        if (i11 - 1 >= this.f46985c) {
            throw new d("Nesting limit " + this.f46985c + " reached" + T());
        }
        int[] iArr = this.f46995m;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f46995m = Arrays.copyOf(iArr, i12);
            this.f46982G = Arrays.copyOf(this.f46982G, i12);
            this.f46997w = (String[]) Arrays.copyOf(this.f46997w, i12);
        }
        int[] iArr2 = this.f46995m;
        int i13 = this.f46996v;
        this.f46996v = i13 + 1;
        iArr2[i13] = i10;
    }

    private char r1() throws d {
        int i10;
        if (this.f46987e == this.f46988f && !G(1)) {
            throw y1("Unterminated escape sequence");
        }
        char[] cArr = this.f46986d;
        int i11 = this.f46987e;
        int i12 = i11 + 1;
        this.f46987e = i12;
        char c10 = cArr[i11];
        if (c10 != '\n') {
            if (c10 != '\"') {
                if (c10 != '\'') {
                    if (c10 != '/' && c10 != '\\') {
                        if (c10 == 'b') {
                            return '\b';
                        }
                        if (c10 == 'f') {
                            return '\f';
                        }
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 == 'r') {
                            return '\r';
                        }
                        if (c10 == 't') {
                            return '\t';
                        }
                        if (c10 != 'u') {
                            throw y1("Invalid escape sequence");
                        }
                        if (i11 + 5 > this.f46988f && !G(4)) {
                            throw y1("Unterminated escape sequence");
                        }
                        int i13 = this.f46987e;
                        int i14 = i13 + 4;
                        int i15 = 0;
                        while (i13 < i14) {
                            char c11 = this.f46986d[i13];
                            int i16 = i15 << 4;
                            if (c11 >= '0' && c11 <= '9') {
                                i10 = c11 - '0';
                            } else if (c11 >= 'a' && c11 <= 'f') {
                                i10 = c11 - 'W';
                            } else {
                                if (c11 < 'A' || c11 > 'F') {
                                    throw y1("Malformed Unicode escape \\u" + new String(this.f46986d, this.f46987e, 4));
                                }
                                i10 = c11 - '7';
                            }
                            i15 = i16 + i10;
                            i13++;
                        }
                        this.f46987e += 4;
                        return (char) i15;
                    }
                }
            }
            return c10;
        }
        if (this.f46984b == p.STRICT) {
            throw y1("Cannot escape a newline character in strict mode");
        }
        this.f46989g++;
        this.f46990h = i12;
        if (this.f46984b == p.STRICT) {
            throw y1("Invalid escaped character \"'\" in strict mode");
        }
        return c10;
    }

    private void t1(char c10) throws d {
        char[] cArr = this.f46986d;
        do {
            int i10 = this.f46987e;
            int i11 = this.f46988f;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f46987e = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f46987e = i12;
                    r1();
                    i10 = this.f46987e;
                    i11 = this.f46988f;
                } else {
                    if (c11 == '\n') {
                        this.f46989g++;
                        this.f46990h = i12;
                    }
                    i10 = i12;
                }
            }
            this.f46987e = i10;
        } while (G(1));
        throw y1("Unterminated string");
    }

    private boolean u1(String str) {
        int length = str.length();
        while (true) {
            if (this.f46987e + length > this.f46988f && !G(length)) {
                return false;
            }
            char[] cArr = this.f46986d;
            int i10 = this.f46987e;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f46986d[this.f46987e + i11] == str.charAt(i11)) {
                    }
                }
                return true;
            }
            this.f46989g++;
            this.f46990h = i10 + 1;
            this.f46987e++;
        }
    }

    private void v1() {
        char c10;
        do {
            if (this.f46987e >= this.f46988f && !G(1)) {
                return;
            }
            char[] cArr = this.f46986d;
            int i10 = this.f46987e;
            int i11 = i10 + 1;
            this.f46987e = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f46989g++;
                this.f46990h = i11;
                return;
            }
        } while (c10 != '\r');
    }

    private void w1() throws d {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f46987e;
                if (i11 + i10 < this.f46988f) {
                    char c10 = this.f46986d[i11 + i10];
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
                                                    i10++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        j();
                    }
                    this.f46987e += i10;
                    return;
                }
                this.f46987e = i11 + i10;
            }
        } while (G(1));
    }

    private d y1(String str) throws d {
        throw new d(str + T() + "\nSee " + H.a("malformed-json"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IllegalStateException z1(String str) {
        return new IllegalStateException("Expected " + str + " but was " + n1() + T() + "\nSee " + H.a(n1() == b.NULL ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    public String I0() throws IOException {
        String strG1;
        int iV = this.f46991i;
        if (iV == 0) {
            iV = v();
        }
        if (iV == 14) {
            strG1 = m1();
        } else if (iV == 12) {
            strG1 = g1('\'');
        } else {
            if (iV != 13) {
                throw z1("a name");
            }
            strG1 = g1('\"');
        }
        this.f46991i = 0;
        this.f46997w[this.f46996v - 1] = strG1;
        return strG1;
    }

    public String M() {
        return J(true);
    }

    public final p N() {
        return this.f46984b;
    }

    public boolean Q() throws IOException {
        int iV = this.f46991i;
        if (iV == 0) {
            iV = v();
        }
        return (iV == 2 || iV == 4 || iV == 17) ? false : true;
    }

    public final boolean R() {
        return this.f46984b == p.LENIENT;
    }

    String T() {
        return " at line " + (this.f46989g + 1) + " column " + ((this.f46987e - this.f46990h) + 1) + " path " + Y();
    }

    public boolean V() throws IOException {
        int iV = this.f46991i;
        if (iV == 0) {
            iV = v();
        }
        if (iV == 5) {
            this.f46991i = 0;
            int[] iArr = this.f46982G;
            int i10 = this.f46996v - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iV != 6) {
            throw z1("a boolean");
        }
        this.f46991i = 0;
        int[] iArr2 = this.f46982G;
        int i11 = this.f46996v - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public void V0() throws IOException {
        int iV = this.f46991i;
        if (iV == 0) {
            iV = v();
        }
        if (iV != 7) {
            throw z1("null");
        }
        this.f46991i = 0;
        int[] iArr = this.f46982G;
        int i10 = this.f46996v - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public double W() throws IOException {
        int iV = this.f46991i;
        if (iV == 0) {
            iV = v();
        }
        if (iV == 15) {
            this.f46991i = 0;
            int[] iArr = this.f46982G;
            int i10 = this.f46996v - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f46992j;
        }
        if (iV == 16) {
            this.f46994l = new String(this.f46986d, this.f46987e, this.f46993k);
            this.f46987e += this.f46993k;
        } else if (iV == 8 || iV == 9) {
            this.f46994l = g1(iV == 8 ? '\'' : '\"');
        } else if (iV == 10) {
            this.f46994l = m1();
        } else if (iV != 11) {
            throw z1("a double");
        }
        this.f46991i = 11;
        double d10 = Double.parseDouble(this.f46994l);
        if (this.f46984b != p.LENIENT && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw y1("JSON forbids NaN and infinities: " + d10);
        }
        this.f46994l = null;
        this.f46991i = 0;
        int[] iArr2 = this.f46982G;
        int i11 = this.f46996v - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int X() throws IOException {
        int iV = this.f46991i;
        if (iV == 0) {
            iV = v();
        }
        if (iV == 15) {
            long j10 = this.f46992j;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f46991i = 0;
                int[] iArr = this.f46982G;
                int i11 = this.f46996v - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f46992j + T());
        }
        if (iV == 16) {
            this.f46994l = new String(this.f46986d, this.f46987e, this.f46993k);
            this.f46987e += this.f46993k;
        } else {
            if (iV != 8 && iV != 9 && iV != 10) {
                throw z1("an int");
            }
            if (iV == 10) {
                this.f46994l = m1();
            } else {
                this.f46994l = g1(iV == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f46994l);
                this.f46991i = 0;
                int[] iArr2 = this.f46982G;
                int i13 = this.f46996v - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f46991i = 11;
        double d10 = Double.parseDouble(this.f46994l);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f46994l + T());
        }
        this.f46994l = null;
        this.f46991i = 0;
        int[] iArr3 = this.f46982G;
        int i15 = this.f46996v - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public String Y() {
        return J(false);
    }

    public long a0() throws IOException {
        int iV = this.f46991i;
        if (iV == 0) {
            iV = v();
        }
        if (iV == 15) {
            this.f46991i = 0;
            int[] iArr = this.f46982G;
            int i10 = this.f46996v - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f46992j;
        }
        if (iV == 16) {
            this.f46994l = new String(this.f46986d, this.f46987e, this.f46993k);
            this.f46987e += this.f46993k;
        } else {
            if (iV != 8 && iV != 9 && iV != 10) {
                throw z1("a long");
            }
            if (iV == 10) {
                this.f46994l = m1();
            } else {
                this.f46994l = g1(iV == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f46994l);
                this.f46991i = 0;
                int[] iArr2 = this.f46982G;
                int i11 = this.f46996v - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f46991i = 11;
        double d10 = Double.parseDouble(this.f46994l);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f46994l + T());
        }
        this.f46994l = null;
        this.f46991i = 0;
        int[] iArr3 = this.f46982G;
        int i12 = this.f46996v - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public void c() throws IOException {
        int iV = this.f46991i;
        if (iV == 0) {
            iV = v();
        }
        if (iV != 3) {
            throw z1("BEGIN_ARRAY");
        }
        q1(1);
        this.f46982G[this.f46996v - 1] = 0;
        this.f46991i = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f46991i = 0;
        this.f46995m[0] = 8;
        this.f46996v = 1;
        this.f46983a.close();
    }

    public void h() throws IOException {
        int iV = this.f46991i;
        if (iV == 0) {
            iV = v();
        }
        if (iV != 1) {
            throw z1("BEGIN_OBJECT");
        }
        q1(3);
        this.f46991i = 0;
    }

    public String l1() throws IOException {
        String str;
        int iV = this.f46991i;
        if (iV == 0) {
            iV = v();
        }
        if (iV == 10) {
            str = m1();
        } else if (iV == 8) {
            str = g1('\'');
        } else if (iV == 9) {
            str = g1('\"');
        } else if (iV == 11) {
            str = this.f46994l;
            this.f46994l = null;
        } else if (iV == 15) {
            str = Long.toString(this.f46992j);
        } else {
            if (iV != 16) {
                throw z1("a string");
            }
            str = new String(this.f46986d, this.f46987e, this.f46993k);
            this.f46987e += this.f46993k;
        }
        this.f46991i = 0;
        int[] iArr = this.f46982G;
        int i10 = this.f46996v - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public b n1() throws IOException {
        int iV = this.f46991i;
        if (iV == 0) {
            iV = v();
        }
        switch (iV) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void s1(p pVar) {
        Objects.requireNonNull(pVar);
        this.f46984b = pVar;
    }

    public String toString() {
        return getClass().getSimpleName() + T();
    }

    int v() throws IOException {
        int iR0;
        int[] iArr = this.f46995m;
        int i10 = this.f46996v;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iR1 = R0(true);
            if (iR1 != 44) {
                if (iR1 != 59) {
                    if (iR1 != 93) {
                        throw y1("Unterminated array");
                    }
                    this.f46991i = 4;
                    return 4;
                }
                j();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iR0 = R0(true)) != 44) {
                    if (iR0 != 59) {
                        if (iR0 != 125) {
                            throw y1("Unterminated object");
                        }
                        this.f46991i = 2;
                        return 2;
                    }
                    j();
                }
                int iR2 = R0(true);
                if (iR2 == 34) {
                    this.f46991i = 13;
                    return 13;
                }
                if (iR2 == 39) {
                    j();
                    this.f46991i = 12;
                    return 12;
                }
                if (iR2 == 125) {
                    if (i11 == 5) {
                        throw y1("Expected name");
                    }
                    this.f46991i = 2;
                    return 2;
                }
                j();
                this.f46987e--;
                if (!S((char) iR2)) {
                    throw y1("Expected name");
                }
                this.f46991i = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iR3 = R0(true);
                if (iR3 != 58) {
                    if (iR3 != 61) {
                        throw y1("Expected ':'");
                    }
                    j();
                    if (this.f46987e < this.f46988f || G(1)) {
                        char[] cArr = this.f46986d;
                        int i12 = this.f46987e;
                        if (cArr[i12] == '>') {
                            this.f46987e = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f46984b == p.LENIENT) {
                    n();
                }
                this.f46995m[this.f46996v - 1] = 7;
            } else if (i11 == 7) {
                if (R0(false) == -1) {
                    this.f46991i = 17;
                    return 17;
                }
                j();
                this.f46987e--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iR4 = R0(true);
        if (iR4 == 34) {
            this.f46991i = 9;
            return 9;
        }
        if (iR4 == 39) {
            j();
            this.f46991i = 8;
            return 8;
        }
        if (iR4 != 44 && iR4 != 59) {
            if (iR4 == 91) {
                this.f46991i = 3;
                return 3;
            }
            if (iR4 != 93) {
                if (iR4 == 123) {
                    this.f46991i = 1;
                    return 1;
                }
                this.f46987e--;
                int iO1 = o1();
                if (iO1 != 0) {
                    return iO1;
                }
                int iP1 = p1();
                if (iP1 != 0) {
                    return iP1;
                }
                if (!S(this.f46986d[this.f46987e])) {
                    throw y1("Expected value");
                }
                j();
                this.f46991i = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f46991i = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw y1("Unexpected value");
        }
        j();
        this.f46987e--;
        this.f46991i = 7;
        return 7;
    }

    public void w() throws IOException {
        int iV = this.f46991i;
        if (iV == 0) {
            iV = v();
        }
        if (iV != 4) {
            throw z1("END_ARRAY");
        }
        int i10 = this.f46996v;
        this.f46996v = i10 - 1;
        int[] iArr = this.f46982G;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f46991i = 0;
    }

    public void x() throws IOException {
        int iV = this.f46991i;
        if (iV == 0) {
            iV = v();
        }
        if (iV != 2) {
            throw z1("END_OBJECT");
        }
        int i10 = this.f46996v;
        int i11 = i10 - 1;
        this.f46996v = i11;
        this.f46997w[i11] = null;
        int[] iArr = this.f46982G;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f46991i = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void x1() throws IOException {
        int i10 = 0;
        do {
            int iV = this.f46991i;
            if (iV == 0) {
                iV = v();
            }
            switch (iV) {
                case 1:
                    q1(3);
                    i10++;
                    this.f46991i = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f46997w[this.f46996v - 1] = null;
                    }
                    this.f46996v--;
                    i10--;
                    this.f46991i = 0;
                    break;
                case 3:
                    q1(1);
                    i10++;
                    this.f46991i = 0;
                    break;
                case 4:
                    this.f46996v--;
                    i10--;
                    this.f46991i = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f46991i = 0;
                    break;
                case 8:
                    t1('\'');
                    this.f46991i = 0;
                    break;
                case 9:
                    t1('\"');
                    this.f46991i = 0;
                    break;
                case 10:
                    w1();
                    this.f46991i = 0;
                    break;
                case 12:
                    t1('\'');
                    if (i10 == 0) {
                        this.f46997w[this.f46996v - 1] = "<skipped>";
                    }
                    this.f46991i = 0;
                    break;
                case 13:
                    t1('\"');
                    if (i10 == 0) {
                        this.f46997w[this.f46996v - 1] = "<skipped>";
                    }
                    this.f46991i = 0;
                    break;
                case 14:
                    w1();
                    if (i10 == 0) {
                        this.f46997w[this.f46996v - 1] = "<skipped>";
                    }
                    this.f46991i = 0;
                    break;
                case 16:
                    this.f46987e += this.f46993k;
                    this.f46991i = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f46982G;
        int i11 = this.f46996v - 1;
        iArr[i11] = iArr[i11] + 1;
    }
}
