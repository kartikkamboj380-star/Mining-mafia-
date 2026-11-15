package R1;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements R1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5085b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f5086a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new b(file, null);
        }

        public final b b(File file) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (file != null) {
                return new b(file, defaultConstructorMarker);
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ b(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    public static final b b(File file) {
        return f5085b.a(file);
    }

    public static final b c(File file) {
        return f5085b.b(file);
    }

    @Override // R1.a
    public InputStream a() {
        return new FileInputStream(this.f5086a);
    }

    public final File d() {
        return this.f5086a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return Intrinsics.b(this.f5086a, ((b) obj).f5086a);
    }

    public int hashCode() {
        return this.f5086a.hashCode();
    }

    @Override // R1.a
    public long size() {
        return this.f5086a.length();
    }

    private b(File file) {
        this.f5086a = file;
    }
}
