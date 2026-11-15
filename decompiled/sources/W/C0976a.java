package W;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: W.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0976a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0976a f6214a = new C0976a();

    private C0976a() {
    }

    public final boolean a(File srcFile, File dstFile) {
        Intrinsics.checkNotNullParameter(srcFile, "srcFile");
        Intrinsics.checkNotNullParameter(dstFile, "dstFile");
        try {
            Files.move(srcFile.toPath(), dstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
