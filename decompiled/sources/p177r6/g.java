package p177r6;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p087i6.j;
import p117l6.AbstractC7048i;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f48342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f48343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f48344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f48345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f48346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final File f48347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f48348g;

    public g(Context context) {
        String str;
        String strD = j.f45093a.e(context).d();
        this.f48342a = strD;
        File filesDir = context.getFilesDir();
        this.f48343b = filesDir;
        if (x()) {
            str = ".crashlytics.v3" + File.separator + w(strD);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileS = s(new File(filesDir, str));
        this.f48344c = fileS;
        this.f48345d = s(new File(fileS, "open-sessions"));
        this.f48346e = s(new File(fileS, "reports"));
        this.f48347f = s(new File(fileS, "priority-reports"));
        this.f48348g = s(new File(fileS, "native-reports"));
    }

    private void b(String str) {
        File file = new File(this.f48343b, str);
        if (file.exists() && u(file)) {
            p087i6.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (!this.f48343b.exists() || (list = this.f48343b.list(new FilenameFilter() { // from class: r6.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    private File p(String str) {
        return t(new File(this.f48345d, str));
    }

    private static synchronized File s(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                p087i6.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                p087i6.g.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static File t(File file) {
        file.mkdirs();
        return file;
    }

    static boolean u(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                u(file2);
            }
        }
        return file.delete();
    }

    private static List v(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    static String w(String str) {
        return str.length() > 40 ? AbstractC7048i.A(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean x() {
        return !this.f48342a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (x()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return u(new File(this.f48345d, str));
    }

    public List f() {
        return v(this.f48345d.list());
    }

    public File g(String str) {
        return new File(this.f48344c, str);
    }

    public List h(FilenameFilter filenameFilter) {
        return v(this.f48344c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f48348g, str);
    }

    public List j() {
        return v(this.f48348g.listFiles());
    }

    public File k(String str) {
        return t(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f48347f, str);
    }

    public List m() {
        return v(this.f48347f.listFiles());
    }

    public File n(String str) {
        return new File(this.f48346e, str);
    }

    public List o() {
        return v(this.f48346e.listFiles());
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List r(String str, FilenameFilter filenameFilter) {
        return v(p(str).listFiles(filenameFilter));
    }
}
