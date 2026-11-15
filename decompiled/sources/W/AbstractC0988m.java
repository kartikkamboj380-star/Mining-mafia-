package W;

import android.os.Build;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: W.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0988m {
    public static final boolean a(File file, File toFile) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? C0976a.f6214a.a(file, toFile) : file.renameTo(toFile);
    }
}
