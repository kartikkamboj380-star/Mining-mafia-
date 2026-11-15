package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5456v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f33999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f34000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f34001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f34002e;

    private C5456v8(int i10, byte[] bArr, Map map, List list, boolean z9, long j10) {
        this.f33998a = i10;
        this.f33999b = bArr;
        this.f34000c = map;
        this.f34001d = list == null ? null : Collections.unmodifiableList(list);
        this.f34002e = z9;
    }

    private static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new C4952r8((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public C5456v8(int i10, byte[] bArr, Map map, boolean z9, long j10) {
        this(i10, bArr, map, a(map), z9, j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5456v8(int i10, byte[] bArr, boolean z9, long j10, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4952r8 c4952r8 = (C4952r8) it.next();
                treeMap.put(c4952r8.a(), c4952r8.b());
            }
        }
        this(i10, bArr, treeMap, list, z9, j10);
    }

    public C5456v8(byte[] bArr, Map map) {
        this(TTAdConstant.MATE_VALID, bArr, map, a(map), false, 0L);
    }
}
