package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class G0 extends K0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class f37081c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* synthetic */ G0(F0 f10) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.K0
    final void a(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) H1.k(obj, j10);
        if (list instanceof E0) {
            objUnmodifiableList = ((E0) list).zze();
        } else {
            if (f37081c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC6394c1) && (list instanceof InterfaceC6472w0)) {
                InterfaceC6472w0 interfaceC6472w0 = (InterfaceC6472w0) list;
                if (interfaceC6472w0.zzc()) {
                    interfaceC6472w0.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        H1.x(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.play_billing.K0
    final void b(Object obj, Object obj2, long j10) {
        List list;
        List list2;
        List listZzd;
        List list3 = (List) H1.k(obj2, j10);
        int size = list3.size();
        List list4 = (List) H1.k(obj, j10);
        if (list4.isEmpty()) {
            if (list4 instanceof E0) {
                listZzd = new D0(size);
            } else {
                listZzd = ((list4 instanceof InterfaceC6394c1) && (list4 instanceof InterfaceC6472w0)) ? ((InterfaceC6472w0) list4).zzd(size) : new ArrayList(size);
            }
            H1.x(obj, j10, listZzd);
            list2 = listZzd;
        } else {
            if (f37081c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                H1.x(obj, j10, arrayList);
                list = arrayList;
            } else if (list4 instanceof C1) {
                D0 d10 = new D0(list4.size() + size);
                d10.addAll(d10.size(), (C1) list4);
                H1.x(obj, j10, d10);
                list = d10;
            } else if ((list4 instanceof InterfaceC6394c1) && (list4 instanceof InterfaceC6472w0)) {
                InterfaceC6472w0 interfaceC6472w0 = (InterfaceC6472w0) list4;
                if (!interfaceC6472w0.zzc()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    InterfaceC6472w0 interfaceC6472w0Zzd = interfaceC6472w0.zzd(list4.size() + size);
                    H1.x(obj, j10, interfaceC6472w0Zzd);
                    list2 = interfaceC6472w0Zzd;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        H1.x(obj, j10, list3);
    }
}
