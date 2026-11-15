package p117l6;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p177r6.g;

/* JADX INFO: renamed from: l6.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C7051l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f46180d = new FilenameFilter() { // from class: l6.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("aqs.");
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator f46181e = new Comparator() { // from class: l6.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f46182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46183b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46184c = null;

    C7051l(g gVar) {
        this.f46182a = gVar;
    }

    private static void d(g gVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            gVar.q(str, "aqs." + str2).createNewFile();
        } catch (IOException e10) {
            p087i6.g.f().l("Failed to persist App Quality Sessions session id.", e10);
        }
    }

    static String e(g gVar, String str) {
        List listR = gVar.r(str, f46180d);
        if (!listR.isEmpty()) {
            return ((File) Collections.min(listR, f46181e)).getName().substring(4);
        }
        p087i6.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f46183b, str)) {
            return this.f46184c;
        }
        return e(this.f46182a, str);
    }

    public synchronized void f(String str) {
        if (!Objects.equals(this.f46184c, str)) {
            d(this.f46182a, this.f46183b, str);
            this.f46184c = str;
        }
    }

    public synchronized void g(String str) {
        if (!Objects.equals(this.f46183b, str)) {
            d(this.f46182a, str, this.f46184c);
            this.f46183b = str;
        }
    }
}
