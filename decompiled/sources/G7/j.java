package G7;

import android.view.View;
import com.swmansion.rnscreens.C6814s;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final boolean a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.isLaidOut() || view.getHeight() > 0 || view.getWidth() > 0;
    }

    public static final boolean b(C6814s c6814s) {
        Intrinsics.checkNotNullParameter(c6814s, "<this>");
        return c6814s.getStackPresentation() == C6814s.e.FORM_SHEET && c6814s.getSheetDetents().size() == 1 && ((Number) CollectionsKt.W(c6814s.getSheetDetents())).doubleValue() == -1.0d;
    }

    public static final boolean c(C6814s c6814s) {
        Intrinsics.checkNotNullParameter(c6814s, "<this>");
        return false;
    }

    public static final boolean d(C6814s c6814s) {
        Intrinsics.checkNotNullParameter(c6814s, "<this>");
        return c6814s.getStackPresentation() == C6814s.e.FORM_SHEET;
    }
}
