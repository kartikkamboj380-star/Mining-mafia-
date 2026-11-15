package p243y2;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f50800a = new b();

    private b() {
    }

    public static final z2.b.a a(Map componentAttribution, Map shortcutAttribution, Map map, Map map2, Rect rect, String str, PointF pointF, Map map3, Object obj, boolean z9, Uri uri) {
        Intrinsics.checkNotNullParameter(componentAttribution, "componentAttribution");
        Intrinsics.checkNotNullParameter(shortcutAttribution, "shortcutAttribution");
        z2.b.a aVar = new z2.b.a();
        if (rect != null) {
            aVar.f50907h = rect.width();
            aVar.f50908i = rect.height();
        }
        aVar.f50909j = str;
        if (pointF != null) {
            aVar.f50910k = Float.valueOf(pointF.x);
            aVar.f50911l = Float.valueOf(pointF.y);
        }
        aVar.f50905f = obj;
        aVar.f50912m = z9;
        aVar.f50906g = uri;
        aVar.f50902c = map;
        aVar.f50903d = map3;
        aVar.f50901b = shortcutAttribution;
        aVar.f50900a = componentAttribution;
        aVar.f50904e = map2;
        return aVar;
    }
}
