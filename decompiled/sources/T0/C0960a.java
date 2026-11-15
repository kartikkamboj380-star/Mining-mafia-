package T0;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: T0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0960a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0960a f5573a = new C0960a();

    private C0960a() {
    }

    @NotNull
    public final String a() {
        String processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "getProcessName()");
        return processName;
    }
}
