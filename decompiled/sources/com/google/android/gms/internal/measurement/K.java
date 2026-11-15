package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class K extends AbstractC6351w {
    @Override // com.google.android.gms.internal.measurement.AbstractC6351w
    public final InterfaceC6289p a(String str, C6157a2 c6157a2, List list) {
        if (str == null || str.isEmpty() || !c6157a2.d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC6289p interfaceC6289pH = c6157a2.h(str);
        if (interfaceC6289pH instanceof AbstractC6235j) {
            return ((AbstractC6235j) interfaceC6289pH).c(c6157a2, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
