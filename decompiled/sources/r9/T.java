package r9;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class T implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48391b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f48392c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C7108k f48393a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ T d(a aVar, File file, boolean z9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z9 = false;
            }
            return aVar.a(file, z9);
        }

        public static /* synthetic */ T e(a aVar, String str, boolean z9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z9 = false;
            }
            return aVar.b(str, z9);
        }

        public static /* synthetic */ T f(a aVar, Path path, boolean z9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z9 = false;
            }
            return aVar.c(path, z9);
        }

        public final T a(File file, boolean z9) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            String string = file.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return b(string, z9);
        }

        public final T b(String str, boolean z9) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return s9.d.k(str, z9);
        }

        public final T c(Path path, boolean z9) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return b(path.toString(), z9);
        }

        private a() {
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f48392c = separator;
    }

    public T(C7108k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f48393a = bytes;
    }

    public static /* synthetic */ T m(T t10, T t11, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return t10.l(t11, z9);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(T other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return d().compareTo(other.d());
    }

    public final C7108k d() {
        return this.f48393a;
    }

    public final T e() {
        int iO = s9.d.o(this);
        if (iO == -1) {
            return null;
        }
        return new T(d().G(0, iO));
    }

    public boolean equals(Object obj) {
        return (obj instanceof T) && Intrinsics.b(((T) obj).d(), d());
    }

    public final List f() {
        ArrayList arrayList = new ArrayList();
        int iO = s9.d.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < d().E() && d().i(iO) == 92) {
            iO++;
        }
        int iE = d().E();
        int i10 = iO;
        while (iO < iE) {
            if (d().i(iO) == 47 || d().i(iO) == 92) {
                arrayList.add(d().G(i10, iO));
                i10 = iO + 1;
            }
            iO++;
        }
        if (i10 < d().E()) {
            arrayList.add(d().G(i10, d().E()));
        }
        return arrayList;
    }

    public final String g() {
        return h().K();
    }

    public final C7108k h() {
        int iL = s9.d.l(this);
        if (iL != -1) {
            return C7108k.H(d(), iL + 1, 0, 2, null);
        }
        return (o() == null || d().E() != 2) ? d() : C7108k.f48468e;
    }

    public int hashCode() {
        return d().hashCode();
    }

    public final T i() {
        if (Intrinsics.b(d(), s9.d.f49364d) || Intrinsics.b(d(), s9.d.f49361a) || Intrinsics.b(d(), s9.d.f49362b) || s9.d.n(this)) {
            return null;
        }
        int iL = s9.d.l(this);
        if (iL == 2 && o() != null) {
            if (d().E() == 3) {
                return null;
            }
            return new T(C7108k.H(d(), 0, 3, 1, null));
        }
        if (iL == 1 && d().F(s9.d.f49362b)) {
            return null;
        }
        if (iL != -1 || o() == null) {
            if (iL == -1) {
                return new T(s9.d.f49364d);
            }
            return iL == 0 ? new T(C7108k.H(d(), 0, 1, 1, null)) : new T(C7108k.H(d(), 0, iL, 1, null));
        }
        if (d().E() == 2) {
            return null;
        }
        return new T(C7108k.H(d(), 0, 2, 1, null));
    }

    public final boolean isAbsolute() {
        return s9.d.o(this) != -1;
    }

    public final T j(T other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.b(e(), other.e())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List listF = f();
        List listF2 = other.f();
        int iMin = Math.min(listF.size(), listF2.size());
        int i10 = 0;
        while (i10 < iMin && Intrinsics.b(listF.get(i10), listF2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && d().E() == other.d().E()) {
            return a.e(f48391b, ".", false, 1, null);
        }
        if (listF2.subList(i10, listF2.size()).indexOf(s9.d.f49365e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (Intrinsics.b(other.d(), s9.d.f49364d)) {
            return this;
        }
        C7105h c7105h = new C7105h();
        C7108k c7108kM = s9.d.m(other);
        if (c7108kM == null && (c7108kM = s9.d.m(this)) == null) {
            c7108kM = s9.d.s(f48392c);
        }
        int size = listF2.size();
        for (int i11 = i10; i11 < size; i11++) {
            c7105h.F(s9.d.f49365e);
            c7105h.F(c7108kM);
        }
        int size2 = listF.size();
        while (i10 < size2) {
            c7105h.F((C7108k) listF.get(i10));
            c7105h.F(c7108kM);
            i10++;
        }
        return s9.d.q(c7105h, false);
    }

    public final T k(String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return s9.d.j(this, s9.d.q(new C7105h().I(child), false), false);
    }

    public final T l(T child, boolean z9) {
        Intrinsics.checkNotNullParameter(child, "child");
        return s9.d.j(this, child, z9);
    }

    public final Path n() {
        Path path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    public final Character o() {
        if (C7108k.q(d(), s9.d.f49361a, 0, 2, null) != -1 || d().E() < 2 || d().i(1) != 58) {
            return null;
        }
        char cI = (char) d().i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final File toFile() {
        return new File(toString());
    }

    public String toString() {
        return d().K();
    }
}
