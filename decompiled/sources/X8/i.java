package X8;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V8.d f6787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(T8.b kSerializer, T8.b vSerializer) {
        super(kSerializer, vSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f6787c = new h(kSerializer.a(), vSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // X8.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap p(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // X8.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Map q(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // X8.l, T8.b, T8.e, T8.a
    public V8.d a() {
        return this.f6787c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // X8.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap f() {
        return new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // X8.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // X8.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(LinkedHashMap linkedHashMap, int i10) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // X8.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Iterator i(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // X8.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public int j(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }
}
