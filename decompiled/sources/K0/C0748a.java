package K0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: K0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0748a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0748a f2471a = new C0748a();

    private C0748a() {
    }

    @NotNull
    public final File a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
