package p137n6;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import p087i6.g;
import p117l6.AbstractC7048i;

/* JADX INFO: loaded from: classes3.dex */
class i implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f46951d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f46952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f46954c;

    class a implements h.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f46955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f46956b;

        a(byte[] bArr, int[] iArr) {
            this.f46955a = bArr;
            this.f46956b = iArr;
        }

        @Override // n6.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            try {
                inputStream.read(this.f46955a, this.f46956b[0], i10);
                int[] iArr = this.f46956b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f46958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46959b;

        b(byte[] bArr, int i10) {
            this.f46958a = bArr;
            this.f46959b = i10;
        }
    }

    i(File file, int i10) {
        this.f46952a = file;
        this.f46953b = i10;
    }

    private void f(long j10, String str) {
        if (this.f46954c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i10 = this.f46953b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f46954c.n(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f46951d));
            while (!this.f46954c.M() && this.f46954c.R0() > this.f46953b) {
                this.f46954c.W();
            }
        } catch (IOException e10) {
            g.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    private b g() {
        if (!this.f46952a.exists()) {
            return null;
        }
        h();
        h hVar = this.f46954c;
        if (hVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[hVar.R0()];
        try {
            this.f46954c.G(new a(bArr, iArr));
        } catch (IOException e10) {
            g.f().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f46954c == null) {
            try {
                this.f46954c = new h(this.f46952a);
            } catch (IOException e10) {
                g.f().e("Could not open log file: " + this.f46952a, e10);
            }
        }
    }

    @Override // p137n6.d
    public void a() {
        AbstractC7048i.f(this.f46954c, "There was a problem closing the Crashlytics log file.");
        this.f46954c = null;
    }

    @Override // p137n6.d
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, f46951d);
        }
        return null;
    }

    @Override // p137n6.d
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i10 = bVarG.f46959b;
        byte[] bArr = new byte[i10];
        System.arraycopy(bVarG.f46958a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // p137n6.d
    public void d() {
        a();
        this.f46952a.delete();
    }

    @Override // p137n6.d
    public void e(long j10, String str) {
        h();
        f(j10, str);
    }
}
