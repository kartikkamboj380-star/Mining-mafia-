package p192t1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.E;

/* JADX INFO: renamed from: t1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7125c {
    public static final Map a(int i10, float f10) {
        return new LinkedHashMap(i10, f10, true);
    }

    public static /* synthetic */ Map b(int i10, float f10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            f10 = 0.75f;
        }
        return a(i10, f10);
    }

    public static final List c(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.W(list));
        }
        return CollectionsKt.i();
    }

    public static final Map d(Map map) {
        int size = map.size();
        if (size == 0) {
            return E.g();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.V(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
