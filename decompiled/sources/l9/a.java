package l9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import r9.L;
import r9.M;
import r9.a0;
import r9.c0;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0468a f46263a = C0468a.f46265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46264b = new C0468a.C0469a();

    /* JADX INFO: renamed from: l9.a$a, reason: collision with other inner class name */
    public static final class C0468a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0468a f46265a = new C0468a();

        /* JADX INFO: renamed from: l9.a$a$a, reason: collision with other inner class name */
        private static final class C0469a implements a {
            @Override // l9.a
            public void a(File directory) throws IOException {
                Intrinsics.checkNotNullParameter(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue(file, "file");
                        a(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // l9.a
            public boolean b(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // l9.a
            public a0 c(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return L.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return L.a(file);
                }
            }

            @Override // l9.a
            public long d(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            @Override // l9.a
            public c0 e(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return L.k(file);
            }

            @Override // l9.a
            public a0 f(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return M.g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return M.g(file, false, 1, null);
                }
            }

            @Override // l9.a
            public void g(File from, File to) throws IOException {
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to, "to");
                h(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // l9.a
            public void h(File file) throws IOException {
                Intrinsics.checkNotNullParameter(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C0468a() {
        }
    }

    void a(File file);

    boolean b(File file);

    a0 c(File file);

    long d(File file);

    c0 e(File file);

    a0 f(File file);

    void g(File file, File file2);

    void h(File file);
}
