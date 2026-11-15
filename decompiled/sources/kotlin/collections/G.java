package kotlin.collections;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class G extends F {
    public static Map b(Map builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((p139n8.d) builder).l();
    }

    public static Map c() {
        return new p139n8.d();
    }

    public static int d(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        return i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static Map e(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.c(), pair.d());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map f(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
