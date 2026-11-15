package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5460vA implements InterfaceC4705pA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BT f34006a;

    C5460vA(BT bt) {
        this.f34006a = bt;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4705pA
    public final void a(Map map) {
        byte b10;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
        } else if (str.equals("flick")) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            this.f34006a.f(EnumC5750xT.SHAKE);
        } else if (b10 != 1) {
            this.f34006a.f(EnumC5750xT.NONE);
        } else {
            this.f34006a.f(EnumC5750xT.FLICK);
        }
    }
}
