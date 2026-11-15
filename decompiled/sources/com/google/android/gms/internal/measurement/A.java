package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class A implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC6235j f36236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6157a2 f36237b;

    A(AbstractC6235j abstractC6235j, C6157a2 c6157a2) {
        this.f36236a = abstractC6235j;
        this.f36237b = c6157a2;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC6289p interfaceC6289p = (InterfaceC6289p) obj;
        InterfaceC6289p interfaceC6289p2 = (InterfaceC6289p) obj2;
        if (interfaceC6289p instanceof C6333u) {
            return !(interfaceC6289p2 instanceof C6333u) ? 1 : 0;
        }
        if (interfaceC6289p2 instanceof C6333u) {
            return -1;
        }
        AbstractC6235j abstractC6235j = this.f36236a;
        return abstractC6235j == null ? interfaceC6289p.zzc().compareTo(interfaceC6289p2.zzc()) : (int) B2.i(abstractC6235j.c(this.f36237b, Arrays.asList(interfaceC6289p, interfaceC6289p2)).zzd().doubleValue());
    }
}
