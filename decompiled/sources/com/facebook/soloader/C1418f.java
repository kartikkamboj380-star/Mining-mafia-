package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.soloader.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1418f extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final File f16547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f16548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final List f16549c;

    public C1418f(File file, int i10) {
        this(file, i10, new String[0]);
    }

    @Override // com.facebook.soloader.E
    public String c() {
        return "DirectorySoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return g(str, i10, this.f16547a, threadPolicy);
    }

    public File f(String str) {
        File file = new File(this.f16547a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    protected int g(String str, int i10, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f16522b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        if (this.f16549c.contains(str)) {
            p.a("SoLoader", str + " is on the denyList, skip loading from " + file.getCanonicalPath());
            return 0;
        }
        File fileF = f(str);
        if (fileF == null) {
            p.f("SoLoader", str + " file not found on " + file.getCanonicalPath());
            return 0;
        }
        String canonicalPath = fileF.getCanonicalPath();
        p.a("SoLoader", str + " file found at " + canonicalPath);
        if ((i10 & 1) != 0 && (this.f16548b & 2) != 0) {
            p.a("SoLoader", str + " loaded implicitly");
            return 2;
        }
        if ((this.f16548b & 1) != 0) {
            i iVar = new i(fileF);
            try {
                t.h(str, iVar, i10, threadPolicy);
                iVar.close();
            } catch (Throwable th) {
                try {
                    iVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            p.a("SoLoader", "Not resolving dependencies for " + str);
        }
        try {
            SoLoader.f16522b.a(canonicalPath, i10);
            return 1;
        } catch (UnsatisfiedLinkError e10) {
            throw D.b(str, e10);
        }
    }

    public void h() {
        this.f16548b |= 1;
    }

    @Override // com.facebook.soloader.E
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f16547a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f16547a.getName();
        }
        return c() + "[root = " + name + " flags = " + this.f16548b + ']';
    }

    public C1418f(File file, int i10, String[] strArr) {
        this.f16547a = file;
        this.f16548b = i10;
        this.f16549c = Arrays.asList(strArr);
    }
}
