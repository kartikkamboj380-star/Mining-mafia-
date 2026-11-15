package p138n7;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.gson.d;
import com.google.gson.p;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f47009l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f47010m = new String[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String[] f47011v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f47012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f47013b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47014c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f47015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f47016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f47017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f47018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p f47019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f47020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f47021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f47022k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f47010m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f47010m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f47011v = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        W(6);
        this.f47019h = p.LEGACY_STRICT;
        this.f47022k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f47012a = writer;
        a0(d.f40740d);
    }

    private void R() throws IOException {
        if (this.f47018g) {
            return;
        }
        this.f47012a.write(this.f47015d.b());
        int i10 = this.f47014c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f47012a.write(this.f47015d.a());
        }
    }

    private c T(int i10, char c10) throws IOException {
        h();
        W(i10);
        this.f47012a.write(c10);
        return this;
    }

    private int V() {
        int i10 = this.f47014c;
        if (i10 != 0) {
            return this.f47013b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void W(int i10) {
        int i11 = this.f47014c;
        int[] iArr = this.f47013b;
        if (i11 == iArr.length) {
            this.f47013b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f47013b;
        int i12 = this.f47014c;
        this.f47014c = i12 + 1;
        iArr2[i12] = i10;
    }

    private void X(int i10) {
        this.f47013b[this.f47014c - 1] = i10;
    }

    private static boolean a(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void c() throws IOException {
        int iV = V();
        if (iV == 5) {
            this.f47012a.write(this.f47017f);
        } else if (iV != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        R();
        X(4);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void g1(String str) throws IOException {
        String str2;
        String[] strArr = this.f47020i ? f47011v : f47010m;
        this.f47012a.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        this.f47012a.write(str, i10, i11 - i10);
                    }
                    this.f47012a.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    this.f47012a.write(str, i10, i11 - i10);
                }
                this.f47012a.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            this.f47012a.write(str, i10, length - i10);
        }
        this.f47012a.write(34);
    }

    private void h() throws IOException {
        int iV = V();
        if (iV == 1) {
            X(2);
            R();
            return;
        }
        if (iV == 2) {
            this.f47012a.append((CharSequence) this.f47017f);
            R();
        } else {
            if (iV == 4) {
                this.f47012a.append((CharSequence) this.f47016e);
                X(5);
                return;
            }
            if (iV != 6) {
                if (iV != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f47019h != p.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            X(7);
        }
    }

    private void r1() throws IOException {
        if (this.f47021j != null) {
            c();
            g1(this.f47021j);
            this.f47021j = null;
        }
    }

    private c v(int i10, int i11, char c10) throws IOException {
        int iV = V();
        if (iV != i11 && iV != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f47021j != null) {
            throw new IllegalStateException("Dangling name: " + this.f47021j);
        }
        this.f47014c--;
        if (iV == i11) {
            R();
        }
        this.f47012a.write(c10);
        return this;
    }

    public final boolean G() {
        return this.f47022k;
    }

    public final void I0(boolean z9) {
        this.f47020i = z9;
    }

    public final p J() {
        return this.f47019h;
    }

    public final boolean M() {
        return this.f47020i;
    }

    public boolean N() {
        return this.f47019h == p.LENIENT;
    }

    public c Q(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f47021j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iV = V();
        if (iV != 3 && iV != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f47021j = str;
        return this;
    }

    public final void R0(boolean z9) {
        this.f47022k = z9;
    }

    public c S() throws IOException {
        if (this.f47021j != null) {
            if (!this.f47022k) {
                this.f47021j = null;
                return this;
            }
            r1();
        }
        h();
        this.f47012a.write("null");
        return this;
    }

    public final void V0(p pVar) {
        Objects.requireNonNull(pVar);
        this.f47019h = pVar;
    }

    public final void a0(d dVar) {
        Objects.requireNonNull(dVar);
        this.f47015d = dVar;
        this.f47017f = ",";
        if (dVar.c()) {
            this.f47016e = ": ";
            if (this.f47015d.b().isEmpty()) {
                this.f47017f = ", ";
            }
        } else {
            this.f47016e = ":";
        }
        this.f47018g = this.f47015d.b().isEmpty() && this.f47015d.a().isEmpty();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f47012a.close();
        int i10 = this.f47014c;
        if (i10 > 1 || (i10 == 1 && this.f47013b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f47014c = 0;
    }

    public void flush() throws IOException {
        if (this.f47014c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f47012a.flush();
    }

    public c j() throws IOException {
        r1();
        return T(1, '[');
    }

    public c l1(double d10) throws IOException {
        r1();
        if (this.f47019h == p.LENIENT || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            h();
            this.f47012a.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public c m1(long j10) throws IOException {
        r1();
        h();
        this.f47012a.write(Long.toString(j10));
        return this;
    }

    public c n() throws IOException {
        r1();
        return T(3, '{');
    }

    public c n1(Boolean bool) throws IOException {
        if (bool == null) {
            return S();
        }
        r1();
        h();
        this.f47012a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c o1(Number number) throws IOException {
        if (number == null) {
            return S();
        }
        r1();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (!a(cls)) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f47019h != p.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
                }
            } else if (cls != Float.class && cls != Double.class && !f47009l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        h();
        this.f47012a.append((CharSequence) string);
        return this;
    }

    public c p1(String str) throws IOException {
        if (str == null) {
            return S();
        }
        r1();
        h();
        g1(str);
        return this;
    }

    public c q1(boolean z9) throws IOException {
        r1();
        h();
        this.f47012a.write(z9 ? "true" : "false");
        return this;
    }

    public c w() {
        return v(1, 2, ']');
    }

    public c x() {
        return v(3, 5, '}');
    }
}
