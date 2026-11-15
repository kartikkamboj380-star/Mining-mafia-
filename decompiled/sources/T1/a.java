package T1;

import android.os.Environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class a implements T1.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f5613f = a.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f5614g = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f5615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f5617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S1.a f5618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p053f2.a f5619e;

    /* JADX INFO: renamed from: T1.a$a, reason: collision with other inner class name */
    private class C0083a implements X1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f5620a;

        @Override // X1.b
        public void b(File file) {
            c cVarU = a.this.u(file);
            if (cVarU == null || cVarU.f5626a != ".cnt") {
                return;
            }
            this.f5620a.add(new b(cVarU.f5627b, file));
        }

        public List d() {
            return Collections.unmodifiableList(this.f5620a);
        }

        private C0083a() {
            this.f5620a = new ArrayList();
        }

        @Override // X1.b
        public void a(File file) {
        }

        @Override // X1.b
        public void c(File file) {
        }
    }

    static class b implements T1.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f5622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final R1.b f5623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f5624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f5625d;

        @Override // T1.f.a
        public long a() {
            if (this.f5624c < 0) {
                this.f5624c = this.f5623b.size();
            }
            return this.f5624c;
        }

        public R1.b b() {
            return this.f5623b;
        }

        @Override // T1.f.a
        public String getId() {
            return this.f5622a;
        }

        @Override // T1.f.a
        public long getTimestamp() {
            if (this.f5625d < 0) {
                this.f5625d = this.f5623b.d().lastModified();
            }
            return this.f5625d;
        }

        private b(String str, File file) {
            Y1.k.g(file);
            this.f5622a = (String) Y1.k.g(str);
            this.f5623b = R1.b.b(file);
            this.f5624c = -1L;
            this.f5625d = -1L;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5627b;

        public static c b(File file) {
            String strS;
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf <= 0 || (strS = a.s(name.substring(iLastIndexOf))) == null) {
                return null;
            }
            String strSubstring = name.substring(0, iLastIndexOf);
            if (strS.equals(".tmp")) {
                int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                if (iLastIndexOf2 <= 0) {
                    return null;
                }
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            return new c(strS, strSubstring);
        }

        public File a(File file) {
            return File.createTempFile(this.f5627b + ".", ".tmp", file);
        }

        public String c(String str) {
            return str + File.separator + this.f5627b + this.f5626a;
        }

        public String toString() {
            return this.f5626a + "(" + this.f5627b + ")";
        }

        private c(String str, String str2) {
            this.f5626a = str;
            this.f5627b = str2;
        }
    }

    private static class d extends IOException {
        public d(long j10, long j11) {
            super("File was not written completely. Expected: " + j10 + ", found: " + j11);
        }
    }

    class e implements T1.f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f5628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final File f5629b;

        public e(String str, File file) {
            this.f5628a = str;
            this.f5629b = file;
        }

        public R1.a a(Object obj, long j10) throws X1.c.d {
            S1.a.EnumC0079a enumC0079a;
            File fileQ = a.this.q(this.f5628a);
            try {
                X1.c.b(this.f5629b, fileQ);
                if (fileQ.exists()) {
                    fileQ.setLastModified(j10);
                }
                return R1.b.b(fileQ);
            } catch (X1.c.d e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    enumC0079a = S1.a.EnumC0079a.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof X1.c.C0114c) {
                    enumC0079a = S1.a.EnumC0079a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else {
                    enumC0079a = cause instanceof FileNotFoundException ? S1.a.EnumC0079a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND : S1.a.EnumC0079a.WRITE_RENAME_FILE_OTHER;
                }
                a.this.f5618d.a(enumC0079a, a.f5613f, "commit", e10);
                throw e10;
            }
        }

        @Override // T1.f.b
        public boolean e() {
            return !this.f5629b.exists() || this.f5629b.delete();
        }

        @Override // T1.f.b
        public R1.a f(Object obj) {
            return a(obj, a.this.f5619e.now());
        }

        @Override // T1.f.b
        public void g(S1.j jVar, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f5629b);
                try {
                    Y1.c cVar = new Y1.c(fileOutputStream);
                    jVar.a(cVar);
                    cVar.flush();
                    long jA = cVar.a();
                    fileOutputStream.close();
                    if (this.f5629b.length() != jA) {
                        throw new d(jA, this.f5629b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                a.this.f5618d.a(S1.a.EnumC0079a.WRITE_UPDATE_FILE_NOT_FOUND, a.f5613f, "updateResource", e10);
                throw e10;
            }
        }
    }

    private class f implements X1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f5631a;

        private boolean d(File file) {
            c cVarU = a.this.u(file);
            if (cVarU == null) {
                return false;
            }
            String str = cVarU.f5626a;
            if (str == ".tmp") {
                return e(file);
            }
            Y1.k.i(str == ".cnt");
            return true;
        }

        private boolean e(File file) {
            return file.lastModified() > a.this.f5619e.now() - a.f5614g;
        }

        @Override // X1.b
        public void a(File file) {
            if (!a.this.f5615a.equals(file) && !this.f5631a) {
                file.delete();
            }
            if (this.f5631a && file.equals(a.this.f5617c)) {
                this.f5631a = false;
            }
        }

        @Override // X1.b
        public void b(File file) {
            if (this.f5631a && d(file)) {
                return;
            }
            file.delete();
        }

        @Override // X1.b
        public void c(File file) {
            if (this.f5631a || !file.equals(a.this.f5617c)) {
                return;
            }
            this.f5631a = true;
        }

        private f() {
        }
    }

    public a(File file, int i10, S1.a aVar) {
        Y1.k.g(file);
        this.f5615a = file;
        this.f5616b = y(file, aVar);
        this.f5617c = new File(file, x(i10));
        this.f5618d = aVar;
        B();
        this.f5619e = p053f2.d.a();
    }

    private boolean A(String str, boolean z9) {
        File fileQ = q(str);
        boolean zExists = fileQ.exists();
        if (z9 && zExists) {
            fileQ.setLastModified(this.f5619e.now());
        }
        return zExists;
    }

    private void B() {
        if (this.f5615a.exists()) {
            if (this.f5617c.exists()) {
                return;
            } else {
                X1.a.b(this.f5615a);
            }
        }
        try {
            X1.c.a(this.f5617c);
        } catch (X1.c.a unused) {
            this.f5618d.a(S1.a.EnumC0079a.WRITE_CREATE_DIR, f5613f, "version directory could not be created: " + this.f5617c, null);
        }
    }

    private long p(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String s(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    private String t(String str) {
        c cVar = new c(".cnt", str);
        return cVar.c(w(cVar.f5627b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c u(File file) {
        c cVarB = c.b(file);
        if (cVarB != null && v(cVarB.f5627b).equals(file.getParentFile())) {
            return cVarB;
        }
        return null;
    }

    private File v(String str) {
        return new File(w(str));
    }

    private String w(String str) {
        return this.f5617c + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    static String x(int i10) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i10));
    }

    private static boolean y(File file, S1.a aVar) {
        String canonicalPath;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String string = externalStorageDirectory.toString();
            try {
                canonicalPath = file.getCanonicalPath();
                try {
                    return canonicalPath.contains(string);
                } catch (IOException e10) {
                    e = e10;
                    aVar.a(S1.a.EnumC0079a.OTHER, f5613f, "failed to read folder to check if external: " + canonicalPath, e);
                    return false;
                }
            } catch (IOException e11) {
                e = e11;
                canonicalPath = null;
            }
        } catch (Exception e12) {
            aVar.a(S1.a.EnumC0079a.OTHER, f5613f, "failed to get the external storage directory!", e12);
            return false;
        }
    }

    private void z(File file, String str) throws X1.c.a {
        try {
            X1.c.a(file);
        } catch (X1.c.a e10) {
            this.f5618d.a(S1.a.EnumC0079a.WRITE_CREATE_DIR, f5613f, str, e10);
            throw e10;
        }
    }

    @Override // T1.f
    public void a() {
        X1.a.a(this.f5615a);
    }

    @Override // T1.f
    public void b() {
        X1.a.c(this.f5615a, new f());
    }

    @Override // T1.f
    public boolean c(String str, Object obj) {
        return A(str, true);
    }

    @Override // T1.f
    public T1.f.b d(String str, Object obj) throws IOException {
        c cVar = new c(".tmp", str);
        File fileV = v(cVar.f5627b);
        if (!fileV.exists()) {
            z(fileV, "insert");
        }
        try {
            return new e(str, cVar.a(fileV));
        } catch (IOException e10) {
            this.f5618d.a(S1.a.EnumC0079a.WRITE_CREATE_TEMPFILE, f5613f, "insert", e10);
            throw e10;
        }
    }

    @Override // T1.f
    public long e(T1.f.a aVar) {
        return p(((b) aVar).b().d());
    }

    @Override // T1.f
    public boolean f(String str, Object obj) {
        return A(str, false);
    }

    @Override // T1.f
    public R1.a g(String str, Object obj) {
        File fileQ = q(str);
        if (!fileQ.exists()) {
            return null;
        }
        fileQ.setLastModified(this.f5619e.now());
        return R1.b.c(fileQ);
    }

    @Override // T1.f
    public boolean isExternal() {
        return this.f5616b;
    }

    File q(String str) {
        return new File(t(str));
    }

    @Override // T1.f
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public List h() {
        C0083a c0083a = new C0083a();
        X1.a.c(this.f5617c, c0083a);
        return c0083a.d();
    }

    @Override // T1.f
    public long remove(String str) {
        return p(q(str));
    }
}
