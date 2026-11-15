package p229w8;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class l extends k {
    public static boolean p(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z9 = true;
            for (File file2 : k.o(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z9) {
                    }
                }
                z9 = false;
            }
            return z9;
        }
    }

    public static String q(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.I0(name, '.', "");
    }
}
