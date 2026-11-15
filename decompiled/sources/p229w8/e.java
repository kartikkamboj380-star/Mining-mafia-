package p229w8;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f50393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f50394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(File file, File file2, String str) {
        super(d.b(file, file2, str));
        Intrinsics.checkNotNullParameter(file, "file");
        this.f50393a = file;
        this.f50394b = file2;
        this.f50395c = str;
    }
}
