package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2110Mu0 {
    public static boolean a(Iterable iterable, InterfaceC2470Ts0 interfaceC2470Ts0) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            interfaceC2470Ts0.getClass();
            return c((List) iterable, interfaceC2470Ts0);
        }
        Iterator it = iterable.iterator();
        interfaceC2470Ts0.getClass();
        boolean z9 = false;
        while (it.hasNext()) {
            if (interfaceC2470Ts0.zza(it.next())) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    public static Object b(Iterable iterable, Object obj) {
        AbstractC2112Mv0 it = ((C1645Dv0) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean c(List list, InterfaceC2470Ts0 interfaceC2470Ts0) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!interfaceC2470Ts0.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        d(list, interfaceC2470Ts0, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        d(list, interfaceC2470Ts0, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    private static void d(List list, InterfaceC2470Ts0 interfaceC2470Ts0, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (interfaceC2470Ts0.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            } else {
                list.remove(i11);
            }
        }
    }
}
