package V3;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.AbstractC1313n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p070h.w;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6078a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f6079b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f6080c = new HashMap();

    private a() {
    }

    public static final View a(View root, String nativeId) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(nativeId, "nativeId");
        if (Intrinsics.b(f6078a.b(root), nativeId)) {
            return root;
        }
        if (!(root instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) root;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            View viewA = a(childAt, nativeId);
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }

    private final String b(View view) {
        Object tag = view.getTag(AbstractC1313n.f15040G);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        String strB = f6078a.b(view);
        if (strB == null) {
            return;
        }
        Iterator it = f6079b.iterator();
        if (it.hasNext()) {
            w.a(it.next());
            throw null;
        }
        for (Map.Entry entry : f6080c.entrySet()) {
            w.a(entry.getKey());
            if (((Set) entry.getValue()).contains(strB)) {
                throw null;
            }
        }
    }
}
