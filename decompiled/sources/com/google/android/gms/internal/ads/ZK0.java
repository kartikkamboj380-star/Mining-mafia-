package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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

/* JADX INFO: loaded from: classes2.dex */
public final class ZK0 implements Closeable, Flushable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f26155j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f26156k = new String[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f26157l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f26158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f26159b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26160c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4726pK0 f26161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f26163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f26164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private EnumC5607wK0 f26165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f26166i;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f26156k[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f26156k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f26157l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public ZK0(Writer writer) {
        boolean z9 = false;
        Q(6);
        this.f26165h = EnumC5607wK0.LEGACY_STRICT;
        Objects.requireNonNull(writer, "out == null");
        this.f26158a = writer;
        C4726pK0 c4726pK0 = C4726pK0.f32362d;
        Objects.requireNonNull(c4726pK0);
        this.f26161d = c4726pK0;
        this.f26163f = ",";
        if (c4726pK0.c()) {
            this.f26162e = ": ";
            if (c4726pK0.a().isEmpty()) {
                this.f26163f = ", ";
            }
        } else {
            this.f26162e = ":";
        }
        if (c4726pK0.a().isEmpty() && c4726pK0.b().isEmpty()) {
            z9 = true;
        }
        this.f26164g = z9;
    }

    private final ZK0 M(int i10, char c10) throws IOException {
        X();
        Q(i10);
        this.f26158a.write(c10);
        return this;
    }

    private final ZK0 N(int i10, int i11, char c10) throws IOException {
        int iR = R();
        if (iR != i11 && iR != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f26166i;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f26160c--;
        if (iR == i11) {
            W();
        }
        this.f26158a.write(c10);
        return this;
    }

    private final void Q(int i10) {
        int i11 = this.f26160c;
        int[] iArr = this.f26159b;
        if (i11 == iArr.length) {
            this.f26159b = Arrays.copyOf(iArr, i11 + i11);
        }
        int[] iArr2 = this.f26159b;
        int i12 = this.f26160c;
        this.f26160c = i12 + 1;
        iArr2[i12] = i10;
    }

    private final int R() {
        int i10 = this.f26160c;
        if (i10 != 0) {
            return this.f26159b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void S(int i10) {
        this.f26159b[this.f26160c - 1] = i10;
    }

    private final void T() throws IOException {
        if (this.f26166i != null) {
            int iR = R();
            if (iR == 5) {
                this.f26158a.write(this.f26163f);
            } else if (iR != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            W();
            S(4);
            V(this.f26166i);
            this.f26166i = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    private final void V(String str) throws IOException {
        String str2;
        Writer writer = this.f26158a;
        String[] strArr = f26156k;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i11 < i10) {
                        writer.write(str, i11, i10 - i11);
                    }
                    writer.write(str2);
                    i11 = i12;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i10) {
                    writer.write(str, i11, i10 - i11);
                }
                writer.write(str2);
                i11 = i12;
            }
            i10 = i12;
        }
        if (i11 < length) {
            writer.write(str, i11, length - i11);
        }
        writer.write(34);
    }

    private final void W() throws IOException {
        if (this.f26164g) {
            return;
        }
        Writer writer = this.f26158a;
        C4726pK0 c4726pK0 = this.f26161d;
        writer.write(c4726pK0.a());
        int i10 = this.f26160c;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(c4726pK0.b());
        }
    }

    private final void X() throws IOException {
        int iR = R();
        if (iR == 1) {
            S(2);
            W();
            return;
        }
        if (iR == 2) {
            this.f26158a.append((CharSequence) this.f26163f);
            W();
        } else {
            if (iR == 4) {
                this.f26158a.append((CharSequence) this.f26162e);
                S(5);
                return;
            }
            if (iR != 6) {
                if (iR != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f26165h != EnumC5607wK0.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            S(7);
        }
    }

    public final ZK0 G(Number number) throws IOException {
        if (number == null) {
            J();
            return this;
        }
        T();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f26165h != EnumC5607wK0.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f26155j.matcher(string).matches()) {
                String strValueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 47 + string.length());
                sb.append("String created by ");
                sb.append(strValueOf);
                sb.append(" is not a valid JSON number: ");
                sb.append(string);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        X();
        this.f26158a.append((CharSequence) string);
        return this;
    }

    public final ZK0 J() throws IOException {
        if (this.f26166i != null) {
            T();
        }
        X();
        this.f26158a.write("null");
        return this;
    }

    public final void a(EnumC5607wK0 enumC5607wK0) {
        Objects.requireNonNull(enumC5607wK0);
        this.f26165h = enumC5607wK0;
    }

    public final ZK0 c() throws IOException {
        T();
        M(1, '[');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f26158a.close();
        int i10 = this.f26160c;
        if (i10 > 1 || (i10 == 1 && this.f26159b[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f26160c = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f26160c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f26158a.flush();
    }

    public final ZK0 h() throws IOException {
        N(1, 2, ']');
        return this;
    }

    public final ZK0 j() throws IOException {
        T();
        M(3, '{');
        return this;
    }

    public final ZK0 n() throws IOException {
        N(3, 5, '}');
        return this;
    }

    public final ZK0 v(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f26166i != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iR = R();
        if (iR != 3 && iR != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f26166i = str;
        return this;
    }

    public final ZK0 w(String str) throws IOException {
        if (str == null) {
            J();
            return this;
        }
        T();
        X();
        V(str);
        return this;
    }

    public final ZK0 x(boolean z9) throws IOException {
        T();
        X();
        this.f26158a.write(true != z9 ? "false" : "true");
        return this;
    }
}
