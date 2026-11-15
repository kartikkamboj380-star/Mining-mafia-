package p108k7;

import com.google.gson.g;
import com.google.gson.internal.bind.n;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
import p138n7.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G {
    public static void a(g gVar, c cVar) {
        n.f40873V.d(cVar, gVar);
    }

    public static Writer b(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    private static final class b extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Appendable f45636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f45637b = new a();

        private static class a implements CharSequence {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private char[] f45638a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f45639b;

            private a() {
            }

            void a(char[] cArr) {
                this.f45638a = cArr;
                this.f45639b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f45638a[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f45638a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f45638a, i10, i11 - i10);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f45639b == null) {
                    this.f45639b = new String(this.f45638a);
                }
                return this.f45639b;
            }
        }

        b(Appendable appendable) {
            this.f45636a = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            this.f45637b.a(cArr);
            this.f45636a.append(this.f45637b, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f45636a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f45636a.append((char) i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
            this.f45636a.append(charSequence, i10, i11);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) throws IOException {
            Objects.requireNonNull(str);
            this.f45636a.append(str, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }
}
