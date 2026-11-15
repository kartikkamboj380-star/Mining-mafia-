package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5241tQ0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f33398b;

    static {
        C3858iQ0.a(Collections.EMPTY_SET);
    }

    /* synthetic */ C5241tQ0(List list, List list2, AbstractC4989rQ0 abstractC4989rQ0) {
        this.f33397a = list;
        this.f33398b = list2;
    }

    public static C5115sQ0 a(int i10, int i11) {
        return new C5115sQ0(i10, i11, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.f33397a;
        int size = list.size();
        List list2 = this.f33398b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((InterfaceC4864qQ0) list2.get(i10)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetB = AbstractC3354eQ0.b(size);
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object objZzb = ((InterfaceC4864qQ0) list.get(i11)).zzb();
            objZzb.getClass();
            hashSetB.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                obj.getClass();
                hashSetB.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetB);
    }
}
