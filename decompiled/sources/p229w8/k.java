package p229w8;

import java.io.File;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class k extends j {
    public static final f m(File file, FileWalkDirection direction) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new f(file, direction);
    }

    public static /* synthetic */ f n(File file, FileWalkDirection fileWalkDirection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return m(file, fileWalkDirection);
    }

    public static final f o(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return m(file, FileWalkDirection.BOTTOM_UP);
    }
}
